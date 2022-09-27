package by.server.kotlinspringmvc.repository;

import by.server.kotlinspringmvc.model.Question
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface QuestionRepository : JpaRepository<Question, UUID> {
}