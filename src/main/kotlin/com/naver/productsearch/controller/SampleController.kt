package com.naver.productsearch.controller

import com.naver.productsearch.dolphago.Owner
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val owner: Owner
) {

    @GetMapping("/hello")
    fun hello(){
        owner.animalSay()
    }
}
