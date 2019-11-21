package com.verdin.jsf.bean;

import com.roasted.model.ContainerMetrics;
import com.roasted.model.MetricAggregateDailyUUID;

import javax.annotation.PostConstruct;
//import javax.enterprise.context.ApplicationScoped;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.Lock;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import static javax.ejb.ConcurrencyManagementType.CONTAINER;
import static javax.ejb.LockType.READ;
import static javax.ejb.LockType.WRITE;

import org.jboss.logging.Logger;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.DateAxis;
import org.primefaces.model.chart.DonutChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.LinearAxis;
import org.primefaces.model.chart.PieChartModel;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.line.LineChartDataSet;

@ManagedBean
@RequestScoped

public class ChartView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public List <MetricAggregateDailyUUID> getMetricAggregateDailyUUIDs() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		
		String url = "jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure";
		
		
		
		try {
			
			Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
		    //conn =  DriverManager.getConnection("jdbc:phoenix:192.168.3.132:/hbase-unsecure");
		    conn =  DriverManager.getConnection(url);
		} catch (SQLException ex) {
			System.out.println("in exec");
			System.out.println(ex.getMessage());
		}
		
		List <MetricAggregateDailyUUID> mdu = new ArrayList<MetricAggregateDailyUUID>();
		PreparedStatement pstmt = conn.prepareStatement("select * from METRIC_AGGREGATE_DAILY_UUID LIMIT 20");
		ResultSet rst = pstmt.executeQuery();
		
		while (rst.next()) {
			MetricAggregateDailyUUID mad = new MetricAggregateDailyUUID();
			mad.setUUID(rst.getByte("UUID"));
	    	mad.setServet(rst.getLong("SERVER_TIME"));
	    	mad.setCount(rst.getInt("METRIC_COUNT"));
	    	mad.setSum(rst.getDouble("METRIC_SUM"));
	    	mad.setMax(rst.getDouble("METRIC_MAX"));
	    	mad.setMin(rst.getDouble("METRIC_MIN"));
	    	
	    	mdu.add(mad);
		}
		
		return mdu;
	}

}


/*------------------*/

//public class ChartView implements Serializable {
//
//	private static final long serialVersionUID = 1L;
////	private static final Logger LOGGER = Logger.getLogger (ChartView.class.getName());
//	static Logger logger = Logger.getLogger(ChartView.class);
//		
//	private LineChartModel lineModel;
//
//	@PostConstruct
//	public void init() {
//		createLineModels();
//	}
//
//	public LineChartModel getLineModel() {
//		return lineModel;
//	}
//
//	private LineChartModel initLinearModel() {
//		LineChartModel model = new LineChartModel();
//
//		LineChartSeries series1 = new LineChartSeries();
//		series1.setLabel("Series 1");
//
//		LineChartDataSet dataset = new LineChartDataSet();
//		List<Number> values = new ArrayList<>();
//
//		ChartData data = new ChartData();
//
//		Random rnd = new Random();
//
////		series1.set(System.currentTimeMillis()-1200000, rnd.nextInt());
//
////		ContainerMetrics cm = new ContainerMetrics();
//
//		MetricAggregateDailyUUID mdu = new MetricAggregateDailyUUID();
//
////		int p = mdu.getCount();
//
////		Calendar now = new GregorianCalendar();
//
//		try {
//			Connection conn;
////			Properties prop = new Properties();
//
//			Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
//
//			conn = DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");
//
//			ResultSet rst;
//			rst = conn.createStatement().executeQuery("select * from METRIC_AGGREGATE_DAILY_UUID");
//			Logger.getLogger("Koneksi berhasil");
//	        System.out.println("Koneksi Berhasil");
//			
////			while (rst.next()) {
//
//			mdu.setCount(rst.getInt("METRIC_COUNT"));
//			values.add(rst.getInt("METRIC_COUNT"));
//			dataset.setData(values);
//			dataset.setFill(false);
//			data.addChartDataSet(dataset);
////				series1.set(System.currentTimeMillis(), mdu.getCount());
////				now.add(Calendar.DAY_OF_MONTH, 1);
////				series1.set(System.currentTimeMillis(), rst.getDouble("METRIC_MAX"));
////				series1.set(System.currentTimeMillis()-600000, rnd.nextInt());
////				series1.set(System.currentTimeMillis()-300000, rnd.nextInt());
//
////			}
//
////			while (System.currentTimeMillis() != 0) {
////				series1.set(System.currentTimeMillis(), rnd.nextInt());
////			}
//			
////			for (int i=0; i <= 1200000; i++) {
////				series1.set(System.currentTimeMillis()-1200000, rnd.nextInt());
////			}
//
////			for (int i=0; i <= System.currentTimeMillis(); i++) {
////				series1.set(rst.getLong("SERVER_TIME"), mdu.getCount());
//				
////			}
////			
//			
//
//		} catch (SQLException se) {
//			se.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		// Muncul grafiknya tapi gak ada datanya (0)
////		for (int i=0; i <= 1200000; i++) {
////			series1.set(System.currentTimeMillis()-1200000, mdu.getCount());
////			
////		}
//		// ------------------
//
////		while (System.currentTimeMillis() != 0) {
////			series1.set(System.currentTimeMillis(), mdu.getCount());
////		}
//
////		series1.set(System.currentTimeMillis(), mdu.getCount());
//		
//		series1.set(System.currentTimeMillis()-3600000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-3240000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-2880000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-2520000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-2160000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-1800000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-1440000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-1080000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-720000, mdu.getCount());
//		series1.set(System.currentTimeMillis()-360000, mdu.getCount());
//		series1.set(System.currentTimeMillis(), mdu.getCount());
//
//		model.addSeries(series1);
//
//		return model;
//	}
//
//	private void createLineModels() {
//		lineModel = initLinearModel();
//		lineModel.setTitle("Linear Chart");
//		lineModel.setLegendPosition("e");
//		lineModel.setZoom(true);
//
//		DateAxis xAxis = new DateAxis();
//		/* Axis xAxis = lineModel.getAxis(AxisType.X); */
//
//		xAxis.setMin(System.currentTimeMillis() - 3600000);
//		xAxis.setMax(System.currentTimeMillis());
//		xAxis.setTickFormat("%e/%b %H:%M:%S");
//		xAxis.setTickAngle(-30);
//		lineModel.getAxes().put(AxisType.X, xAxis);
//
//		/*
//		 * Axis yAxis = lineModel.getAxis(AxisType.Y); yAxis.setMin(0);
//		 * yAxis.setMax(10);
//		 */
//
//		Axis yaxis = new LinearAxis();
//		yaxis.setMin(0);
//		yaxis.setMax(1);
//		lineModel.getAxes().put(AxisType.Y, yaxis);
//	}
//
//}

