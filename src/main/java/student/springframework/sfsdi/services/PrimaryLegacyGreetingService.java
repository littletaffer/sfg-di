package student.springframework.sfsdi.services;

public class PrimaryLegacyGreetingService implements LegacyGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean!";
    }
}
