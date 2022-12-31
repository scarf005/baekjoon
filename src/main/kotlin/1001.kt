/**
 * # A-B
 *
 * ## 문제
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 *
 * ## 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * [See](https://www.acmicpc.net/problem/1001)
 */
fun `1001`() = readln().split(" ").map(String::toInt).reduce(Int::minus).let(::println)
