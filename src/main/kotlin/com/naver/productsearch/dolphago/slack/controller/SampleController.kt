package com.naver.productsearch.dolphago.slack.controller

import com.naver.productsearch.dolphago.slack.SchedulerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    val service: SchedulerService
) {

    @GetMapping("/hello")
    fun hello(@RequestParam("start") start: Int) {
        service.register("dolphago", start)
    }

    @GetMapping("/bye")
    fun bye() {
        service.remove("dolphago")
    }
}
