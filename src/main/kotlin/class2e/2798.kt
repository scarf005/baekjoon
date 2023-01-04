package class2e


/** [See](https://www.acmicpc.net/problem/2798) */
fun `2798`() {
    val (_, m) = nextInts()
    nextInts().cardCombinations().map(Cards::sum).filter { it <= m }.max().let(::println)
}

typealias Cards = Triple<Int, Int, Int>

fun Cards.sum() = first + second + third

private fun List<Int>.cardCombinations(): Sequence<Cards> = sequence {
    for (i in indices) {
        for (j in i + 1 until size) {
            for (k in j + 1 until size) {
                yield(Triple(get(i), get(j), get(k)))
            }
        }
    }
}

private fun nextInts() = readln().split(" ").map(String::toInt)
