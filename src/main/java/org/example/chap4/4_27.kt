package org.example.chap4

// companion object 에 이름을 붙일 수도 있다.
class Person4_27(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String): Person = Person("Hello")
    }
}

fun main() {

}