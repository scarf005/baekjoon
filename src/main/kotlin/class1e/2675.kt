package class1e

private operator fun String.times(other: Int) = repeat(other)

/** [See](https://www.acmicpc.net/problem/2675) */
fun `2675`() = repeat(readln().toInt()) {
    val (r, s) = readln().split(" ")
    fun multiply(c: Char) = c.toString() * r.toInt()

    s.map(::multiply).joinToString("").let(::println)
}
