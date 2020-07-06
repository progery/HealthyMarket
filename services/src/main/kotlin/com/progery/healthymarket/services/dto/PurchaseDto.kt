package com.progery.healthymarket.services.dto

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 14:33
 * Project: healthymarket
 * Description:
 */

data class PurchaseDto(
        var id: Int?,
        var purName: String?
) {
    constructor(): this(null, null)
}