package twosum

import java.lang.IllegalStateException
import java.util.HashMap

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

    // https://leetcode.com/problems/two-sum/solution/
    // これはLeatCodeの解 Approach 2: Two-pass Hash Table
    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement) && map[complement] != i) {
                return intArrayOf(i, map[complement]!!)
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }

    // これはLeatCodeの解 Approach 3: One-pass Hash Table
    fun twoSum3(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }
}