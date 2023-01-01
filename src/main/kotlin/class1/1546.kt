package class1

/** [See](https://www.acmicpc.net/problem/1546) */
fun `1546`() {
    readln()
    val scores = readln().split(" ").map(String::toDouble)
    val max = scores.max()
    scores.map { it / max * 100 }.average().let(::println)
}
