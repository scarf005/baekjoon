package class2e

/** [See](https://www.acmicpc.net/problem/2164) */
fun `2164`() = (1..readln().toInt()).toCollection(ArrayDeque<Int>()).run {
    while (size > 1) {
        removeFirst()
        addLast(removeFirst())
    }
    println(first())
}
