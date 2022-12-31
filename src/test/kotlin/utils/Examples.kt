package utils

import com.charleskorn.kaml.Yaml
import io.kotest.inspectors.forAll
import io.kotest.matchers.shouldBe
import kotlinx.serialization.Serializable
import kotlin.reflect.KFunction

@Serializable
data class Examples(val samples: List<TestCase>) {
    fun test(fn: () -> Unit) = samples.forAll { (input, output) ->
        mock(input.trimIndent()) { fn() } shouldBe output.toOutput()
    }

    companion object {
        private fun resourceStream(id: Int) =
            Examples::class.java.getResourceAsStream("/$id.yaml")!!

        private fun fromResource(id: Int): Examples =
            Yaml.default.decodeFromStream(serializer(), resourceStream(id))

        fun test(fn: KFunction<*>) {
            val name = fn.name
            println("Testing $name")
            fromResource(name.toInt()).test(fn::call)
        }
    }
}
