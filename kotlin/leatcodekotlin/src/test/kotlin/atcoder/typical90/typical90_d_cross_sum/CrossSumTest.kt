package atcoder.typical90.typical90_d_cross_sum

import atcoder.utils.judge
import org.junit.Test


class CrossSumTest {
    @Test
    fun test() {
        val input: String = """
            3 3
            1 1 1
            1 1 1
            1 1 1
        """.trimIndent()
        val output: String = """
5 5 5
5 5 5
5 5 5
        """.trimIndent()

        judge(input, output) {
            val crossSum = CrossSum()
            crossSum.main()
        }
    }
}
