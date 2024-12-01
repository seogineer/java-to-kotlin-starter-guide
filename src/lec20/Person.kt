package lec20

class Person constructor (
    var name: String,
    var age: Int,
) {
    var hobby = ""

    fun createPerson(
        name: String,
        age: Int,
        hobby: String,
    ): Person {
        return Person(
            name = name,
            age = age,
        ).apply {
            this.hobby = hobby
        }
    }
}
