package com.roasted.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.chart.DonutChartModel;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.roasted.model.ResourceManagerHeap;

@ManagedBean
@RequestScoped
public class ResourceManagerHeapJMXUtil implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public static List<ResourceManagerHeap> jsonResourceManagerHeap(String json) throws Exception{
		List<ResourceManagerHeap> listHeap = new ArrayList<ResourceManagerHeap>();
		JsonParser parser = new JsonParser();
		JsonElement jsonTree = parser.parse(json);
		
		if (jsonTree.isJsonObject()) {
			JsonObject jsonObject = jsonTree.getAsJsonObject();
			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());
			
			for (JsonElement bean : beans) {
				ResourceManagerHeap heap = new ResourceManagerHeap();
				JsonObject object =(JsonObject) bean;
				
				heap.setMemHeapUsedM(object.get("MemHeapUsedM").getAsDouble());
				heap.setMemHeapMaxM(object.get("MemHeapMaxM").getAsDouble());
				
				listHeap.add(heap);
			}
		}
		return listHeap;
	}
}