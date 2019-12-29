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
        if (grid.isEmpty()) return 0

        this.grid = grid
        maxColumn = grid[0].size
        maxRow = grid.size
        seen = Array(maxRow) { BooleanArray(maxColumn) { false } }

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
        seen[row.value][column.value] = true

        for (i in 0 until 4) {
            val nextColumn = column.value + dx[i]
            val nextRow = row.value + dy[i]

            if (
                (nextColumn > maxColumn - 1)  // 右端オーバー
                || (nextColumn < 0) // 左端オーバー
                || (nextRow > maxRow - 1) // 下端オーバー
                || (nextRow < 0) // 上端オーバー
            ) {
                continue
            }

            // 水だったらスルー
            if (grid[nextRow][nextColumn] == '0') continue

            // 探索済みならスルー
            if (seen[nextRow][nextColumn]) continue

            dfs(Row(nextRow), Column(nextColumn))
        }
    }
}


