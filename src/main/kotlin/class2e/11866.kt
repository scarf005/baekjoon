package class2e

/**
 * create a new list, with its [n] elements from first moved to back
 * ```
 * listOf(1, 2, 3, 4, 5).rotate(2) == listOf(3, 4, 5, 1, 2))
 * ```
 */
private fun <T> List<T>.rotate(n: Int): List<T> = drop(n % size) + take(n % size)

private fun josephus(n: Int, k: Int): List<Int> {
    tailrec fun go(nx: List<Int>, res: List<Int> = emptyList()): List<Int> = when {
        nx.isEmpty() -> res
        else -> {
            val next = nx.rotate(k - 1)
            go(next.drop(1), res + next.first())
        }
    }
    return go((1..n).toList())
}


/** [See](https://www.acmicpc.net/problem/11866) */
fun `11866`() = readln().split(" ").map(String::toInt)
    .let { (n, k) -> josephus(n, k) }
    .joinToString(prefix = "<", postfix = ">") { it.toString() }
    .let(::println)
