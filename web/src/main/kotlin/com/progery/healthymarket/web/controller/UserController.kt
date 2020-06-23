package com.progery.healthymarket.web.controller

import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
        path = ["/users"],
        produces = [APPLICATION_JSON_VALUE]
) // todo зобраться с массивами
class UserController {

    @GetMapping
    fun hello(): String {
        return "hello spring"
    }

}