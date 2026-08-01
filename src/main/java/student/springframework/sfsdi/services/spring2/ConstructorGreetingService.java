package student.springframework.sfsdi.services.spring2;

import student.springframework.sfsdi.services.spring2.GreetingService;

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}