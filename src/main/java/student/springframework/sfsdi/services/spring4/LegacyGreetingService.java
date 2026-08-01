package student.springframework.sfsdi.services.spring4;

import student.springframework.sfsdi.repositories.spring4.LegacyRepo;

public class LegacyGreetingService {

    public String getGreeting(){
        LegacyRepo legacyRepo = new LegacyRepo();
        return legacyRepo.queryDatabase();
    }
}
