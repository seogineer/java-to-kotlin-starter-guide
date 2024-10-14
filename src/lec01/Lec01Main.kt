package lec01

fun main() {
    var number1 = 10L   // var number1: Long = 10L
    val number2 = 10L

//    var number3: Long? = 1_000L   // Primtive Type과 Referene Type을 구분하지 않는다.
    var number3: Long? = 1_000L   // null이 들어갈 수 있는 변수는 Long?로 표현
    var person = Person("Seogineer")    // 객체를 인스턴스화 할 때 new를 붙이지 않는다.
}
