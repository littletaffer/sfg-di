package student.springframework.sfsdi.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import student.springframework.sfsdi.datasource.spring2.FakeDataSource;
import student.springframework.sfsdi.repositories.spring2.EnglishGreetingRepository;
import student.springframework.sfsdi.repositories.spring2.EnglishGreetingRepositoryImpl;
import student.springframework.sfsdi.services.spring2.*;

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
