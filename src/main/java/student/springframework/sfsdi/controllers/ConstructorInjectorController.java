package student.springframework.sfsdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.LegacyGreetingService;
@Controller
public class ConstructorInjectorController {

    //The preferred method by constructor
    private final LegacyGreetingService legacyGreetingService;

    public ConstructorInjectorController(@Qualifier("constructorGreetingService") LegacyGreetingService legacyGreetingService) {
        this.legacyGreetingService = legacyGreetingService;
    }

    public String getGreeting(){
        return legacyGreetingService.sayGreeting();
    }
}
