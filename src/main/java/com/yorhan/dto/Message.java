package com.yorhan.dto;

import java.time.LocalDateTime;

public class Message {
    private Integer id;
    private String message;
    private String sender;
    private LocalDateTime date;

    public Message() {
    }

    public Message(Integer id, String message, String sender, LocalDateTime date) {
        this.id = id;
        this.message = message;
        this.sender = sender;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
