package ch.ursw.customer.service

import ch.ursw.customer.controller.CustomerVO
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class CustomerServiceIntegrationTest(@Autowired val sut: CustomerService) {

    @BeforeAll
    fun setup() {
        println(">> Setup")
    }

    @Test
    fun `create customer`() {
        val customerVO = CustomerVO(firstName = "fritzli", lastName = "meier", city = "basel", age = 52)
        val result = sut.createCustomer(customerVO)
        assertThat(result.id).isNotNull()
    }

    @Disabled("https://stackoverflow.com/questions/52588574/cant-use-transactional-in-spring-boot-test")
    @Test
    fun `get customer`() {
        val result: List<CustomerVO> = sut.getAllCustomers()
        assertThat(result.size).isEqualTo(3)
    }

    @AfterAll
    fun teardown() {
        println(">> Tear down")
    }

}
