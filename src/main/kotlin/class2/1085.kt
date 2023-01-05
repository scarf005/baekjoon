package class2

/** [See](https://www.acmicpc.net/problem/1085) */
fun `1085`() = readln().split(" ").map(String::toInt)
    .let { (x, y, w, h) -> minOf(x, y, w - x, h - y) }
    .let(::println)
