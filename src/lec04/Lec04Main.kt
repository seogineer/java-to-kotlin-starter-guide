package lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {  // 객체를 비교할 때 compareTo를 자동으로 호출한다.
        println("Money1이 Money2보다 금액이 큽니다")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4)  // true
    println(money3 === money5)  // false
    println(money3 == money5)  // true

    val money6 = Money(1_000L)
    val money7 = Money(2_000L)
    println(money6 + money7)    // Money(amount=3000)
}
