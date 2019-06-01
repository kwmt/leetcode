package MaximumSubarray

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MaximumSubarrayTest {

    private lateinit var target : Solution

    @Before
    fun setup() {

        target = Solution()
    }

    @Test
    fun maxSubArrayTest1() {
        val result = target.maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))
        Assert.assertEquals(6, result)
    }

}