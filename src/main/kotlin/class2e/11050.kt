package class2e

/** Factorial. */
tailrec fun fact(n: Int, acc: Int = 1): Int = if (n == 0) acc else fact(n - 1, acc * n)

/** Binomial Coefficient. */
fun binomial(n: Int, k: Int) = fact(n) / (fact(k) * fact(n - k))

/** [See](https://www.acmicpc.net/problem/11050) */
fun `11050`() {
    val (n, k) = readln().split(" ").map(String::toInt)
    binomial(n, k).let(::println)
}
