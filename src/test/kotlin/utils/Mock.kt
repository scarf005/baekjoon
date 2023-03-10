package utils

import io.kotest.extensions.system.captureStandardOut

fun mock(input: String, block: () -> Unit): String =
    captureStandardOut {
        try {
            mockSystemIn(input, block)
        } catch (e: Exception) {
            e.cause?.stackTraceToString().let(::println)
        }
    }

fun String.toOutput() = this.trimIndent() + '\n'

private fun mockSystemIn(input: String, block: () -> Unit) {
    val old = System.`in`
    System.setIn(input.byteInputStream())

    try {
        block()
    } finally {
        System.setIn(old)
    }
}
