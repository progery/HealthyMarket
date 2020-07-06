package com.progery.healthymarket.services.mapstruct

import com.progery.healthymarket.data.model.Purchase
import com.progery.healthymarket.services.dto.PurchaseDto
import org.mapstruct.Mapper

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 14:34
 * Project: healthymarket
 * Description:
 */

@Mapper(componentModel = "spring")
interface PurchaseConverter {

    fun convertToDto(purchase: Purchase): PurchaseDto

    fun convertToModel(purchaseDto: PurchaseDto): Purchase

    fun convertToDto(purchase: List<Purchase>): List<PurchaseDto>

    fun convertToModel(purchaseDto: List<PurchaseDto>): List<Purchase>

}