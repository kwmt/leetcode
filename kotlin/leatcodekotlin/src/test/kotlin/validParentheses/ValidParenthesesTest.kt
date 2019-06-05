package validParentheses

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class ValidParenthesesTest {

    private lateinit var target: Solution

    @Before
    fun setup() {

        target = Solution()
    }

    @Test
    fun isValidTest1() {
        val s = "()"
        val result = target.isValid(s)
        assertTrue(result)

    }
//    @Test
//    fun popTest() {
//        val s = arrayListOf("(", ")")
//        s.pop()
//
//        assertEquals(1, s.size)
//
//    }
}