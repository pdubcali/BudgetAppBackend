package com.budgetappbackend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
class LineItemController {

    @Autowired
    lateinit var repository: LineItemRepository
    @GetMapping("/lineItem/findAll")
    fun findAll()= repository.findAll()

    @PostMapping("/lineItem")
    fun post(@RequestBody lineItem: LineItem) {
        repository.save(lineItem)
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

