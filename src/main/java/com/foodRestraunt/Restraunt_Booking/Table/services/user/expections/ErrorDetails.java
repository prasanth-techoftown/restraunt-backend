package com.foodRestraunt.Restraunt_Booking.Table.services.user.expections;

import java.time.LocalDateTime;


public class ErrorDetails{

    private LocalDateTime timeStamp;
    private String message;
    private String path;

    public ErrorDetails(LocalDateTime timeStamp, String message, String path) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.path = path;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    



}

