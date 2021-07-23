package uniquePathsII

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
    fun uniquePathsWithObstacles() {
        val input = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
        val result = target.uniquePathsWithObstacles(input)
        assertThat(result).isEqualTo(2)

    }

    @Test
    fun uniquePathsWithObstacles2() {
        val input = arrayOf(intArrayOf(0))
        val result = target.uniquePathsWithObstacles(input)
        assertThat(result).isEqualTo(1)

    }

    @Test
    fun uniquePathsWithObstacles3() {
        val input = arrayOf(intArrayOf(1))
        val result = target.uniquePathsWithObstacles(input)
        assertThat(result).isEqualTo(0)

    }

    @Test
    fun uniquePathsWithObstacles4() {
        val input = arrayOf(intArrayOf(0), intArrayOf(1))
        val result = target.uniquePathsWithObstacles(input)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun uniquePathsWithObstacles5() {

        val input = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0)
        )
        val result = target.uniquePathsWithObstacles(input)
        assertThat(result).isEqualTo(7)
    }

    @Test
    fun uniquePathsWithObstacles6() {
        val input = arrayOf(intArrayOf(1, 0))
        val result = target.uniquePathsWithObstacles(input)
        assertThat(result).isEqualTo(0)
    }
    @Test
    fun uniquePathsWithObstacles7() {
        val input = arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(0, 0))
        val result = target.uniquePathsWithObstacles(input)
        assertThat(result).isEqualTo(0)
    }

//    @Test
//    fun uniquePathsWithObstacles7() {
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [1, 0],
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [1, 0],
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [0, 0],
//        [0, 1], [0, 0], [0, 0], [1, 0], [0, 0], [0, 0], [0, 1], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 1], [0, 0], [0, 0], [0, 0], [0, 0], [1, 0], [0, 0], [0, 0], [0, 0], [0, 0]]
//
//        val input = arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(0, 0))
//        val result = target.uniquePathsWithObstacles(input)
//        assertThat(result).isEqualTo(0)
//    }

}