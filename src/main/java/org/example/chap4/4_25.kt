package org.example.chap4

class User4_25 {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }

    fun getFacebookName(facebookAccountId: Int): String {
        return "Hello"
    }
}