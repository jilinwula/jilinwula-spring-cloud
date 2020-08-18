package com.jilinwula.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudEurekaServerApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudEurekaServerApplication>(*args)
}
