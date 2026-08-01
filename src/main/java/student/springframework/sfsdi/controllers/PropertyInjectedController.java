package student.springframework.sfsdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.LegacyGreetingService;
@Controller
public class PropertyInjectedController {

    //The least favorable
    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public LegacyGreetingService legacyGreetingService;

    public String getGreeting(){
        return legacyGreetingService.sayGreeting();
    }
}
