fun main() {
    val box = Box(10)
    val box2 = Box("12312")

    println(box.value)
}

class Box<T>(val value: T) {

}
