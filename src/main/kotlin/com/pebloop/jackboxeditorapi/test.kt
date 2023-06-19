package com.pebloop.jackboxeditorapi

import jackbox.editor.core.Library
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {
    @GetMapping("/")
    fun index(): String {
        var lib: Library = Library()
        lib.someLibraryMethod()
        return "Greetings from Spring Boot!"
    }
}