package com.progery.healthymarket.data.model

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
data class User(

        @Id
        @GeneratedValue
        var id: Int?,

        @Column(name = "name", nullable = false)
        var name: String?,

        @Column(name = "age", nullable = false)
        var age: Int?

) {
        constructor(): this(null, null, null)
}