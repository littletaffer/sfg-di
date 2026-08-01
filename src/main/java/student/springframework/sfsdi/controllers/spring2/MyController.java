package student.springframework.sfsdi.controllers.spring2;

import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.spring2.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
