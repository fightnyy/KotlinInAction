package org.example.chap3

import org.example.mySimpleFunction
import java.lang.IllegalArgumentException
import java.util.Collections


val String.lastChar: Char
    get() = get(length - 1)


var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) = this.setCharAt(length - 1, value)


fun main(args: Array<String>) {
    val lastChar = "Nice to see you".lastChar
    println("lastChar = ${lastChar}")


    val strings: List<String> = listOf("first", "second", "fourteenth")
    val last = strings.last()
    println("last = ${last}")

    val numbers: Collection<Int> = setOf(1, 14, 2)
    val maxOrNull = numbers.maxOrNull()
    println("maxOrNull = ${maxOrNull}")


    val list = listOf("args: ", *args)
    println("list = ${list}")

    val pair = 1 to "one"
    val map = mapOf("A" to "Apple", "B" to "Busy")
    println("map = ${map}")
    val s = map["A"]
    println("s = ${s}")


    val split = "12.345-6.A".split("\\.".toRegex())
    println("split = ${split}")


    parsePath("/Users/yole/kotlin-book/chapter.adoc")

}


fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name:$fileName, ext: $extension")
}

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Name"
        )
    }
}


fun saveUserRefactor(user: User) {
    fun validate(
        user: User,
        value: String,
        fieldName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                """
                    Can't save user ${user.id}: empty ${fieldName}
                """.trimIndent()
            )
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun saveUserRefactor2(user: User) {

    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                """ \
                    Can't save user ${user.id}: empty ${fieldName}
                """.trimIndent()
            )
        }
    }

    mySimpleFunction()
}