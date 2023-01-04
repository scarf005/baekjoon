package class2e


class Deque(val logBuilder: StringBuilder = StringBuilder()) {
    private val deque = ArrayDeque<Int>()

    private fun log(message: Int) {
        logBuilder.appendLine(message)
    }

    fun parse(command: String) = deque.run {
        when (command) {
            "pop_front" -> log(if (isEmpty()) -1 else removeFirst())
            "pop_back" -> log(if (isEmpty()) -1 else removeLast())
            "size" -> log(size)
            "empty" -> log(if (isEmpty()) 1 else 0)
            "front" -> log(if (isEmpty()) -1 else first())
            "back" -> log(if (isEmpty()) -1 else last())
            else -> {
                val (cmd, value) = command.split(" ")
                when (cmd) {
                    "push_front" -> addFirst(value.toInt())
                    else /*push_back*/ -> addLast(value.toInt())
                }
            }
        }
    }
}

/** [See](https://www.acmicpc.net/problem/10866) */
fun `10866`() {
    Deque()
        .apply { repeat(readln().toInt()) { parse(readln()) } }
        .logBuilder.let(::print)
}
