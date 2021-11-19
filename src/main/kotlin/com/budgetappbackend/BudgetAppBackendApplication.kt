package com.budgetappbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BudgetAppBackendApplication

fun main(args: Array<String>) {
    runApplication<BudgetAppBackendApplication>(*args)
}
