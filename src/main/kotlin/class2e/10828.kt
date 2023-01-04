package class2e

private class Stack {
    private val stack = mutableListOf<Int>()

    fun push(x: Int) = stack.add(x)
    fun pop(): Int = if (stack.isEmpty()) -1 else stack.removeAt(stack.lastIndex)
    fun size(): Int = stack.size
    fun empty(): Int = if (stack.isEmpty()) 1 else 0
    fun top(): Int = if (stack.isEmpty()) -1 else stack.last()
}

private fun Stack.parse(command: String) {
    when (command) {
        "pop" -> println(pop())
        "size" -> println(size())
        "empty" -> println(empty())
        "top" -> println(top())
        else -> push(command.split(" ")[1].toInt())
    }
}

/** [See](https://www.acmicpc.net/problem/10828) */
fun `10828`() {
    Stack().apply {
        List(readln().toInt()) { readln() }.forEach(::parse)
    }
}
