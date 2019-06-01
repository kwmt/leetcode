package maximumSubarray

import kotlin.math.max

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var result = Int.MIN_VALUE

        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums.size == 1) {
                    return nums[0]
                }

                if (j + i == nums.size) {
                    break
                }
                val sum = nums.slice(IntRange(i, j + i)).reduce { n1, n2 -> n1 + n2 }
                result = max(result, sum)
            }
        }

        return result
    }

}