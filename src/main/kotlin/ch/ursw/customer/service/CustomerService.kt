package ch.ursw.customer.service

import ch.ursw.customer.entity.Customer

interface CustomerService {
    fun getAllCustomers() : List<Customer>
    fun isAdult(age:Int) : Boolean
    fun createCustomer(customer: Customer) : Customer
}