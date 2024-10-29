package lec09

fun main() {
    val person = Person("Seogineer", 100)
    println(person.name)    // getter, setter 대신 사용 가능, Java로 작성된 클래스도 가능.
    person.age = 10
    println(person.age)
}
