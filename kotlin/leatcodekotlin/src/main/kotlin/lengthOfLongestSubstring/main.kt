package lengthOfLongestSubstring

import kotlin.math.max
import java.util.HashSet


class Solution {
    /**
     * Given a string, find the length of the longest substring without repeating characters.

    Input: "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    Input: "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Input: "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()
        val n = s.length

        var i = 0
        var j = 0
        var ans = 0
        while (i < n && j < n) {
            if (!set.contains(s[j])) {
                set.add(s[j++])
                ans = max(ans, j - i)
            } else {
                set.remove(s[i++])
            }
        }

        return ans

    }
}