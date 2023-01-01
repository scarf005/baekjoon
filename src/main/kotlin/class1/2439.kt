package class1

/** [See](https://www.acmicpc.net/problem/2439) */
fun `2439`() = readln().toInt().let { n ->
    (1..n).map { "*".repeat(it).padStart(n, ' ') }.forEach(::println)
}
