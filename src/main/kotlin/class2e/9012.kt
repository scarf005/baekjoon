package class2e

fun String.isParenthesisString(): Boolean = 0 == fold(0) { openings, c ->
    when {
        openings < 0 -> openings
        c == '(' -> openings + 1
        c == ')' -> openings - 1
        else -> throw IllegalArgumentException("Invalid character: $c")
    }
}

/** [See](https://www.acmicpc.net/problem/9012) */
fun `9012`() = List(readln().toInt()) { readln().isParenthesisString() }
    .joinToString("\n") { if (it) "YES" else "NO" }.let(::println)
