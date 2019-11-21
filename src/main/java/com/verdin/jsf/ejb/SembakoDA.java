package com.verdin.jsf.ejb;

import com.mysql.cj.xdevapi.Statement;
import com.verdin.jsf.bean.SembakoBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SembakoDA {

    public static Statement stmtObj;
    public static Connection connObj;
    public static ResultSet resultSetObj;
    public static PreparedStatement pstmt;

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_url ="jdbc:mysql://localhost:3306/magang",
                    db_userName = "root",
                    db_password = "";
            connObj = DriverManager.getConnection(db_url,db_userName,db_password);
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
        return connObj;
    }
    public static String save(SembakoBean sembako) {
        int saveResult = 0;
        String navigationResult = "";
        try {
            pstmt = (PreparedStatement) getConnection().prepareStatement("insert into sembako (jenis, harga, stok) values (?, ?, ?)");
            pstmt.setString(1, sembako.getJenis());
            pstmt.setInt(1, sembako.getHarga());
            pstmt.setInt(1, sembako.getStok());
            saveResult = pstmt.executeUpdate();
            connObj.close();
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
        if(saveResult !=0) {
            navigationResult = "fullPageLayout1.xhtml?faces-redirect=true";
        } else {
            navigationResult = "fullPageLayout1.xhtml?faces-redirect=true";
        }
        return navigationResult;

    }

}
