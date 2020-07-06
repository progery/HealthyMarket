package com.progery.healthymarket.services.mapstruct

import com.progery.healthymarket.data.model.SecretCredentials
import com.progery.healthymarket.services.dto.SecretCredentialsDto
import org.mapstruct.Mapper

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 14:00
 * Project: healthymarket
 * Description:
 */

@Mapper(componentModel = "spring")
interface SecretCredentialsConverter {

    fun convertToDto(secretCredentials: SecretCredentials): SecretCredentialsDto

    fun convertToModel(secretCredentialsDto: SecretCredentialsDto): SecretCredentials

    fun convertToDto(secretCredentials: List<SecretCredentials>): List<SecretCredentialsDto>

    fun convertToModel(secretCredentialsDto: List<SecretCredentialsDto>): List<SecretCredentials>

}