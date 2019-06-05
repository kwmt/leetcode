package kthLargestElementInAStream

class KthLargest(val k: Int, val nums: IntArray) {

    private var numList = arrayListOf<Int>()

    init {
        nums.sortDescending()
        numList = nums.toCollection(ArrayList())
    }

    fun add(`val`: Int): Int {
        numList.add(`val`)
        numList.sortDescending()
        return numList[k - 1]
    }
}