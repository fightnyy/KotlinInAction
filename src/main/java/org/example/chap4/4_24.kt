package org.example.chap4

// 어떤 클래스의 인스턴스를 비교하는 Comparator 를 클래스 내부에 정의하는게 더 바람직 합니다.
data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int {
            return (p1.name.compareTo(p2.name))
        }
    }
}

fun main() {
    val persons = listOf<Person>(
        Person("Bob"),
        Person("Alice")
    )

    println(persons.sortedWith(Person.NameComparator))
}


class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}