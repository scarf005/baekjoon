package class1

/** [See](https://www.acmicpc.net/problem/2753) */
fun `2753`() = readln().toInt().let { year ->
    when {
        year % 4 == 0 && year % 100 != 0 -> 1
        year % 400 == 0 -> 1
        else -> 0
    }.let(::println)
}
