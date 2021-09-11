package no.dreamstate.customannotationprocessor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomAnnotationProcessorApplication

fun main(args: Array<String>) {
	runApplication<CustomAnnotationProcessorApplication>(*args)
}
