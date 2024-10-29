package lec09

class Person(
    // 주 생성자: 필수임.
//    val name: String = "Seogineer",
    name: String = "Seogineer",
    var age: Int = 1
) {
    // 가장 먼저 실행된다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    // 두번째 생성자부터는 생성자를 여기에 정의할 수 있다.
    // 부 생성자: 필수 아님.
    constructor(name: String) : this(name, 1) {
        println("부생성자 1")
    }

    constructor() : this("홍길동") {
        println("부생성자 2")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

//    val isAdult: Boolean
//        get() {
//            return this.age >= 20
//        }

    val isAdult: Boolean
        get() = this.age >= 20

//    val name = name
//        get() = field.uppercase()   // 자기 자신을 가르키는 backing field

    val uppercaseName: String
        get() = this.name.uppercase()

    var name = name
        set(value) {
            field = value.uppercase()
        }
}
