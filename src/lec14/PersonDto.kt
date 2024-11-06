package lec14

data class PersonDto(   // data 키워드를 사용하면 equals, hashCode, toString 메서드를 만들어 준다.
    val name: String,
    val age: Int,
) {

}
