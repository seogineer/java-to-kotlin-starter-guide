package lec12

fun main() {
    // Singleton Example
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // Anonymous function
    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
