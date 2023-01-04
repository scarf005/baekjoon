package class2e

private data class Room(val floor: Int, val number: Int) {
    override fun toString() = "${floor * 100 + number}"
}

/** [See](https://www.acmicpc.net/problem/10250) */
fun `10250`() = repeat(readln().toInt()) {
    val (h, _, n) = readln().split(" ").map(String::toInt)

    when (n % h) {
        0 -> Room(h, n / h)
        else -> Room(n % h, n / h + 1)
    }.let(::println)
}
