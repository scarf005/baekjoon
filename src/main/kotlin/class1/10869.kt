package class1

/** [See](https://www.acmicpc.net/problem/10869) */
fun `10869`() = readln().split(" ").map(String::toInt)
    .let { (a, b) -> listOf(a + b, a - b, a * b, a / b, a % b) }
    .forEach(::println)
