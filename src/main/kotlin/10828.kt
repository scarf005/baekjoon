import java.util.*

fun Stack<Int>.popOrMinusOne(): Int = if (this.isEmpty()) -1 else this.pop()
fun Stack<Int>.peekOrMinusOne(): Int = if (this.isEmpty()) -1 else this.peek()
private fun Boolean.toInt() = if (this) 1 else 0

fun `10828`() = Stack<Int>().run {
    val reader = System.`in`.bufferedReader()
    repeat(reader.readLine().toInt()) {
        when (val input = reader.readLine()) {
            "pop" -> println(popOrMinusOne())
            "size" -> println(size)
            "empty" -> println(isEmpty().toInt())
            "top" -> println(peekOrMinusOne())
            else -> push(input.split(" ").last().toInt())
        }
    }
}
