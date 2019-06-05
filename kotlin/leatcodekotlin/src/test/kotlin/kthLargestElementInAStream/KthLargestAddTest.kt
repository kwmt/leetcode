package kthLargestElementInAStream

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class KthLargestAddTest {
    @Test
    fun sortTest() {
        val target = KthLargest(3, intArrayOf(4, 5, 8, 2))
        assertTrue(target.nums.contentEquals(intArrayOf(8, 5, 4, 2)))
    }

    @Test
    fun test1() {
        val target = KthLargest(3, intArrayOf(4, 5, 8, 2))
        assertEquals(4, target.add(3))
        assertEquals(5, target.add(5))
        assertEquals(5, target.add(10))
        assertEquals(8, target.add(9))
        assertEquals(8, target.add(4))
    }
}