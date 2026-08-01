package student.springframework.sfsdi.controllers;

import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.LegacyGreetingService;

@Controller
public class MyController {

    private final LegacyGreetingService legacyGreetingService;

    public MyController(LegacyGreetingService legacyGreetingService) {
        this.legacyGreetingService = legacyGreetingService;
    }

    public String sayHello() {
        return legacyGreetingService.sayGreeting();
    }

}
