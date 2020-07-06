package com.progery.healthymarket.services.service.impl

import com.progery.healthymarket.data.repository.PurchaseRepository
import com.progery.healthymarket.services.dto.PurchaseDto
import com.progery.healthymarket.services.mapstruct.PurchaseConverter
import com.progery.healthymarket.services.service.IPurchaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 15:06
 * Project: healthymarket
 * Description:
 */

@Service
class PurchaseServiceImpl @Autowired constructor(
        private val purchaseRepository: PurchaseRepository,
        private val purchaseConverter: PurchaseConverter
) : IPurchaseService {

    override fun getAll(): List<PurchaseDto> {
        return purchaseConverter.convertToDto(purchaseRepository.findAll())
    }

    override fun create(purchaseDto: PurchaseDto): PurchaseDto {
        val model = purchaseConverter.convertToModel(purchaseDto)
        val savedPurchase = purchaseRepository.save(model)
        return purchaseConverter.convertToDto(savedPurchase)
    }

}