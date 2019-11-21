package com.verzinen.telyu.bean;


import org.primefaces.model.chart.PieChartModel;

import com.verzinen.telyu.ejb.DatanodeFileClient;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;

@Named
public class NetworkBean {
    private PieChartModel model;
    @EJB DatanodeFileClient data;
    //private DatanodeView data = new DatanodeView();

    @PostConstruct
    public void init() {
    	
    //	data = new DatanodeView();
    	
    	
        model = new PieChartModel();
        model.set("Bytes In", data.getNetwork().getBytesIn() );//jobs in thousands
        model.set("Bytes In Avg", data.getNetwork().getBytesInAvg());
        model.set("Bytes In Max", data.getNetwork().getBytesInMax());
        model.set("Bytes In Min", data.getNetwork().getBytesInMin() );
        
        model.set("Bytes Out", data.getNetwork().getBytesOut());//jobs in thousands
        model.set("Bytes Out Avg", data.getNetwork().getBytesOutAvg());
        model.set("Bytes Out Max", data.getNetwork().getBytesOutMax());
        model.set("Bytes Out Min", data.getNetwork().getBytesOutMin() );
    
  
        //followings are some optional customizations:
        //set title
        model.setTitle("Network free");
        //set legend position to 'e' (east), other values are 'w', 's' and 'n'
        model.setLegendPosition("e");
        //enable tooltips
        model.setShowDatatip(true);
        //show labels inside pie chart
        model.setShowDataLabels(true);
        //show label text  as 'value' (numeric) , others are 'label', 'percent' (default). Only one can be used.
        model.setDataFormat("value");
        //format: %d for 'value', %s for 'label', %d%% for 'percent'
        model.setDataLabelFormatString("%dK");
        //pie sector colors
        model.setSeriesColors("aaf,afa,faa,ffa,aff,faf,ddd");
    }
    
    

    public PieChartModel getModel() {
        return model;
    }
}