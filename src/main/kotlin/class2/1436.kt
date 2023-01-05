package class2

fun Int.isDoomsdayNumber() = toString().contains("666")

fun doomsdayNumbers(): Sequence<Int> = generateSequence(666) { it + 1 }.filter(Int::isDoomsdayNumber)

/** [See](https://www.acmicpc.net/problem/1436) */
fun `1436`() {
    val n = readln().toInt()
    doomsdayNumbers().take(n).last().let(::println)
}
