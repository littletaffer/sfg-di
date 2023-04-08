package student.springframework.sfsdi.services;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
