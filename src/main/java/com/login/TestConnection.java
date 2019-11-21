package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestConnection {
     
     
    public static void main(String[] args) {

      Connection con = null;
        
        try {
           con = DriverManager.getConnection(
        		   "jdbc:postgresql://localhost/login",
        		   "postgres",
        		   "");
           
           System.out.println("Connection completed.");
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
      
      
      //        try {
//            Class.forName("org.postgresql.Driver");
//            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/login", "postgres", "");
////                    DBContract.HOST+DBContract.DB_NAME,
////                    DBContract.USERNAME,
////                    DBContract.PASSWORD);
//             
//            System.out.println("DB connected");
//             
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
 
    }
 
}