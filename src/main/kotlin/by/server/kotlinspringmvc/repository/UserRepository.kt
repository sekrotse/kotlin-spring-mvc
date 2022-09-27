package by.server.kotlinspringmvc.repository;

import by.server.kotlinspringmvc.model.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, UUID> {
}