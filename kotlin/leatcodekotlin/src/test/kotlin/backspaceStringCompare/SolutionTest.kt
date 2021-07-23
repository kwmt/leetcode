package backspaceStringCompare

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class SolutionTest {
    val target = Solution()
    @Before
    fun setUp() {
    }

    @Test
    fun backspaceCompare() {
        val actual = target.backspaceCompare("ab#c", "ad#c")
        assertThat(actual).isEqualTo(true)
    }
   @Test
    fun backspaceCompare2() {
        val actual = target.backspaceCompare("ab##", "c#d#")
        assertThat(actual).isEqualTo(true)
    }
   @Test
    fun backspaceCompare3() {
        val actual = target.backspaceCompare("a##c", "#a#c")
        assertThat(actual).isEqualTo(true)
    }
   @Test
    fun backspaceCompare4() {
        val actual = target.backspaceCompare("a#c", "b")
        assertThat(actual).isEqualTo(false)
    }


}