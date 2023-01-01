package class1

/** [See](https://www.acmicpc.net/problem/10998) */
fun `10998`() = readln().split(" ").map(String::toInt).let { (a, b) -> a * b }.let(::println)
