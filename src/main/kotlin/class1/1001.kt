package class1

/** [See](https://www.acmicpc.net/problem/1001) */
fun `1001`() = readln().split(" ").map(String::toInt).reduce(Int::minus).let(::println)
