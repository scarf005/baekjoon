package class1

/** [See](https://www.acmicpc.net/problem/1157) */
fun `1157`() {
    val groups = readln().uppercase().groupingBy { it }.eachCount()
    val max = groups.values.max()
    val maxes = groups.filterValues { it == max }
    when (maxes.size) {
        1 -> maxes.keys.first()
        else -> "?"
    }.let(::println)
}
