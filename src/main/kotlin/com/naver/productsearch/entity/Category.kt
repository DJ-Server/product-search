package com.naver.productsearch.entity

import javax.persistence.*

@Table(name = "category")
@Entity
data class Category(
    @Id
    @Column(name = "category_id", nullable = false)
    var id: Long? = null,

    var name: String,

    var level: Int
) {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    lateinit var parent: Category

    @OneToMany(mappedBy = "parent")
    var child: List<Category> = listOf()

    @OneToMany(mappedBy = "category")
    var categoryProducts: List<CategoryProduct> = listOf()
}
