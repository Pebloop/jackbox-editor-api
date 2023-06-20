package com.pebloop.jackboxeditorapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {
    @GetMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot!"
    }

    @GetMapping("/test")
    fun test(path: String): String {
        //JackBoxEditor.getGameEditor(path)
        return path
    }
}