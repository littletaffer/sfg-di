package student.springframework.sfsdi.services;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean!";
    }
}
