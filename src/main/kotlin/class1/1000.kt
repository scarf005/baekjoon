package class1

/** [See](https://www.acmicpc.net/problem/1000) */
fun `1000`() = println(readln().split(" ").map(String::toInt).reduce(Int::plus))
