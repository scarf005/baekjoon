package class1

fun Int.digits(): List<Int> = this.toString().map { it.toString().toInt() }

/** [See](https://www.acmicpc.net/problem/2577) */
fun `2577`() {
    val (a, b, c) = List(3) { readln().toInt() }
    val counts = (a * b * c).digits().groupingBy { it }.eachCount()
    (0..9).forEach { println(counts[it] ?: 0) }
}
