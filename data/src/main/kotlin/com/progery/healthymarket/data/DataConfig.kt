package com.progery.healthymarket.data

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

/**
 * Created by evgenii
 * Date: 27.06.2020
 * Time: 17:17
 * Project: healthymarket
 * Description:
 */

@Configuration
@EnableJpaRepositories(basePackages = ["com.progery.healthymarket.data.repository"])
@EntityScan("com.progery.healthymarket.data.model")
open class DataConfig