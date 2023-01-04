package utils

import io.kotest.matchers.shouldBe
import kotlin.reflect.KFunction

data class TestGen(val fn: KFunction<*>) {
    init {
        fn.returnType.toString() shouldBe "kotlin.Unit"
    }

    fun from(vararg samples: TestCase) = Runner(fn, samples.toList())
    fun fromResource(): Runner = Examples.fromResource(fn.name.toInt()).samples.let { Runner(fn, it) }
}
