package crawlerLogFolder

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SolutionTest {
    val target = Solution()

    @Test
    fun minOperations() {
        val actual = target.minOperations(arrayOf("d1/", "d2/", "../", "d21/", "./"))
        assertThat(actual).isEqualTo(2)
    }
    @Test
    fun minOperations2() {
        val actual = target.minOperations(arrayOf("d1/","d2/","./","d3/","../","d31/"))
        assertThat(actual).isEqualTo(3)
    }
    @Test
    fun minOperations3() {
        val actual = target.minOperations(arrayOf("d1/","../","../","../"))
        assertThat(actual).isEqualTo(0)
    }
}