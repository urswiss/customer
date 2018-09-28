package ch.ursw.customer.repository

import ch.ursw.customer.entity.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<Order, String> {}