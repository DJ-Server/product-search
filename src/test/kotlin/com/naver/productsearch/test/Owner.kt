package com.naver.productsearch.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class Owner(
    @Autowired
    private val animal: Animal
) {
    fun animalSay() = println(animal.say())
}

