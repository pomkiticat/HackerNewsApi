package com.example.hackernews.exception;

import java.util.Date;

public class ExceptionResponse {
    private String message;
    private String details;
    private Date time;

    public  ExceptionResponse(){}
    public ExceptionResponse(String message, String details, Date time) {
        this.message = message;
        this.details = details;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
