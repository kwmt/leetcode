package evaluateReversePolishNotation

class Solution {
    private var tokens: Array<String> = emptyArray()
    private var stack: ArrayList<Int> = arrayListOf()

    fun evalRPN(tokens: Array<String>): Int {
        this.tokens = tokens
        tokens.forEach { token ->
            calculate(token)
        }
        return stack.pop()
    }

    private fun calculate(currentToken: String) = when (currentToken) {
        "+" -> add()
        "-" -> minus()
        "*" -> multiple()
        "/" -> div()
        else -> currentToken.toInt()
    }.run {
        stack.push(this)
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