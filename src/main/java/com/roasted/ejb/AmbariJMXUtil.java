package com.roasted.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.roasted.model.Bean;
import com.roasted.model.DataNodeInfo;
import com.roasted.model.DatanodeNetworkCount;
import com.roasted.model.DiagnosticOption;
import com.roasted.model.UgiMetrics;

/*
 * parsing work
 * json to POJO
 * 
 */
public class AmbariJMXUtil {
	
	
	public static List<DataNodeInfo> json2DataNodeInfo(String json) throws Exception {
		List<DataNodeInfo>  _dd =  new ArrayList<DataNodeInfo>(); 
		
			
		JsonParser parser = new JsonParser();
	
		JsonElement jsonTree = parser.parse(json);
	
		if(jsonTree.isJsonObject()) {
			
			DataNodeInfo d = new DataNodeInfo();

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());
		
			for (JsonElement bean : beans) {
				JsonObject _bean = (JsonObject) bean;
				
				d.setName(_bean.get("name").getAsString()); 
				d.setModelerType(_bean.get("modelerType").getAsString());
				
		/* 		modelerType,
				XceiverCount,
			    "XmitsInProgress" : 0,
			    "SoftwareVersion" : "3.1.1",
			    "Version" : "3.1.1, rUnknown",
			    "RpcPort" : "8010",
			    "DataPort" : "50010",
			    "HttpPort" : null,  
			    */
				
				d.setXceiverCount(_bean.get("XceiverCount").getAsInt());
				d.setXmitsInProgress(_bean.get("XmitsInProgress").getAsInt());
				d.setSoftwareVersion(_bean.get("SoftwareVersion").getAsString());
				d.setVersion(_bean.get("Version").getAsString());
				d.setRpcPort(_bean.get("RpcPort").getAsString());
				d.setDataPort(_bean.get("DataPort").getAsString());
				
				//d.setHttpPort(_bean.get("HttpPort").getAsString());

				//System.out.println(_bean.get("HttpPort"));
				//System.out.println(_bean.get("HttpPort").getAsString());

				//DatanodeHostname
				//ClusterId
				//SendPacketDownstreamAvgInfo
				//SlowDisks
				
				d.setDatanodeHostname(_bean.get("DatanodeHostname").getAsString());
				d.setClusterId(_bean.get("ClusterId").getAsString());
				
				//d.setSendPacketDownstreamAvgInfo(_bean.get("SendPacketDownstreamAvgInfo").getAsString());
				//System.out.println(_bean.get("SendPacketDownstreamAvgInfo"));
				
				//d.setSlowDisks(_bean.get("SlowDisks").getAsString());
				
				//System.out.println(_bean.get("SlowDisks"));
				//System.out.println(_bean.get("SlowDisks").getAsString());

				
				JsonArray entries = (JsonArray) parser.parse(_bean.get("DatanodeNetworkCounts").toString()) ;

				List<DatanodeNetworkCount> dd = new ArrayList<DatanodeNetworkCount>();
								
				for (JsonElement _entry: entries) {
					JsonObject entry  = (JsonObject) _entry;
					
					System.out.println(entry);
					
					// DatanodeNetworkCounts []
					DatanodeNetworkCount dn = new DatanodeNetworkCount();
						
						//	d.setKey(entry.get);
						
				}
				
				
				// NamenodeAddresses
				d.setNamenodeAddresses(_bean.get("NamenodeAddresses").getAsString());
				
				// BPServiceActorInfo []
				d.setBPServiceActorInfo(_bean.get("BPServiceActorInfo").getAsString());

				System.out.println(_bean.get("BPServiceActorInfo"));

				// VolumeInfo
				d.setVolumeInfo(_bean.get("VolumeInfo").getAsString());

				// DiskBalancerStatus
				d.setDiskBalancerStatus(_bean.get("DiskBalancerStatus").getAsString());
			}
				
			_dd.add(d);
				
				
		}
		
			
		return _dd;
	}
	
	
	public static List<UgiMetrics> json2UgiMetrics(String json) throws Exception {

		
		List<UgiMetrics> _beans_  = new ArrayList<UgiMetrics>();
				
		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if(jsonTree.isJsonObject()) {
			/*
 "beans" : [ {
    "name" : "Hadoop:service=DataNode,name=UgiMetrics",
    "modelerType" : "UgiMetrics",
    "tag.Context" : "ugi",
    "tag.Hostname" : "yava3-132.labs247.com",
    "LoginSuccessNumOps" : 1,
    "LoginSuccessAvgTime" : 6.0,
    "LoginFailureNumOps" : 0,
    "LoginFailureAvgTime" : 0.0,
    "GetGroupsNumOps" : 0,
    "GetGroupsAvgTime" : 0.0,
    "RenewalFailuresTotal" : 0,
    "RenewalFailures" : 0
  } ]

*/
			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());
			
			
			
			for (JsonElement bean : beans) {
				
				UgiMetrics  _u = new UgiMetrics();

				JsonObject _bean = (JsonObject) bean;
				
				_u.setName(_bean.get("name").getAsString());
						
				_u.setModelerType(_bean.get("modelerType").getAsString());
				
				_u.setTagContext(_bean.get("tag.Context").getAsString());
				
				_u.setTagHostname(_bean.get("tag.Hostname").getAsString());
				
				_u.setLoginSuccessNumOps(_bean.get("LoginSuccessNumOps").getAsInt());
				
				_u.setLoginSuccessAvgTime(_bean.get("LoginSuccessAvgTime").getAsDouble());
				
				_u.setLoginFailureNumOps(_bean.get("LoginFailureNumOps").getAsInt());
				
				_u.setLoginFailureAvgTime(_bean.get("LoginFailureAvgTime").getAsDouble());
				
				_u.setGetGroupsNumOps(_bean.get("GetGroupsNumOps").getAsInt());
				_u.setGetGroupsAvgTime(_bean.get("GetGroupsAvgTime").getAsDouble());
				_u.setRenewalFailuresTotal(_bean.get("RenewalFailuresTotal").getAsInt());
				_u.setRenewalFailures(_bean.get("RenewalFailures").getAsInt());
				
				
				_beans_.add(_u);
				
			}
			
		}
		
		return _beans_;
	}


	public static List<Bean> json2pojo(String json) throws Exception {

		
		List<Bean> _beans_  = new ArrayList<Bean>();
				
		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if(jsonTree.isJsonObject()) {
			
	/* "beans" : [ { ...

			  "name" : "com.sun.management:type=HotSpotDiagnostic",
			  "modelerType" : "sun.management.HotSpotDiagnostic",
			  "ObjectName" : "com.sun.management:type=HotSpotDiagnostic",

			  "DiagnosticOptions" : [ {} ]
			  */

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());
			
			for (JsonElement bean : beans) {

				JsonObject _bean = (JsonObject) bean;

				Bean _bb = new Bean();
				
				//System.out.println(bean.toString());
				
				
				//System.out.println();
				
				//System.out.println(_bean.entrySet().size());  //4
				
				System.out.println(_bean.get("name"));
						
			    System.out.println(_bean.get("ObjectName"));

				System.out.println(_bean.get("modelerType"));
				
				//System.out.println(_bean.get("DiagnosticOptions"));
				
				_bb.setName(_bean.get("name").getAsString());
				    /* name
				     * ObjectName
				     * modelerType
				     * DiagnosticOptions   []   
				     */
				//System.out.println(_bean.get("DiagnosticOptions"));
				
				_bb.setModelerType(_bean.get("modelerType").getAsString());
				_bb.setObjectName(_bean.get("ObjectName").getAsString());
				
				
				// iterate over DiagnosticOptions
			/*	 "DiagnosticOptions" : [ {
				      "name" : "HeapDumpBeforeFullGC",
				      "origin" : "DEFAULT",
				      "value" : "false",
				      "writeable" : true
				    }, {   */
				
				JsonArray entries = (JsonArray) parser.parse(_bean.get("DiagnosticOptions").toString()) ;

				List<DiagnosticOption> dd = new ArrayList<DiagnosticOption>();
				
				for (JsonElement _entry: entries) {
					JsonObject entry  = (JsonObject) _entry;
					
					DiagnosticOption d = new DiagnosticOption();
					
					d.setName(entry.get("name").getAsString());
					d.setOrigin(entry.get("origin").getAsString());
					d.setValue(entry.get("value").getAsString());
					d.setWriteable(entry.get("writeable").getAsBoolean());;
					
					dd.add(d);
					
					System.out.println(entry);
						
				}
				_bb.setDiagnosticOptions(dd);

				
				_beans_.add(_bb);
				
			}
			
		}
		
		return _beans_;
	}



	public static Map<String, Object> toMap(JsonObject object) throws Exception {

		Map<String, Object> map = new HashMap<String, Object>();

		Set<String> keysItr = object.keySet();

		//   while(keysItr.) {

		for (String key : keysItr) {
			//String key = keysItr.next();

			Object value = object.get(key);

			if(value instanceof JsonArray) {
				value = toList((JsonArray) value);
			}

			else if(value instanceof JsonObject) {
				value = toMap((JsonObject) value);
			}
			map.put(key, value);
		}
		return map;
	}


	public static List<Object> toList(JsonArray array) throws Exception {
		List<Object> list = new ArrayList<Object>();
		for(int i = 0; i < array.size(); i++) {
			Object value = array.get(i);
			if(value instanceof JsonArray) {
				value = toList((JsonArray) value);
			}

			else if(value instanceof JsonObject) {
				value = toMap((JsonObject) value);
			}
			list.add(value);
		}
		return list;
	}
}
