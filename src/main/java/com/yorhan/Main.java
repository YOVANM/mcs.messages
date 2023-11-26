package com.yorhan;

import com.yorhan.Config.DataBaseConnection;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection conecction = new DataBaseConnection();
        conecction.getConnection();

    }
}