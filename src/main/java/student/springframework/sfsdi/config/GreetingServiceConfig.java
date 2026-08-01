package student.springframework.sfsdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import student.springframework.sfsdi.datasource.FakeDataSource;
import student.springframework.sfsdi.repositories.EnglishGreetingRepository;
import student.springframework.sfsdi.repositories.EnglishGreetingRepositoryImpl;
import student.springframework.sfsdi.services.*;

@EnableConfigurationProperties(SfsConstructorConfig.class)
@ImportResource("classpath:sfsdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfsConstructorConfig sfsConstructorConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfsConstructorConfig.getUsername());
        fakeDataSource.setPassword(sfsConstructorConfig.getPassword());
        fakeDataSource.setJdbcUrl(sfsConstructorConfig.getJdbcUrl());
        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog","default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"ESP","default"})
    @Bean("i18nService")
    I18NSpanishLegacyGreetingService ii8NSpanishService() {
        return new I18NSpanishLegacyGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18NEnglishLegacyGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18NEnglishLegacyGreetingService(englishGreetingRepository);
    }
    @Primary
    @Bean
    PrimaryLegacyGreetingService primaryGreetingService() {
        return new PrimaryLegacyGreetingService();
    }

    @Bean
    PropertyInjectedLegacyGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedLegacyGreetingService();
    }

    @Bean
    SetterInjectedLegacyGreetingService setterInjectedGreetingService(){
        return new SetterInjectedLegacyGreetingService();
    }
}
