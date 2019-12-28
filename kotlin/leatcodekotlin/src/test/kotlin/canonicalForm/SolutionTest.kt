package canonicalForm

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
    fun numUniqueEmails() {
        val emails = arrayOf(
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        )
        val result  = target.numUniqueEmails(emails)
        assertThat(result).isEqualTo(2)
    }
}