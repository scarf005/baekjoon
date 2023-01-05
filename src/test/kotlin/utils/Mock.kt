package utils

import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun mock(input: String, block: () -> Unit): String =
    captureSystemOut { mockSystemIn(input, block) }

fun String.toOutput() = this.trimIndent() + '\n'

private fun mockSystemIn(input: String, block: () -> Unit) {
    val old = System.`in`
    System.setIn(input.byteInputStream())

    block()

    System.setIn(old)
}

private fun captureSystemOut(block: () -> Unit): String {
    val old = System.out
    val newOut = ByteArrayOutputStream()
    val printStream = PrintStream(newOut)

    System.setOut(printStream)
    System.out.flush()

    block()

    System.setOut(old)
    return newOut.toString()
}
