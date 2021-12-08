package com.budgetappbackend.LineItem

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import java.util.*


@Service
class LineItemService (private val lineItemRepository: LineItemRepository){

    fun createLineItem(lineItem: LineItem): LineItem = lineItemRepository.save(lineItem)

    fun updateLineItem(lineItemId: UUID, lineItem: LineItem): LineItem {
        return if (lineItemRepository.existsById(lineItemId)) {
            lineItemRepository.save(
                LineItem(
                    id = lineItem.id,
                    itemName = lineItem.itemName,
                    itemAmount = lineItem.itemAmount
                )
            )
        }else throw LineItemNotFoundException(HttpStatus.NOT_FOUND, "No matching line item")
    }
}