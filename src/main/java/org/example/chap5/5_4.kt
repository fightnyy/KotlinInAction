package org.example.chap5

fun main() {
    val people = listOf(Person("Alice", 29), Person("Alice", 29))
    println(people.maxByOrNull { it.age })
}