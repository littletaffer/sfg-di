package student.springframework.sfsdi.controllers.spring2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.GreetingService;

@Controller
public class I18nController {

    private final LegacyGreetingService legacyGreetingService;

    public I18nController(@Qualifier("i18nService") LegacyGreetingService legacyGreetingService) {
        this.legacyGreetingService = legacyGreetingService;
    }

    public String sayHello(){
        return legacyGreetingService.sayGreeting();
    }
}
