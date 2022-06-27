package crawlerLogFolder

import java.util.Stack

class Solution {
    fun minOperations(logs: Array<String>): Int {
        val stack = Stack<String>()

        for (log in logs) {
            val value = log.slice(0 until (log.length - 1))
            if (value == ".") {
                continue
            }


            if (!stack.empty()) {
                if (value == "..") {
                    stack.pop()
                    continue
                }
            } else {
                if (value == "..") {
                    continue
                }
            }
            stack.push(log)
        }
        return stack.size
    }
}