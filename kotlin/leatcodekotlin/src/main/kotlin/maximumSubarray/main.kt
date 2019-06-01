package maximumSubarray

import kotlin.math.max

class Solution {

    // https://youtu.be/2MmGzdiKR9Y
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        val list = arrayListOf(max)

        for (i in 0 until nums.size - 1) {
            val next = nums[i + 1]
            max = max(next, max + next)
            list.add(max)
        }
        return list.max()!!
    }
}