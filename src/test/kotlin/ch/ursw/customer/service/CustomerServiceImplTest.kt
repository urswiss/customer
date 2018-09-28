package ch.ursw.customer.service

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class CustomerServiceImplTest {

    var sut: CustomerServiceImpl = CustomerServiceImpl()

    @ParameterizedTest
    @CsvSource(
            "0, false",
            "17, false",
            "18, true",
            "25, true"
    )
    fun isAdult(age: Int, expected: Boolean) {
        Assertions.assertThat(sut.isAdult(age)).isEqualTo(expected)
    }

//    the same in Spock
//    void "IsAdult"() {
//        expect:
//        result == sut.isAdult(age)
//
//        where:
//        age | result
//        0   | false
//        17  | false
//        18  | true
//        19  | true
//    }

}