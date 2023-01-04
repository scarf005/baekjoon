package utils

import io.kotest.inspectors.forAll
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import kotlin.reflect.KFunction

data class Runner(val fn: KFunction<*>, val cases: List<TestCase>) {
    fun test() = cases.forAll { (input, output) ->
        mock(input.trimIndent(), fn::call) shouldBe output.toOutput()
    }

    fun testNearEquality(tolerance: Double = 1e-9) = cases.forAll { (input, output) ->
        mock(input.trimIndent(), fn::call).let(String::toDouble)
            .shouldBe(output.toOutput().toDouble() plusOrMinus tolerance)
    }
}
