/**
 * @sample
 * 1, 2, 3
 * fun foo() = 2
 *
 * [See](https://www.acmicpc.net/problem/1000)
 */
fun `1000`() = readln().split(" ").map(String::toInt).reduce(Int::plus).let(::println)
