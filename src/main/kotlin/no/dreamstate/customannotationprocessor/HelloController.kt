package no.dreamstate.customannotationprocessor

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HelloController {

    @AtsValidate(rettighet = Rettighet.LES)
    @GetMapping("/hello")
    fun hello(@RequestParam(required = false) name: String?): String {
        return "Hello ${name ?: "world"}"
    }
}