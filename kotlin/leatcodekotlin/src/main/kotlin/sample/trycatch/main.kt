package sample.trycatch

import java.lang.IllegalStateException

fun main() {
    println("a")

    val b = B("hoge")
    b.age = 3

    val a = b as? A

    val b2 = a as? B ?: throw IllegalStateException()
    val b3 = a.tryCast<A, B>()

    println(b2.age)
    println(b3.age)

}


open class A(val name: String)

class B(name: String) : A(name) {
    var age: Int = 0
}


fun <T, U : T> T.tryCast(): U {
    return this as? U ?: throw  IllegalStateException()
}