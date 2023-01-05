package class1

private fun nextIntList() = readln().split(" ").map(String::toInt)

/** [See](https://www.acmicpc.net/problem/10871) */
fun `10871`() = nextIntList()
    .let { (_, x) -> nextIntList().filter { it < x } }
    .joinToString(" ")
    .let(::println)
