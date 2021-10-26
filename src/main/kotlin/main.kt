package ru.eho.contracts

/* function main is implemented in RedCollar style, but something is missing */

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import ru.eho.common.annotations.EnableCommonLib

@SpringBootApplication
@EnableCommonLib
class EhoContractsApplication

fun main(args: Array<String>) {
    runApplication<EhoContractsApplication>(*args)
}