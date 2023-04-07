package student.springframework.sfsdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import student.springframework.sfsdi.services.ConstructorGreetingService;
import student.springframework.sfsdi.services.PropertyInjectedGreetingService;
import student.springframework.sfsdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
