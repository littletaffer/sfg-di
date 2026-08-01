package student.springframework.sfsdi.services.spring2;

public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
