package class1

/** [See](https://www.acmicpc.net/problem/2475) */
fun `2475`() = readln().split(" ").map(String::toInt)
    .sumOf { it * it }.let { it % 10 }.let(::println)
