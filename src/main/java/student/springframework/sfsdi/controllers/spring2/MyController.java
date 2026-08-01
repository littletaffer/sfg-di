package student.springframework.sfsdi.controllers.spring2;

import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.spring2.GreetingService;

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
