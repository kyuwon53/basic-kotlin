fun main() {
    var i = 5

    if (i > 10) {
        println("10보다 크다")
    } else if (i > 5) {
        println("5보다 크다")
    } else {
        println("")
    }
    /*
    * if문은 when문으로 치환이 가능하다. when은 자바의 select 문과 흡사하지만 훨씬 강력하다
    * 조건문이 들어있고 화살표로 표시됨
    * */
    when {
        i > 10 -> {
            println("10보다 크다")
        }

        i > 5 -> {
            println("5보다 크다")
        }

        else -> {
            println("5입니다")
        }
    }
    /*
     * 리턴 문을 쓰고 싶을 때 조건문 자체를 변수로 받을 수 있다.
     * 코틀린은 식으로 취급받기 때문에 변수로 받는게 가능하다.
     */

    var result = when {
        i > 10 -> {
            "10보다 크다"
        }

        i > 5 -> {
            "5보다 크다"
        }

        else -> {
            "5입니다"
        }
    }
    println(result)

    /*
    * 자바에서의 삼항 연산자
    * boolean resutl = i > 10 ? true : false;
    * */
    var it = 5
    val operator = if (1 > 10) true else false
}
