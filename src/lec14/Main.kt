package lec14

fun main() {
    val dto1 = PersonDto("Seogineer", 100)
    val dto2 = PersonDto("Seogineer", 100)
    println(dto1 == dto2)

    val dto3 = PersonDto("Seogineer", 100)
    println(dto3)

    handleCar(Avante())
}

private fun handleCountry(country: Country) {
    when (country) {    // if문 대신 사용할 수 있고, else가 필요없다. Enum클래스에 변화가 생기면 경고 표시를 한다.
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}
