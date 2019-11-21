package com.roasted.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.donut.DonutChartDataSet;
import org.primefaces.model.charts.donut.DonutChartModel;
import org.primefaces.model.charts.pie.PieChartModel;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.roasted.model.DataNodeVolume;

@ManagedBean
@RequestScoped
public class DataNodeAmbariJMXUtil implements Serializable{

	private static final long serialVersionUID = 1L;
	
	DataNodeVolume _dn = new DataNodeVolume();

	public static List<DataNodeVolume> json2DataNodeVolume(String json) throws Exception {

		List<DataNodeVolume> _beans_ = new ArrayList<DataNodeVolume>();
		
		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if (jsonTree.isJsonObject()) {
			/*
			 * { "beans" : [ { "name" :
			 * "Hadoop:service=DataNode,name=DataNodeVolume-/hadoop/hdfs/data",
			 * "modelerType" : "DataNodeVolume-/hadoop/hdfs/data", "tag.Context" : "dfs",
			 * "tag.Hostname" : "yava3-132.labs247.com", "TotalMetadataOperations" : 0,
			 * "MetadataOperationRateNumOps" : 0, "MetadataOperationRateAvgTime" : 0.0,
			 * "TotalDataFileIos" : 0, "DataFileIoRateNumOps" : 0, "DataFileIoRateAvgTime" :
			 * 0.0, "FlushIoRateNumOps" : 0, "FlushIoRateAvgTime" : 0.0, "SyncIoRateNumOps"
			 * : 0, "SyncIoRateAvgTime" : 0.0, "ReadIoRateNumOps" : 0, "ReadIoRateAvgTime" :
			 * 0.0, "WriteIoRateNumOps" : 0, "WriteIoRateAvgTime" : 0.0, "TotalFileIoErrors"
			 * : 0, "FileIoErrorRateNumOps" : 0, "FileIoErrorRateAvgTime" : 0.0 } ] }
			 */

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());

			for (JsonElement bean : beans) {

				DataNodeVolume _v = new DataNodeVolume();

				JsonObject _bean = (JsonObject) bean;
				

				_v.setName(_bean.get("name").getAsString());

				_v.setModelerType(_bean.get("modelerType").getAsString());

				_v.setTagContext(_bean.get("tag.Context").getAsString());
				
				_v.setTagHostname(_bean.get("tag.Hostname").getAsString());

				_v.setTotalMetadataOperations(_bean.get("TotalMetadataOperations").getAsInt());

				_v.setMetadataOperationRateNumOps(_bean.get("MetadataOperationRateNumOps").getAsInt());
				
				_v.setMetadataOperationRateAvgTime(_bean.get("MetadataOperationRateAvgTime").getAsDouble());
				
				_v.setTotalDataFileIos(_bean.get("TotalDataFileIos").getAsInt());
				
				_v.setDataFileIoRateNumOps(_bean.get("DataFileIoRateNumOps").getAsInt());

				_v.setDataFileIoRateAvgTime(_bean.get("DataFileIoRateAvgTime").getAsDouble());
				
				_v.setFlushIoRateNumOps(_bean.get("FlushIoRateNumOps").getAsInt());
				
				_v.setFlushIoRateAvgTime(_bean.get("FlushIoRateAvgTime").getAsDouble());
				
				_v.setSyncIoRateNumOps(_bean.get("SyncIoRateNumOps").getAsInt());
				
				_v.setSyncIoRateAvgTime(_bean.get("SyncIoRateAvgTime").getAsDouble());
				
				_v.setReadIoRateNumOps(_bean.get("ReadIoRateNumOps").getAsInt());
				
				_v.setReadIoRateAvgTime(_bean.get("ReadIoRateAvgTime").getAsDouble());
				
				_v.setWriteIoRateNumOps(_bean.get("WriteIoRateNumOps").getAsInt());
				
				_v.setWriteIoRateAvgTime(_bean.get("WriteIoRateAvgTime").getAsDouble());
				
				_v.setTotalFileIoErrors(_bean.get("TotalFileIoErrors").getAsInt());
				
				_v.setFileIoErrorRateNumOps(_bean.get("FileIoErrorRateNumOps").getAsInt());
				
				_v.setFileIoErrorRateAvgTime(_bean.get("FileIoErrorRateAvgTime").getAsDouble());

				_beans_.add(_v);

			}
			
		}

		return _beans_;
	}
	
}