package no.dreamstate.customannotationprocessor

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun les() {
        println("HELLO FROM LES SERVICE!")
    }

    fun skriv() {
        println("HELLO FROM SKRIV SERVICE!")
    }
}