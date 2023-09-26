fun main() {
    /*
     * 코틀린에서는 null을 대입하려면 ? 를 넣어야 가능하다
     */
    var name: String? = null
    name = "규원"

    var name2: String = ""
    /*
    * null 체크를 해줘야 name이 null safe한 String 타입이 되기 때문에 대입이 가능하다
    *
    * !! 표를 강제로 붙여서 쓸 수도 있지만 안티 패턴이다. null 체크를 사용
    * */
    if (name != null) {
        name2 = name
    }
    //* !! 표를 강제로 붙여서 쓸 수도 있지만 안티 패턴이다. null 체크를 사용
    name2 = name!!
    // null이 아니라면 let 구문을 실행
    name?.let {
        name2 = name
    }

}
