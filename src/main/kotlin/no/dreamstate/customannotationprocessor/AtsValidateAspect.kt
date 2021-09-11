package no.dreamstate.customannotationprocessor

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class AtsValidateAspect(private val helloService: HelloService) {

    @Before(value = "@annotation(atsValidate)")
    fun validate(atsValidate: AtsValidate) {
        if (atsValidate.rettighet == Rettighet.LES) {
            helloService.les()
        } else if (atsValidate.rettighet == Rettighet.SKRIV) {
            helloService.skriv()
        }
    }
}