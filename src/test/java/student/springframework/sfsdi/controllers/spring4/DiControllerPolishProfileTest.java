package student.springframework.sfsdi.controllers.spring4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import student.springframework.sfsdi.datasource.spring4.DiDataSource;
import student.springframework.sfsdi.datasource.spring4.PolishDiDataSource;
import student.springframework.sfsdi.repositories.spring4.DiRepoImpl;
import student.springframework.sfsdi.services.spring4.DiServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {
        DiController.class,
        DiServiceImpl.class,
        DiRepoImpl.class,
        DiDataSource.class,
        PolishDiDataSource.class
})
@ActiveProfiles("polish")
class DiControllerPolishProfileTest {

    @Autowired
    DiController diController;

    @Test
    void getGreetingReturnsPolishGreetingWhenPolishProfileIsActive() {
        assertEquals("Witaj świecie", diController.getGreeting());
    }
}
