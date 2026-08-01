package student.springframework.sfsdi.controllers.spring4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LegacyControllerTest {
    @Test
    void getGreeting() {
        LegacyController legacyController = new LegacyController();

        assertEquals("Hello World!", legacyController.getGreeting());

        System.out.println(legacyController.getGreeting());

    }
}
