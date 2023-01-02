package class1e

fun String.toOs() = split("X").filter(String::isNotEmpty)
fun String.toScore() = length.let { it * (it + 1) / 2 }

/** [See](https://www.acmicpc.net/problem/8958) */
fun `8958`() = List(readln().toInt()) { readln() }
    .map { it.toOs().sumOf(String::toScore) }
    .forEach(::println)
