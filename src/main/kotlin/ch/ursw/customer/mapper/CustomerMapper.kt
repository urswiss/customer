package ch.ursw.customer.mapper

import ch.ursw.customer.controller.CustomerVO
import ch.ursw.customer.entity.Customer
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface CustomerMapper {
    @Mapping(source = "firstName", target="firstName")
    fun customerToCustomerVO(customer: Customer): CustomerVO
    fun customersToCustomerVOs(customer: List<Customer>): List<CustomerVO>

    @InheritInverseConfiguration
    fun customerVOToCustomer(customer: CustomerVO): Customer
}
