package no.dreamstate.customannotationprocessor

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class AtsValidate(val rettighet: Rettighet)
