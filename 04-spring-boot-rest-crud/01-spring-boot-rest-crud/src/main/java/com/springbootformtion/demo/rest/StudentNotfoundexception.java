package com.springbootformtion.demo.rest;

public class StudentNotfoundexception  extends RuntimeException{
    public StudentNotfoundexception(String message) {
        super(message);
    }

    public StudentNotfoundexception(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotfoundexception(Throwable cause) {
        super(cause);
    }
}