/*------------------*/


//@Named("chartview")
//@ViewScoped
//
//public class ChartView implements Serializable {
//	private static final long serialVersionUID = 1L;
//	private CartesianChartModel model;
//
//    public ChartView() {
//        
//    }
//    
//    @PostConstruct
//    public void init() {
//    	model = new CartesianChartModel();
//
//        ChartSeries series = new ChartSeries("Server 1");
//
//        Calendar now = new GregorianCalendar(2013, 0, 1);
//
//        for(int i = 0; i < 1500; i++) {
//            series.set(now.getTime(), 1500 + ((int) (200 * Math.random())));
//            now.add(Calendar.DAY_OF_MONTH, 1);
//        }
//        model.addSeries(series);
//
//        DateAxis axis = new DateAxis("Dates");
//        axis.setTickCount(30);
//        axis.setTickAngle(30);
//        model.setZoom(true);
//        model.getAxes().put(AxisType.X, axis);
//    }
//
//    public CartesianChartModel getModel() {
//        return model;
//    }
//	
//}


/*--- Start Version 5 ---*/
//Deskripsi : Sumbu x memakai time server sekarang dan di code-nya sudah terdapat untuk pengambilan data

//public class ChartView implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	private LineChartModel lineModel;
//
//	@PostConstruct
//	public void init() {
//		createLineModels();
//	}
//
//	public LineChartModel getLineModel() {
//		return lineModel;
//	}
//
//	private LineChartModel initLinearModel() {
//		LineChartModel model = new LineChartModel();
//
//		LineChartSeries series1 = new LineChartSeries();
//		series1.setLabel("Series 1");
//
//		Random rnd = new Random();
//
////
//		// ContainerMetrics cm = new ContainerMetrics();
//
//		MetricAggregateDailyUUID mdu = new MetricAggregateDailyUUID();
////
//		int p = mdu.getCount();
//
//		Calendar now = new GregorianCalendar();
//
//		for (int i = 0; i < mdu.getServet(); i++) {
//			// now.add(Calendar.DAY_OF_MONTH, 1);
//			series1.set(System.currentTimeMillis(), p);
//		}
//
//		model.addSeries(series1);
//
//		return model;
//	}
//
//	private void createLineModels() {
//		lineModel = initLinearModel();
//		lineModel.setTitle("Linear Chart");
//		lineModel.setLegendPosition("e");
//		lineModel.setZoom(true);
//
//		DateAxis xAxis = new DateAxis();
//		/* Axis xAxis = lineModel.getAxis(AxisType.X); */
//
//		xAxis.setMin(System.currentTimeMillis() - 3600000);
//		xAxis.setMax(System.currentTimeMillis());
//		xAxis.setTickFormat("%e/%b %H:%M:%S");
//		//xAxis.setTickAngle(-30);
//		lineModel.getAxes().put(AxisType.X, xAxis);
//
//		/*
//		 * Axis yAxis = lineModel.getAxis(AxisType.Y); yAxis.setMin(0);
//		 * yAxis.setMax(10);
//		 */
//
//		Axis yaxis = new LinearAxis();
//		yaxis.setMin(0);
//		yaxis.setMax(100);
//		lineModel.getAxes().put(AxisType.Y, yaxis);
//	}
//
//	public ArrayList<MetricAggregateDailyUUID> metricAggregateDailyUUID() throws ClassNotFoundException, SQLException {
//
//		ArrayList<MetricAggregateDailyUUID> metricAggregate = new ArrayList<MetricAggregateDailyUUID>();
//
//		Connection conn;
//		Properties prop = new Properties();
//
//		Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
//
//		conn = DriverManager.getConnection("jdbc:phoenix:192.168.3.132:61181:/ams-hbase-unsecure");
//
//		ResultSet rst;
//		rst = conn.createStatement().executeQuery("select * from CONTAINER_METRICS");
//
//		ContainerMetrics cm = new ContainerMetrics();
//		return metricAggregate;
//	}
//
//}

/*--- End Version 5 ---*/

/*--- Start Version 4 ---*/
//Referensi : https://forum.primefaces.org/viewtopic.php?t=45105

