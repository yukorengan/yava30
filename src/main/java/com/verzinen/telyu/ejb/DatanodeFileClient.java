package com.verzinen.telyu.ejb;

import com.verzinen.ugm.model.datanode.Datanode;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;


import com.verzinen.ugm.model.datanode.Cpu;
//import com.verzinen.ugm.model.datanode.Datanode;
import com.verzinen.ugm.model.datanode.Datanode__2;
import com.verzinen.ugm.model.datanode.Disk;
import com.verzinen.ugm.model.datanode.Jvm;
import com.verzinen.ugm.model.datanode.JvmMetrics;
import com.verzinen.ugm.model.datanode.Load;
import com.verzinen.ugm.model.datanode.Memory;
import com.verzinen.ugm.model.datanode.Metrics;
import com.verzinen.ugm.model.datanode.MetricsSystem;
import com.verzinen.ugm.model.datanode.Network;
import com.verzinen.ugm.model.datanode.ServiceComponentInfo;

 
@Singleton
@Startup
public class DatanodeFileClient {
	
	public enum States {BEFORESTARTED, STARTED, PAUSED, SHUTTINGDOWN};
	    
	private States state;
	static String host = "192.168.3.132";
	static String port = "8080";
	
	static Datanode _datanode = null;
	static long fire_time = System.currentTimeMillis();
	String DEFAULT_JSON_FILE = "/app/devel/prime/json/DATANODE.json";
	
	
	public DatanodeFileClient() {
		
		System.out.println("DatanodeClient init ...");
		
		System.out.println("DatanodeClient init ... done");
	}
	
	public Datanode  getDatanode() {
		//System.out.println("getDatanode invoke ...");
		System.out.println("getDatanode invoked ...");
			
		return _datanode;
	}

	@PostConstruct
	public void initialize() {
		state = States.BEFORESTARTED;
		// Perform intialization
		get_de_data();
		state = States.STARTED;
		System.out.println("Service Started");
	}
	
	//@Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
	@Schedule(minute = "*/5", hour = "*", persistent = false)
    public void atSchedule() throws InterruptedException {
		
		get_de_data();
		
        System.out.println("DeclarativeScheduler:: In atSchedule() fired get_de_data()");
        
    }
	
public void get_de_data() {
		
		try {

	
			System.out.println("reading file " + DEFAULT_JSON_FILE );

			TelyuFileClient  _client = new TelyuFileClient(DEFAULT_JSON_FILE);

		
			fire_time = System.currentTimeMillis();
			
			String json = _client.textFileReader(DEFAULT_JSON_FILE);

			_datanode = JsonParsingUtil.json2DataNode(json);
			
			System.out.println(getServiceComponentInfo().getDisplayName());
			
			System.out.println("get_de_data () ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void get_de_data2() {
		
		try {

			// curl -u admin:admin -H "X-Requested-By: ambari" -X GET
			// http://192.168.3.132:8080/api/v1/clusters/C10H16/services/HDFS/components/DATANODE

			String qry_name = "/api/v1/clusters/C10H16/services/HDFS/components/DATANODE";

			System.out.println("get_de_data qry " + qry_name);

			UGMRestClient _client = new UGMRestClient(host, port);

			String _url = "http://" + host + ":" + port + qry_name;

			fire_time = System.currentTimeMillis();
			String json = _client.basic_auth_client(_url);

			_datanode = JsonParsingUtil.json2DataNode(json);
			
			System.out.println(getServiceComponentInfo().getDisplayName());
			
			System.out.println("get_de_data () ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void terminate() {
		state = States.SHUTTINGDOWN;
		// Perform termination
		System.out.println("DatanodeClient shutdown in progress");
	}

	public States getState() {
		return state;
	}

	public void setState(States state) {
		this.state = state;
	}
	
	public long getFiretime() {
		return fire_time;
	}
	
	
	public String getHref() {
		
		return _datanode.getHref();
		
	}
	
    public ServiceComponentInfo getServiceComponentInfo() {
		
		return _datanode.getServiceComponentInfo();
		
	}

    public Metrics getMetrics() {
		
		return _datanode.getMetrics();
		
	}

    public Cpu getCpu() {
		
  		return _datanode.getMetrics().getCpu();
  		
  	}
  
    public Disk getDisk() {
		
  		return _datanode.getMetrics().getDisk();
  		
  	}
 
    public Memory getMemory() {
		
		return _datanode.getMetrics().getMemory();
		
	}
 
    public Network getNetwork() {
		
		return _datanode.getMetrics().getNetwork();
		
	}
    
    public Datanode__2  getDatanode2() {
		
		return _datanode.getMetrics().getDfs().getDatanode();
		
	}
    
    public JvmMetrics  getJvmMetrics() {
		
		return _datanode.getMetrics().getJvm().getJvmMetrics();
		
	}
    
    public Jvm  getJvm() {
		
		return _datanode.getMetrics().getJvm();
		
	}
    
    public Load  getLoad() {
		
		return _datanode.getMetrics().getLoad();
		
	}
    
    public MetricsSystem  getMetricsSystem() {
		
    	return _datanode.getMetrics().getMetricssystem().getMetricsSystem();
		
	}
    
  
}