package com.sugoikondo.multiprojectdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PublicController {
    @GetMapping("/public")
    fun public() {
        return
    }
}