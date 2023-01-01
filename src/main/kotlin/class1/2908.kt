package class1

/** [See](https://www.acmicpc.net/problem/2908) */
fun `2908`() = readln().split(" ").maxBy { it.reversed().toInt() }.reversed().let(::println)
