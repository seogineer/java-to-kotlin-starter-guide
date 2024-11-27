package lec19

import lec19.a.printHelloWorld as printHelloWorldA
import lec19.b.printHelloWorld as printHelloWorldB

fun main() {
    // 1. Type Alias 와 as import
    printHelloWorldA()
    printHelloWorldB()

    // 2. 구조분해와 componetN 함수
    val person = Person("Seogineer", 100)
    val (name, age) = person
//    val name = person.component1()
//    val age = person.component2()
    println("이름 : ${name}, 나이 : ${age}")

    // 3. Jump와 Label
    val numbers = listOf(1, 2, 3)
    run {
        numbers.map { number -> number + 2 }
            .forEach { number -> if(number == 2) return@run println(number) }   // @run을 사용해서 break 사용
    }

    numbers.map { number -> number + 2 }
        .forEach { number -> if(number == 2) return@forEach println(number) }   // @forEach를 사용해서 continue 사용
    // 단, break과 continue를 사용하고 싶다면 for문을 사용한다.


    // 라벨을 이용해서 흐름을 조정한다.
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("${i} ${j}")
        }
    }
    // 단, 가독성을 위해서 사용하지 않는다.
}

// 1. Type Alias 와 as import
typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter /* (Fruit) -> Boolean */) {

}

data class UltraSuperGuardianTribe(val name: String)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

// 2. 구조분해와 componetN 함수
/* data */ class Person(
    val name: String,
    val age: Int
) {
    // data class가 아닌 클래스에서 구조 분해 문법을 사용하려면 operator를 사용한다.
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

// 4. TakeIf와 TakeUnless
const val number = 0

fun getNumberOrNull(): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

// 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환
fun getNumberOrNullV2(): Int? {
    return number.takeIf { it > 0 }
}

// 주어진 조건을 만족하지 않으면 그 값이, 그렇지 않으면 null이 반환
fun getNumberOrNullV3(): Int? {
    return number.takeUnless { it <= 0 }
}
