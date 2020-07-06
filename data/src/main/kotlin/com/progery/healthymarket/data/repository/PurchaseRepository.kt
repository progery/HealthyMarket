package com.progery.healthymarket.data.repository

import com.progery.healthymarket.data.model.Purchase
import com.progery.healthymarket.data.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 15:07
 * Project: healthymarket
 * Description:
 */

@Repository
interface PurchaseRepository : CrudRepository<Purchase, Int> {

    override fun findAll(): List<Purchase>

}