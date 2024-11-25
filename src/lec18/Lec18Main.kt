package lec18

import java.util.*

fun main() {
    // 1. 필터와 맵
    val fruits = Arrays.asList(
        Fruit(1, "사과", 1000, 1400),
        Fruit(2, "사과", 1200, 1400),
        Fruit(3, "사과", 1200, null),
        Fruit(4, "사과", 1500, 1600),
        Fruit(5, "바나나", 3000, 3400),
        Fruit(6, "바나나", 3200, 3500),
        Fruit(7, "바나나", 2500, 2800),
        Fruit(8, "수박", 10000, 12000)
    )

    val apples = fruits.filter {fruit -> fruit.name == "사과"}

    val apples2 = fruits.filterIndexed { index, fruit ->
        println(index)
        fruit.name == "사과"
    }

    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { index, fruit ->
            println(index)
            fruit.currentPrice
        }

    val values = fruits.filter { fruit -> fruit.name == "사과" }.mapNotNull { fruit -> fruit.nullOrValue() }

    // 2. 다양한 컬렉션 처리 기능
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }

    val hasOverTenThousand = fruits.any { fruit -> fruit.factoryPrice >= 10_000 }

    val fruitCount = fruits.count()

    val sortedFruits = fruits.sortedBy { fruit -> fruit.currentPrice }

    val sortedByDescendingFruits = fruits.sortedByDescending { fruit -> fruit.currentPrice }

    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }.map { fruit -> fruit.name }

    // 3. List를 Map으로
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    // 중복되지 않은 키로 Map을 만들때
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    // 과일 이름별 출고가
    val map3: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })

    // id별 출고가
    val map4: Map<Long, Long> = fruits.associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })

    val map5: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }.filter { (key, value) -> key == "사과" }

    // 4. 중첩된 컬렉션 처리
    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1_000, 1_500),
            Fruit(2L, "사과", 1_200, 1_500),
            Fruit(3L, "사과", 1_200, 1_500),
            Fruit(4L, "사과", 1_500, 1_500),
        ),
        listOf(
            Fruit(5L, "바나나", 3_000, 3_200),
            Fruit(6L, "바나나", 3_200, 3_200),
            Fruit(7L, "바나나", 2_500, 3_200),
        ),
        listOf(
            Fruit(8L, "수박", 10_000, 10_000),
        ),
    )

    // 출고가와 현재가가 동일한 과일
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter }

    val flattenedList = fruitsInList.flatten()
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}
