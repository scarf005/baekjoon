package class1e

/** [See](https://www.acmicpc.net/problem/2739) */
fun `2739`() =
    readln().toInt().let { n -> (1..9).map { "$n * $it = ${n * it}" }.forEach(::println) }
