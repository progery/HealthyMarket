package com.progery.healthymarket.data.repository

import com.progery.healthymarket.data.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by evgenii
 * Date: 27.06.2020
 * Time: 17:16
 * Project: healthymarket
 * Description:
 */

@Repository
interface UserRepository : CrudRepository<User, Int> {

    override fun findAll(): List<User>

}