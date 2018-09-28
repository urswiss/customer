package ch.ursw.customer

import ch.ursw.customer.entity.Customer
import ch.ursw.customer.service.CustomerService
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.annotation.Rollback
import spock.lang.Ignore
import spock.lang.Stepwise

@Ignore
@Stepwise
@Rollback
class CustomerServiceIntegrationTest extends spock.lang.Specification {
    @Autowired
    CustomerService sut

    void "create customer"() {
        given:
        Customer customer = new Customer(firstName: "fritzli", lastName: "meier", city: "basel", age: 52, ConstructorStrategy.ForDefaultConstructor)
//        val customer = Customer(firstName = "Max", lastName = "Binder", city = "Schwyz", age = 18)

        when:
        def result = sut.createCustomer(customer)

        then:
        result.id
    }
}
