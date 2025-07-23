package com.example.my_backend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc

@WebMvcTest(HelloController::class)
class HelloControllerTest(
    @Autowired val mockMvc: MockMvc
) {

}