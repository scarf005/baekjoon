package class2e

/** [See](https://www.acmicpc.net/problem/1259) */
fun `1259`() = generateSequence(::readln).takeWhile { it != "0" }
    .map { it.reversed() == it }
    .map { if (it) "yes" else "no" }
    .forEach(::println)
