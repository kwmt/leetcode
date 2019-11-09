package BestTimetoBuyandSellStock2

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0;
        for (i in 1 until prices.size) {
            val diff = prices[i] - prices[i - 1]
            if (diff > 0) {
                profit += prices[i] - prices[i - 1]

            }
        }
        return profit
    }
}