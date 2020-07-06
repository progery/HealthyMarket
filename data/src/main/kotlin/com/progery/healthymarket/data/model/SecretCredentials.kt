package com.progery.healthymarket.data.model

import com.github.pozo.KotlinBuilder
import javax.persistence.*

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 13:44
 * Project: healthymarket
 * Description:
 */

@Entity
@Table(name = "credentials")
//@KotlinBuilder
data class SecretCredentials(

    @Id
    @GeneratedValue
    var id: Int?,

    @Column(name = "login", nullable = false)
    var login: String?,

    @Column(name = "password", nullable = false)
    var password: String?

) {
    constructor(): this(null, null, null)
}