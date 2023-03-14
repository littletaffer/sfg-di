package student.springframework.sfsdi.controllers;

import student.springframework.sfsdi.services.GreetingService;

public class PropertyInjectedController {

    //The least favorable

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
