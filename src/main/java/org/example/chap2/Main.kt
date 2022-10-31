package org.example.chap2

import java.io.BufferedReader
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.net.URI
import java.util.Random
import java.util.TreeMap
import kotlin.reflect.typeOf


fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b

val question = "삶, 우주, 그리고 모든 것에 대한 궁긍적인 질문"
val answer: Int = 42
val yearsToCompute = 7e6;


interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}


fun kotlinStyleEval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }


fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("e.value = ${e.value}")
            e.value
        }

        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum = ${left} + ${right}")
            left + right
        }

        else -> throw IllegalArgumentException("Unknown Expression")
    }


fun fizzBuzz(num: Int) =
    when {
        num % 15 == 0 -> println("FizzBuzz")
        num % 3 == 0 -> println("Fizz")
        num % 5 == 0 -> println("Buzz")
        else -> println("$num")
    }

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know.."
}


val number = 20
val percentage =
    if (number in 0..100) number else throw IllegalArgumentException("A percentage value must be between 0 and 100 : $number")

fun readNumber(reader: BufferedReader): Int? = try {
    val line = reader.readLine()
    Integer.parseInt(line)
} catch (e: NumberFormatException) {
    null
} finally {
    reader.close()
}

fun readNumber1(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: Exception) {
        null
    } finally {
        1
    }
}

fun findUri() {
    val uri = URI("https://dunamu.com")
}


fun main(args: Array<String>) {
    println("Hello, world!")
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
    val a = (Random().nextInt(5))
    println("val : ${a}")
    while (a == 1) {
        println("Hello This is While")
    }
    do {
        println("Hello This is Do while")
    } while (a == 2)


    val oneToTen = 1..10

    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }

    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }


    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("${index}: ${element}")
    }

    val impossible = "Java".."Scalar"
    println(impossible::class.java.typeName)

    `create User (when user doesn't exist)`();

    val empty = emptySet<String>()
    empty
}

fun `create User (when user doesn't exist)`() = println("Hello")