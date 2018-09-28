package ch.ursw.customer

import ch.ursw.customer.repository.CustomerRepository
import ch.ursw.customer.service.CustomerServiceImpl

class CustomerServiceTest extends spock.lang.Specification {
    CustomerRepository customerRepository = GroovyMock()
    CustomerServiceImpl sut = new CustomerServiceImpl()

    void "setup"() {
        sut.customerRepository = customerRepository
    }

    void "IsAdult"() {
        expect:
        result == sut.isAdult(age)

        where:
        age | result
        0   | false
        17  | false
        18  | true
        19  | true
    }
}
