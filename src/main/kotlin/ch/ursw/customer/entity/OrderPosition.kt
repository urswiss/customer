package ch.ursw.customer.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class OrderPosition (@Id var id: String? = null, var order: Order, var article: Article, var quantity: Int)