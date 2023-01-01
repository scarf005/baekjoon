package class1

/** [See](https://www.acmicpc.net/problem/10809) */
fun `10809`() = readln()
    .let { word -> ('a'..'z').map { word.indexOf(it) } }
    .joinToString(" ").let(::println)
