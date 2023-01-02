package class1e

/** [See](https://www.acmicpc.net/problem/1008) */
fun `1008`() = println(readln().split(" ").map(String::toDouble).reduce(Double::div))
