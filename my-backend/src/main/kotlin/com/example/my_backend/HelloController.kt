package com.example.my_backend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/api/hello")
    fun getHello(): String{
        return "Hello World"
    }
}