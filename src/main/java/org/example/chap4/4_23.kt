package org.example.chap4

import org.example.chap2.Person
import java.io.File

// object 는 싱글턴을 정의하는 방법 중 하나다.
// companion object 는 인스턴스 메서드는 아니지만 어떤 클래스와 관련 있는 메서드와 팩토리 메서드를 담을 때 쓰인다
// 객체 식은 자바의 익명 내부 클래스 대신 쓰인다

object Payroll {
    val allEmployees = arrayListOf<Person>()

}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }

}

fun main() {
    println(
        CaseInsensitiveFileComparator.compare(
            File("/User"),
            File("/user")
        )
    )

}