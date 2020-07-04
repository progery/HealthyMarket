package com.progery.healthymarket.data.model

import com.github.pozo.KotlinBuilder
import javax.persistence.*

/**
 * Created by evgenii
 * Date: 27.06.2020
 * Time: 17:17
 * Project: healthymarket
 * Description:
 */


@Entity
@Table(name = "users")
@KotlinBuilder
data class User(

        @Id
        @GeneratedValue
        val id: Int,

        @Column(name = "name", nullable = false)
        val name: String,

        @Column(name = "age", nullable = false)
        val age: Int

)