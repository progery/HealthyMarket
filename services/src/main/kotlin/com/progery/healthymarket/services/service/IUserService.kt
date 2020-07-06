package com.progery.healthymarket.services.service

import com.progery.healthymarket.services.dto.PurchaseDto
import com.progery.healthymarket.services.dto.UserDto

/**
 * Created by evgenii
 * Date: 27.06.2020
 * Time: 18:25
 * Project: healthymarket
 * Description:
 */

interface IUserService {

    fun getAll(): List<UserDto>

    fun createUser(userDto: UserDto): UserDto

    fun addPurchase(id: Int, purchaseDto: PurchaseDto): UserDto

}