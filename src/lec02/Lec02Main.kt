package lec02

import kotlin.IllegalArgumentException

fun main() {
    val str: String? = "ABC"
//    println(str.length)   // null이 들어갈 수 있는 변수를 호출했기 때문에 실행 불가
    println(str?.length)    // safe call: null이 아닌 경우에만 실행

    val str2: String? = null
    println(str2?.length ?: 0)   // Elvis 연산자: null인 경우 반환값 지정

//    println(startsWithA4(null))

    val person = Person("공부하는 개발자") // 플랫폼 타입: 어노테이션이 없어서 null인지 아닌지 알 수 없는 경우
    startsWithA5(person.name)   // Person 객체의 getName()이 @Nullable 또는 @NotNull 인가에 따라 값의 null 여부를 검사한다.
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")

//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다")
//    }
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")

//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")    // null이 절대 들어올 수 없는 경우, 만약 null인 경우 NPE 발생
}

fun startsWithA5(str: String): Boolean {
    return str.startsWith("A")
}
