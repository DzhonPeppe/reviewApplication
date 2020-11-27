package com.udacity.jwdnd.c1.review;

import javax.annotation.PostConstruct;

public class MessageService {
    private String message;

    public MessageService(String message) {
        this.message = message;
    }

    public String uppercase() {
        return this.message.toUpperCase();
    }
    public String lowercase() {
        return this.message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean");
    }
}
