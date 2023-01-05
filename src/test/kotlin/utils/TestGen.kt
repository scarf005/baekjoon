package utils

import io.kotest.matchers.shouldBe
import kotlin.reflect.KFunction

data class TestGen(val fn: KFunction<*>) {
    init {
        fn.returnType.toString() shouldBe "kotlin.Unit"
    }

    operator fun invoke(vararg samples: TestCase) = when {
        samples.isEmpty() -> fromResource()
        else -> from(*samples)
    }

    fun from(vararg samples: TestCase) = Runner(fn, samples.toList())
    fun fromResource(): Runner =
        Examples.fromResource(fn.name.toInt()).samples.let { Runner(fn, it) }
}
