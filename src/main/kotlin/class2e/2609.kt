package class2e

/** [See](https://www.acmicpc.net/problem/2609) */
fun `2609`() = readln().split(" ").map(String::toInt)
    .let { (a, b) -> listOf(gcd(a, b), lcm(a, b)) }
    .forEach(::println)

/**
 * Greatest Common Divisor.
 * uses euclidean algorithm,
 * requires: [a] > [b]
 */
private tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

/** Least Common Multiple. */
private fun lcm(a: Int, b: Int) = a * b / gcd(a, b)
