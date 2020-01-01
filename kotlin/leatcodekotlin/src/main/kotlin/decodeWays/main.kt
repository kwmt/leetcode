package decodeWays

class Solution {


//    fun numDecodings(s: String): Int {
//        val dp = IntArray(s.length + 1).also {
//            it[0] = 1
//            it[1] = if (s.elementAt(0) == '0') 0 else 1
//        }
//        for (i in 2..s.length) {
//            val oneDigit = s.substring(i - 1 until i).toInt()
//            val twoDigits = s.substring(i - 2 until i).toInt()
//            if (oneDigit >= 1) {
//                dp[i] += dp[i - 1]
//            }
//            if (twoDigits in 10..26) {
//                dp[i] += dp[i - 2]
//            }
//        }
//        return dp[s.length]
//    }

    private var input: String = ""
    val dp by lazy { Array(input.length + 1) { -1 } }
    fun numDecodings(s: String): Int {
        this.input = s

        return rec(0)
    }

    private fun rec(ptr: Int): Int {
        //
        if (ptr >= input.length) return 1
//        println(input[ptr])
        // すでに計算済み
        if (dp[ptr] > -1) return dp[ptr]

        var total = 0
        for (i in 1..2) {
            if (ptr + i > input.length) continue
            val sub = input.substring(ptr, ptr + i)
//            println(sub)
            if (!isValid(sub)) continue
//            total += rec(ptr + i)
            val t = rec(ptr + i)
            total += t
        }

        dp[ptr] = total
        return dp[ptr]


    }

    private fun isValid(s: String): Boolean {
        if (s.isEmpty() || s[0] == '0') return false
        return s.toInt() in 1..26
    }

}