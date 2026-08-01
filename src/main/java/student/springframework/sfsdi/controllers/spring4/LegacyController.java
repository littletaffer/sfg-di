package student.springframework.sfsdi.controllers.spring4;

import student.springframework.sfsdi.services.spring4.DiService;

public class LegacyController {
    public String getGreeting() {
        DiService.LegacyGreetingService legacyGreetingService = new DiService.LegacyGreetingService();

        return legacyGreetingService.getGreeting();
    }
}
