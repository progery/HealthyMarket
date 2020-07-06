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
//@KotlinBuilder
data class User(

        @Id
        @GeneratedValue
        var id: Int?,

        @Column(name = "name", nullable = false)
        var name: String?,

        @Column(name = "age", nullable = false)
        var age: Int?,

        @OneToOne(cascade = [CascadeType.ALL], orphanRemoval = true)
        var secretCredentials: SecretCredentials?,

        @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
        @JoinColumn(name = "user_id")
        var purchases: List<Purchase>?

) {
        constructor(): this(null, null, null, null, null)
}