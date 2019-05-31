package twosum

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class TwoSumTest {

    private lateinit var twoSum: Solution
    @Before
    fun before() {
        twoSum = Solution()
    }

    // OKケース１
    @Test
    fun SampleTest001() {
        var result = twoSum.twoSum(intArrayOf(1), 9)
        assertEquals(2, result.size)
    }

    @Test
    fun ExampleTest() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        var result = twoSum.twoSum(nums, target)

        assertEquals(2, result.size)
        assertEquals(0, result[0])
        assertEquals(1, result[1])
    }
    @Test
    fun ExampleTest2() {
        val nums = intArrayOf(3, 2, 3)
        val target = 6
        var result = twoSum.twoSum(nums, target)

        assertEquals(2, result.size)
        assertEquals(0, result[0])
        assertEquals(2, result[1])
    }
}