package student.springframework.sfsdi.services;

public class SetterInjectedLegacyGreetingService implements LegacyGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
