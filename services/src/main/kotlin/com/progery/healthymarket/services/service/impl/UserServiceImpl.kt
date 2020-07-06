package com.progery.healthymarket.services.service.impl

import com.progery.healthymarket.data.model.User
import com.progery.healthymarket.data.repository.UserRepository
import com.progery.healthymarket.services.dto.PurchaseDto
import com.progery.healthymarket.services.dto.UserDto
import com.progery.healthymarket.services.mapstruct.UserConverter
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
class UserServiceImpl @Autowired constructor(
        private val userRepository: UserRepository,
        private val userConverter: UserConverter
) : IUserService {

    override fun getAll(): List<UserDto> {
        val users = userRepository.findAll()
        return userConverter.convertToDto(users)
    }

    override fun createUser(userDto: UserDto): UserDto {
        var user = userConverter.convertToModel(userDto)
        user = userRepository.save(user)
        return userConverter.convertToDto(user);
    }

    override fun addPurchase(id: Int, purchaseDto: PurchaseDto): UserDto {
        val user = userRepository.findById(id).orElse(User())
        user.purchases.add()
    }

}