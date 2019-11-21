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

import com.roasted.ejb.FSDatasetAmbariJMXUtil;
import com.roasted.ejb.FSDatasetRestClient;
import com.roasted.model.FSDatasetState;

@ManagedBean
@RequestScoped
public class FSDatasetStateView implements Serializable {

	static final long serialVersionUID = 1237l;
	private DonutChartModel donutModel;
	
	String _percentage;

	static Logger logger = Logger.getLogger(FSDatasetStateView.class);

	static String host = "192.168.3.132";
	static String port = "50075";
	static String qry_name = "Hadoop:name=FSDatasetState,service=DataNode";

	private List<FSDatasetState> _bbs_;

	FSDatasetRestClient _client = new FSDatasetRestClient(host, port);

	FSDatasetState _fs = new FSDatasetState();

	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}

	public void getJSON() {

		try {

			String qry_name = "Hadoop:name=FSDatasetState,service=DataNode";

//			  UGMRestClient _client  =  new UGMRestClient(host,port);

			String _url = "http://" + host + ":" + port + "/jmx?qry=" + qry_name;

			String json = _client.ambari_plain_client(_url);

			_bbs_ = FSDatasetAmbariJMXUtil.json2FSDatasetState(json);

			_bbs_.size();

			for (FSDatasetState i : _bbs_) {
//				i.getCapacity();
//				i.getDfsUsed();
//				i.getRemaining();

				_fs = i;

			}

//			while (json.length() != 0) {
//				_bbs_.add(_fs);
//			}

//			_bbs_.add(_fs);

		} catch (Exception e) {
			logger.error(e);
		}

	}

	/**
	 * 
	 */
	public void createDonutModel() {
		donutModel = new DonutChartModel();
		ChartData data = new ChartData();

		DonutChartDataSet dataSet = new DonutChartDataSet();
		List<Number> values = new ArrayList<>();

		Double op1 = 1073741824.0;
		Double c = _fs.getCapacity() / op1;
		DecimalFormat dfC = new DecimalFormat("#.##");
		c = Double.valueOf(dfC.format(c));

		Double d = _fs.getDfsUsed() / op1;
		DecimalFormat dfD = new DecimalFormat("#.##");
		d = Double.valueOf(dfD.format(d));

		Double r = _fs.getRemaining() / op1;
		DecimalFormat dfR = new DecimalFormat("#.##");
		r = Double.valueOf(dfR.format(r));

		Double n = c - d - r;
		Double total = d + n;
		DecimalFormat dfT = new DecimalFormat("#.##");
		total = Double.valueOf(dfT.format(total));
		
		Double percentage = (total / c) * 100;
		DecimalFormat dfP = new DecimalFormat("#");
		percentage = Double.valueOf(dfP.format(percentage));
		_percentage = percentage.toString() + "%";

		values.add(total);
		values.add(r);
		dataSet.setData(values);

//        values.add(c);
//        values.add(d);
//        values.add(r);
//        dataSet.setData(values);

//		values.add(_fs.getCapacity());
//		values.add(_fs.getDfsUsed());
//		values.add(_fs.getRemaining());
//		
//		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
//		bgColors.add("rgb(255, 205, 86)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
//		labels.add("Capacity");
		labels.add("Disk Used");
		labels.add("Remaining");
		data.setLabels(labels);

		donutModel.setData(data);
	}

	public String get_percentage() {
		return _percentage;
	}

	public void set_percentage(String _percentage) {
		this._percentage = _percentage;
	}

	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	public List<FSDatasetState> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<FSDatasetState> _bbs_) {
		this._bbs_ = _bbs_;
	}

}
