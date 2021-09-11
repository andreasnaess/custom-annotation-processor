package no.dreamstate.customannotationprocessor

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

@Configuration
class AppConfig {

    @Bean
    fun filterRegistration(): FilterRegistrationBean<AtsFilter> {
        val filterRegistrationBean = FilterRegistrationBean(AtsFilter())
        filterRegistrationBean.addUrlPatterns("/api/*")
        return filterRegistrationBean
    }

    class AtsFilter : Filter {
        override fun doFilter(p0: ServletRequest, p1: ServletResponse, p2: FilterChain) {
            println("HELLO FROM FILTER")
            p2.doFilter(p0, p1)
        }
    }
}