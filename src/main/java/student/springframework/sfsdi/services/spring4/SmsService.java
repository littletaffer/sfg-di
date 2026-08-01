package student.springframework.sfsdi.services.spring4;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
