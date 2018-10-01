package ch.ursw.customer.mapper

import ch.ursw.customer.controller.CustomerVO
import ch.ursw.customer.entity.Customer
import org.mapstruct.Mapper



@Mapper
interface CustomerMapper {

    fun customerToCustomerVO(customer: Customer): CustomerVO
    fun customerVOToCustomer(customer: CustomerVO): Customer
}