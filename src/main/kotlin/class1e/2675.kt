package class1e

/** [See](https://www.acmicpc.net/problem/2675) */
fun `2675`() = repeat(readln().toInt()) {
    val (r, s) = readln().split(" ")
    s.map { it.toString().repeat(r.toInt()) }.joinToString("").let(::println)
}