//@Named (value= "chartView")
//@ViewScoped
//public class ChartView implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	
//	private LineChartModel model;
//	
//	public ChartView() {
//		
//	}
//	
//	@PostConstruct
//	public void init() {
//		long[][] lines = {{1334856823000l, 2}, {1334856853000l, 1}, {1334856883000l, 0}, {1334856913000l, 4}, {1334856914000l, 13},
//		        {1334856943000l, 16}, {1334856973000l, 23}, {1334857003000l, 24}, {1334857033000l, 36}, {1334857063000l, 14}, {1334857093000l, 1}};
//		
//		model = new LineChartModel();
//		model.setTitle("Primefaces Chart");
//		model.setZoom(true);
//		
//		LineChartSeries series = new LineChartSeries();
//		
//		for(long[] line : lines) {
//			series.set(line[0], line[1]);
//		}
//		
//		DateAxis xaxis = new DateAxis();
//		
//		xaxis.setTickFormat("%e/%b %H:%M");
//		xaxis.setTickAngle(-30);
//		xaxis.setMin(1334856823000l);
//		model.getAxes().put(AxisType.X, xaxis);
//		
//		Axis yaxis = new LinearAxis();
//		yaxis.setMin(0);
//		model.getAxes().put(AxisType.Y, yaxis);
//		
//		model.addSeries(series);
//	}
//	
//	public LineChartModel getModel() {
//		return model;
//	}
//	
//}

/*--- End Version 4 ---*/

/*--- Start Another Version 3 ---*/
//Deskripsi : Mengganti sumbu y menjadi data metrics tetapi datanya belum terbaca

//public class ChartView implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	
//	private LineChartModel lineModel;
//
//	@PostConstruct
//	public void init() {
//		createLineModels();
//	}
//	
//	public LineChartModel getLineModel() {
//		return lineModel;
//	}
//	
//	
//
//	private LineChartModel initLinearModel() {
//		LineChartModel model = new LineChartModel();
//
//		LineChartSeries series1 = new LineChartSeries();
//		series1.setLabel("Series 1");
//
//		Random rnd = new Random();
//		
////		List<ContainerMetrics> containermetrics;
//		
//		ContainerMetrics cm = new ContainerMetrics();
//		
//		Double p = cm.getMem_requested_gb();
//		
//		
//
//		series1.set(rnd.nextInt(10), p);
//		series1.set(rnd.nextInt(10), p);
//		series1.set(rnd.nextInt(10), p);
//		series1.set(rnd.nextInt(10), p);
//		series1.set(rnd.nextInt(10), p);
//
//		LineChartSeries series2 = new LineChartSeries();
//		series2.setLabel("Series 2");
//		series2.set(rnd.nextInt(10), rnd.nextInt(10));
//		series2.set(rnd.nextInt(10), rnd.nextInt(10));
//		series2.set(rnd.nextInt(10), rnd.nextInt(10));
//		series2.set(rnd.nextInt(10), rnd.nextInt(10));
//
//		model.addSeries(series1);
//		model.addSeries(series2);
//
//		return model;
//	}
//	
//	private void createLineModels() {
//		lineModel = initLinearModel();
//		lineModel.setTitle("Linear Chart");
//		lineModel.setLegendPosition("e");
//		lineModel.setZoom(true);
//		Axis xAxis = lineModel.getAxis(AxisType.X);
//		xAxis.setMin(0);
//		xAxis.setMax(10);
//		Axis yAxis = lineModel.getAxis(AxisType.Y);
//		yAxis.setMin(0);
//		yAxis.setMax(10);
//	}
//	
//}

/*--- End Another Version 3 ---*/

/*--- Start Version 3 ---*/
//Deskripsi : Line Chart memiliki data random tetapi belum ada range / periodenya
//Referensi : https://www.javacodegeeks.com/2015/11/programmatically-caching-primefaces-charts-via-omnifaces-cache-component.html

//public class ChartView implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    
//    private LineChartModel lineModel;
//
//    @PostConstruct
//    public void init() {
//      createLineModels();
//    }
//    
//    public LineChartModel getLineModel() {
//      return lineModel;
//    }
//
//    private LineChartModel initLinearModel() {
//      LineChartModel model = new LineChartModel();
//
//      LineChartSeries series1 = new LineChartSeries();
//      series1.setLabel("Series 1");
//
//      Random rnd = new Random();
//
//      ChartData cd = new ChartData();
//      series1.set(rnd.nextInt(10), rnd.nextInt(10));
//      series1.set(rnd.nextInt(10), rnd.nextInt(10));
//      series1.set(rnd.nextInt(10), rnd.nextInt(10));
//      series1.set(rnd.nextInt(10), rnd.nextInt(10));
//      series1.set(rnd.nextInt(10), rnd.nextInt(10));
//
//      LineChartSeries series2 = new LineChartSeries();
//      series2.setLabel("Series 2");
//      series2.set(rnd.nextInt(10), rnd.nextInt(10));
//      series2.set(rnd.nextInt(10), rnd.nextInt(10));
//      series2.set(rnd.nextInt(10), rnd.nextInt(10));
//      series2.set(rnd.nextInt(10), rnd.nextInt(10));
//
//      model.addSeries(series1);
//      model.addSeries(series2);
//
//      return model;
//    }
//    
//    private void createLineModels() {
//      lineModel = initLinearModel();
//      lineModel.setTitle("Linear Chart");
//      lineModel.setLegendPosition("e");
//      lineModel.setZoom(true);
//      Axis xAxis = lineModel.getAxis(AxisType.X);
//      xAxis.setMin(0);
//      xAxis.setMax(10);
//      Axis yAxis = lineModel.getAxis(AxisType.Y);
//      yAxis.setMin(0);
//      yAxis.setMax(10);
//    }
//}

