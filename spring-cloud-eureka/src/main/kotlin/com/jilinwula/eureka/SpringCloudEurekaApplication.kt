package com.jilinwula.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SpringCloudEurekaApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudEurekaApplication>(*args)
}
