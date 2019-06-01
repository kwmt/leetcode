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
    fun lengthOfLongestSubstringTest1() {
        val result = target.lengthOfLongestSubstring("abcabcbb")
        assertEquals(3, result)
    }
    @Test
    fun lengthOfLongestSubstringTest2() {
        val result = target.lengthOfLongestSubstring("bbbbb")
        assertEquals(1, result)
    }
    @Test
    fun lengthOfLongestSubstringTest3() {
        val result = target.lengthOfLongestSubstring("pwwkew")
        assertEquals(3, result)
    }
    @Test
    fun lengthOfLongestSubstringTest4() {
        val result = target.lengthOfLongestSubstring(" ")
        assertEquals(1, result)
    }
    @Test
    fun lengthOfLongestSubstringTest5() {
        val result = target.lengthOfLongestSubstring("ckilbkd")
        assertEquals(5, result)
    }
    @Test
    fun lengthOfLongestSubstringTest6() {
        val result = target.lengthOfLongestSubstring("dvdf")
        assertEquals(3, result)
    }
}