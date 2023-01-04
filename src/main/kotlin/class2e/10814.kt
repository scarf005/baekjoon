package class2e

private data class Account(val age: Int, val name: String) {
    override fun toString() = "$age $name"
}

private fun String.toAccount() = split(" ").let { (age, name) -> Account(age.toInt(), name) }

/** [See](https://www.acmicpc.net/problem/10814) */
fun `10814`() = System.`in`.bufferedReader()
    .run { List(readLine().toInt()) { readLine().toAccount() } }
    .sortedWith(compareBy { it.age })
    .joinToString("\n")
    .let(::println)
