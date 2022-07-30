package com.naver.productsearch.entity

import java.math.BigDecimal
import javax.persistence.*

@Table(name = "product")
@Entity
class Product(
    @Id
    @Column(name = "product_id", nullable = false)
    var id: Long? = null,

    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "price", nullable = false)
    var price: BigDecimal,

    @Column(name = "display", nullable = false)
    var display: Boolean,

    @Column(name = "residual", nullable = false)
    var residual: Long,
) {
    @OneToMany(mappedBy = "product")
    private val categoryProducts: List<CategoryProduct> = listOf()
}
