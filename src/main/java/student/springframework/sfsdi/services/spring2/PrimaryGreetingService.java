package student.springframework.sfsdi.services.spring2;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean!";
    }
}
