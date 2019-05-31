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


    @Test
    fun TwoSumTest() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        var result = twoSum.twoSum(nums, target)

        assertEquals(2, result.size)
        assertEquals(0, result[0])
        assertEquals(1, result[1])
    }
    @Test
    fun TwoSumTest2() {
        val nums = intArrayOf(3, 2, 3)
        val target = 6
        var result = twoSum.twoSum(nums, target)

        assertEquals(2, result.size)
        assertEquals(0, result[0])
        assertEquals(2, result[1])
    }

    @Test
    fun TwoSum2Test() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        var result = twoSum.twoSum2(nums, target)

        assertEquals(2, result.size)
        assertEquals(0, result[0])
        assertEquals(1, result[1])
    }
    @Test
    fun TwoSum2Test2() {
        val nums = intArrayOf(3, 2, 3)
        val target = 6
        var result = twoSum.twoSum2(nums, target)

        assertEquals(2, result.size)
        assertEquals(0, result[0])
        assertEquals(2, result[1])
    }

    @Test
    fun TwoSum3Test() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        var result = twoSum.twoSum3(nums, target)

        assertEquals(2, result.size)
        assertEquals(0, result[0])
        assertEquals(1, result[1])
    }
    @Test
    fun TwoSum3Test2() {
        val nums = intArrayOf(3, 2, 3)
        val target = 6
        var result = twoSum.twoSum3(nums, target)

        assertEquals(2, result.size)
        assertEquals(0, result[0])
        assertEquals(2, result[1])
    }
}