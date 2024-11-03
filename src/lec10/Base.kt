package lec10

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
        // 상위 클래스에 constructor와 init 블락에서는 하위 클래스의 field에 접근하면 안 된다
        // 하위 클래스에서 ovrride하고 있는 프로퍼티에 접근하면 안 된다.
        // 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피한다.

        // 상위 클래스의 constructor가 먼저 실행되는 단계라서
        // 아직 하위 클래스의 number가 초기화되지 않은 상태이기 때문에
        // 0이 출력된다.
    }
}
