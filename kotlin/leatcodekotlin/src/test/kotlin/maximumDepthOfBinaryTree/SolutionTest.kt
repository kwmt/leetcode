package maximumDepthOfBinaryTree

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class SolutionTest {
    lateinit var target: Solution

    @Before
    fun setUp() {
        target = Solution()
    }

    @Test
    fun maxDepth() {
        val data = listOf(3, 9, 20, null, null, 15, 7)
        val root = Solution.TreeNode(data.first()!!)

        for (d in data) {
            if (root.left == null && d != null) {
                root.left = Solution.TreeNode(d)
            }
            if (root.right == null && d != null) {
                root.right = Solution.TreeNode(d)
            }
        }

        Solution.TreeNode(3)
        val actual = target.maxDepth(null)
        assertThat(actual).isEqualTo(0)
    }
}