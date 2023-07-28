package com.example.owlapplication


class User(
    val id: Int?,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String
) {
    override fun toString(): String {
        return "User(id=$id, firstName='$firstName', lastName='$lastName', email='$email', password='$password')"
    }
}

fun main() {
    val user = User(1, "John", "Doe", "johndoe@example.com", "password")

    println(user)
}
