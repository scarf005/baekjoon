package class1

/** [See](https://www.acmicpc.net/problem/3052) */
fun `3052`() = List(10) { readln().toInt() % 42 }.distinct().size.let(::println)
