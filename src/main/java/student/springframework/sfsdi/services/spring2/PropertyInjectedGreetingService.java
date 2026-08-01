package student.springframework.sfsdi.services.spring2;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
