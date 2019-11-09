package houseRobber

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class HouseRobberTest {

// [1,2,3,1]
// 4


    private lateinit var target: Solution
    @Before
    fun before() {
        target = Solution()
    }

    @Test
    fun rob() {
        val houses = listOf(2, 7, 9, 3, 1)

        val result = target.rob(houses.toIntArray())

//        assertThat(result).isEqualTo(Int.MIN_VALUE)
        assertThat(result).isEqualTo(12)
//        assertThat(result).isEqualTo(4)
    }

    @Test
    fun rob2() {
        val houses = listOf(1, 2, 3, 1)

        val result = target.rob(houses.toIntArray())
        assertThat(result).isEqualTo(4)
    }

}