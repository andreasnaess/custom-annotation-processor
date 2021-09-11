package no.dreamstate.customannotationprocessor

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HelloController {

    @AtsValidate(rettighet = Rettighet.SKRIV)
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello world"
    }
}