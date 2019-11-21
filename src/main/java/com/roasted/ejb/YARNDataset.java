package com.roasted.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.roasted.model.YARNDataJMX;

@ManagedBean
@RequestScoped

public class YARNDataset implements Serializable{
private static final long serialVersionUID = 1L;
	
	public static List<YARNDataJMX> json2YARNData(String json) throws Exception {
		List<YARNDataJMX> yarn = new ArrayList<YARNDataJMX>();
		JsonParser parser = new JsonParser();
		JsonElement jsonTree = parser.parse(json);

		if (jsonTree.isJsonObject()) {
			JsonObject jsonObject = jsonTree.getAsJsonObject();
			JsonArray yarn_ = (JsonArray) parser.parse(jsonObject.get("beans").toString());
			
			for (JsonElement _yarn : yarn_) {
				YARNDataJMX _u = new YARNDataJMX();
				JsonObject _yarn_ = (JsonObject) _yarn;
				
				//Using Data AbsoluteCapacity and AvailableMB 
				_u.setAbsoluteUsedCapacity(_yarn_.get("AbsoluteUsedCapacity").getAsDouble());
				_u.setAvailableMB(_yarn_.get("AvailableMB").getAsInt());
				
				yarn.add(_u);
			}
		}

		return yarn;
	}
}
