package org.example.chap4

data class Client(val name: String, val postalCode: Int) {
    override fun toString(): String {
        return "Client(name: $name, postalCode=$postalCode)"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }

    //

}


fun main() {
    val client1 = Client("나영윤", 1)
    println(client1.toString())

    val client2 = Client("나영윤", 1)

    println(
        """
        Client1 is same with Client2 : ${client1 == client2}
    """.trimIndent()
    )


    // hashCode 를 정의 안했을 때 false 가 나온다.
    val processed = hashSetOf(Client("나영윤", 1))
    println(processed.contains(Client("나영윤", 1)))
    val simpleName = client1.copy(name = "멈무미", postalCode = 2)
    println(simpleName)

}