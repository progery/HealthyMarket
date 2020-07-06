package com.progery.healthymarket.data.model

import com.github.pozo.KotlinBuilder
import javax.persistence.*

/**
 * Created by evgenii
 * Date: 06.07.2020
 * Time: 14:27
 * Project: healthymarket
 * Description:
 */

@Entity
@Table(name = "purchases")
//@KotlinBuilder
data class Purchase(

        @Id
        @GeneratedValue
        var id: Int?,

        @Column(name = "purName", nullable = false)
        var purName: String?

) {
        constructor(): this(null, null)
}