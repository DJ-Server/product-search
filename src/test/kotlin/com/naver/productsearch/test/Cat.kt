package com.naver.productsearch.test

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

//@Component("cat")
class Cat : Animal {
    override fun say(): String = "야옹"
}
