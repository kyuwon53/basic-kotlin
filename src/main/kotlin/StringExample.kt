fun main(){
    val name = "hello"
    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])

    println(name + "world")
    // 문자열 넣는 기능
    println("$name world")
    // 문자를 붙이고 싶을 때 {}를 사용
    println("${name}world")
}
