package com.progery.healthymarket.web

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.progery.healthymarket.web.controller"])
open class WebConfig