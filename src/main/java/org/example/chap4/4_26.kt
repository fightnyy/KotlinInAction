package org.example.chap4

class User4_26 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User4_26(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))

        private fun getFacebookName(accountId: Int): String {
            return "Hello"
        }
    }
}

fun main() {
    val facebookUser = User4_26.newFacebookUser(1)
    val subscribingUser = User4_26.newSubscribingUser("Bob@naver.com")
    println("subscribingUser = ${subscribingUser}")
}