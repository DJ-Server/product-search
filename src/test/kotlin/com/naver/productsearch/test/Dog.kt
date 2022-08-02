package com.naver.productsearch.test

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Primary
@Component("dog")
class Dog : Animal {
    override fun say() : String = "멍멍"
}
