package com.mycompany.clients.notification;

import com.mycompany.clients.fraud.FraudCheckResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(
        "notification"
)

public interface NotificationClient {
    @PostMapping("api/v1/notification")
    void sendNotification(NotificationRequest notificationRequest);
}
