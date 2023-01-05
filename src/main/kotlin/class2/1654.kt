package class2

import java.io.BufferedReader

fun BufferedReader.longs(n: Int) = List(n) { readLine().toLong() }

/** [See](https://www.acmicpc.net/problem/1654) */
fun `1654`() = System.`in`.bufferedReader().use { br ->
    val (k, n) = br.readLine().split(" ").map(String::toInt)
    val lines = br.longs(k)

    tailrec fun go(min: Long, max: Long): Long = when {
        min <= max -> {
            val mid = (min + max) / 2
            val count = lines.sumOf { it / mid }
            when {
                count < n -> go(min, mid - 1)
                else -> go(mid + 1, max)
            }
        }

        else -> max
    }
    println(go(1, lines.max()))
}
