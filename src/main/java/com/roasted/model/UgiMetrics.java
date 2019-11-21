package com.roasted.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UgiMetrics {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("modelerType")
	@Expose
	private String modelerType;
	@SerializedName("tag.Context")
	@Expose
	private String tagContext;
	@SerializedName("tag.Hostname")
	@Expose
	private String tagHostname;
	@SerializedName("LoginSuccessNumOps")
	@Expose
	private Integer loginSuccessNumOps;
	@SerializedName("LoginSuccessAvgTime")
	@Expose
	private Double loginSuccessAvgTime;
	@SerializedName("LoginFailureNumOps")
	@Expose
	private Integer loginFailureNumOps;
	@SerializedName("LoginFailureAvgTime")
	@Expose
	private Double loginFailureAvgTime;
	@SerializedName("GetGroupsNumOps")
	@Expose
	private Integer getGroupsNumOps;
	@SerializedName("GetGroupsAvgTime")
	@Expose
	private Double getGroupsAvgTime;
	@SerializedName("RenewalFailuresTotal")
	@Expose
	private Integer renewalFailuresTotal;
	@SerializedName("RenewalFailures")
	@Expose
	private Integer renewalFailures;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelerType() {
		return modelerType;
	}

	public void setModelerType(String modelerType) {
		this.modelerType = modelerType;
	}

	public String getTagContext() {
		return tagContext;
	}

	public void setTagContext(String tagContext) {
		this.tagContext = tagContext;
	}

	public String getTagHostname() {
		return tagHostname;
	}

	public void setTagHostname(String tagHostname) {
		this.tagHostname = tagHostname;
	}

	public Integer getLoginSuccessNumOps() {
		return loginSuccessNumOps;
	}

	public void setLoginSuccessNumOps(Integer loginSuccessNumOps) {
		this.loginSuccessNumOps = loginSuccessNumOps;
	}

	public Double getLoginSuccessAvgTime() {
		return loginSuccessAvgTime;
	}

	public void setLoginSuccessAvgTime(Double loginSuccessAvgTime) {
		this.loginSuccessAvgTime = loginSuccessAvgTime;
	}

	public Integer getLoginFailureNumOps() {
		return loginFailureNumOps;
	}

	public void setLoginFailureNumOps(Integer loginFailureNumOps) {
		this.loginFailureNumOps = loginFailureNumOps;
	}

	public Double getLoginFailureAvgTime() {
		return loginFailureAvgTime;
	}

	public void setLoginFailureAvgTime(Double loginFailureAvgTime) {
		this.loginFailureAvgTime = loginFailureAvgTime;
	}

	public Integer getGetGroupsNumOps() {
		return getGroupsNumOps;
	}

	public void setGetGroupsNumOps(Integer getGroupsNumOps) {
		this.getGroupsNumOps = getGroupsNumOps;
	}

	public Double getGetGroupsAvgTime() {
		return getGroupsAvgTime;
	}

	public void setGetGroupsAvgTime(Double getGroupsAvgTime) {
		this.getGroupsAvgTime = getGroupsAvgTime;
	}

	public Integer getRenewalFailuresTotal() {
		return renewalFailuresTotal;
	}

	public void setRenewalFailuresTotal(Integer renewalFailuresTotal) {
		this.renewalFailuresTotal = renewalFailuresTotal;
	}

	public Integer getRenewalFailures() {
		return renewalFailures;
	}

	public void setRenewalFailures(Integer renewalFailures) {
		this.renewalFailures = renewalFailures;
	}

}