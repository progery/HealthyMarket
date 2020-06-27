package com.progery.healthymarket.services.service.impl

import com.progery.healthymarket.data.model.User
import com.progery.healthymarket.data.repository.UserRepository
import com.progery.healthymarket.services.dto.UserDto
import com.progery.healthymarket.services.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by evgenii
 * Date: 27.06.2020
 * Time: 18:49
 * Project: healthymarket
 * Description:
 */

@Service
class UserServiceImpl: IUserService {

    @Autowired
    lateinit var userRepository: UserRepository


    override fun getAll(): List<UserDto> {
        val users = userRepository.findAll()
        return convert(users)
    }

    override fun createUser(userDto: UserDto): UserDto {
        TODO("Not yet implemented")
    }

    fun convert(users: List<User>): List<UserDto> {
        val userDtoList: ArrayList<UserDto> = ArrayList()
        for (user in users) {
            val userDto = UserDto(user.id, user.name, user.age)
            userDtoList.add(userDto)
        }
        return userDtoList
    }
}