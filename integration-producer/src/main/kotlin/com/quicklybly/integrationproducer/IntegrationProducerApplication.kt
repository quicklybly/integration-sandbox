package com.quicklybly.integrationproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntegrationProducerApplication

fun main(args: Array<String>) {
	runApplication<IntegrationProducerApplication>(*args)
}
