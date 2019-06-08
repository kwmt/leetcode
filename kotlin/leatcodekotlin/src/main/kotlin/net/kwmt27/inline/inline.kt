package net.kwmt27.inline

class Inline {

    fun test() {
        repeat {
            print("test")
        }
    }
}

inline fun repeat(fn: () -> Unit) {
    fn()
    fn()
}