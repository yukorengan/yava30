package com.roasted.model;

import java.io.Serializable;

public class MetricAggregateDailyUUID implements Serializable {
	
	public long servet;
	public double sum, max, min;
	
	public byte uuid;
	public int count;
	
	public MetricAggregateDailyUUID(double sum, double max, double min, long servet, byte uuid, int count) {
		
		this.sum = sum;
		this.max = max;
		this.min = min;
		this.servet = servet;
		this.count = count;
		this.uuid = uuid;
	}
	
	public MetricAggregateDailyUUID() {
		
	}
	
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public long getServet() {
		return servet;
	}
	public void setServet(long servet) {
		this.servet = servet;
	}
	
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	
	public byte getUUID() {
		return uuid;
	}
	public void setUUID(byte uuid) {
		this.uuid = uuid;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
