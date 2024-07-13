package atcoder.typical90.typical90_d_cross_sum

class CrossSum {

    fun main() {
        val (h, w) = readln().split(" ").map { it.toInt() }

        val a: MutableList<MutableList<Int>> = MutableList(h) { MutableList(w) { 0 } }
        for (i in 1..h) {
            val line = readln().split(" ").map { it.toInt() }
            for (j in 1..w) {
                a[i - 1][j - 1] = line[j - 1]
            }
        }
        val row: MutableList<Int> = MutableList(h) { 0 }
        val column: MutableList<Int> = MutableList(w) { 0 }
        for (i in 0..(h - 1)) {
            for (j in 0..(w - 1)) {
                row[i] += a[i][j]
                column[j] += a[i][j]
            }
        }

        val answer: MutableList<MutableList<Int>> = MutableList(h) { MutableList(w) { 0 } }
        for (i in 0..(h - 1)) {
            for (j in 0..(w - 1)) {
                answer[i][j] = row[i] + column[j] - a[i][j]
            }
        }

        for (i in 0..(h - 1)) {
            for (j in 0..(w - 1)) {
                if (j >= 1) {
                    print(" ")
                }
                print(answer[i][j])
            }
            println()
        }

    }
}