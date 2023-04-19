package com.sugoikondo.multiprojectdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
class MultiProjectDemoApplicationForPublic

fun main(args: Array<String>) {
	runApplication<MultiProjectDemoApplicationForPublic>(*args)
}
