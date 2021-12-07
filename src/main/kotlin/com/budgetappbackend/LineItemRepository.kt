package com.budgetappbackend

import org.springframework.data.repository.CrudRepository
import java.util.*

interface LineItemRepository : CrudRepository<LineItem, UUID> {
//    fun delete(id: UUID)
    fun save(lineItem: LineItem)
}