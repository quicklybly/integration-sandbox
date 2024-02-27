package com.quicklybly.integrationconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntegrationConsumerApplication

fun main(args: Array<String>) {
    runApplication<IntegrationConsumerApplication>(*args)
}
