package student.springframework.sfsdi.services;

public class ConstructorLegacyGreetingService implements LegacyGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
