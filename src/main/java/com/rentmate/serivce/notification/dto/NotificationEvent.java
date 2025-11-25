package com.rentmate.serivce.notification.dto;

import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class NotificationEvent{
    private String eventType;
    private Long userId;
    private Map<String, Object> params;

    public String getEventType() {
        return eventType;
    }

    public String getEmail(){
        RestTemplate rest = new RestTemplate();
        String url = "http://localhost:8080/users/{id}/email";
        String email = rest.getForObject(url, String.class, userId);
        return email;
    }
    public void setEventType(String type) {
        this.eventType = type;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
    public Long getUserId() {
        return this.userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
