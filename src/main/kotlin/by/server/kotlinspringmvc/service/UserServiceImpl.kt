package by.server.kotlinspringmvc.service

import by.server.kotlinspringmvc.repository.UserRepository
import by.server.kotlinspringmvc.service.api.UserService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(val userRepository: UserRepository): UserService {

    override fun getUserInformation(userId: UUID) =
        userRepository.findById(userId).get()
}