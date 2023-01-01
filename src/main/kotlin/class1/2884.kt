package class1

/** [See](https://www.acmicpc.net/problem/2884) */
fun `2884`() = readln().split(" ").map(String::toInt).let { (h, m) ->
    val (hour, minute) = when {
        m >= 45 -> h to m - 45
        h == 0 -> 23 to m + 15
        else -> h - 1 to m + 15
    }
    println("$hour $minute")
}
