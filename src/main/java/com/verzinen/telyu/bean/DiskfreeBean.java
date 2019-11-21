package com.verzinen.telyu.bean;


import org.primefaces.model.chart.PieChartModel;

import com.verzinen.telyu.ejb.DatanodeFileClient;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;

@Named
public class DiskfreeBean {
    private PieChartModel model;
    
    @EJB DatanodeFileClient data;
   // private DatanodeView data = new DatanodeView();

    @PostConstruct
    public void init() {
    	
    //	data = new DatanodeView();
    	
    	
        model = new PieChartModel();
        
       
        model.set("DiskFree", data.getDisk().getDiskFree() );//jobs in thousands
        model.set("DiskFreeAvg", data.getDisk().getDiskFreeAvg() );
        model.set("DiskFreeMax", data.getDisk().getDiskFreeMax());
        model.set("DiskFreeMin", data.getDisk().getDiskFreeMin() ); 
        /*
        model.set("MemoryFree", data.getMemory().getMemFree());//jobs in thousands
        model.set("MemoryFreeAvg", data.getMemory().getMemFreeAvg() );
        model.set("MemoryFreeMax", data.getMemory().getMemFreeMax());
        model.set("MemoryFreeMin", data.getMemory().getMemFreeMin() );
  		*/
        //followings are some optional customizations:
        //set title
        model.setTitle("Disk free");
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