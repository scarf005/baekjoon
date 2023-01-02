package class1e

/** [See](https://www.acmicpc.net/problem/10951) */
fun `10951`() = generateSequence(::readLine)
    .map { it.split(" ").map(String::toInt) }
    .map { (a, b) -> a + b }
    .forEach(::println)
