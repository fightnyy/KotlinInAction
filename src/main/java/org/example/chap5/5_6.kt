package org.example.chap5

fun main(args: Array<String>) {
    val people = listOf(Person("이몽룡", 29), Person("성춘향", 31))
    val value = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    println("value = ${value}")


    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum(2, 3))
    // Hello
    // nice
}