package student.springframework.sfsdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.LegacyGreetingService;
@Controller
public class SetterInjectedController {

    //Using the setter injector method.
    private LegacyGreetingService legacyGreetingService;

    public LegacyGreetingService getGreetingService() {
        return legacyGreetingService;
    }
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(LegacyGreetingService legacyGreetingService) {
        this.legacyGreetingService = legacyGreetingService;
    }

    public String getGreeting(){
        return legacyGreetingService.sayGreeting();
    }
}
