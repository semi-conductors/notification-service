package com.rentmate.serivce.notification.listener;
import com.rentmate.serivce.notification.dto.NotificationEvent;
import com.rentmate.serivce.notification.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    private final EmailService emailService;

    public NotificationListener(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "notification-queue")
    public void handleNotificationEvent(NotificationEvent event) {
        try {
            emailService.sendEmail(
                    event.getEmail(),
                    event.getSubjectFile(),
                    event.getEventType(),
                    event.getParams()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
