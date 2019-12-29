package maxAreaOfIsland

import com.google.common.truth.Truth.assertThat
import org.junit.Test

import org.junit.Before

class SolutionTest {

    lateinit var target: Solution
    @Before
    fun setUp() {
        target = Solution()

    }

    @Test
    fun maxAreaOfIsland() {
        val grid = arrayOf(
            intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
            intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
            intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
        )
        val result = target.maxAreaOfIsland(grid)
        assertThat(result).isEqualTo(6)
    }

    @Test
    fun maxAreaOfIsland2() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0)
        )
        val result = target.maxAreaOfIsland(grid)
        assertThat(result).isEqualTo(0)
    }
}