package com.naver.productsearch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class ProductSearchApplication

fun main(args: Array<String>) {
    runApplication<ProductSearchApplication>(*args)
}


