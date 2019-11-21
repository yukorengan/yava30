package com.verdin.jsf.ejb;

import com.verdin.jsf.model.Sembako;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Named("sembakoService")
@ApplicationScoped
public class SembakoDAO {
	
	static Logger logger = Logger.getLogger(SembakoDAO.class);
	
	public List<Sembako> getSembako() throws Exception {

		logger.info("get in DAO ...");
		
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/MagangDS");
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

	    List<Sembako> _sembakos =  new ArrayList<Sembako>();

		String q_SEMBAKO = "select * from sembako";
	

		try {

			conn = ds.getConnection();

			st = conn.createStatement();

			rs = st.executeQuery(q_SEMBAKO);



			while (rs.next()) {

				logger.info("get in DAO ... "+ _sembakos.size());
				
				
				Sembako s = new Sembako();
				
				s.setId(rs.getInt("id"));
				s.setJenis(rs.getString("jenis"));
				s.setHarga(rs.getInt("harga"));
				s.setStok(rs.getInt("stok"));

				_sembakos.add(s);

			}  
			
			logger.info("get in DAO ... "+ _sembakos.size());
			
		}  catch (Exception e) {
			
			e.printStackTrace();

		} finally {
			conn.close();
		}


		return _sembakos;

	}


}
