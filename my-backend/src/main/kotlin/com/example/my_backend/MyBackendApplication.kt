package com.example.my_backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyBackendApplication

fun main(args: Array<String>) {
	runApplication<MyBackendApplication>(*args)
}
