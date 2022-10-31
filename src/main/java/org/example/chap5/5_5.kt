package org.example.chap5

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Alice", 29))
    people.maxByOrNull(Person::age)
}