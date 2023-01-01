package class1

/** [See](https://www.acmicpc.net/problem/10818) */
fun `10818`() {
    readln()
    val numbers = readln().split(" ").map(String::toInt)
    println("${numbers.min()} ${numbers.max()}")
}
