package student.springframework.sfsdi.controllers.spring4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import student.springframework.sfsdi.datasource.spring4.DiDataSource;
import student.springframework.sfsdi.datasource.spring4.SpanishDiDataSource;
import student.springframework.sfsdi.repositories.spring4.DiRepoImpl;
import student.springframework.sfsdi.services.spring4.DiServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {
        DiController.class,
        DiServiceImpl.class,
        DiRepoImpl.class,
        DiDataSource.class,
        SpanishDiDataSource.class
})
@ActiveProfiles("spanish")
class DiControllerSpanishProfileTest {

    @Autowired
    DiController diController;

    @Test
    void getGreetingReturnsSpanishGreetingWhenSpanishProfileIsActive() {
        assertEquals("Hola Mundo", diController.getGreeting());
    }
}
