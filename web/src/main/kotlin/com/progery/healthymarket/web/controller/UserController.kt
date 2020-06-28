package com.progery.healthymarket.web.controller

import com.progery.healthymarket.services.dto.UserDto
import com.progery.healthymarket.services.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(
        path = ["/users"],
        produces = [APPLICATION_JSON_VALUE]
)
class UserController @Autowired constructor(
        private val userService: IUserService
) {

    @GetMapping
    fun getAllUsers(): List<UserDto> {
        return userService.getAll()
    }

    @PostMapping(consumes = [APPLICATION_JSON_VALUE])
    fun createUser(@RequestBody user: UserDto): UserDto {
        return userService.createUser(user)
    }

}