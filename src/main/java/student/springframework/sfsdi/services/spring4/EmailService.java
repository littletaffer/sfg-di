package student.springframework.sfsdi.services.spring4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("emailService")
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
