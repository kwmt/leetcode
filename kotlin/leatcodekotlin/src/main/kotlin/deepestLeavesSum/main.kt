package deepestLeavesSum

import java.util.*

// https://leetcode.com/problems/deepest-leaves-sum/
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

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun deepestLeavesSum(root: TreeNode?): Int {
        val queue: Queue<TreeNode?> = LinkedList()
        queue.add(root)
        var sum = 0
        while (queue.isNotEmpty()) {
            sum = 0
            for (i in 0 until queue.size) {
                val q = queue.poll()
                q?.`val`?.let {
                    sum += it
                }
                if (q?.left != null) queue.add(q.left)
                if (q?.right != null) queue.add(q.right)
            }
        }
        return sum
    }

}

