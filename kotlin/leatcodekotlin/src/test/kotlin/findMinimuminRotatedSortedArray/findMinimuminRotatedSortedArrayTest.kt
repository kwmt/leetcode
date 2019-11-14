package findMinimuminRotatedSortedArray

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class findMinimuminRotatedSortedArrayTest {
    private lateinit var target: Solution
    @Before
    fun before() {
        target = Solution()
    }

    @Test
    fun test1() {
        val actual = target.findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2))
        assertThat(actual).isEqualTo(0)
    }

    @Test
    fun test2() {
        val actual = target.findMin(intArrayOf(3, 4, 5, 1, 2))
        assertThat(actual).isEqualTo(1)
    }

    @Test
    fun test3() {
        val actual = target.findMin(intArrayOf(1))
        assertThat(actual).isEqualTo(1)
    }

    @Test
    fun test4() {
        val actual = target.findMin(intArrayOf(2, 1))
        assertThat(actual).isEqualTo(1)
    }

    @Test
    fun test5() {
        val actual = target.findMin(intArrayOf(3, 1, 2))
        assertThat(actual).isEqualTo(1)
    }

}