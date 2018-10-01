package ch.ursw.customer.controller

data class CustomerVO (
    val id: String? = null,
    val firstName: String,
    val lastName: String,
    val city: String,
    val age: Int
)