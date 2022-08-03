package com.naver.productsearch.dolphago.slack

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "slack-client", url = "\${slack-hook}")
interface SlackClient {
    @PostMapping
    fun send(@RequestBody body: SlackBody)
}
