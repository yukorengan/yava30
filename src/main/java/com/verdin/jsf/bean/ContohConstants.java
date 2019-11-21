package com.verdin.jsf.bean;

public final class ContohConstants {
	  public final class Service {
		  
		    public static final String MAPREDUCE2 = "MAPREDUCE2";
		    public static final String HBASE = "HBASE";

		    public static final String DEFAULT_USER = "admin";
		    public static final String DEFAULT_PASS = "admin";
		    public static final String DEFAULT_CLUSTER = "C10H16";// "YAVA30";// "H2SO4";
		    public static final String DEFAULT_HOSTNAME = "192.168.3.132";// 192.168.3.132 192.168.3.221 192.168.3.164

		    private Service() {}
		  }

		  public final class DB {
		    public static final String name = "oups";

		    public final class Connection {
		      public static final String URL = "jdbc:tra-ta-ta";
		      public static final String USER = "testUser";
		      public static final String PASSWORD = "testPassword";

		      private Connection() {}
		    }

		    private DB() {}
		  }

		  private ContohConstants() {}
}
