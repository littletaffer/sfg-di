package student.springframework.sfsdi.controllers.spring4;

import org.springframework.stereotype.Component;
import student.springframework.sfsdi.services.spring4.DiService;

@Component
public class DiController {

    private DiService service;

    public DiController(DiService service) {
        this.service = service;
    }

    public String getGreeting(){
        return service.getGreeting();
    }
}
