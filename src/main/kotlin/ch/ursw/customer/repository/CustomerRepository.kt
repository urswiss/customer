package ch.ursw.customer.repository

import ch.ursw.customer.entity.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, String> {
    fun findByFirstName(firstName: String) : List<Customer>
}