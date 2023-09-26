/*
*
* 코틀린에서 전달하는 인자가 함수인 경우
* 그 함수는 밖으로 빼낼 수 있다
* 전달하는 매개변수가 함수 1개인 경우 괄호가 필요없다
* 람다 표현식이 이렇게 표현된다.
* 뒤에 {}를 안써도 된다
* */
fun main() {
    myFunc(10) {
        println("함수 호출")
    }
}

/*
* void가 아니라 Unit이다
* void는 없다
* () -> Unit 타입 함수
* */
fun myFunc(a: Int, callBack: () -> Unit) {
    println("함수 시작!!")
    callBack()
    println("함수 끝!!")
}
