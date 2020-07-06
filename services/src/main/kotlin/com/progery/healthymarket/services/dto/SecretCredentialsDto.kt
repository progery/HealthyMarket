package com.progery.healthymarket.services.dto

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 13:57
 * Project: healthymarket
 * Description:
 */

data class SecretCredentialsDto(
        var id: Int?,
        var login: String?,
        var password: String?
) {
    constructor(): this(null, null, null)
}