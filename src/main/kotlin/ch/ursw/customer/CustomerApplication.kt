package ch.ursw.customer

import ch.ursw.customer.entity.Article
import ch.ursw.customer.entity.Customer
import ch.ursw.customer.entity.Order
import ch.ursw.customer.entity.OrderPosition
import ch.ursw.customer.repository.ArticleRepository
import ch.ursw.customer.repository.CustomerRepository
import ch.ursw.customer.repository.OrderPositionRepository
import ch.ursw.customer.repository.OrderRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CustomerApplication {
    @Bean
    fun init(
            customerRepository: CustomerRepository,
            orderRepository: OrderRepository,
            orderPositionRepository: OrderPositionRepository,
            articleRepository: ArticleRepository) = CommandLineRunner {
        customerRepository.deleteAll()
        orderRepository.deleteAll()
        orderPositionRepository.deleteAll()
        articleRepository.deleteAll()

        val article = Article(description = "apple juice")
        articleRepository.save(article)

        val customer = Customer(firstName = "Max", lastName = "Binder", city = "Schwyz", age = 18)
        customerRepository.save(customer)
        val order = Order(customer = customer, orderNumber = 1)
        orderRepository.save(order)
        orderPositionRepository.save(OrderPosition(order = order, article = article, quantity = 3))

        customerRepository.save(Customer(firstName = "Paul2", lastName = "Meier", city = "Stans", age = 12))
        customerRepository.save(Customer(firstName = "Rita", lastName = "Blum", city = "Lugano", age = 22))
    }
}

fun main(args: Array<String>) {
    runApplication<CustomerApplication>(*args)
}

