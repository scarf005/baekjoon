package class1

/** [See](https://www.acmicpc.net/problem/2920) */
fun `2920`() = when (readln()) {
    "1 2 3 4 5 6 7 8" -> "ascending"
    "8 7 6 5 4 3 2 1" -> "descending"
    else -> "mixed"
}.let(::println)
