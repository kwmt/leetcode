package numberOfIslands

class Solution {
    data class Column(val value: Int)
    data class Row(val value: Int)


    private val dx = listOf(1, 0, -1, 0)
    private val dy = listOf(0, 1, 0, -1)

    private var maxRow: Int = 0
    private var maxColumn: Int = 0
    private var grid: Array<CharArray> = emptyArray()
    private lateinit var seen: Array<BooleanArray>

    private var startRow: Int = 0
    private var startCol: Int = 0
    private var islandCount: Int = 0

    fun numIslands(grid: Array<CharArray>): Int {
        this.grid = grid
        maxColumn = grid[0].size // TODO: エラー処理
        maxRow = grid.size
        this.seen = Array(maxRow) { BooleanArray(maxColumn) { false } }

        for (row in seen.indices) {
            for (column in seen[row].indices) {
                // 探索済みまたは陸でない(水)なら探索しない
                if (seen[row][column] || grid[row][column] == '0') continue

                startRow = row
                startCol = column
                islandCount += 1
                dfs(Row(startRow), Column(startCol))
            }
        }

        return islandCount
    }

    private fun dfs(row: Row, column: Column) {
        seen[column.value][row.value] = true

//        println("(${row.value}, ${column.value}) = ${grid[column.value][row.value]}")
        for (i in 0 until 4) {
            val x = row.value + dx[i]
            val y = column.value + dy[i]

            if (
                (x > maxColumn - 1)  // 右端オーバー
                || (x < 0) // 左端オーバー
                || (y > maxRow - 1) // 下端オーバー
                || (y < 0) // 上端オーバー
            ) {
                continue
            }

//            println("($x, $y) = ${grid[y][x]}")

            // 水だったらスルー
            if (grid[y][x] == '0') continue

            // 探索済みならスルー
            if (seen[y][x]) continue

            dfs(Row(x), Column(y))

        }
    }
}


