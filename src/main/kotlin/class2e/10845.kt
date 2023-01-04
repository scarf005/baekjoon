package class2e

private class Queue {
    private val queue = mutableListOf<Int>()

    fun push(x: Int) = queue.add(x)
    fun pop(): Int = if (queue.isEmpty()) -1 else queue.removeAt(0)
    fun size(): Int = queue.size
    fun empty(): Int = if (queue.isEmpty()) 1 else 0
    fun front(): Int = if (queue.isEmpty()) -1 else queue.first()
    fun back(): Int = if (queue.isEmpty()) -1 else queue.last()
}

private fun Queue.parse(command: String) {
    when (command) {
        "pop" -> println(pop())
        "size" -> println(size())
        "empty" -> println(empty())
        "front" -> println(front())
        "back" -> println(back())
        else -> push(command.split(" ")[1].toInt())
    }
}

/** [See](https://www.acmicpc.net/problem/10845) */
fun `10845`() {
    System.`in`.bufferedReader().use { br ->
        Queue().apply {
            repeat(br.readLine().toInt()) { parse(br.readLine()) }
        }
    }
}
