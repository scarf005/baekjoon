package class2e

import java.io.BufferedReader
import java.util.*

private fun BufferedReader.ints(n: Int) =
    readLine().let(::StringTokenizer).run { IntArray(n) { nextToken().toInt() } }

private fun Boolean.toInt() = if (this) 1 else 0

/** [See](https://www.acmicpc.net/problem/1920) */
fun `1920`() = System.`in`.bufferedReader().run {
    val n = readLine().toInt()
    val a = ints(n).apply { sort() }
    val m = readLine().toInt()
    ints(m).map { a.binarySearch(it) >= 0 }.map(Boolean::toInt).joinToString("\n").let(::println)
}
