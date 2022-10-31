package org.example.chap2

import kotlin.concurrent.thread
import kotlin.coroutines.coroutineContext

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class ColorWithParam(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), YELLOW(255, 255, 0),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {

    var num = 0
    for (i in 1..1000) {
        thread {
            Thread.sleep(10)
            num += 1
        }
    }
    Thread.sleep(4000)
    print(num)


    var num1 = 0

}

val enum = "Hello"
val Enum_ = "Nice"