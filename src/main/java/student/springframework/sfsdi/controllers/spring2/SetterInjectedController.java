package student.springframework.sfsdi.controllers.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import student.springframework.sfsdi.services.spring2.GreetingService;
@Controller
public class SetterInjectedController {

    //Using the setter injector method.
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
