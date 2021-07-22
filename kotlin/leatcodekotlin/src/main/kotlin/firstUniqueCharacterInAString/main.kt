package firstUniqueCharacterInAString

class Solution {
    data class CounterWithIndex(
        val counter: Int,
        val index: Int
    )

    fun firstUniqChar(s: String): Int {
        val map = hashMapOf<Char, CounterWithIndex>()
        var i = 0
        for (c in s) {
            val data: CounterWithIndex? = map[c]

            if (data != null) {
                map[c] = data.copy(counter = data.counter + 1)
                i++
                continue
            }

            map[c] = CounterWithIndex(1, i)
            i++
        }
        // 1より大きいものは考慮しない
        // 1よ理大きいものを除いたものなかから、indexが最小のものを返す。
        // 見つからなかったら -1を返す。
        return map.filterNot { it.value.counter > 1 }.values.minBy { it.index }?.index ?: -1
    }
}