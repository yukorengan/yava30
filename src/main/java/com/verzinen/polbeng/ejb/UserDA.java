package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.UserBean;
import org.jboss.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;

public class UserDA {
    static Logger logger = Logger.getLogger(UserDA.class);
    public static Connection connObj;
    public static PreparedStatement pstmt;

    public static Connection getConnection() throws Exception{
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/TraningDS");
        try{
            connObj = ds.getConnection();
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
        return connObj;
    }

    public static String save(UserBean user) {
        int saveResult = 0;
        String navigationResult = "";
        try {
            pstmt = (PreparedStatement) getConnection().prepareStatement("insert into tbl_admin (admin_id, admin_name, password) values (?, ?, ?)");
            pstmt.setInt(1, user.getAdmin_id());
            pstmt.setString(2, user.getUser_name());
            pstmt.setString(3, user.getPassword());
            saveResult = pstmt.executeUpdate();
            connObj.close();
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
        if(saveResult !=0) {
            logger.info("STATUS : Data tersimpan - " + saveResult);
            navigationResult = "admin.xhtml?faces-redirect=true";
        } else {
            logger.info("STATUS : Data tidak tersimpan - " + saveResult);
            navigationResult = "admin.xhtml?faces-redirect=true";
        }
        return navigationResult;

    }

    public static String update(UserBean user) {
        int saveResult = 0;
        String navigationResult = "";
        try {
            pstmt = (PreparedStatement) getConnection().prepareStatement("update tbl_admin set admin_name=?, password=? where admin_id=?");
            pstmt.setString(1, user.getUser_name());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getAdmin_id());
            saveResult = pstmt.executeUpdate();
            connObj.close();
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
        if(saveResult !=0) {
            logger.info("STATUS : Data diupdate - " + saveResult);
            navigationResult = "admin.xhtml?faces-redirect=true";
        } else {
            logger.info("STATUS : Data tidak diupdate - " + saveResult);
            navigationResult = "admin.xhtml?faces-redirect=true";
        }
        return navigationResult;

    }

    public static String delete(int id) {
        int saveResult = 0;
        String navigationResult = "";
        try {
            pstmt = (PreparedStatement) getConnection().prepareStatement("delete from tbl_admin where admin_id=?");
            pstmt.setInt(1, id);
            saveResult = pstmt.executeUpdate();
            connObj.close();
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
        if(saveResult !=0) {
            logger.info("STATUS : Data dihapus - " + saveResult);
            navigationResult = "admin.xhtml?faces-redirect=true";
        } else {
            logger.info("STATUS : Data tidak dihapus - " + saveResult);
            navigationResult = "admin.xhtml?faces-redirect=true";
        }
        return navigationResult;

    }

}
