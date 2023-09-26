// 컴파일 타임  상수면 main 함수 바깥에 선언 main보다 우선적으로 선언됌
const val num = 20

fun main() {
    print("Hello World")
    var i = 10 // 변수
    /*
    * 코틀린은 타입 추론기능이 있어서 별도로 타입 지정을 안해도 되지만
    * 별도로 타입을 지정할 때는 변수 선언 뒤에 : 을 찍고 명시할 수 있음
    * 모든 타입들이 레퍼런스 타입을 가지고 있다.
    * */
    var point: Double = 3.3
    var name: String = "규원"

    // 상수
    // 재대입이 불가능 Java의 final
    val num = 20

    // 형변환
    var it = 10
    var l = 20L

    l = it.toLong() // 타입 캐스팅 자동 안됨  l  = (Long) it 안됨
    i  = l.toInt()

    var text = ""
    text = it.toString() // 데이터 변환은 .toXXX

}

