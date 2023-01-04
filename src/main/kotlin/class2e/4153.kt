package class2e

/** [See](https://www.acmicpc.net/problem/4153) */
fun `4153`() = generateSequence { readln() }.takeWhile { it != "0 0 0" }
    .map { it.split(" ").map(String::toInt).sorted() }
    .map { (a, b, c) -> a * a + b * b == c * c }
    .joinToString("\n") { if (it) "right" else "wrong" }
    .let(::println)
