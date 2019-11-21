package com.roasted.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.jboss.logging.Logger;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.donut.DonutChartDataSet;
import org.primefaces.model.charts.donut.DonutChartModel;

import com.roasted.ejb.YARNRestClient;
import com.roasted.ejb.YARNDataset;
import com.roasted.model.YARNDataJMX;

@ManagedBean
@RequestScoped

public class YARNDataView implements Serializable{
	
	static final long serialVersionUID = 1237l;
	private DonutChartModel donutModel;
	String _percentageYARN;

	static Logger logger = Logger.getLogger(YARNDataView.class);
	static String host = "192.168.3.132";
	static String port = "8088";

	private List<YARNDataJMX> listData;
	YARNRestClient client = new YARNRestClient(host, port);
	YARNDataJMX yarnData = new YARNDataJMX();
	
	
	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}
	
	public void getJSON() {
		try {
			String _url = "http://192.168.3.132:8088/jmx?qry=Hadoop:service=ResourceManager,name=QueueMetrics,q0=root";
			String json = client.ambari_plain_client(_url);
			listData = YARNDataset.json2YARNData(json);
			listData.size();
			
			for (YARNDataJMX i : listData) {
				yarnData = i;
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	public void createDonutModel() {
		donutModel = new DonutChartModel();
		ChartData data = new ChartData();

		DonutChartDataSet dataSet = new DonutChartDataSet();
		List<Number> values = new ArrayList<>();
		
		//Using Data AbsoluteCapacity and AvailableMB
		Double absoluteCapacity = yarnData.getAbsoluteUsedCapacity();
		Integer availableMB = yarnData.getAvailableMB();
		
		Double yarnResult;
		
		if( absoluteCapacity == 0.0) {
			yarnResult = (double) availableMB;
		} else {
			//YARN = AbsoluteCapacity x AvailableMB
			yarnResult = absoluteCapacity * availableMB;
		}
		
		//Show the percentage
		Double percentageYARN = (absoluteCapacity / availableMB) * 100;
		DecimalFormat dfP = new DecimalFormat("#");
		percentageYARN = Double.valueOf(dfP.format(percentageYARN));
		_percentageYARN = percentageYARN.toString() + "%";
		
		values.add(absoluteCapacity);
		values.add(yarnResult);
		dataSet.setData(values);
		
		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("Absolute Capacity");
		labels.add("Available (MB)");
		data.setLabels(labels);

		donutModel.setData(data);
	}

	public String get_percentageYARN() {
		return _percentageYARN;
	}

	public void set_percentageYARN(String _percentageYARN) {
		this._percentageYARN = _percentageYARN;
	}

	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	public List<YARNDataJMX> getListData() {
		return listData;
	}

	public void setListData(List<YARNDataJMX> listData) {
		this.listData = listData;
	}
	
}
