package lec06

fun main() {
    // for-each
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    // for
    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    // while
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}
