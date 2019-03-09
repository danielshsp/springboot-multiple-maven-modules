package rc.service.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

//import static rc.jmsconfig.JmsConfig.EMPLOYEE_TOPIC;

@Component
public class EmployeeConsumer {

    private static Logger log = LoggerFactory.getLogger(EmployeeConsumer.class);

    @JmsListener(destination = "employee-topic")
    public void consume(String message) {
        log.info("received:" + message );
    }
}
