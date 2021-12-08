package com.budgetappbackend.LineItem

import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
class LineItemController(private val lineItemService: LineItemService){

    @CrossOrigin
    @PostMapping("/lineItem")
    fun createLineItem(@RequestBody lineItem: LineItem): LineItem {
        return lineItemService.createLineItem(lineItem)
    }

    @CrossOrigin
    @PutMapping("/lineItem/{id}")
    fun putLineItem(@PathVariable("id") lineItemId: UUID, @RequestBody lineItem: LineItem): LineItem {
        return lineItemService.updateLineItem(lineItemId, lineItem)
    }

//    @PutMapping("/lineItem/{id}")
//    fun put(@PathVariable id: UUID, @RequestBody lineItem: LineItem) {
//        if(repository.findById(id) != null){
//
//        }
//    }
//
//    @DeleteMapping("/lineItem/{id}")
//    fun delete(@PathVariable id: UUID) {
//        repository.delete(id)
//    }


}

