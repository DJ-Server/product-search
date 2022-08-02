package com.naver.productsearch.dolphago.configuration

import com.naver.productsearch.dolphago.Animal
import com.naver.productsearch.dolphago.Cat
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean

class AppConfig {
    @Bean
    @Qualifier("cat")
    fun dolphago(): Animal = Cat()

//    @Bean("cat")
//    fun dolphago2(): Animal = Dog()
}
