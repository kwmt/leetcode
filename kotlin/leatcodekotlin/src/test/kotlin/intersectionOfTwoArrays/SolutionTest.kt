package intersectionOfTwoArrays

import org.junit.Before
import org.junit.Test
import com.google.common.truth.Truth.assertThat


class SolutionTest {

    private lateinit var target: Solution

    @Before
    fun setUp() {
        target = Solution()
    }

    @Test
    fun intersection() {
        val num1 = intArrayOf(1, 2, 2, 1)
        val num2 = intArrayOf(2, 2)
        val result = target.intersection(num1, num2)
        assertThat(result.toList()).containsAnyIn(listOf(2))
    }

    @Test
    fun intersection2() {
        val num1 = intArrayOf(4, 9, 5)
        val num2 = intArrayOf(9, 4, 9, 8, 4)
        val result = target.intersection(num1, num2)
        assertThat(result.toList()).containsAnyIn(listOf(9, 4))
    }
}