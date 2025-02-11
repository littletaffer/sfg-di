package student.springframework.sfsdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.springframework.sfsdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService());
    }
}