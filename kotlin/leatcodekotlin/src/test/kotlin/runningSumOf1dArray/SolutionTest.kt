package runningSumOf1dArray

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class SolutionTest {
    lateinit var target: Solution

    @Before
    fun setUp() {
        target = Solution()
    }

    @Test
    fun runningSum() {
        val actual = target.runningSum(intArrayOf(1, 2, 3, 4))
        assertThat(actual).isEqualTo(intArrayOf(1, 3, 6, 10))
        val actual2 = target.runningSum(intArrayOf(1,1,1,1,1))
        assertThat(actual2).isEqualTo(intArrayOf(1,2,3,4,5))
        val actual3 = target.runningSum(intArrayOf(3,1,2,10,1))
        assertThat(actual3).isEqualTo(intArrayOf(3,4,6,16,17))
    }
}