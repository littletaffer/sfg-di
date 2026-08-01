package student.springframework.sfsdi.services;

public class I18NSpanishLegacyGreetingService implements LegacyGreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo ---- ESP";
    }
}
