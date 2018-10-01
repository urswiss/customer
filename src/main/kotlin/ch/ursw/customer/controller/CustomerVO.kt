package ch.ursw.customer.controller

data class CustomerVO (
    var id: String? = null,
    var firstName: String?,
    var lastName: String?,
    var city: String?,
    var age: Int?
)
{
    // Necessary for MapStruct
    constructor() : this(null, null, null, null, null)
}
