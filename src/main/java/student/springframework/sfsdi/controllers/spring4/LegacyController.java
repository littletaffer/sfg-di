package student.springframework.sfsdi.controllers.spring4;

import student.springframework.sfsdi.services.spring4.LegacyGreetingService;

public class LegacyController {
    public String getGreeting() {
        LegacyGreetingService legacyGreetingService = new LegacyGreetingService();

        return legacyGreetingService.getGreeting();
    }
}
