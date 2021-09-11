package no.dreamstate.customannotationprocessor

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.reflect.CodeSignature
import org.springframework.stereotype.Component

@Aspect
@Component
class AtsValidateAspect(private val helloService: HelloService) {

    @Before(value = "@annotation(atsValidate)")
    fun validate(joinPoint: JoinPoint, atsValidate: AtsValidate) {
        (joinPoint.signature as CodeSignature).parameterNames.forEach {
            println(it)
        }
        println(joinPoint.args[0])
        if (atsValidate.rettighet == Rettighet.LES) {
            helloService.les()
        } else if (atsValidate.rettighet == Rettighet.SKRIV) {
            helloService.skriv()
        }
    }
}