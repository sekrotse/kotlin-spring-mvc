package by.server.kotlinspringmvc.repository;

import by.server.kotlinspringmvc.model.Answer
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AnswerRepository : JpaRepository<Answer, UUID> {
}