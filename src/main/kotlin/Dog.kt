fun main() {

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
class Dog : Animal(){
    override fun move() {
        println("우다다")
    }
}

class Cat : Animal() {
    override fun move() {
        println("살금")
    }
}
