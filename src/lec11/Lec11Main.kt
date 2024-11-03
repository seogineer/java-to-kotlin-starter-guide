package lec11

/*
* public: 기본값, 어디서든 접근 가능
* protected: 파일(최상단)에는 사용 불가능
* internal: 같은 모듈에서만 접근 가능
* private: 같은 파일 내에서만 접근 가능
*/

// public 이외에 다른 접근 제어자를 생성자에 사용하고 싶다면 아래와 같이 사용
class Car /* internal constructor */ (
    /* 1번 방법 */ internal val name: String,
    private var owner: String,
    _price: Int,
) {
    var price = _price
        /* 2번 방법 */ private set
}

/*
* 프로퍼티의 가시성을 제어 하는 방법
*  1. val 혹은 var 앞에 internal, public 등을 붙여서
*     getter, setter 한 번에 접근 지시어를 정하는 방법
*  2. custom getter 혹은 custom setter를 만들고 접근 지시어를 붙이는 방법
*/
