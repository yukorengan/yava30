package com.roasted.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

//import com.roasted.model.ContainerMetrics;
import com.roasted.model.MetricAggregateDailyUUID;

import java.util.List;
import java.util.ArrayList;

public class MetricsAggregateDaily {
	
	
	
	
	public static void main(String args[]) throws Exception {
	    Connection conn;
	    Properties prop = new Properties();
	    
	    Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
	    //conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:/hbase-unsecure");
	    conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");

	    System.out.println("got connection");

	    
	    ResultSet rst = conn.createStatement().executeQuery("select * from METRIC_AGGREGATE_DAILY_UUID");
//	    
	    MetricAggregateDailyUUID mad = new MetricAggregateDailyUUID();
	    while (rst.next()) {
//	      System.out.println(rst.getString("UUID"));
	    	mad.setUUID(rst.getByte("UUID"));
	    	mad.setServet(rst.getLong("SERVER_TIME"));
	    	mad.setCount(rst.getInt("METRIC_COUNT"));
	    	mad.setSum(rst.getDouble("METRIC_SUM"));
	    	mad.setMax(rst.getDouble("METRIC_MAX"));
	    	mad.setMin(rst.getDouble("METRIC_MIN"));
	    	
	      
	    }
	  }

}
