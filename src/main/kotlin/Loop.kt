fun main() {
    val items = listOf(1, 2, 3, 4, 5)

    for (item in items) {
        println(item)
    }
    println("========")

    items.forEach { item ->
        println(item)
    }
    println("========")
    // for (int i = 0; i < items.length; i++)
    for (i in 0..3) {
        println(i)
    }
    println("========")
    for (i in 0..(items.size - 1)) {
        println(items[i])
    }
    println("========")
    for (i in 0 until items.size) {
        println(items[i])
    }

    //while문은 자바와 동일
}
