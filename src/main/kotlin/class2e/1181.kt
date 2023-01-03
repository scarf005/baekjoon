package class2e

/** [See](https://www.acmicpc.net/problem/1181) */
fun `1181`() = System.`in`.bufferedReader().run { List(readLine().toInt()) { readLine() } }
    .distinct()
    .sortedWith(compareBy({ it.length }, { it }))
    .joinToString("\n")
    .let(::println)
