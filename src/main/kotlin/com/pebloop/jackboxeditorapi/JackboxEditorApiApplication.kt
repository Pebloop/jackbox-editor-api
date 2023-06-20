package com.pebloop.jackboxeditorapi

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import java.util.*


@SpringBootApplication
class JackboxEditorApiApplication

fun main(args: Array<String>) {
	runApplication<JackboxEditorApiApplication>(*args)
}

@Bean
fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner? {
	return CommandLineRunner { args: Array<String?>? ->
		println("Let's inspect the beans provided by Spring Boot:")
		val beanNames: Array<String> = ctx.getBeanDefinitionNames()
		Arrays.sort(beanNames)
		for (beanName in beanNames) {
			println(beanName)
		}
	}
}

@Bean
fun usersMicroserviceOpenAPI(): OpenAPI? {
	return OpenAPI()
		.info(
			Info().title("Jackbox Editor API")
				.description("Allow to edit Jackbox games")
				.version("1.0")
		)
}