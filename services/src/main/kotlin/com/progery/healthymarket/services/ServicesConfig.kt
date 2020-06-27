package com.progery.healthymarket.services

import com.progery.healthymarket.data.DataConfig
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * Created by evgenii
 * Date: 27.06.2020
 * Time: 19:20
 * Project: healthymarket
 * Description:
 */

@Configuration
@ComponentScan(basePackages = ["com.progery.healthymarket.services.service"])
@Import(DataConfig::class)
open class ServicesConfig