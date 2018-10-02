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
    val mapper = Mappers.getMapper(CustomerMapper::class.java)

    @Autowired
    lateinit var customerRepository: CustomerRepository

    override fun getAllCustomers(): List<CustomerVO> {
        return mapper.customersToCustomerVOs(customerRepository.findAll().toList())
    }

    override fun isAdult(age:Int) = age>17

    override fun createCustomer(customerVO: CustomerVO) : CustomerVO {
        val customer: Customer = customerRepository.save(mapper.customerVOToCustomer(customerVO))
        return mapper.customerToCustomerVO(customer)
    }

    override fun deleteCustomer(customerId: String) {
        customerRepository.deleteById(customerId)
    }
}
