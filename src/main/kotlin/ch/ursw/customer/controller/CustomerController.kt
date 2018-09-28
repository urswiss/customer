package ch.ursw.customer.controller

import ch.ursw.customer.service.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController (val service: CustomerService){
    @GetMapping
    fun findAll() = service.getAllCustomers()

}