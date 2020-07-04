package com.progery.healthymarket.services.dto

import com.github.pozo.KotlinBuilder

/**
 * Created by evgenii
 * Date: 27.06.2020
 * Time: 18:26
 * Project: healthymarket
 * Description:
 */

@KotlinBuilder
data class UserDto(
        val id: Int,
        val name: String,
        val age: Int
)