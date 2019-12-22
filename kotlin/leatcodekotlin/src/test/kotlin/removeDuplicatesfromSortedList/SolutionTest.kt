package removeDuplicatesfromSortedList

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class SolutionTest {
    private lateinit var target: Solution

    @Before
    fun setup() {

        target = Solution()
    }

    @Test
    fun testA() {

        val list = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(3)
                    }
                }
            }
        }

        val result = target.deleteDuplicates(list)
        assertThat(result).isNotNull()
        assertThat(result?.value).isEqualTo(1)
        assertThat(result?.next?.value).isEqualTo(2)
        assertThat(result?.next?.next?.value).isEqualTo(3)
        assertThat(result?.next?.next?.next).isNull()
    }

    @Test
    fun testB() {

        val list = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2)
            }
        }

        val result = target.deleteDuplicates(list)
        assertThat(result).isNotNull()
        assertThat(result?.value).isEqualTo(1)
        assertThat(result?.next?.value).isEqualTo(2)
    }

}