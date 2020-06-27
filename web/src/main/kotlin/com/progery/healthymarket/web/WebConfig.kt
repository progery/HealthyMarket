package com.progery.healthymarket.web

import com.progery.healthymarket.services.ServicesConfig
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@ComponentScan(basePackages = ["com.progery.healthymarket.web.controller"])
@Import(ServicesConfig::class)
open class WebConfig