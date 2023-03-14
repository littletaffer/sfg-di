package student.springframework.sfsdi.controllers;

import student.springframework.sfsdi.services.GreetingService;

public class SetterInjectedController {

    //Using the setter injector method.
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
