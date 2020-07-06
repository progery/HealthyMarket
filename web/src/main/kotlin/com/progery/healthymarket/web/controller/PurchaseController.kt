package com.progery.healthymarket.web.controller

import com.progery.healthymarket.services.dto.PurchaseDto
import com.progery.healthymarket.services.dto.UserDto
import com.progery.healthymarket.services.service.IPurchaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 14:38
 * Project: healthymarket
 * Description:
 */

@RestController
@RequestMapping(
        path = ["/purchases"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
)
class PurchaseController @Autowired constructor(
        private val purchaseService: IPurchaseService
) {

    @GetMapping
    fun getAll(): List<PurchaseDto> {
        return purchaseService.getAll()
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun createUser(@RequestBody pur: PurchaseDto): PurchaseDto {
        return purchaseService.create(pur)
    }

}