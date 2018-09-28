package ch.ursw.customer.repository

import ch.ursw.customer.entity.OrderPosition
import org.springframework.data.repository.CrudRepository

interface OrderPositionRepository : CrudRepository<OrderPosition, String> {}