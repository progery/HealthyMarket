package com.progery.healthymarket

import com.progery.healthymarket.web.WebConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(WebConfig::class)
class HealthyMarketApplication

fun main(args: Array<String>) {
    runApplication<HealthyMarketApplication>(*args)
}
