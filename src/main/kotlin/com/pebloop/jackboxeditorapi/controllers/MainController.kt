package com.pebloop.jackboxeditorapi.controllers

import org.springframework.web.bind.annotation.GetMapping

@GetMapping("/")
fun index(): String {
    return "Api working ok !"
}