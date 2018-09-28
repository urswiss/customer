package ch.ursw.customer.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Order(
        @Id var id: String? = null, var orderNumber:Int,
        var customer: Customer)