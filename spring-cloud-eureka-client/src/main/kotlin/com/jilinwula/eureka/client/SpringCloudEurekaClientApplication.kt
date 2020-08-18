package com.jilinwula.eureka.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SpringCloudEurekaClientApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudEurekaClientApplication>(*args)
}
