package student.springframework.sfsdi.services.spring4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import student.springframework.sfsdi.repositories.spring4.Repo;

@Service
public class DiServiceImpl implements DiService{

    private final Repo repo;
    private final MessageService emailService;
    private final MessageService smsService;

    public DiServiceImpl(Repo repo,
                         @Qualifier("emailService") MessageService emailService,
                         @Qualifier("smsService") MessageService smsService) {
        this.repo = repo;
        this.emailService = emailService;
        this.smsService = smsService;
    }

    @Override
    public String getGreeting() {
        String greeting = repo.queryDatabase();
        emailService.sendMessage(greeting);
        smsService.sendMessage(greeting);
        return greeting;
    }
}
