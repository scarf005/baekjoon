package class2e

import java.io.BufferedReader

data class Pos(val x: Int, val y: Int) {
    override fun toString() = "$x $y"
}

private fun String.toPos() = split(" ").map(String::toInt).let { (x, y) -> Pos(x, y) }

private fun BufferedReader.posList(n: Int) = List(n) { readLine().toPos() }

/** [See](https://www.acmicpc.net/problem/11650) */
fun `11650`() = System.`in`.bufferedReader().use { br ->
    val n = br.readLine().toInt()
    br.posList(n)
        .sortedWith(compareBy({ it.x }, { it.y }))
        .joinToString("\n")
        .let(::println)
}
