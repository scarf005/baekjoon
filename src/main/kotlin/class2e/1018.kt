package class2e

/** [See](https://www.acmicpc.net/problem/1018) */
fun `1018`() {
    val (n, _) = readln().split(" ").map(String::toInt)
    val board: Matrix = (1..n).map { readln().map { if (it == 'W') Color.WHITE else Color.BLACK } }

    board.allSubMatrices().map { it.repaints() }.min().let(::println)
}

private enum class Color(val char: Char) { BLACK('B'), WHITE('W') }
private typealias Matrix = List<List<Color>>

private const val SIZE = 8

private fun Matrix.subMatrix(row: Int, col: Int): Matrix = subList(row, row + SIZE).map { it.subList(col, col + SIZE) }

private fun Matrix.allSubMatrices(): Sequence<Matrix> = sequence {
    yieldAll((0..size - SIZE).flatMap { row ->
        (0..this@allSubMatrices[row].size - SIZE).map { col ->
            subMatrix(row, col)
        }
    })
}

private fun supposedColor(y: Int, x: Int) = if ((y + x) % 2 == 0) Color.BLACK else Color.WHITE

private fun Matrix.repaints(): Int {
    val repaints = (0 until SIZE).flatMap { y ->
        (0 until SIZE).map { x ->
            if (this[y][x] != supposedColor(y, x)) 1 else 0
        }
    }.sum()

    return if (repaints > 32) 64 - repaints else repaints
}
