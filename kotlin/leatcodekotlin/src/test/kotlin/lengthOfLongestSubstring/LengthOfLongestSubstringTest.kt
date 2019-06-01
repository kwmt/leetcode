package lengthOfLongestSubstring

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class LengthOfLongestSubstringTest {

    private lateinit var target : Solution

    @Before
    fun setup() {

        target = Solution()
    }

    @Test
    fun lengthOfLongestSubstringTest() {
        val result = target.lengthOfLongestSubstring("test")
        assertEquals(0, result)
    }
}