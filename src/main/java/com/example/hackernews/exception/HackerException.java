package com.example.hackernews.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class HackerException extends RuntimeException {

    public HackerException() {
        super();
    }
    public HackerException(String message, Throwable cause) {
        super(message, cause);
    }
    public HackerException(String message) {
        super(message);
    }
    public HackerException(Throwable cause) {
        super(cause);
    }
}
