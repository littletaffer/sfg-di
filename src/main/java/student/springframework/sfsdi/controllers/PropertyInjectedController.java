package student.springframework.sfsdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.GreetingService;
@Controller
public class PropertyInjectedController {

    //The least favorable
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
