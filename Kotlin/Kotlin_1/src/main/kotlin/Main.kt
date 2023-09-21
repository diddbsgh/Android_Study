// 9.21(목)

fun main(args: Array<String>) {
    fun main() {

//    val a:String = "1"
//    println(a)
//
//    for(i in 0..3){
//        println(i)
//    }
//
//    while(true){
//        println("무한반복")
//    }
//
//    repeat(3){
//        println(it)
//    }


        val a: Int? = null
//    val b = a ?: throw RuntimeException()  // 엘비스 연산자 뒤에 변수, 함수, exception 사용 가능
//    println(b)

        val b = a?.plus(3)


        // ?
        val c: Int? = null

        // !!
        val d: Int = 0!!


        // ?.
        c?.plus(3)

        // ?:
        c ?: throw RuntimeException()


        val aa = 3
        var bb = 4

        // aa = 5 <- 오류 생김 (val을 사용해 선언한 변수는 재정의 불가)
        bb = 6
    }
}