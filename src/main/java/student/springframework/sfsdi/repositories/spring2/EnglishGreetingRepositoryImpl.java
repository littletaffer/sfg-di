package student.springframework.sfsdi.repositories.spring2;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World ----- EN";
    }
}
