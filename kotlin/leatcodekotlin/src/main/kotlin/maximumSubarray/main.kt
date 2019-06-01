package maximumSubarray

import kotlin.math.max

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var result = Int.MIN_VALUE

        var list = arrayListOf<Int>()
        var count = 0
        var i = 0

        if(nums.size == 1) {
            return nums[0]
        }

        if(nums.size == 2) {
            return max(nums[0], nums[1])
        }


        val (max, index) = nums.max()



        val left = nums.take(index)
        val right = nums.drop(index)

        var maxIndex = right.size
        if (left.size < right.size) {
            maxIndex = left.size
        }

        for (i in 0 until maxIndex) {
            val r = right[i]
            val l = left[(left.size - 1) - i]

            result = max(l + max, r + max)
        }


        return result
    }

    fun IntArray.max(): Pair<Int, Int> {
        var index = 0
        var max = this[index]

        for (i in 1..lastIndex) {
            val e = this[i]
            if (max < e) {
                max = e
                index = i
            }
        }
        return Pair(max, index)
    }
//    fun maxSubArray(nums: IntArray): Int {
//
//        var result = Int.MIN_VALUE
//
//        for (i in nums.indices) {
//            for (j in nums.indices) {
//                if (nums.size == 1) {
//                    return nums[0]
//                }
//
//                if (j + i == nums.size) {
//                    break
//                }
//                val sum = nums.slice(IntRange(i, j + i)).reduce { n1, n2 -> n1 + n2 }
//                result = max(result, sum)
//            }
//        }
//
//        return result
//    }

}