package com.yorhan.repository.impl;

import com.yorhan.Config.DataBaseConnection;

import java.sql.Connection;

public class MessageRepositoryImpl {

    Connection conecction = DataBaseConnection.getConnection();
    public static void insertMessage(String message, String sender) {

    }
    public static void deleteMessage(String messageId) {

    }
    public static void updateMessage(String messageId, String message) {

    }
    public static void getMessage(String messageId) {

    }
}
