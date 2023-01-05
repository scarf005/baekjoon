package class2e

/** [See](https://www.acmicpc.net/problem/1978) */
fun `1978`() {
    readln()
    val allPrimes = primes(1000)
    readln().split(" ").map(String::toInt).count { it in allPrimes }.let(::println)
}

private fun primes(n: Int) =
    (2..n).fold(emptyList<Int>()) { acc, i -> if (acc.none { i % it == 0 }) acc + i else acc }
