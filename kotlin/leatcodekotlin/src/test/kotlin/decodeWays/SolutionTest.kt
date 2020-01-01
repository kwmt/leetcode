package decodeWays

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class SolutionTest {

    private lateinit var target : Solution

    @Before
    fun setUp() {
        target = Solution()
    }

    @Test
    fun numDecodings() {
        val result = target.numDecodings("12")
        assertThat(result).isEqualTo(2)
    }
//    @Test
//    fun numDecodings2() {
//        val result = target.numDecodings("226")
//        assertThat(result).isEqualTo(3)
//    }
//    @Test
//    fun numDecodings3() {
//        val result = target.numDecodings("239")
//        assertThat(result).isEqualTo(2)
//    }
}