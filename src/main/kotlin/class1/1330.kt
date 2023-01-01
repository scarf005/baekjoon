package class1

/** [See](https://www.acmicpc.net/problem/1330) */
fun `1330`() = readln().split(" ").map(String::toInt).let { (a, b) ->
    when {
        a > b -> ">"
        a < b -> "<"
        else -> "=="
    }
}.let(::println)
