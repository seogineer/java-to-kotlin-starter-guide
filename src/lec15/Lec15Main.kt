package lec15

fun main() {
    val array = arrayOf(100, 200).plus(300)

    // index
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    //index and value
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }


//    val numbers = listOf(100, 200)    // 읽기 전용
    val numbers = mutableListOf(100, 200)
    numbers.add(300)

    val emptyList = emptyList<Int>()    // 타입을 지정한다.
    printNumbers(emptyList())   // 타입을 Int로 추론할 수 있기 때문에 생략


    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }


    val numbers2 = setOf(100, 200)
//    val numbers2 = mutableSetOf(100, 200)

    for (number in numbers2) {
        println(number)
    }

    for ((idx, value) in numbers2.withIndex()) {
        println("$idx $value")
    }


    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>) {  // 타입을 Int로 지정

}
