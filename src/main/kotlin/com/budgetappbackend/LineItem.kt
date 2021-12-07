package com.budgetappbackend

import java.util.*
import javax.persistence.*

@Entity
class LineItem (
    @Column(name = "item_name")
    val itemName: String,
    @Column(name = "item_amount")
    val itemAmount: Float,
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID?
) {
    protected constructor() : this("",0.0f,null)
}