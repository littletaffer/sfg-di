package student.springframework.sfsdi.services;

public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World ----- EN";
    }
}
