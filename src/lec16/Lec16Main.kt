package lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())


    val person = Person("A", "B", 100)
    person.nextYearAge()


    val train: Train = Train()
    train.isExpensive()

    val srt1: Train = Srt()
    srt1.isExpensive()

    val srt2: Srt = Srt()
    srt2.isExpensive()


    // infix 함수
    3.add(4)
    3.add2(4)
    3 add2 4

    // inline 함수
    3.add3(4)
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.add3(other: Int): Int {
    return this + other
}
