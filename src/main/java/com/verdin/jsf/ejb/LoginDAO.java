package com.verdin.jsf.ejb;

import javax.enterprise.context.ApplicationScoped;
import java.sql.Connection;
import javax.inject.Named;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.sql.SQLException;
import javax.sql.DataSource;

@Named("loginService")
@ApplicationScoped
public class LoginDAO {
    public static boolean validate (String user, String password) throws Exception {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/TraningDS");
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = ds.getConnection();
            ps = con.prepareStatement("Select admin_name, password from tbl_admin where admin_name = ? and password = ?");
            ps.setString(1, user);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //result found, means valid inputs
                return true;
            }
        } catch (Exception ex) {
            System.out.println("Login error -->" + ex.getMessage());
            return false;
        } finally {
            con.close();
        }
        return false;
    }
}
