package student.springframework.sfsdi.controllers;

import student.springframework.sfsdi.services.GreetingService;

public class ConstructorInjectorController {

    //The preferred method by constructor
    private final GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
