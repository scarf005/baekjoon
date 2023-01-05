package class2

/** [See](https://www.acmicpc.net/problem/1874) */
fun `1874`() {
    val n = readln().toInt()
    val numbers = List(n) { readln().toInt() }
    val stack = ArrayList<Int>()
    val result = StringBuilder()

    var count = 0
    for (num in numbers) {
        if (count < num) {
            stack += (count + 1)..num
            repeat(num - count) { result.appendLine("+") }
            count = num
        }
        if (stack.lastOrNull() == num) {
            stack.removeLast()
            result.appendLine("-")
        } else {
            println("NO")
            return
        }
    }
    print(result)
}
