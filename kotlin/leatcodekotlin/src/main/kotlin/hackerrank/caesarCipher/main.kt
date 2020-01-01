package hackerrank.caesarCipher

//https://www.hackerrank.com/challenges/caesar-cipher-1/problem

class Solution {
    // Complete the hackerrank.caesarCipher function below.

    private var rotatedAlphabetMap = hashMapOf<String, String>()
    fun caesarCipher(s: String, k: Int): String {
        createCipher(k)

        val result = s.map {
            // 大文字の場合
            if (isUpper(it)) {
                // 必ず存在するので、例外が投げられることはない
                val r = rotatedAlphabetMap[it.toString().toLowerCase()]!!
                // 大文字に戻す
                return@map r.toCharArray().first().toString().toUpperCase()
            }
            rotatedAlphabetMap[it.toString()] ?: it.toString()

        }.joinToString("")
        return result
    }

    private fun isUpper(c: Char) = (c.toInt() + 0x20) in 0x61..0x7A

    private fun createCipher(k: Int) {
        // abc..xyzリストを作成
        val alphabet = (1..26).map {
            (0x60 + it).toChar().toString()
        }
        // alphabetからkだけ左に回転したリストを作成し、
        // 回転前と回転後のリストをマッピングする
        alphabet.forEachIndexed { index, _ ->
            // kが26を超える場合は1周以上して k/26の余りと等しくなる
            val k2 = k % 26
            val temp = if (index + k2 < alphabet.size) {
                alphabet[index + k2]
            } else {
                alphabet[index + k2 - 26]
            }
            rotatedAlphabetMap[alphabet[index]] = temp
        }
    }
}

