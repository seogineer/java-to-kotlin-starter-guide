package lec08

fun main() {
    repeat("Hello World")
    repeat("Hello World", useNewLine = false)

    // named argument
    // 매개변수 이름을 통해 직접 지정 가능.
    // 단, 자바 메서드에서 사용 불가능.
    printNameAndGender(name = "Seogineer", gender = "MALE")

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)    // *: spread 연산자
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat( // 기본값을 사용하여 자바의 오버라이딩과 오버로딩을 대체할 수 있다.
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
