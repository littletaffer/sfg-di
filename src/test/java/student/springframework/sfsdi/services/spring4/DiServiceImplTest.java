package student.springframework.sfsdi.services.spring4;

import org.junit.jupiter.api.Test;
import student.springframework.sfsdi.repositories.spring4.Repo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class DiServiceImplTest {

    @Test
    void getGreetingSendsGreetingToEmailAndSmsServices() {
        Repo repo = mock(Repo.class);
        EmailService emailService = spy(new EmailService());
        SmsService smsService = spy(new SmsService());
        DiServiceImpl diService = new DiServiceImpl(repo, emailService, smsService);

        when(repo.queryDatabase()).thenReturn("hello world");

        String greeting = diService.getGreeting();

        assertEquals("hello world", greeting);
        verify(emailService).sendMessage("hello world");
        verify(smsService).sendMessage("hello world");
    }
}
