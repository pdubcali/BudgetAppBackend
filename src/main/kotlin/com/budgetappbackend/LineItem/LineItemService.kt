package com.budgetappbackend.LineItem

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import java.util.*


@Service
class LineItemService (){
    @Autowired
    lateinit var lineItemRepository: LineItemRepository

    fun createLineItem(lineItem: LineItem): LineItem = lineItemRepository.save(lineItem)

    fun updateLineItem(lineItemId: UUID, lineItem: LineItem): LineItem {
        return if (lineItemRepository.existsById(lineItemId)) {
            lineItemRepository.save(
                LineItem(
                    id = lineItem.id,
                    itemName = lineItem.itemName,
                    itemAmount = lineItem.itemAmount,
                    date = lineItem.date
                )
            )
        }else throw LineItemNotFoundException(HttpStatus.NOT_FOUND, "No matching line item")
    }

    fun findAllLineItems() = lineItemRepository.findAll()

}