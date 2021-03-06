package com.progery.healthymarket.services.dto

/**
 * Created by evgenii
 * Date: 27.06.2020
 * Time: 18:26
 * Project: healthymarket
 * Description:
 */

data class UserDto(
        var id: Int?,
        var name: String?,
        var age: Int?,
        var secretCredentials: SecretCredentialsDto?,
        var purchasesDto: List<PurchaseDto>?
) {
    constructor(): this(null, null, null, null, null)
}