package com.verzinen.polbeng.ejb;

import com.verzinen.polbeng.model.UserBean;
import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.*;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class UserEJB implements Serializable {
	static final long serialVersionUID = 142232299l;
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;

	UserBean user;
	List<UserBean> userList;
	int i = 0;
	int admin_id;
	String password, user_name;
	
	UserBean updateUser;

	public static Connection connObj;
	public static PreparedStatement pstmt;

	static Logger logger = Logger.getLogger(UserEJB.class);

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

	@PostConstruct
	public void init() {
		try {
			user = new UserBean();
			readData();
			user = new UserBean();
			user.setAdmin_id(0);
			user.setUser_name("");
			user.setPassword("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertData(UserBean user) {
		int status = 0;
		try
	    {
			pstmt = (PreparedStatement) getConnection().prepareStatement("insert into tbl_admin (admin_id, admin_name, password) values (?, ?, ?)");
			pstmt.setInt(1, user.getAdmin_id());
			pstmt.setString(2, user.getUser_name());
			pstmt.setString(3, user.getPassword());
			status = pstmt.executeUpdate();
			logger.info("Status penyimpanan : " + status);
			System.out.format("DATA Insert: %s, %s, %s\n", user.getAdmin_id(), user.getUser_name(), user.getPassword());
			connObj.close();
			user.setAdmin_id(0);
			user.setUser_name("");
			user.setPassword("");
			init();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	}

	public void delData(int id) {
		 int status = 0;
		 try {
				pstmt = (PreparedStatement) getConnection().prepareStatement("delete from tbl_admin where admin_id=?");
				pstmt.setInt(1, id);
				status = pstmt.executeUpdate();
				connObj.close();
				logger.info("Status penyimpanan : " + status);
		      	init();
		    }
		    catch (Exception e) {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
	}

	public void updateData(int id, String username, String password) {
		int status = 0;
		try {
			pstmt = (PreparedStatement) getConnection().prepareStatement("update tbl_admin set admin_name=?, password=? where admin_id=?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setInt(3, id);
			status = pstmt.executeUpdate();
			connObj.close();
			logger.info("Status penyimpanan : " + status);
			init();
	    }
	    catch (Exception e) {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	}

	public void readData() {
		// create our mysql database connection
		userList = new ArrayList<UserBean>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		String q_USER = "select * from tbl_admin";

		try {
			conn = getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(q_USER);

	      // iterate through the java resultset
	      while (rs.next()) {
	    	user = new UserBean();
	        int adminId = rs.getInt("admin_id");
	        user.setAdmin_id(adminId);
	        String namaAdmin = rs.getString("admin_name");
	        user.setUser_name(namaAdmin);
	        String password = rs.getString("password");
	        user.setPassword(password);
	        // print the results
	        System.out.format("DATA : %s, %s, %s\n", adminId, namaAdmin, password);
	        userList.add(user);
	      }
	      st.close();
	    }
	    catch (Exception e) {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	}
	
	public void bantuUpdate(int id) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String q_USER = "select * from tbl_admin where admin_id = " + id;
		try
	    {
			conn = getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(q_USER);

	      	// iterate through the java resultset
	      	while (rs.next())
	      	{
				updateUser = new UserBean();
				int adminId = rs.getInt("admin_id");
				updateUser.setAdmin_id(adminId);
				String namaAdmin = rs.getString("admin_name");
				updateUser.setUser_name(namaAdmin);
				String password = rs.getString("password");
				updateUser.setPassword(password);
				// print the results
				System.out.format("DATA : %s, %s, %s\n", adminId, namaAdmin, password);
	      	}
	      	st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
		init();
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('dlg4').show();");

	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public List<UserBean> getUserList() {
		return userList;
	}

	public void setUserList(List<UserBean> userList) {
		this.userList = userList;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserBean getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(UserBean updateUser) {
		this.updateUser = updateUser;
	}
}