/*--- End Version 3 ---*/

/*--- Start : Sama dengan Versi 1, hanya berbeda di salah satu line, x-nya memiliki data random ---*/

//public class ChartView implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	private LineChartModel lineModel1;
//
//	@PostConstruct
//	public void init() {
//		createLineModels();
//	}
//
//	public LineChartModel getLineModel1() {
//		return lineModel1;
//	}
//
//	private LineChartModel initLineModel1() {
//		int random1 = (int) (Math.random() * 10);
//		int random2 = (int) (Math.random() * 10);
//		int random3 = (int) (Math.random() * 10);
//		int random4 = (int) (Math.random() * 10);
//		int random5 = (int) (Math.random() * 10);
//
//		LineChartModel model = new LineChartModel();
//
//		LineChartSeries series1 = new LineChartSeries();
//		series1.setLabel("Series 1");
//		series1.set(random1, 2);
//		series1.set(random2, 1);
//		series1.set(random3, 3);
//		series1.set(random4, 6);
//		series1.set(random5, 8);
////		series1.getData().put("Series 1", random1);
//
//		LineChartSeries series2 = new LineChartSeries();
//		series2.setLabel("Series 2");
//		series2.set(1, 6);
//		series2.set(2, 3);
//		series2.set(3, 2);
//		series2.set(4, 7);
//		series2.set(5, 9);
////		series2.getData().put("Series 2", random2);
//
//		model.addSeries(series1);
//		model.addSeries(series2);
//
//		return model;
//
//	}
//
//	private void createLineModels() {
//		lineModel1 = initLineModel1();
//        lineModel1.setTitle("Linear Chart");
//        lineModel1.setLegendPosition("e");
////      lineModel1.setShowPointLabels(true);
////      lineModel1.getAxes().put(AxisType.X, new CategoryAxis("Years"));
//        Axis xAxis = lineModel1.getAxis(AxisType.X);
//        Axis yAxis = lineModel1.getAxis(AxisType.Y);
////		yAxis.setLabel("Births");
//        xAxis.setMin(0);
//        xAxis.setMax(10);
//		yAxis.setMin(0);
//		yAxis.setMax(10);
//	}
//
//}

/*--- End : Sama dengan Versi 1, hanya berbeda di salah satu line, x-nya memiliki data random ---*/

/*--- Start Other Version ---*/

//public class ChartView implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	private LineChartModel lineModel1;
//	private LineChartSeries data;
//	
//	private int counter = 0;
//
//	@PostConstruct
//	public void init() {
//		createLineModels();
//	}
//
//	public LineChartModel getLineModel1() {
//		return lineModel1;
//	}
//
//	private LineChartModel initLineModel1() {
//		int random1 = (int) (Math.random() * 10);
//		int random2 = (int) (Math.random() * 10);
//		int random3 = (int) (Math.random() * 1000);
//		int random4 = (int) (Math.random() * 1000);
//		int random5 = (int) (Math.random() * 1000);
//
//		LineChartModel model = new LineChartModel();
//
////		LineChartSeries series1 = new LineChartSeries();
//		
//		if (data == null) {
//			LineChartSeries data = new LineChartSeries();
//			for (int i = 1; i <= 20; i++) {
//				data.getData().put(counter++, (int) (Math.random() * 1000));
//			}
//		}
//		data.setLabel("Series 1");
////		series1.set(random1, random2);
////		series1.set(random1, random2);
////		series1.set(random1, random2);
////		series1.set(random1, random2);
////		series1.set(random1, random2);
////		series1.getData().put("Series 1", random1);
//
//		LineChartSeries series2 = new LineChartSeries();
//		series2.setLabel("Series 2");
//		series2.set(random1, 6);
//		series2.set(random1, 3);
//		series2.set(random1, 2);
//		series2.set(random1, 7);
//		series2.set(random1, 9);
////		series2.getData().put("Series 2", random2);
//
//		model.addSeries(data);
//		model.addSeries(series2);
//
//		
//		return model;
//
//	}
//
//	private void createLineModels() {
//		lineModel1 = initLineModel1();
//        lineModel1.setTitle("Linear Chart");
//        lineModel1.setLegendPosition("e");
////      lineModel1.setShowPointLabels(true);
////      lineModel1.getAxes().put(AxisType.X, new CategoryAxis("Years"));
//        Axis xAxis = lineModel1.getAxis(AxisType.X);
//        Axis yAxis = lineModel1.getAxis(AxisType.Y);
////		yAxis.setLabel("Births");
//        xAxis.setMin(0);
//        xAxis.setMax(10);
//		yAxis.setMin(0);
//		yAxis.setMax(10);
//	}
//
//}

/*--- End Other Version ---*/

/*--- Start Real Time Pie Chart Model Version ---*/

