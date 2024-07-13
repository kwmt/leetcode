package firstUniqueCharacterInAString

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class SolutionTest {

    lateinit var target : Solution
    @Before
    fun setUp() {
        target = Solution()
    }

    @Test
    fun firstUniqChar() {
        val actual = target.firstUniqChar("leetcode")
        assertThat(actual).isEqualTo(0)
        val actual2 = target.firstUniqChar("loveleetcode")
        assertThat(actual2).isEqualTo(2)
//        val actual3 = target.firstUniqChar("aabb")
//        assertThat(actual3).isEqualTo(-1)
        val actual4 = target.firstUniqChar("dddccdbba")
        assertThat(actual4).isEqualTo(8)
    }
}