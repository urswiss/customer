package ch.ursw.customer

import ch.ursw.customer.controller.CustomerVO
import ch.ursw.customer.service.CustomerService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerServiceIntegrationTest(@Autowired val sut: CustomerService) {

    @BeforeAll
    fun setup() {
        println(">> Setup")
    }

    fun `create customer`() {
        val customerVO = CustomerVO(firstName = "fritzli", lastName = "meier", city = "basel", age = 52)
        val result = sut.createCustomer(customerVO)
        assertThat(result.id).isNotNull()
    }

    @AfterAll
    fun teardown() {
        println(">> Tear down")
    }

}