//public class ChartView implements Serializable {
//	private static final long serialVersionUID = 1L;
//	private PieChartModel livePieModel;
//	
//	@PostConstruct
//	public void init() {
//		createPieModels();
//	}
//	
//	public PieChartModel getLivePieModel() {
//		int random1 = (int) (Math.random() * 1000);
//		int random2 = (int) (Math.random() * 1000);
//		
//		livePieModel.getData().put("Candidate 1", random1);
//		livePieModel.getData().put("Candidate 2", random2);
//		
//		livePieModel.setTitle("Votes");
//		livePieModel.setLegendPosition("ne");
//		
//		return livePieModel;
//	}
//	
//	private void createPieModels() {
//		createLivePieModel();
//	}
//	
//	private void createLivePieModel() {
//		livePieModel = new PieChartModel();
//	}
//}

/*--- End Real Time Pie Chart Model Version ---*/

/*--- Start Live Updates in Primefaces Line Chart ---*/
// Referensi :
// https://blogs.oracle.com/geertjan/live-updates-in-primefaces-line-chart

//@Named
//
//@SessionScoped
//
//public class ChartView implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	private CartesianChartModel model;
//
//	private ChartSeries data;
//	
//	private int counter  = 0;
//
//	public ChartView() {
//
//		createLinearModel();
//
//	}
//
//	private void createLinearModel() {
//
//		model = new CartesianChartModel();
//
//		model.addSeries(getStockChartData("Stock Chart"));
//
//	}
//
//	private ChartSeries getStockChartData(String label) {
//
//		if (data == null) {
//
//			data = new ChartSeries();
//
//			for (int i = 1; i <= 20; i++) {
//
//				data.getData().put(counter++, (int) (Math.random() * 1000));
//
//			}
//
//		}
//
//		data.setLabel(label);
//
//		return data;
//
//	}
//
//	public CartesianChartModel getLinearModel() {
//
//		return model;
//
//	}
//
//	public void update() {
//		
//		if(data.getData().size() > 10) {
//			data.getData().remove(data.getData().keySet().toArray()[0]);
//		}
//
//		data.getData().put(counter++, (int) (Math.random() * 1000));
//
//	}
//
//}

/*--- End Live Updates in Primefaces Line Chart ---*/

/*--- Start Version 2 ---*/

