package ch.ursw.customer.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Article (@Id var id: String? = null, var description: String)