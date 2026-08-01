package student.springframework.sfsdi.services;

import student.springframework.sfsdi.repositories.EnglishGreetingRepository;

public class I18NEnglishLegacyGreetingService implements LegacyGreetingService {

    public I18NEnglishLegacyGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    private final EnglishGreetingRepository englishGreetingRepository;
    @Override
    public String sayGreeting() {
        return "Hello World ----- EN";
    }
}
