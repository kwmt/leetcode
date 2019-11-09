package houseRobber

import kotlin.math.abs
import kotlin.math.max

class Solution {
    private val dp = arrayListOf<Int>()

    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]

        dp.add(nums[0])
        dp.add(max(nums[0], nums[1]))

        for (i in 2 until nums.size) {
            dp.add(max(dp[i - 2] + nums[i], dp[i - 1]))
        }
        return dp[nums.size - 1]
    }

    fun min(a: Int, b: Int): Int = if (a < b) {
        a
    } else {
        b
    }

//    fun max(a: Int, b: Int): Int = if (a > b) {
//        a
//    } else b
}

// 1,2,3,1
// dp[0] = max(nums[0] + nums[0+2], nums[1] + nums[1+2])


// 2,7,9,3,1
// dp[0] = max(nums[0] + nums[0+2], nums[1] + nums[1+2]) // 11

// 2,9,7,3,1
// dp[0] = max(nums[0] + nums[0+2], nums[1] + nums[1+2]) // 12

