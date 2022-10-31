package org.example.chap4

class User(val name: String) {
    var address: String  = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" => "$value"
                
                By the way, this.address : ${this.address}
                So this.address is Equal to field? ${this.address == field}
            """.trimIndent())
            field = value // 뒷받침 하는 필드값 변경하기
        }

}


fun main() {
    val user = User("name")
    user.address = "!!!"
}