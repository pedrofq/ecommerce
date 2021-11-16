package com.pedro;

import java.sql.*;

public class ConnectDB {
    public Connection connection = null;
    private String url;
    private String user;
    private String password;
           
    public Connection conectar(){
        try{
            
           url = "jdbc:postgresql://localhost:5432/e-commerce";
           user = "postgres";
           password = "admin";
           Class.forName("org.postgresql.Driver");
           connection = DriverManager.getConnection(url, user, password);
           
           if(connection!=null){
               System.out.println("Connected");
           }else{
               System.out.println("Connection failed");
           }
           }catch (Exception e){
                System.out.println(e);
       }
       return connection;
    }
}
