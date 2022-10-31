import javax.naming.Context
import javax.print.attribute.AttributeSet

//package org.example.chap4
//
//interface Clickable {
//
//    fun click() // 일반 메서드
//    fun showOff() = println("I'm clickable!") // 디폴트 구현이 있는 메서드
//}
//
//class Button : Clickable {
//    override fun click() = println("I was clicked")
//}
//
//interface Focusable {
//    fun setFocus(b: Boolean) =
//        println("I ${if (b) "got" else "lost"} focus.")
//
//    fun showOff() = println("I'm focusable!")
//
//}
//
//open class RichButton : Clickable {
//    fun disable() {} // 이 함수는 final 입니다.
//    override fun click() { // 오버라이드한 메서드는 기본적으로 열려있습니다.
//        TODO("Not yet implemented")
//    }
//
//    open fun animate() { // 이 함수는 열려있습니다. 하위 클래스에서 이 메서드를 오버라이드 해도 됩니다.
//
//    }
//
//
//
//}
//
//data class User(var name: String = "name", var level: Int = 15)
//
//
//val _val: User = User()
//var _var: User = User()
//


//
//fun main() {
//    _var = User()
//    _var.level = 24
//    _var.name = "nice!"
//
//    println("_val = ${_val}")
//    println("_var = ${_var}")
//    _var = User()
//
//}
//

/**
 * class User(val nickname: String)
 */
//
//class User constructor(_nickname: String) {
//    val nickname: String
//
//    init {
//        nickname = _nickname
//    }
//
//    init {
//        println("Nice to see you")
//    }
//}
//
//fun main() {
//    val user = User("username")
//    println("user.nickname = ${user.nickname}")
//    println("DEFAULT_BUFFER_SIZE = ${DEFAULT_BUFFER_SIZE}")
//}
//


//
//
//open class User(val nickname: String)
//
//class TwitterUser(nickname: String) : User(nickname) {
//
//}
//
//open class Button {
//
//}
//
//class specialButton: Button() {
//
//}
//
//class Secretive private constructor() {
//
//}
//
//open class View {
//    constructor(ctx : Context) {
//
//    }
//
//    constructor(ctx: Context, attr: AttributeSet) {
//
//    }
//}


//class SomeCase(
//    var name: String = "A",
//    var age: Int = 12,
//    var gender: String = "MALE"
//)

interface User {
    val nickname: String // 추상 프로퍼티 선언
}

class PrivateUser constructor(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() {
            return email.substringBefore('@') // 매번 계산한다.
        }

}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId) // backing field 에 저장해서 가져온다.
                                                       // 호출할 때 효율적이다.

    private fun getFacebookName(accountId: Int) : String {
        return "Hello"
    }
}




//fun main() {
//    SomeCase();
//    SomeCase(name = "Dude")
//    SomeCase(age = 15)
//    SomeCase()

//}