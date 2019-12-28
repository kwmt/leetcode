package nQueens

class Solution {


    fun solveNQueens(n: Int): List<List<String>> {

        // board[行][列]
        val board = Array(n) { Array(n) { "." } }
        // ボードにクイーンを置くことができない(他のクイーンの導線になっている)場合はfalse
        // ボードに置くことができる場合はtrue。初期値は全部true。
        val canPutQueenList = Array(n) { Array(n) { true } }

        // どこにクイーンを置いたか
        val putQueen = Array(n) { Array(n) { -1 } }

        /**
         * クイーンを配置したrow, columnをもとに、配置できない場所を確定する
         */
        fun setCanPutQueenList(n: Int, row: Int, column: Int) {
            canPutQueenList[row][column] = false
            for (i in 0 until n) {
                canPutQueenList[i][column] = false
                for (j in 0 until n) {
                    canPutQueenList[row][j] = false

                    if ( row + i == column + j) {
                        // 斜め(右下)
                        if ((row + i < n) && (column + j < n)) {
                            canPutQueenList[row + i][column + j] = false
                        }
                    }


                }
            }


        }

        //
        for (row in 0 until n) {
            val canPutRow = canPutOnRow(row, n, board)

            for (column in 0 until n) {
                if (canPutRow && canPutQueenList[row][column]) {
                    board[row][column] = "Q"

                    setCanPutQueenList(n, row, column)

                    continue
                }
            }
        }




        return emptyList()


    }

    fun canPutOnRow(row: Int, n: Int, board: Array<Array<String>>): Boolean {
        // nullなら置かれてないので、その行に置くことができるためtrueを返す
        return board[row].firstOrNull { it == "Q" } == null
    }
}