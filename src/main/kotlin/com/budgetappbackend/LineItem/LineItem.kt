package com.budgetappbackend.LineItem

import org.springframework.data.relational.core.mapping.Table
import java.util.*
import javax.persistence.*

@Entity
@Table("line_item")
class LineItem (
    @Column(name = "id")
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID?,
    @Column(name = "item_name")
    val itemName: String,
    @Column(name = "item_amount")
    val itemAmount: Float,
)