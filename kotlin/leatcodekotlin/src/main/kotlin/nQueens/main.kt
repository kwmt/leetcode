package nQueens

import java.util.*


class Solution {

    var n = 0
    var ans: ArrayList<List<String?>> = ArrayList()
    private val queens by lazy { IntArray(n) }
    fun solveNQueens(n: Int): List<List<String?>>? {
        this.n = n
        backtrack(0)
        return ans
    }

    private fun backtrack(row: Int) {
        if (row == n) {
            val rowls = ArrayList<String>()
            for (q in queens) {
                val cs = CharArray(n)
                Arrays.fill(cs, '.')
                cs[q] = 'Q'
                rowls.add(String(cs))
            }
            ans.add(rowls)
            return
        }
        for (i in 0 until n) {
            queens[row] = i
            if (isValid(queens, row)) backtrack(row + 1)
        }
    }

    private fun isValid(queens: IntArray, row: Int): Boolean {
        for (i in 0 until row) {
            if (queens[row] == queens[i] ||
                queens[i] + row - i == queens[row] ||
                queens[row] + row - i == queens[i]
            ) return false
        }
        return true
    }

}