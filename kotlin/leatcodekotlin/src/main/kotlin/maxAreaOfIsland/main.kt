package maxAreaOfIsland

class Solution {

    private val dx = listOf(1, 0, -1, 0)
    private val dy = listOf(0, 1, 0, -1)

    private var maxRow: Int = 0
    private var maxColumn: Int = 0
    private lateinit var grid: Array<IntArray>
    private lateinit var seen: Array<BooleanArray>

    private var startRow: Int = 0
    private var startCol: Int = 0
    private var maxIsland: Int = 0
    private var islandCounter: Int = 0

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        this.grid = grid
        maxColumn = grid[0].size // TODO: エラー処理
        maxRow = grid.size
        seen = Array(maxRow) { BooleanArray(maxColumn) { false } }

        for (row in seen.indices) {
            for (column in seen[row].indices) {
                // 探索済みまたは陸でない(水)なら探索しない
                if (seen[row][column] || grid[row][column] == 0) continue

                startRow = row
                startCol = column


                islandCounter = 0
                dfs(startRow, startCol)
            }
            if (maxIsland < islandCounter) {
                maxIsland = islandCounter
            }
        }

        return maxIsland
    }

    private fun dfs(row: Int, column: Int) {
        seen[row][column] = true

        if (grid[row][column] == 1) {
            islandCounter += 1
        }

//        println("(${row.value}, ${column.value}) = ${grid[column.value][row.value]}")
        for (i in 0 until 4) {
            val nextColumn = column + dx[i]
            val nextRow = row + dy[i]

            if (
                (nextColumn > maxColumn - 1)  // 右端オーバー
                || (nextColumn < 0) // 左端オーバー
                || (nextRow > maxRow - 1) // 下端オーバー
                || (nextRow < 0) // 上端オーバー
            ) {
                continue
            }

//            println("($x, $y) = ${grid[y][x]}")

            // 水だったらスルー
            if (grid[nextRow][nextColumn] == 0) {
//                islandCounter += -1
                continue
            }

            // 探索済みならスルー
            if (seen[nextRow][nextColumn]) continue

            dfs(nextRow, nextColumn)

        }
    }
}
