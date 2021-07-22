package runningSumOf1dArray

    class Solution {
        fun runningSum(nums: IntArray): IntArray {
            val a = IntArray(nums.size)
            for ((i, _) in nums.withIndex()) {
                val d = nums.slice(0 until i + 1)
                a[i] = sum(d)
            }
            return a
        }

        private fun sum(nums: List<Int>): Int {
            return nums.sum()
        }
    }