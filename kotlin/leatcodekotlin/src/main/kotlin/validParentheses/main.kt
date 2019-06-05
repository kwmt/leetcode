package validParentheses

class Solution {

    fun isValid(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }

        val stack = arrayListOf<Char>()

        for (c in s) {
            val pop = stack.pop()

            if (pop == null) {
                stack.push(c)
                continue
            }

            val (isPopOpen, popIndex) = openOrClose(indexOfParentheses(pop))
            val (isCOpen, cIndex) = openOrClose(indexOfParentheses(c))

            if ((isPopOpen && !isCOpen) && isPair(popIndex, cIndex)) {
                continue
            } else {
                stack.push(pop)
                stack.push(c)
                continue
            }

        }


        return stack.isEmpty()
    }

    private fun indexOfParentheses(c: Char): Int {
        var i = 0
        for (p in Parentheses) {
            if (c == p) {
                return i
            }
            i++
        }
        return i
    }

    // open true, close false
    private fun openOrClose(index: Int): Pair<Boolean, Int> {
        return Pair(index % 2 == 0, index)
    }


    fun isPair(openIndex: Int, closeIndex: Int): Boolean {
        return closeIndex - openIndex == 1
    }

    companion object {
        const val Parentheses = "(){}[]"
    }

    private fun ArrayList<Char>.pop(): Char? {
        val lastIndex = this.lastIndex
        if (lastIndex == -1) {
            return null
        }
        val ret = this.last()
        val d = this.dropLast(1)
        this.clear()
        this.addAll(d)
        return ret

    }

    private fun ArrayList<Char>.push(c: Char) {
        this.add(c)
    }
}

