package ch.ursw.customer.service

import ch.ursw.customer.controller.CustomerVO
import ch.ursw.customer.entity.Customer
import ch.ursw.customer.mapper.CustomerMapper
import ch.ursw.customer.repository.CustomerRepository
import org.mapstruct.factory.Mappers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl : CustomerService {
    @Autowired
    lateinit var customerRepository: CustomerRepository

    override fun getAllCustomers(): List<Customer> = customerRepository.findAll().toList()

    override fun isAdult(age:Int) = age>17

    override fun createCustomer(customerVO: CustomerVO) : CustomerVO {
        val mapper = Mappers.getMapper(CustomerMapper::class.java)
        val customer: Customer = customerRepository.save(mapper.customerVOToCustomer(customerVO))
        return mapper.customerToCustomerVO(customer)
    }
}
