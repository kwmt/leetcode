package twosum

import java.lang.IllegalStateException

fun main() {

    val nums = intArrayOf(1, 3, 4)

    val result = Solution().twoSum(intArrayOf(1), 9)

}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var resultB = -1
        var resultA = 0
        for ((n, _) in nums.withIndex()) {
            val a = nums[n]

            val exceptNArray = nums.drop(n + 1)

            for ((index, elm) in exceptNArray.withIndex()) {

                if (a + elm == target) {
                    resultB = index + n + 1
                    break
                }
            }

            if (resultB == -1) {
                continue
            }
            resultA = n
            break

        }
        return intArrayOf(resultA, resultB)
    }
}