package ch.ursw.customer.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Customer (
        @Id var id: String? = null,
        var firstName: String?,
        var lastName: String?,
        var city: String?,
        var age: Int?
)
{
    // Necessary for MapStruct
    constructor() : this(null, null, null, null, null)
}
