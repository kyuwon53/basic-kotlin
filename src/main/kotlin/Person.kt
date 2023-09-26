// 기본 생성자를 파라미터로 바로 선언
// 앞에 data를 붙이면 equals, toString 등의 기능이 들어감
// data class Person(val name: String, var age: Int)
class Person(
    val name: String,
    var age: Int
) {
    var hobby = "축구"
        private set // 외부에서 변경 불가능
        get() = "취미: $field"  // 게터를 재정의 할 수 있음. 게터안에서 호출하는 변수는 $field로

    init {
        println("init")
    }

    fun some() {
        hobby = "농구"
    }
}

fun main() {
    val john = Person("John", 20)
    println(john.name)
    println(john.age)
    // 게터 세터 필요없이. val(불변) var(가변)을 사용하여 조절 할 수 있다.
    // 기본적으로 public이고 변수 앞에 private을 선언하면 게터를 제공하지 않느다.
    val john2 = Person("John", 20)

    println(john)
    println(john2)
    println(john == john2) // false
}


