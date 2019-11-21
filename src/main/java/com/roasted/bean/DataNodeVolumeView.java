package com.roasted.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.jboss.logging.Logger;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.donut.DonutChartDataSet;
import org.primefaces.model.charts.donut.DonutChartModel;
import org.primefaces.model.charts.pie.PieChartDataSet;
import org.primefaces.model.charts.pie.PieChartModel;

import com.roasted.ejb.DataNodeAmbariJMXUtil;
import com.roasted.ejb.DataNodeVolumeRestClient;
import com.roasted.model.DataNodeVolume;

@ManagedBean
@RequestScoped
public class DataNodeVolumeView implements Serializable {

	static final long serialVersionUID = 1237l;
	
	private DonutChartModel donutModel;
	
	String _percentageWriteIO;

	static Logger logger = Logger.getLogger(DataNodeVolumeView.class);

	static String host = "192.168.3.132";
	static String port = "50075";
	static String qry_name = "Hadoop:name=DataNodeVolume,service=DataNode";
	
	private List<DataNodeVolume> _bbs_;

	DataNodeVolumeRestClient _client = new DataNodeVolumeRestClient(host, port);

	DataNodeVolume _dn = new DataNodeVolume();

	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}

	public void getJSON() {

		try {

			String qry_name = "Hadoop:service=DataNode,name=DataNodeVolume-/hadoop/hdfs/data";

//			  UGMRestClient _client  =  new UGMRestClient(host,port);

			String _url = "http://" + host + ":" + port + "/jmx?qry=" + qry_name;

			String json = _client.ambari_plain_client(_url);

			_bbs_ = DataNodeAmbariJMXUtil.json2DataNodeVolume(json);

			_bbs_.size();

			for (DataNodeVolume i : _bbs_) {

				_dn = i;

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

		Double writeIO = _dn.getWriteIoRateAvgTime();

		Double heapMax = 100.0;
		
		Double NonUsed = heapMax - writeIO;
		
		Double percentageWriteIO = (writeIO / heapMax) * 100;
		DecimalFormat dfP = new DecimalFormat("#");
		percentageWriteIO = Double.valueOf(dfP.format(percentageWriteIO));
		_percentageWriteIO = percentageWriteIO.toString() + "%";

		values.add(writeIO);
		values.add(NonUsed);
		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
//		labels.add("Capacity");
		labels.add("Write IO");
		labels.add("Not Used");
		data.setLabels(labels);

		donutModel.setData(data);
	}

	public String get_percentageWriteIO() {
		return _percentageWriteIO;
	}

	public void set_percentageWriteIO(String _percentageWriteIO) {
		this._percentageWriteIO = _percentageWriteIO;
	}
	
	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	public List<DataNodeVolume> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<DataNodeVolume> _bbs_) {
		this._bbs_ = _bbs_;
	}

}
