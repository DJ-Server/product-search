package com.naver.productsearch.dolphago

import com.naver.productsearch.dolphago.configuration.AppConfig
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Import

@Import(AppConfig::class)
@SpringBootTest
class BeanTest(
    @Autowired
    private val owner: Owner
) {
    @Test
    fun beanTest() {
        owner.animalSay()

        val context: ApplicationContext = AnnotationConfigApplicationContext(Owner::class.java)
        val bean = context.getBean(Owner::class.java)
        println("bean의 이름은 ${bean.javaClass.name}")
    }
}
