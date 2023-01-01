package class1

/** [See](https://www.acmicpc.net/problem/10952) */
fun `10952`() = generateSequence(::readln)
    .takeWhile { it != "0 0" }
    .map { it.split(" ").map(String::toInt) }
    .map { (a, b) -> a + b }
    .forEach(::println)
