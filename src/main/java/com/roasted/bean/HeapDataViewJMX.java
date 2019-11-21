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

import com.roasted.ejb.HeapDatasetJMX;
import com.roasted.ejb.FSDatasetAmbariJMXUtil;
import com.roasted.ejb.FSDatasetRestClient;
//import com.roasted.ejb.HeapDataRestClient;
import com.roasted.ejb.HeapDataRestClientJMX;
//import com.roasted.ejb.HeapDataset;
import com.roasted.model.FSDatasetState;
//import com.roasted.model.HeapData;
import com.roasted.model.HeapDataJMX;

@ManagedBean
@RequestScoped

public class HeapDataViewJMX implements Serializable {

	static final long serialVersionUID = 1237l;
	private DonutChartModel donutModel;
	
	String _percentageHBASE;

	static Logger logger = Logger.getLogger(HeapDataViewJMX.class);

	static String host = "192.168.3.132";
	static String port = "16010";

	private List<HeapDataJMX> _bbs_;

	HeapDataRestClientJMX _client = new HeapDataRestClientJMX(host, port);

	HeapDataJMX _fs = new HeapDataJMX();

	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}

	public void getJSON() {

		try {

			String _url = "http://192.168.3.132:16010/jmx?qry=Hadoop:name=JvmMetrics,service=HBase";

			String json = _client.ambari_plain_client(_url);

			_bbs_ = HeapDatasetJMX.json2FSDatasetState(json);

			_bbs_.size();

			for (HeapDataJMX i : _bbs_) {
				_fs = i;

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
		
		Double heapUsed = _fs.getMemHeapUsedM();
		Double heapMax = _fs.getMemHeapMaxM();
		Double heapNonUsed = heapMax - heapUsed;
		
		
		Double percentageJvm = (heapUsed / heapMax) * 100;
		DecimalFormat dfP = new DecimalFormat("#");
		percentageJvm = Double.valueOf(dfP.format(percentageJvm));
		_percentageHBASE = percentageJvm.toString() + "%";
		
		values.add(heapUsed);
		values.add(heapNonUsed);
		dataSet.setData(values);
		
		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
		labels.add("Memory Used");
		labels.add("Memory Free");
		data.setLabels(labels);

		donutModel.setData(data);
	}

	public String get_percentageHBASE() {
		return _percentageHBASE;
	}

	public void set_percentageHBASE(String _percentageHBASE) {
		this._percentageHBASE = _percentageHBASE;
	}

	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	public List<HeapDataJMX> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<HeapDataJMX> _bbs_) {
		this._bbs_ = _bbs_;
	}

}