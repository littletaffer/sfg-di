package student.springframework.sfsdi.controllers.spring2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.spring2.GreetingService;

@Controller
public class ConstructorInjectorController {

    //The preferred method by constructor
    private final GreetingService greetingService;

    public ConstructorInjectorController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
