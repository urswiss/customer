package ch.ursw.customer.repository

import ch.ursw.customer.entity.Article
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, String> {}