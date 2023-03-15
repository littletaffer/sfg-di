package student.springframework.sfsdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.GreetingService;
@Controller
public class SetterInjectedController {

    //Using the setter injector method.
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
