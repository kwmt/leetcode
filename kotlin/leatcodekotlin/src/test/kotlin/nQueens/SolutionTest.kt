package nQueens

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class SolutionTest {

    private lateinit var target: Solution

    @Before
    fun setUp() {
        target = Solution()
    }

    @Test
    fun solveNQueens() {

        val expect = listOf(
            listOf(
                ".Q..",  // Solution 1
                "...Q",
                "Q...",
                "..Q."
            ),
            listOf(
                "..Q.",  // Solution 2
                "Q...",
                "...Q",
                ".Q.."
            )
        )

        val actual = target.solveNQueens(4)
        assertThat(actual).containsAnyIn(expect)
    }
}