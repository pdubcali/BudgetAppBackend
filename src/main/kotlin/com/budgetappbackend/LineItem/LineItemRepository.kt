package com.budgetappbackend.LineItem

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface LineItemRepository : JpaRepository<LineItem, UUID> {
}