import kotlin.math.max
import kotlin.random.Random

/*
* 자바에서 제공하는 Max도 쓸 수 있지만, 코틀린에서 제공하는 Max를 사용하자
* */
fun main() {
    var i = 10
    var j = 20
    println(max(i, j))

    val randomNumber = Random.nextInt()
    println(randomNumber)

    val randomNumberRange = Random.nextInt(0, 100) // 0 ~ 99
    println(randomNumberRange)

    var randomNumberDouble = Random.nextDouble(0.0, 1.0)
    println(randomNumberDouble)
}
