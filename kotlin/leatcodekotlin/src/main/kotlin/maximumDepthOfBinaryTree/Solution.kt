package maximumDepthOfBinaryTree

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        var left = 1
        var right = 1


        if (root.left != null) {
            left = 1 + maxDepth(root.left)
        }
        if (root.right != null) {
            right = 1 + maxDepth(root.right)
        }

        return if (left >= right) {
            left
        } else {
            right
        }
    }
}