package org.example.chap4
//
//import java.time.Period
//import java.util.ArrayList
//
//interface JSONFactory<T> {
//    fun fromJSON(jsonText: String): T
//}
//
//class Person4_28(val name: String) {
//    companion object : JSONFactory<Person> {
//        override fun fromJSON(jsonText: String): Person {
//            TODO()
//        }
//
//    }
//}
//
//
//fun <T> loadFromJSON(factory: JSONFactory<T>): T {
//    TODO()
//}


fun main() {
//    val myn = "\\n";
//    println("myn = ${myn}")
//
//    val str = "설명문 안에 \\n, \\b, \\r, \\t 가 들어있습니다. 수정 후 등록해주세요"
//    println("str = ${str}")
//    println((str).contains(myn))



    val singleQuoteWithSingleSlash = "만나서 반가워요\n"
    val tripleQuoteWithSingleSlash = """만나서 반가워요\n"""
    val singleQuoteWithDoubleSlash = "만나서 반가워요\\n"
    val myTrimMargin = """만나서 반가워요
        |
    """.trimMargin()

    println("is singleQuoteWithSingleEnter is same with tripleQuoteWithSingleEnter : ${singleQuoteWithSingleSlash == tripleQuoteWithSingleSlash}")
    println("is singleQuoteWithSingleEnter is same with tripleQuoteWithSingleEnter : ${singleQuoteWithDoubleSlash == tripleQuoteWithSingleSlash}")
    println(myTrimMargin == singleQuoteWithSingleSlash)



}

//private fun String.contains(spaceChar: ArrayList<String>) {
//    TODO("Not yet implemented")
//}
