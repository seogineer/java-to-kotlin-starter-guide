package lec12

class Person private constructor (
    var name: String,
    var age: Int,
) {

    companion object Factory : Log {  // 클래스와 동행하는 유일한 오브젝트
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }

}
