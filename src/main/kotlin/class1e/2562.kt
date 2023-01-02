package class1e

/** [See](https://www.acmicpc.net/problem/2562) */
fun `2562`() = List(9) { readln().toInt() }
    .let {
        println(it.max())
        println(it.indexOf(it.max()) + 1)
    }
