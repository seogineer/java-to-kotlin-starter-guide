package lec13

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    inner class LivingRoom(
        private val area: Double,
    ) {
        val address: String
            get() = this@House.address  // 바깥 클래스를 사용하고 싶다면 inner 키워드와 this@를 사용해서 참조한다.
    }

}