//public class ChartView implements Serializable {
//	private static final long serialVersionUID = -6345160256194390311L;
//	private static final int MAX_AGE = 100;
//	
//	private int currentAge = 30;
//	private double currentIncome = 100000.00;
//	private double current401KValue = 50000.00;
//	private int targetRetirementAge = 65;
//	private double contribution401KPercentage = 3.0;
//	private double investmentGrowth = 8.0;
//	private double incomeGrowth = 2.5;
//	private double retirementYearlyExpensesPercentage = 80.0;
//	
//	private LineChartModel model401k;
//	private LineChartModel modelIncome;
//	private LineChartModel modelExpenses;
//	
//	private ArrayList<LineChartSeries> additionalIncomeSeries = new ArrayList<LineChartSeries>();
//	private LineChartSeries expenseSeries;
//	private LineChartSeries netSeries;
//	private LineChartSeries preRetirement401k;
//	private LineChartSeries postRetirement401k;
//	private LineChartSeries preRetirementIncome;
//	
//	private double max401k = 0;
//	private double maxAge = 0;
//	
//	private ArrayList<AdditionalIncomeSourceBean> additionalIncomeSources = new ArrayList<AdditionalIncomeSourceBean>();
//	
//	public ChartView() {
//		additionalIncomeSources.add(new AdditionalIncomeSourceBean("Social Security", 10000, true, 62));
//		additionalIncomeSources.add(new AdditionalIncomeSourceBean("Pension", 20000, true, 55));
//		additionalIncomeSources.add(new AdditionalIncomeSourceBean("", 0, false, 0));
//		
//		calculateModel();
//	}
//	
//	@PostConstruct
//	public void init() {
//		calculateModel();
//	}
//	
//	public void actionListener(ActionEvent actionEvent) {
//		System.out.println("Made it!");
//	}
//	
//	public void morePressed(AjaxBehaviorEvent e) {
//		System.out.println("Made it!");
//	}
//	
//	public void onValueChanged (AjaxBehaviorEvent e) {
//		System.out.println("onValueChange");
//		calculateModel();
//	}
//	
//	public void submit() {
//		System.out.println("submitted!");
//		calculateModel();
//	}
//	
//	
//	 //Calculates the value of money for each year
//	 //@param startingAge - Age to start calculating at - each year before this will be set to zero
//	 //@param initialAmount - the initial amount of money at that age
//	 //@param growthRate - The growth rate as a percentage such as 8.0
//	 //@return - returns a list of calculated values
//	 
//	
//	public LineChartSeries calculateMoneyGrowth (double startingAge, double initialAmount, double growthRate, double finalAge) {
//		LineChartSeries moneyList = new LineChartSeries();
//		
//		// Now calculate the value of the money for each year
//		double currentAmount = initialAmount;
//		
//		for(int i = (int) startingAge; i<= finalAge; i++) {
//			moneyList.set(i,  currentAmount);
//			currentAmount = currentAmount * (1 + growthRate/100);
//		}
//		
//		return moneyList;
//	}
//	
//	public void calculateModel() {
//		System.out.println("calculateModel");
//		
//		model401k = new LineChartModel();
//		modelIncome = new LineChartModel();
//		modelExpenses = new LineChartModel();
//		
//		for(@SuppressWarnings("unused") LineChartSeries currentSeries : additionalIncomeSeries)
//			currentSeries = new LineChartSeries();
//		expenseSeries = new LineChartSeries();
//		netSeries = new LineChartSeries();
//		preRetirement401k = new LineChartSeries();
//		postRetirement401k = new LineChartSeries();
//		preRetirementIncome = new LineChartSeries();
//		
//		calculateFixedIncome();
//		
//		double finalIncome = calculateIncome();
//		
//		calculateExpenses(finalIncome);
//		
//		calculateNet();
//		
//		calculate401k();
//		
//		setChart(model401k, "401K Value");
//		
//		setChart(modelIncome, "Income");
//		
//		setChart(modelExpenses, "Retirement Expenses");
//		
//	}
//	
//	private void setChart(LineChartModel chart, String title) {
//		chart.setLegendPosition("nw");
//		Axis yAxis = chart.getAxis(AxisType.Y);
//		yAxis.setMin(0);
//		yAxis.setTickFormat("$%'.0f");
//		
//		Axis xAxis = chart.getAxis(AxisType.X);
//		xAxis.setMin(currentAge);
//		xAxis.setMax(maxAge);
//		xAxis.setTickFormat("%.0f");
//		
//		chart.setTitle(title);
//	}
//	
//	private void calculate401k() {
//		calculatePreRetirement401k();
//		
//		calculatePostRetirement401k();
//	}
//	
//	private void calculatePreRetirement401k() {
//		double calculated401KValue = getCurrent401KValue();
//		max401k = calculated401KValue;
//		int calculatedAge;
//		
//		//set the initial value
//		preRetirement401k.set(getCurrentAge(), calculated401KValue);
//		
//		for(calculatedAge = getCurrentAge() + 1; calculatedAge < getTargetRetirementAge(); calculatedAge++) {
//			calculated401KValue = calculated401KValue * (1 + getInvestmentGrowth()/100) +
//					(double) (getDataPoint(preRetirementIncome, calculatedAge)) * getContribution401KPercentage()/100;
//			
//			preRetirement401k.set(calculatedAge, calculated401KValue);
//			
//			if(max401k < calculated401KValue)
//				max401k = calculated401KValue;
//		}
//		
//		preRetirement401k.setLabel("Pre-retirement 401K Value");
//		model401k.addSeries(preRetirement401k);
//		
//	}
//	
//	private void calculatePostRetirement401k() {
//		int calculatedAge = getTargetRetirementAge();
//		double calculated401KValue = (double) (getDataPoint(preRetirement401k, calculatedAge - 1));
//		
//		postRetirement401k.set(calculatedAge, calculated401KValue);
//		postRetirement401k.setLabel("Post Retirement 401K Value");
//		
//		while(calculated401KValue > 0 && calculatedAge < MAX_AGE) {
//			calculated401KValue = calculated401KValue * (1+ getInvestmentGrowth()/100) - (double) (getDataPoint(netSeries, calculatedAge));
//			postRetirement401k.set(calculatedAge, calculated401KValue);
//			
//			if(max401k < calculated401KValue)
//				max401k = calculated401KValue;
//			
//			calculatedAge++;
//			
//		}
//		
//		maxAge = calculatedAge;
//		
//		model401k.addSeries(postRetirement401k);
//	}
//	
//	private void calculateNet() {
//		netSeries = new LineChartSeries();
//		
//		double net;
//		
//		for(int currentAge = 1; currentAge <= MAX_AGE; currentAge++) {
//			net = getDataPoint(expenseSeries, currentAge);
//			for(int i = 0; i < additionalIncomeSeries.size(); i++) {
//				net -= getDataPoint(additionalIncomeSeries.get(i), currentAge);
//			}
//			netSeries.set(currentAge, net);
//		}
//	}
//	
//	private double getDataPoint(LineChartSeries series, int i) {
//		if(series.getData().get(i) != null)
//			return (double) series.getData().get(i);
//		else
//			return 0;
//	}
//	
//	private double calculateIncome() {
//		preRetirementIncome = calculateMoneyGrowth(getCurrentAge(),
//				getCurrentIncome(),
//				getIncomeGrowth(),
//				getTargetRetirementAge());
//		
//		preRetirementIncome.setLabel("Pre-retirement Income");
//		modelIncome.addSeries(preRetirementIncome);
//		
//		return (double) preRetirementIncome.getData().get(getTargetRetirementAge());
//	}
//	
//	private void calculateExpenses(double finalIncome) {
//		expenseSeries = calculateMoneyGrowth(getTargetRetirementAge(),
//				finalIncome * getRetirementYearlyExpensesPercentage() / 100,
//				getIncomeGrowth(), MAX_AGE);
//		
//		expenseSeries.setLabel("Retirement Expenses");
//		modelExpenses.addSeries(expenseSeries);
//	}
//	
//	private void calculateFixedIncome() {
//		additionalIncomeSeries = new ArrayList<LineChartSeries>();
//		
//		//Calculate the future value of the additional income sources
//		for (int i = 0; i < 3; i++) {
//			//should we even consider this source?
//			if(additionalIncomeSources.get(i).getEffectiveAge() > 0 && additionalIncomeSources.get(i).getYearlyAmount() > 0) {
//				//Start with no growth
//				double growthRate = 0.0;
//				
//				//Is this inflation adjusted?
//				if(additionalIncomeSources.get(i).getInflationAdjusted())
//					growthRate = this.getIncomeGrowth();
//				
//				additionalIncomeSeries.add(calculateMoneyGrowth(additionalIncomeSources.get(i).getEffectiveAge(),
//						additionalIncomeSources.get(i).getYearlyAmount(),
//						growthRate, MAX_AGE));
//				
//				additionalIncomeSeries.get(i).setLabel(additionalIncomeSources.get(i).getSourceName());
//				
//				modelIncome.addSeries(additionalIncomeSeries.get(i));
//			}
//		}
//	}
//	
//	public LineChartModel getModel401k() {
//		return model401k;
//	}
//	
//	public LineChartModel getModelIncome() {
//		return modelIncome;
//	}
//	
//	public void setCurrentAge(int newAge) {
//		this.currentAge = newAge;
//	}
//	
//	public int getCurrentAge() {
//		return this.currentAge;
//	}
//	
//	public void setCurrentIncome(double newIncome) {
//		this.currentIncome = newIncome;
//	}
//	
//	public double getCurrentIncome() {
//		return this.currentIncome;
//	}
//
//	public double getCurrent401KValue() {
//		return current401KValue;
//	}
//
//	public void setCurrent401KValue(double current401KValue) {
//		this.current401KValue = current401KValue;
//	}
//
//	public int getTargetRetirementAge() {
//		return targetRetirementAge;
//	}
//
//	public void setTargetRetirementAge(int targetRetirementAge) {
//		this.targetRetirementAge = targetRetirementAge;
//	}
//
//	public double getContribution401KPercentage() {
//		return contribution401KPercentage;
//	}
//
//	public void setContribution401KPercentage(double contribution401kPercentage) {
//		contribution401KPercentage = contribution401kPercentage;
//	}
//
//	public double getInvestmentGrowth() {
//		return investmentGrowth;
//	}
//
//	public void setInvestmentGrowth(double investmentGrowth) {
//		this.investmentGrowth = investmentGrowth;
//	}
//
//	public double getIncomeGrowth() {
//		return incomeGrowth;
//	}
//
//	public void setIncomeGrowth(double incomeGrowth) {
//		this.incomeGrowth = incomeGrowth;
//	}
//
//	public double getRetirementYearlyExpensesPercentage() {
//		return retirementYearlyExpensesPercentage;
//	}
//
//	public void setRetirementYearlyExpensesPercentage(double retirementYearlyExpensesPercentage) {
//		this.retirementYearlyExpensesPercentage = retirementYearlyExpensesPercentage;
//	}
//
//	public ArrayList<AdditionalIncomeSourceBean> getAdditionalIncomeSources() {
//		return additionalIncomeSources;
//	}
//
//	public void setAdditionalIncomeSources(ArrayList<AdditionalIncomeSourceBean> additionalIncomeSources) {
//		this.additionalIncomeSources = additionalIncomeSources;
//	}
//
//	public LineChartModel getModelExpenses() {
//		return modelExpenses;
//	}
//
//	public void setModelExpenses(LineChartModel modelExpenses) {
//		this.modelExpenses = modelExpenses;
//	}
//}

