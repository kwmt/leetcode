package uniquePathsII


class Solution {

    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        if (obstacleGrid.isEmpty()) return 0

        if (obstacleGrid[0].isEmpty()) return 0
        if (obstacleGrid[0][0] == 1) return 0

        for (row in obstacleGrid) {
            if (!row.contains(0)) {
                return 0
            }
        }

        val rows = obstacleGrid.size
        val cols = obstacleGrid[0].size
        val dp = Array(rows) { IntArray(cols) }

        if (rows >= 2 && cols >= 2) {
            if (obstacleGrid[0][1] == 1 && obstacleGrid[1][0] == 1) {
                return 0
            }
        }


        // 縦
        for (i in dp.indices) {
            dp[i][0] = if (isWall(obstacleGrid, i, 0)) {
                0
            } else {
                1
            }
        }

        // 横
        for (i in dp[0].indices) {
            dp[0][i] = if (isWall(obstacleGrid, 0, i)) {
                0
            } else {
                1
            }
        }


        for (i in 1 until dp.size) {
            for (j in 1 until dp[i].size) {
                if (isWall(obstacleGrid, i, j)) {
                    dp[i][j] = 0
                    continue
                }

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
            }
        }
        return dp[rows - 1][cols - 1]

    }

    private fun isWall(obstacleGrid: Array<IntArray>, row: Int, col: Int) = obstacleGrid[row][col] == 1


}