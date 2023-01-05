package utils

import com.charleskorn.kaml.Yaml
import io.kotest.inspectors.forAll
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import kotlinx.serialization.Serializable
import kotlin.reflect.KFunction

@Serializable
data class Examples(val samples: List<TestCase>) {
    fun test(fn: () -> Unit) = samples.forAll { (input, output) ->
        mock(input.trimIndent()) { fn() } shouldBe output.toOutput()
    }

    fun testNearEquality(fn: () -> Unit, tolerance: Double) = samples.forAll { (input, output) ->
        mock(input.trimIndent()) { fn() }.let(String::toDouble)
            .shouldBe(output.toOutput().toDouble() plusOrMinus tolerance)
    }

    companion object {
        private fun resourceStream(id: Int) =
            Examples::class.java.getResourceAsStream("/$id.yaml")!!

        fun fromResource(id: Int): Examples =
            Yaml.default.decodeFromStream(serializer(), resourceStream(id))

        fun test(fn: KFunction<*>) {
            val name = fn.name
            println("Testing $name")
            fn.returnType.toString() shouldBe "kotlin.Unit"
            fromResource(name.toInt()).test(fn::call)
        }

        fun testNearEquality(fn: KFunction<*>, tolerance: Double = 1e-9) {
            val name = fn.name
            println("Testing $name")
            fn.returnType.toString() shouldBe "kotlin.Unit"
            fromResource(name.toInt()).testNearEquality(fn::call, tolerance)
        }
    }
}