/*--- End Version 2 ---*/

/*--- Start Version 1 ---*/

//public class ChartView implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	private PieChartModel pieModel1;
//	private PieChartModel pieModel2;
//	private DonutChartModel donutModel1;
//	private DonutChartModel donutModel2;
//	private DonutChartModel donutModel3;
//	private DonutChartModel donutModel4;
//	private DonutChartModel donutModel5;
//	private LineChartModel lineModel1;
//	private LineChartModel lineModel2;
//	private LineChartModel lineModel3;
//	private LineChartModel areaModel1;
//
//	@PostConstruct
//	public void init() {
//		createPieModels();
//		createDonutModels();
//		createLineModels();
//		createAreaModels();
//	}
//
//	public PieChartModel getPieModel1() {
//		return pieModel1;
//	}
//
//	public PieChartModel getPieModel2() {
//		return pieModel2;
//	}
//
//	public DonutChartModel getDonutModel1() {
//		return donutModel1;
//	}
//
//	public DonutChartModel getDonutModel2() {
//		return donutModel2;
//	}
//
//	public DonutChartModel getDonutModel3() {
//		return donutModel3;
//	}
//
//	public DonutChartModel getDonutModel4() {
//		return donutModel4;
//	}
//
//	public DonutChartModel getDonutModel5() {
//		return donutModel5;
//	}
//
//	public LineChartModel getLineModel1() {
//		return lineModel1;
//	}
//
//	public LineChartModel getLineModel2() {
//		return lineModel2;
//	}
//
//	public LineChartModel getLineModel3() {
//		return lineModel3;
//	}
//
//	public LineChartModel getAreaModel1() {
//		return areaModel1;
//	}
//
//	private void createPieModels() {
//		createPieModel1();
//		createPieModel2();
//	}
//
//	private void createDonutModels() {
//		donutModel1 = initDonutModel();
//		donutModel2 = initDonutModel2();
//		donutModel3 = initDonutModel3();
//		donutModel4 = initDonutModel4();
//		donutModel5 = initDonutModel5();
//	}
//
//	private void createLineModels() {
//		lineModel1 = initLineModel1();
//		lineModel2 = initLineModel2();
//		lineModel3 = initLineModel3();
//	}
//
//	private void createAreaModels() {
//		areaModel1 = initAreaModel1();
//		Axis xAxis = areaModel1.getAxis(AxisType.X);
//		Axis yAxis = areaModel1.getAxis(AxisType.Y);
//
//		yAxis.setMin(0);
//		xAxis.setMin(2000);
//		xAxis.setMax(2010);
//	}
//
//	private void createPieModel1() {
//		pieModel1 = new PieChartModel();
//
//		pieModel1.set("Brand 1", 540);
//		pieModel1.set("Brand 2", 325);
//		pieModel1.set("Brand 3", 702);
//		pieModel1.set("Brand 4", 421);
//	}
//
//	private void createPieModel2() {
//		pieModel2 = new PieChartModel();
//
//		pieModel2.set("Brand 1", 540);
//		pieModel2.set("Brand 2", 325);
//		pieModel2.set("Brand 3", 702);
//		pieModel2.set("Brand 4", 421);
//	}
//
//	private DonutChartModel initDonutModel() {
//		DonutChartModel model = new DonutChartModel();
//
//		Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
//		circle1.put("Free", 94);
//		circle1.put("Memory Usage", 6);
//
//		model.addCircle(circle1);
//
//		return model;
//	}
//
//	private DonutChartModel initDonutModel2() {
//		DonutChartModel model = new DonutChartModel();
//
//		Map<String, Number> circle2 = new LinkedHashMap<String, Number>();
//		circle2.put("Free", 60);
//		circle2.put("Memory Usage", 40);
//
//		model.addCircle(circle2);
//
//		return model;
//	}
//
//	private DonutChartModel initDonutModel3() {
//		DonutChartModel model = new DonutChartModel();
//
//		Map<String, Number> circle3 = new LinkedHashMap<String, Number>();
//		circle3.put("Free", 99.6);
//		circle3.put("Memory Usage", 0.4);
//
//		model.addCircle(circle3);
//
//		return model;
//	}
//
//	private DonutChartModel initDonutModel4() {
//		DonutChartModel model = new DonutChartModel();
//
//		Map<String, Number> circle4 = new LinkedHashMap<String, Number>();
//		circle4.put("Free", 95);
//		circle4.put("Memory Usage", 5);
//
//		model.addCircle(circle4);
//
//		return model;
//	}
//
//	private DonutChartModel initDonutModel5() {
//		DonutChartModel model = new DonutChartModel();
//
//		Map<String, Number> circle5 = new LinkedHashMap<String, Number>();
//		circle5.put("Free", 90);
//		circle5.put("Memory Usage", 10);
//
//		model.addCircle(circle5);
//
//		return model;
//	}
//
//	private LineChartModel initLineModel1() {
//		LineChartModel model = new LineChartModel();
//
//		LineChartSeries series1 = new LineChartSeries();
//		series1.setLabel("Series 1");
//
//		series1.set(1, 2);
//		series1.set(2, 1);
//		series1.set(3, 3);
//		series1.set(4, 6);
//		series1.set(5, 8);
//
//		LineChartSeries series2 = new LineChartSeries();
//		series2.setLabel("Series 2");
//
//		series2.set(1, 6);
//		series2.set(2, 3);
//		series2.set(3, 2);
//		series2.set(4, 7);
//		series2.set(5, 9);
//
//		model.addSeries(series1);
//		model.addSeries(series2);
//
//		return model;
//	}
//
//	private LineChartModel initLineModel2() {
//		LineChartModel model = new LineChartModel();
//
//		LineChartSeries series1 = new LineChartSeries();
//		series1.setLabel("Series 1");
//
//		series1.set(1, 2);
//		series1.set(2, 1);
//		series1.set(3, 3);
//		series1.set(4, 6);
//		series1.set(5, 8);
//
//		LineChartSeries series2 = new LineChartSeries();
//		series2.setLabel("Series 2");
//
//		series2.set(1, 6);
//		series2.set(2, 3);
//		series2.set(3, 2);
//		series2.set(4, 7);
//		series2.set(5, 9);
//
//		model.addSeries(series1);
//		model.addSeries(series2);
//
//		return model;
//	}
//
//	private LineChartModel initLineModel3() {
//		LineChartModel model = new LineChartModel();
//
//		LineChartSeries series1 = new LineChartSeries();
//		series1.setLabel("Series 1");
//
//		series1.set(1, 2);
//		series1.set(2, 1);
//		series1.set(3, 3);
//		series1.set(4, 6);
//		series1.set(5, 8);
//
//		LineChartSeries series2 = new LineChartSeries();
//		series2.setLabel("Series 2");
//
//		series2.set(1, 6);
//		series2.set(2, 3);
//		series2.set(3, 2);
//		series2.set(4, 7);
//		series2.set(5, 9);
//
//		model.addSeries(series1);
//		model.addSeries(series2);
//
//		return model;
//	}
//
//	private LineChartModel initAreaModel1() {
//		LineChartModel model = new LineChartModel();
//
//		LineChartSeries boys = new LineChartSeries();
//		boys.setFill(true);
//		boys.setLabel("Boys");
//		boys.set("2004", 120);
//		boys.set("2005", 100);
//		boys.set("2006", 44);
//		boys.set("2007", 150);
//		boys.set("2008", 25);
//
//		LineChartSeries girls = new LineChartSeries();
//		girls.setFill(true);
//		girls.setLabel("Girls");
//		girls.set("2004", 52);
//		girls.set("2005", 60);
//		girls.set("2006", 110);
//		girls.set("2007", 90);
//		girls.set("2008", 120);
//
//		model.addSeries(boys);
//		model.addSeries(girls);
//
//		return model;
//	}
//}

/*--- End Version 1 ---*/