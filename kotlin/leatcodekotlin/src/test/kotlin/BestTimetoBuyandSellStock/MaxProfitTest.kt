package BestTimetoBuyandSellStock

import BestTimetoBuyandSellStock2.Solution
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MaxProfitTest {

    private lateinit var target: Solution

    @Before
    fun setup() {

        target = Solution()
    }

    @Test
    fun maxProfitTest1() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        val result = target.maxProfit(prices)
        assertEquals(5, result)

    }
}