package class1e

/** [See](https://www.acmicpc.net/problem/10950) */
fun `10950`() = List(readln().toInt()) { readln().split(" ").map(String::toInt) }
    .map { (a, b) -> a + b }
    .forEach(::println)
