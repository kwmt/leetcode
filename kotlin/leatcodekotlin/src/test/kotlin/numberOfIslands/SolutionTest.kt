package numberOfIslands

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
    fun numIslands() {
        val input = listOf(
            "11110",
            "11010",
            "11000",
            "00000"
        )
        val grid = input.map { it.toCharArray() }.toTypedArray()
        val result = target.numIslands(grid)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun numIslands2() {
        val input = listOf(
            "11000",
            "11000",
            "00100",
            "00011"
        )
        val grid = input.map { it.toCharArray() }.toTypedArray()
        val result = target.numIslands(grid)
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun numIslands3() {
        val input = listOf(
            "1011011"
        )
        val grid = input.map { it.toCharArray() }.toTypedArray()
        val result = target.numIslands(grid)
        assertThat(result).isEqualTo(3)
    }
}