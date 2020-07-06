package com.progery.healthymarket.services.service

import com.progery.healthymarket.services.dto.PurchaseDto

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 15:04
 * Project: healthymarket
 * Description:
 */

interface IPurchaseService {

    fun getAll(): List<PurchaseDto>

    fun create(purchaseDto: PurchaseDto): PurchaseDto

}