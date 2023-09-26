fun main() {

}

/*
* 인터페이스 선언 후 , 구현 클래스에 `,` 찍고 사용해주면 된다
* */
interface Drawable {
    fun draw()
}

abstract class Animal {
    open fun move() {
        print("이동")
    }
}

/*
* 코틀린은 모든게 닫혀있음
* 상속을 받아도 닫혀있음
* 오버라이드 하려면 open 키워드를 사용해야한다.
* 기본 클래스를 상속 받으려면 open 키워드를 입력해야한다
* */
class Dog : Animal(), Drawable {
    override fun move() {
        println("우다다")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

class Cat : Animal() {
    override fun move() {
        println("살금")
    }
}
