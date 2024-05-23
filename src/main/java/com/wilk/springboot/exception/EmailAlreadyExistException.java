package com.wilk.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlreadyExistException  extends RuntimeException{

    private String msg;

    public EmailAlreadyExistException(String msg) {
        super(msg);
    }
}
