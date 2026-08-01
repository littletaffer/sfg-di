package student.springframework.sfsdi.services.spring2;

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
