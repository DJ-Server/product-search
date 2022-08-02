package com.naver.productsearch.dolphago

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class Owner(
    @Qualifier("cat")
    private val animal: Animal
) {
    fun animalSay() = println(animal.say())
}
