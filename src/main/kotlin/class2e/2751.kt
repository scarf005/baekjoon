package class2e

/** [See](https://www.acmicpc.net/problem/2751) */
fun `2751`() = System.`in`.bufferedReader()
    .run { List(readLine().toInt()) { readLine().toInt() } }
    .sorted().joinToString("\n").let(::println)
