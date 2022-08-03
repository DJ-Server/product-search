package com.naver.productsearch.dolphago

import com.naver.productsearch.dolphago.beantest.Animal
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class Owner(
    @Autowired
    @Qualifier("cat")
    private val animal: Animal
) {
    fun animalSay() = println(animal.say())
}
