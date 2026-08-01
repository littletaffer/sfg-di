package student.springframework.sfsdi.controllers.spring2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.springframework.sfsdi.services.spring2.ConstructorGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}