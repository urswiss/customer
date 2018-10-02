package ch.ursw.customer.service

import ch.ursw.customer.controller.CustomerVO

interface CustomerService {
    fun getAllCustomers() : List<CustomerVO>
    fun isAdult(age:Int) : Boolean
    fun createCustomer(customerVO: CustomerVO) : CustomerVO
    fun deleteCustomer(customerId: String)
}