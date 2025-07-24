package com.example.my_backend

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(HelloController::class)
class HelloControllerTest(
    @Autowired val mockMvc: MockMvc
) {
    @Test
    fun `should return 200 OK and Hello World for GET api hello`() {
        mockMvc.perform(get("/api/hello"))
            .andExpect(status().isOk)
            .andExpect(content().string("Hello World"))
    }
}
