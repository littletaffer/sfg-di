package student.springframework.sfsdi.services.spring2;

import student.springframework.sfsdi.repositories.spring2.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    private final EnglishGreetingRepository englishGreetingRepository;
    @Override
    public String sayGreeting() {
        return "Hello World ----- EN";
    }
}
