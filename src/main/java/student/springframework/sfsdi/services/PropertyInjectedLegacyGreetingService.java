package student.springframework.sfsdi.services;

public class PropertyInjectedLegacyGreetingService implements LegacyGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
