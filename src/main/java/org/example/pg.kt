package org.example
//
//import kotlinx.coroutines.coroutineScope
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import kotlin.jvm.Throws
//
//class Rectangle {
//    lateinit var area: Area
//    fun initArea(param: Area): Unit {
//        this.area = param
//    }
//}
//
//class Area(val value: Int)
//
////fun main() {
////    val rectangle = Rectangle()
////    rectangle.initArea(Area(10))
////    println(rectangle.area.value)
////
////
////    val set = setOf<String>()
////    val plus = set.plus("Hello")
////    val emptySet = emptySet<String>()
////    val plus1 = emptySet.plus("Nice to see you")
////    println("set = ${set}")
////    println("plus = ${plus}")
////    println("emptySet = ${emptySet}")
////    println("plus1 = ${plus1}")
////}
//
//suspend fun main() {
//    var num = 0
//    coroutineScope {
//        for (i in 1..1000) {
//            launch {
//                delay(10)
//                num+=1
//            }
//        }
//
//        println("num = ${num}")
//    }
//}
//
//suspend fun myCoroutine() {
//    val lock = A
//}


open class View {
    open fun click() = println("View clicked")

}

class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}

fun main() {
    val button = Button()
    button.click()
}

fun View.showOff() = println("I'm view!")
fun Button.showOff() = println("I'm a button!")

fun mySimpleFunction() {
    println("mySimpleFunction")
}