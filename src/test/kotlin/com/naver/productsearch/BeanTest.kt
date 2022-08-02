package com.naver.productsearch

import com.naver.productsearch.test.Animal
import com.naver.productsearch.test.Cat
import com.naver.productsearch.test.Dog
import com.naver.productsearch.test.Owner
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.AnnotationConfigApplicationContext

@SpringBootTest
class BeanTest(
    @Autowired
    private val owner: Owner,
//
//    @Autowired
//    private val animals: List<Animal>
) {

    @Test
    fun beanTest() {

        /**
         * 직접 Bean을 주입하는 방식
         */
//        val dog = Dog()
//        val cat = Cat()
//
//        val owner1 = Owner(dog)
//        val owner2 = Owner(cat)
//
//        owner1.animalSay() // 멍멍
//        owner2.animalSay() // 야옹


//        println("빈으로 등록된 동물들의 소리를 들어보자.")
//        animals.forEach {
//            println("Say => ${it.say()}")
//        }
        owner.animalSay() // 야옹
//        val ac1 = AnnotationConfigApplicationContext(Dog::class.java)
//        val ac2 = AnnotationConfigApplicationContext(Cat::class.java)
//
//        val beanDog = ac1.getBean(Dog::class.java)
//        val beanCat = ac2.getBean(Cat::class.java)
//        println("beanDog = ${beanDog.say()}")
//        println("beanCat = ${beanCat.say()}")
//
//        // 전략패턴으로, Owner 생성자로 주입되는 AnimalType을 바꿔주면 되겠습니다..........

    }


}
