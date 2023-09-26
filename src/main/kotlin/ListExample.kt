fun main() {
    val items = mutableListOf<Int>(1, 2, 3, 4, 5) // 변경가능한 리스트 타입 생략 가능
    items.add(6)
    items.remove(3)

    try {
        // get 안씀
        val item = items[5]
    } catch (e: Exception) {
        println(e.message)
    }

    // Array
    val itemsArray = arrayOf(1, 2, 3, 4)
    itemsArray[0] = 10

    println(itemsArray.forEach { println(it) })
}
