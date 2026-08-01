package student.springframework.sfsdi.controllers.spring4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.springframework.sfsdi.datasource.spring4.DataSource;
import student.springframework.sfsdi.datasource.spring4.DiDataSource;
import student.springframework.sfsdi.repositories.spring4.DiRepoImpl;
import student.springframework.sfsdi.repositories.spring4.Repo;
import student.springframework.sfsdi.services.spring4.DiService;
import student.springframework.sfsdi.services.spring4.DiServiceImpl;
import student.springframework.sfsdi.services.spring4.EmailService;
import student.springframework.sfsdi.services.spring4.SmsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiControllerTest {

    private DiController diController;
    private DiService diService;
    private Repo diRepo;
    private DataSource diDataStore;

    @BeforeEach
    void setUp() {
        diDataStore = new DiDataSource("testUser", "testPassword", "testUrl");
        diRepo = new DiRepoImpl(diDataStore);
        diService = new DiServiceImpl(diRepo, new EmailService(), new SmsService());
        diController = new DiController(diService);
    }

    @Test
    void getGreeting() {
        // Given
        String expectedGreeting = "hello world";

        // When
        String actualGreeting = diController.getGreeting();

        // Then
        assertEquals(expectedGreeting, actualGreeting);

        System.out.println(actualGreeting);
    }
}
