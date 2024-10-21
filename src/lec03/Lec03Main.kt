package lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()    // 타입 변환 메소드를 사용하여 명시하여야 함

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L // null인 경우 적절한 처리 필요

    printAgeIfPerson2(null)
    printAgeIfPerson2(1)

    val person = Person("Seogineer", 100)
    println("이름 : ${person.name}")  // 가독성, 통일성 측면에서 사용 권장

    val name = "Seogineer"
    println("이름 : $name")

    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[0])    // charAt과 동일
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
//        val person = obj as Person    // as T으로 타입 명시
//        println(person.age)

        println(obj.age)    // 모두 생략 후 사용 가능
    }

    if (obj !is Person) {   // not 연산 사용 예
        // some things...
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)    // null인 경우 null, Type이 아니어도 null
}

/**
 * 코틀린에만 존재하는 타입
 *
 * Any: 자바의 Object 역할
 * Unit: 자바의 void 역할
 * Nothing: 함수가 정상적으로 끝나지 않았다는 사실을 표현
 */
