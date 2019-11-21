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

import com.roasted.ejb.JvmAmbariJMXUtil;
import com.roasted.ejb.JvmMetricsRestClient;
import com.roasted.model.JvmMetrics;

@ManagedBean
@RequestScoped
public class JvmMetricsView implements Serializable {

	static final long serialVersionUID = 1237l;
	
	private DonutChartModel donutModel;
	
	String _percentageJvmMetrics;

	static Logger logger = Logger.getLogger(JvmMetricsView.class);

	static String host = "192.168.3.132";
	static String port = "50075";

	private List<JvmMetrics> _bbs_;

	JvmMetricsRestClient _client = new JvmMetricsRestClient(host, port);

	JvmMetrics _jvm = new JvmMetrics();

	@PostConstruct
	public void init() {
		getJSON();
		createDonutModel();
	}

	public void getJSON() {

		try {

			String _url = "http://192.168.3.132:50075/jmx?qry=Hadoop:name=JvmMetrics,service=DataNode";

			String json = _client.ambari_plain_client(_url);

			_bbs_ = JvmAmbariJMXUtil.json2JvmMetrics(json);

			_bbs_.size();

			for (JvmMetrics i : _bbs_) {
				_jvm = i;
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

		Double heapUsed = _jvm.getMemHeapUsedM();

		Double heapMax = _jvm.getMemHeapMaxM();
		
		Double heapNonUsed = heapMax - heapUsed;
		
		Double percentageJvm = (heapUsed / heapMax) * 100;
		DecimalFormat dfP = new DecimalFormat("#");
		percentageJvm = Double.valueOf(dfP.format(percentageJvm));
		_percentageJvmMetrics = percentageJvm.toString() + "%";

		values.add(heapUsed);
		values.add(heapNonUsed);
		dataSet.setData(values);

		List<String> bgColors = new ArrayList<>();
		bgColors.add("rgb(1, 155, 0)");
		bgColors.add("rgb(191, 191, 191)");
		dataSet.setBackgroundColor(bgColors);

		data.addChartDataSet(dataSet);
		List<String> labels = new ArrayList<>();
//		labels.add("Capacity");
		labels.add("Heap Used");
		labels.add("Heap Free");
		data.setLabels(labels);

		donutModel.setData(data);
	}
	
	public String get_percentageJvmMetrics() {
		return _percentageJvmMetrics;
	}

	public void set_percentageJvmMetrics(String _percentageJvmMetrics) {
		this._percentageJvmMetrics = _percentageJvmMetrics;
	}
	
	public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	public List<JvmMetrics> get_bbs_() {
		return _bbs_;
	}

	public void set_bbs_(List<JvmMetrics> _bbs_) {
		this._bbs_ = _bbs_;
	}

}
