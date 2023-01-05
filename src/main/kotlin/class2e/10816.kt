package class2e

import java.io.BufferedReader
import java.util.*


@Suppress("NOTHING_TO_INLINE")
private inline fun StringTokenizer.nextInt() = nextToken().toInt()
private fun BufferedReader.tokens() = readLine().let(::StringTokenizer)
private fun BufferedReader.ints(n: Int) = tokens().run { IntArray(n) { nextInt() } }

private const val ABSOLUTE_MAX = 10_000_000
private const val SIGNED_MAX = ABSOLUTE_MAX * 2 + 1

/** [See](https://www.acmicpc.net/problem/10816) */
fun `10816`() = System.`in`.bufferedReader().run {
    val n = readLine().toInt()
    val hashes = IntArray(SIGNED_MAX) { 0 }

    val tokens = tokens()
    repeat(n) { hashes[tokens.nextInt() + ABSOLUTE_MAX]++ }

    val m = readLine().toInt()
    val result = ints(m).joinToString(" ") { hashes[it + 10_000_000].toString() }
    println(result)
}
