package hackerrank.caesarCipher

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class SolutionTest {

    private lateinit var target: Solution


    @Before
    fun setUp() {
        target = Solution()
    }



    @Test
    fun caesarCipher() {
        val result = target.caesarCipher("middle-Outz", 2)


        assertThat(result).isEqualTo("okffng-Qwvb")
    }
}