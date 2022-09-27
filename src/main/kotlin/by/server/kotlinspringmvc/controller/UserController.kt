package by.server.kotlinspringmvc.controller

import by.server.kotlinspringmvc.config.logger
import by.server.kotlinspringmvc.model.User
import by.server.kotlinspringmvc.service.api.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("api/v1/user")
class UserController(val userService: UserService) {
    val log = logger()

    @GetMapping("/{id}")
    fun getUserIngo(@PathVariable("id") userId: String):ResponseEntity<User> {
        log.info("******************************************************")
        return ResponseEntity.ok(userService.getUserInformation(UUID.fromString(userId)))
    }
}