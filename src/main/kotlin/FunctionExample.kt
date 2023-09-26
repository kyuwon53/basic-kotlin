fun main() {
    println(sum(1, 4))

    println(sumOverrode(5, 10))
    println(sumOverrode(b = 10, a = 5))
}

/*
* 탑레벨 함수여서 모든 파일에서 호출하여 사용할 수 있다.
* 한 줄 함수의 경우 축약 가능
* 아래 함수를 예로 들면
* fun sum(a: Int, b: Int) = a + b
*
* Input 타입은 지정해야하고 return 타입은 지정 안해도 된다.
* 오버로드해도 되지만 디폴트 값을 쓰면 오버로드처럼 쓸 수 있음
* */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumOverrode(a: Int, b: Int, c: Int = 0) = a + b + c
