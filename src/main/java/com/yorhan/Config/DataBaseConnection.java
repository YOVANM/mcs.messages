package com.yorhan.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class DataBaseConnection {

    public Connection getConnection(){
        Connection res = null;
        try {
            res = DriverManager.getConnection("jdbc:mysql://localhost:3306/fog","yovan","rsN543R$");
            if (Objects.nonNull(res)){
                System.out.println("Conexion exitosa");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("error al realizar la conexion con la base de datos");

        }
        return res;
    }
}
