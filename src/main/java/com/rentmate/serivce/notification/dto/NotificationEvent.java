package com.rentmate.serivce.notification.dto;

import java.util.Map;

public class NotificationEvent {
    private String eventType;
    private String email;
    private String subjectFile;
    private Map<String, Object> params;

    public String getSubjectFile() {
        return subjectFile;
    }

    public void setSubjectFile(String subjectFile) {
        this.subjectFile = subjectFile;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String type) {
        this.eventType = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
