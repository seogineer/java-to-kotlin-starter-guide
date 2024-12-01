package lec20

fun main() {
    val person = Person("홍길동", 100)

    val value1 = person.let {
        it.age
    }

    val value2 = person.run {
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    println("value1: ${value1}, value2: ${value2}, value3: ${value3}, value4: ${value4}")

    val person2 = Person("홍길동", 100)
    with(person) {
        println(name)
        println(this.age)
    }

    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println)

    val str = "apple"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!${firstItem}!"
        }.uppercase()
    println(modifiedFirstItem)

//    val numbers2 = mutableListOf("one", "two", "three")
//    println("The list elements before adding new one: ${numbers2}")
//    numbers2.add("four")

    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: ${it}") }
        .add("four")

}

fun printPerson(person: Person?) {
//    if (person != null) {
//        println(person.name)
//        println(person.age)
//    }

    person?.let {
        println(it.name)
        println(it.age)
    }
}
