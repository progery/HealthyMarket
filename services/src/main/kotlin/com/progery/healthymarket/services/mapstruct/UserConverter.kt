package com.progery.healthymarket.services.mapstruct

import com.progery.healthymarket.data.model.User
import com.progery.healthymarket.services.dto.UserDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings


@Mapper(componentModel ="spring")
interface UserConverter {

@Mapping(target="name",ignore = true)
fun convertToDto(user: User):UserDto

   @InheritInverseConfiguration
fun convertToModel(userDto: UserDto): User

fun convertToDto(user: List<User>): List <UserDto>

   @InheritInverseConfiguration
fun convertToModel(userDto: List<UserDto>): List<User>


}