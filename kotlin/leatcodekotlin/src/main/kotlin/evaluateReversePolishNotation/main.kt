package evaluateReversePolishNotation

class Solution {
    private var tokens: Array<String> = emptyArray()
    private var stack: ArrayList<Int> = arrayListOf()
    private var result: Int = 0

    fun evalRPN(tokens: Array<String>): Int {
        this.tokens = tokens
        calculate(0)
        return result
    }

    private fun calculate(i: Int) {
        val nextIndex = i + 1
        // 次のindexがTokensサイズを超えていたら、計算終了
        if (nextIndex > tokens.size) {
            result = stack.pop()
            return
        }
        val currentToken = tokens[i]


        val calcResult = when (currentToken) {
            "+" -> add()
            "-" -> minus()
            "*" -> multiple()
            "/" -> div()
            else -> currentToken.toInt()
        }
        stack.push(calcResult)
        calculate(nextIndex)
    }

    // stackから2つ取り出して、足し算する
    private fun add(): Int {
        val (first, second) = pop2()
        return first + second
    }

    private fun minus(): Int {
        val (first, second) = pop2()
        return first - second
    }

    private fun multiple(): Int {
        val (first, second) = pop2()
        return first * second
    }

    private fun div(): Int {
        val (first, second) = pop2()
        return (first.toDouble() / second.toDouble()).toInt()
    }

    /**
     * スタックから2つ取り出してPairで返す。
     * 先に入れたほうをfirst, 後に入れたほうがsecond
     */
    private fun pop2(): Pair<Int, Int> {
        val second = stack.pop()
        val first = stack.pop()
        return first to second
    }

    private fun ArrayList<Int>.pop(): Int {
        return this.removeAt(lastIndex)
    }

    private fun ArrayList<Int>.push(value: Int) {
        this.add(value)
    }
}