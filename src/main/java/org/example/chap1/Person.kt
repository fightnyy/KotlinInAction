package org.example.chap1

import org.example.chap1.Color.*
import java.lang.Exception

data class Person(val name: String, val age: Int? = null)


val function = simpleFunction()


fun simpleFunction() {
    println("이건 간단함 함수입니다.")
}

fun nothing() {

}

fun run() {
    simpleParamFunction(nothing())
}

fun simpleParamFunction(argFunction: Unit): String {
    return "파라미터를 함수로 받았습니다."
}

fun returnFunction(): () -> Unit {
    return fun() {
        println("함수를 반환해줍니다.")
    }
}

//fun renderPersonList(persons: Collection<Person>) = createHTML().table {
//    for (person in persons) {
//        tr {
//            td { +person.name }
//            td { +person.age }
//        }
//    }
//}

fun findPerson(operation: (Person) -> Boolean) {

}

fun simplicity() {
    val persons = listOf<Person>(Person("n"), Person("n"), Person("n"), Person("n"), Person("n"))
    for (person in persons) {
    }

    val operation: (Person) -> Boolean = { it.name == "Bob" }
    findPerson(operation)

}

fun method() {
    var answer2: Int
    val answer: Int
    answer = 42

}

fun getMnemonic(color: Color) = // 함수의 반환 값으로 when 식을 직접 사용합니다.
    when (color) { // 색이 특정 enum 상수와 같을 때 그 상수에 대응하는 문자열을 돌려줍니다.
        RED -> "Richard"
        ORANGE -> "Of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "Battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty Color")
}

fun main(args: Array<String>) {
    println("나이가 가장 많은 사람: ")
}

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), GREEN(0, 255, 0), ORANGE(255, 255, 0),
    BLUE(0, 0, 255), YELLOW(255, 255, 0),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238); // 여기 반드시 세미콜론을 사용해야 합니다.

    fun rgb() = (r * 256 + g) * 256 + b // enum 클래스 안에서 메서드를 정의합니다.
}