package com.progery.healthymarket.services.mapstuct

import com.progery.healthymarket.data.model.User
import com.progery.healthymarket.services.dto.UserDto
import org.mapstruct.Mapper
import org.mapstruct.Mapping


@Mapper
interface UserConverter {
fun covertToDto(user: User):UserDto

fun convertToModel(userDto: UserDto): User

fun covertToDto(user: List<User>): List <UserDto>
fun convertToModel(userDto: List<UserDto>): List<User>


}