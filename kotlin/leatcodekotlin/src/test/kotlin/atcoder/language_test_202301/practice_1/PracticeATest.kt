package atcoder.language_test_202301.practice_1

import atcoder.utils.judge
import org.junit.Test

class PracticeATest {
    @Test
    fun test() {
        val input: String = """
            1
            2 3
            test
        """.trimIndent()
        val output: String = """
            6 test
        """.trimIndent()

        judge(input, output) {
            val practiceA = PracticeA()
            practiceA.main()
        }
    }
}