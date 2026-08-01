package student.springframework.sfsdi.controllers.spring4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringContextTest {

    @Autowired
    DiController diController;

    @Test
    void testSpringController(){
        System.out.println(diController.getGreeting());
    }
}
