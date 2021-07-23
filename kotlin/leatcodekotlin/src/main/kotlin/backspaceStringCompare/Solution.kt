package backspaceStringCompare

import java.util.Stack

class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        return run(s) == run(t)
    }
    private fun run(target: String): String {
        val stack = Stack<Char>()

        for (c in target) {
            if (stack.empty() && c == '#') {
                continue
            }

            if (!stack.empty() && c == '#') {
                stack.pop()
                continue
            }

            stack.push(c)
        }
        return stack.elements().toList().joinToString("")
    }
}