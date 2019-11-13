package searchInsertPosition

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class SearchInsertPositionTest {
    private lateinit var target : Solution

    @Before
    fun setup() {
        target = Solution()
    }
    @Test
    fun searchInsert() {
        val actual = target.searchInsert(intArrayOf(1,3,5,6), 5)

        assertThat(actual).isEqualTo(2)
    }
}