package BestTimetoBuyandSellStock

class Solution {
    fun maxProfit(prices: IntArray): Int {

        var min = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < min) {
                min = price
            } else if (price - min > maxProfit) {
                maxProfit = price - min
            }
        }
        return maxProfit

    }
}