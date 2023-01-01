package class1

/** [See](https://www.acmicpc.net/problem/1008) */
fun `1008`() = println(readln().split(" ").map(String::toDouble).reduce(Double::div))
