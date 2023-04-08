package student.springframework.sfsdi.services;

public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
