package by.server.kotlinspringmvc.service.api

import by.server.kotlinspringmvc.model.User
import java.util.*

interface UserService {
    fun getUserInformation(userId: UUID): User
}