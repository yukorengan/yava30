package com.verzinen.polbeng.ejb;
import com.verzinen.polbeng.model.UserBean;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Named("userService")
@ApplicationScoped
public class UserDAO {
	
	static Logger logger = Logger.getLogger(UserDAO.class);

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
	
	public List<UserBean> getUser() throws Exception {

		logger.info("get in DAO ...");

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

	    List<UserBean> _users =  new ArrayList<UserBean>();

		String q_USER = "select * from tbl_admin";
	

		try {

			conn = getConnection();

			st = conn.createStatement();

			rs = st.executeQuery(q_USER);



			while (rs.next()) {

				logger.info("get in DAO ... "+ _users.size());
				
				
				UserBean u = new UserBean();

				u.setAdmin_id(rs.getInt("admin_id"));
				u.setUser_name(rs.getString("admin_name"));
				u.setPassword(rs.getString("password"));

				_users.add(u);

			}  
			
			logger.info("get in DAO ... "+ _users.size());
			
		}  catch (Exception e) {
			
			e.printStackTrace();

		} finally {
			conn.close();
		}
		return _users;
	}

}
