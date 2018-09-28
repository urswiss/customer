package ch.ursw.customer.service

import ch.ursw.customer.entity.Customer
import ch.ursw.customer.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl : CustomerService {
    @Autowired
    lateinit var customerRepository: CustomerRepository

    override fun getAllCustomers(): List<Customer> = customerRepository.findAll().toList()

    override fun isAdult(age:Int) = age>17

    override fun createCustomer(customer: Customer) = customerRepository.save(customer)
}
