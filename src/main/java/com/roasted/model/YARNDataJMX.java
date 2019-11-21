package com.roasted.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YARNDataJMX {
	
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("modelerType")
	@Expose
	private String modelerType;
	@SerializedName("tag.Queue")
	@Expose
	private String tagQueue;
	@SerializedName("tag.Context")
	@Expose
	private String tagContext;
	@SerializedName("tag.Hostname")
	@Expose
	private String tagHostname;
	@SerializedName("running_0")
	@Expose
	private Integer running0;
	@SerializedName("running_60")
	@Expose
	private Integer running60;
	@SerializedName("running_300")
	@Expose
	private Integer running300;
	@SerializedName("running_1440")
	@Expose
	private Integer running1440;
	@SerializedName("AMResourceLimitMB")
	@Expose
	private Integer aMResourceLimitMB;
	@SerializedName("AMResourceLimitVCores")
	@Expose
	private Integer aMResourceLimitVCores;
	@SerializedName("UsedAMResourceMB")
	@Expose
	private Integer usedAMResourceMB;
	@SerializedName("UsedAMResourceVCores")
	@Expose
	private Integer usedAMResourceVCores;
	@SerializedName("UsedCapacity")
	@Expose
	private Double usedCapacity;
	@SerializedName("AbsoluteUsedCapacity")
	@Expose
	private Double absoluteUsedCapacity;
	@SerializedName("AppsSubmitted")
	@Expose
	private Integer appsSubmitted;
	@SerializedName("AppsRunning")
	@Expose
	private Integer appsRunning;
	@SerializedName("AppsPending")
	@Expose
	private Integer appsPending;
	@SerializedName("AppsCompleted")
	@Expose
	private Integer appsCompleted;
	@SerializedName("AppsKilled")
	@Expose
	private Integer appsKilled;
	@SerializedName("AppsFailed")
	@Expose
	private Integer appsFailed;
	@SerializedName("AggregateNodeLocalContainersAllocated")
	@Expose
	private Integer aggregateNodeLocalContainersAllocated;
	@SerializedName("AggregateRackLocalContainersAllocated")
	@Expose
	private Integer aggregateRackLocalContainersAllocated;
	@SerializedName("AggregateOffSwitchContainersAllocated")
	@Expose
	private Integer aggregateOffSwitchContainersAllocated;
	@SerializedName("AggregateContainersPreempted")
	@Expose
	private Integer aggregateContainersPreempted;
	@SerializedName("AggregateMemoryMBSecondsPreempted")
	@Expose
	private Integer aggregateMemoryMBSecondsPreempted;
	@SerializedName("AggregateVcoreSecondsPreempted")
	@Expose
	private Integer aggregateVcoreSecondsPreempted;
	@SerializedName("ActiveUsers")
	@Expose
	private Integer activeUsers;
	@SerializedName("ActiveApplications")
	@Expose
	private Integer activeApplications;
	@SerializedName("AppAttemptFirstContainerAllocationDelayNumOps")
	@Expose
	private Integer appAttemptFirstContainerAllocationDelayNumOps;
	@SerializedName("AppAttemptFirstContainerAllocationDelayAvgTime")
	@Expose
	private Double appAttemptFirstContainerAllocationDelayAvgTime;
	@SerializedName("AllocatedMB")
	@Expose
	private Integer allocatedMB;
	@SerializedName("AllocatedVCores")
	@Expose
	private Integer allocatedVCores;
	@SerializedName("AllocatedContainers")
	@Expose
	private Integer allocatedContainers;
	@SerializedName("AggregateContainersAllocated")
	@Expose
	private Integer aggregateContainersAllocated;
	@SerializedName("AggregateContainersReleased")
	@Expose
	private Integer aggregateContainersReleased;
	@SerializedName("AvailableMB")
	@Expose
	private Integer availableMB;
	@SerializedName("AvailableVCores")
	@Expose
	private Integer availableVCores;
	@SerializedName("PendingMB")
	@Expose
	private Integer pendingMB;
	@SerializedName("PendingVCores")
	@Expose
	private Integer pendingVCores;
	@SerializedName("PendingContainers")
	@Expose
	private Integer pendingContainers;
	@SerializedName("ReservedMB")
	@Expose
	private Integer reservedMB;
	@SerializedName("ReservedVCores")
	@Expose
	private Integer reservedVCores;
	@SerializedName("ReservedContainers")
	@Expose
	private Integer reservedContainers;
	
	public YARNDataJMX() {
		
	}

	public YARNDataJMX(String name, String modelerType, String tagQueue, String tagContext, String tagHostname,
			Integer running0, Integer running60, Integer running300, Integer running1440, Integer aMResourceLimitMB,
			Integer aMResourceLimitVCores, Integer usedAMResourceMB, Integer usedAMResourceVCores, Double usedCapacity,
			Double absoluteUsedCapacity, Integer appsSubmitted, Integer appsRunning, Integer appsPending,
			Integer appsCompleted, Integer appsKilled, Integer appsFailed,
			Integer aggregateNodeLocalContainersAllocated, Integer aggregateRackLocalContainersAllocated,
			Integer aggregateOffSwitchContainersAllocated, Integer aggregateContainersPreempted,
			Integer aggregateMemoryMBSecondsPreempted, Integer aggregateVcoreSecondsPreempted, Integer activeUsers,
			Integer activeApplications, Integer appAttemptFirstContainerAllocationDelayNumOps,
			Double appAttemptFirstContainerAllocationDelayAvgTime, Integer allocatedMB, Integer allocatedVCores,
			Integer allocatedContainers, Integer aggregateContainersAllocated, Integer aggregateContainersReleased,
			Integer availableMB, Integer availableVCores, Integer pendingMB, Integer pendingVCores,
			Integer pendingContainers, Integer reservedMB, Integer reservedVCores, Integer reservedContainers) {
		super();
		this.name = name;
		this.modelerType = modelerType;
		this.tagQueue = tagQueue;
		this.tagContext = tagContext;
		this.tagHostname = tagHostname;
		this.running0 = running0;
		this.running60 = running60;
		this.running300 = running300;
		this.running1440 = running1440;
		this.aMResourceLimitMB = aMResourceLimitMB;
		this.aMResourceLimitVCores = aMResourceLimitVCores;
		this.usedAMResourceMB = usedAMResourceMB;
		this.usedAMResourceVCores = usedAMResourceVCores;
		this.usedCapacity = usedCapacity;
		this.absoluteUsedCapacity = absoluteUsedCapacity;
		this.appsSubmitted = appsSubmitted;
		this.appsRunning = appsRunning;
		this.appsPending = appsPending;
		this.appsCompleted = appsCompleted;
		this.appsKilled = appsKilled;
		this.appsFailed = appsFailed;
		this.aggregateNodeLocalContainersAllocated = aggregateNodeLocalContainersAllocated;
		this.aggregateRackLocalContainersAllocated = aggregateRackLocalContainersAllocated;
		this.aggregateOffSwitchContainersAllocated = aggregateOffSwitchContainersAllocated;
		this.aggregateContainersPreempted = aggregateContainersPreempted;
		this.aggregateMemoryMBSecondsPreempted = aggregateMemoryMBSecondsPreempted;
		this.aggregateVcoreSecondsPreempted = aggregateVcoreSecondsPreempted;
		this.activeUsers = activeUsers;
		this.activeApplications = activeApplications;
		this.appAttemptFirstContainerAllocationDelayNumOps = appAttemptFirstContainerAllocationDelayNumOps;
		this.appAttemptFirstContainerAllocationDelayAvgTime = appAttemptFirstContainerAllocationDelayAvgTime;
		this.allocatedMB = allocatedMB;
		this.allocatedVCores = allocatedVCores;
		this.allocatedContainers = allocatedContainers;
		this.aggregateContainersAllocated = aggregateContainersAllocated;
		this.aggregateContainersReleased = aggregateContainersReleased;
		this.availableMB = availableMB;
		this.availableVCores = availableVCores;
		this.pendingMB = pendingMB;
		this.pendingVCores = pendingVCores;
		this.pendingContainers = pendingContainers;
		this.reservedMB = reservedMB;
		this.reservedVCores = reservedVCores;
		this.reservedContainers = reservedContainers;
	}

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

	public String getTagQueue() {
	return tagQueue;
	}

	public void setTagQueue(String tagQueue) {
	this.tagQueue = tagQueue;
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

	public Integer getRunning0() {
	return running0;
	}

	public void setRunning0(Integer running0) {
	this.running0 = running0;
	}

	public Integer getRunning60() {
	return running60;
	}

	public void setRunning60(Integer running60) {
	this.running60 = running60;
	}

	public Integer getRunning300() {
	return running300;
	}

	public void setRunning300(Integer running300) {
	this.running300 = running300;
	}

	public Integer getRunning1440() {
	return running1440;
	}

	public void setRunning1440(Integer running1440) {
	this.running1440 = running1440;
	}

	public Integer getAMResourceLimitMB() {
	return aMResourceLimitMB;
	}

	public void setAMResourceLimitMB(Integer aMResourceLimitMB) {
	this.aMResourceLimitMB = aMResourceLimitMB;
	}

	public Integer getAMResourceLimitVCores() {
	return aMResourceLimitVCores;
	}

	public void setAMResourceLimitVCores(Integer aMResourceLimitVCores) {
	this.aMResourceLimitVCores = aMResourceLimitVCores;
	}

	public Integer getUsedAMResourceMB() {
	return usedAMResourceMB;
	}

	public void setUsedAMResourceMB(Integer usedAMResourceMB) {
	this.usedAMResourceMB = usedAMResourceMB;
	}

	public Integer getUsedAMResourceVCores() {
	return usedAMResourceVCores;
	}

	public void setUsedAMResourceVCores(Integer usedAMResourceVCores) {
	this.usedAMResourceVCores = usedAMResourceVCores;
	}

	public Double getUsedCapacity() {
	return usedCapacity;
	}

	public void setUsedCapacity(Double usedCapacity) {
	this.usedCapacity = usedCapacity;
	}

	public Double getAbsoluteUsedCapacity() {
	return absoluteUsedCapacity;
	}

	public void setAbsoluteUsedCapacity(Double absoluteUsedCapacity) {
	this.absoluteUsedCapacity = absoluteUsedCapacity;
	}

	public Integer getAppsSubmitted() {
	return appsSubmitted;
	}

	public void setAppsSubmitted(Integer appsSubmitted) {
	this.appsSubmitted = appsSubmitted;
	}

	public Integer getAppsRunning() {
	return appsRunning;
	}

	public void setAppsRunning(Integer appsRunning) {
	this.appsRunning = appsRunning;
	}

	public Integer getAppsPending() {
	return appsPending;
	}

	public void setAppsPending(Integer appsPending) {
	this.appsPending = appsPending;
	}

	public Integer getAppsCompleted() {
	return appsCompleted;
	}

	public void setAppsCompleted(Integer appsCompleted) {
	this.appsCompleted = appsCompleted;
	}

	public Integer getAppsKilled() {
	return appsKilled;
	}

	public void setAppsKilled(Integer appsKilled) {
	this.appsKilled = appsKilled;
	}

	public Integer getAppsFailed() {
	return appsFailed;
	}

	public void setAppsFailed(Integer appsFailed) {
	this.appsFailed = appsFailed;
	}

	public Integer getAggregateNodeLocalContainersAllocated() {
	return aggregateNodeLocalContainersAllocated;
	}

	public void setAggregateNodeLocalContainersAllocated(Integer aggregateNodeLocalContainersAllocated) {
	this.aggregateNodeLocalContainersAllocated = aggregateNodeLocalContainersAllocated;
	}

	public Integer getAggregateRackLocalContainersAllocated() {
	return aggregateRackLocalContainersAllocated;
	}

	public void setAggregateRackLocalContainersAllocated(Integer aggregateRackLocalContainersAllocated) {
	this.aggregateRackLocalContainersAllocated = aggregateRackLocalContainersAllocated;
	}

	public Integer getAggregateOffSwitchContainersAllocated() {
	return aggregateOffSwitchContainersAllocated;
	}

	public void setAggregateOffSwitchContainersAllocated(Integer aggregateOffSwitchContainersAllocated) {
	this.aggregateOffSwitchContainersAllocated = aggregateOffSwitchContainersAllocated;
	}

	public Integer getAggregateContainersPreempted() {
	return aggregateContainersPreempted;
	}

	public void setAggregateContainersPreempted(Integer aggregateContainersPreempted) {
	this.aggregateContainersPreempted = aggregateContainersPreempted;
	}

	public Integer getAggregateMemoryMBSecondsPreempted() {
	return aggregateMemoryMBSecondsPreempted;
	}

	public void setAggregateMemoryMBSecondsPreempted(Integer aggregateMemoryMBSecondsPreempted) {
	this.aggregateMemoryMBSecondsPreempted = aggregateMemoryMBSecondsPreempted;
	}

	public Integer getAggregateVcoreSecondsPreempted() {
	return aggregateVcoreSecondsPreempted;
	}

	public void setAggregateVcoreSecondsPreempted(Integer aggregateVcoreSecondsPreempted) {
	this.aggregateVcoreSecondsPreempted = aggregateVcoreSecondsPreempted;
	}

	public Integer getActiveUsers() {
	return activeUsers;
	}

	public void setActiveUsers(Integer activeUsers) {
	this.activeUsers = activeUsers;
	}

	public Integer getActiveApplications() {
	return activeApplications;
	}

	public void setActiveApplications(Integer activeApplications) {
	this.activeApplications = activeApplications;
	}

	public Integer getAppAttemptFirstContainerAllocationDelayNumOps() {
	return appAttemptFirstContainerAllocationDelayNumOps;
	}

	public void setAppAttemptFirstContainerAllocationDelayNumOps(Integer appAttemptFirstContainerAllocationDelayNumOps) {
	this.appAttemptFirstContainerAllocationDelayNumOps = appAttemptFirstContainerAllocationDelayNumOps;
	}

	public Double getAppAttemptFirstContainerAllocationDelayAvgTime() {
	return appAttemptFirstContainerAllocationDelayAvgTime;
	}

	public void setAppAttemptFirstContainerAllocationDelayAvgTime(Double appAttemptFirstContainerAllocationDelayAvgTime) {
	this.appAttemptFirstContainerAllocationDelayAvgTime = appAttemptFirstContainerAllocationDelayAvgTime;
	}

	public Integer getAllocatedMB() {
	return allocatedMB;
	}

	public void setAllocatedMB(Integer allocatedMB) {
	this.allocatedMB = allocatedMB;
	}

	public Integer getAllocatedVCores() {
	return allocatedVCores;
	}

	public void setAllocatedVCores(Integer allocatedVCores) {
	this.allocatedVCores = allocatedVCores;
	}

	public Integer getAllocatedContainers() {
	return allocatedContainers;
	}

	public void setAllocatedContainers(Integer allocatedContainers) {
	this.allocatedContainers = allocatedContainers;
	}

	public Integer getAggregateContainersAllocated() {
	return aggregateContainersAllocated;
	}

	public void setAggregateContainersAllocated(Integer aggregateContainersAllocated) {
	this.aggregateContainersAllocated = aggregateContainersAllocated;
	}

	public Integer getAggregateContainersReleased() {
	return aggregateContainersReleased;
	}

	public void setAggregateContainersReleased(Integer aggregateContainersReleased) {
	this.aggregateContainersReleased = aggregateContainersReleased;
	}

	public Integer getAvailableMB() {
	return availableMB;
	}

	public void setAvailableMB(Integer availableMB) {
	this.availableMB = availableMB;
	}

	public Integer getAvailableVCores() {
	return availableVCores;
	}

	public void setAvailableVCores(Integer availableVCores) {
	this.availableVCores = availableVCores;
	}

	public Integer getPendingMB() {
	return pendingMB;
	}

	public void setPendingMB(Integer pendingMB) {
	this.pendingMB = pendingMB;
	}

	public Integer getPendingVCores() {
	return pendingVCores;
	}

	public void setPendingVCores(Integer pendingVCores) {
	this.pendingVCores = pendingVCores;
	}

	public Integer getPendingContainers() {
	return pendingContainers;
	}

	public void setPendingContainers(Integer pendingContainers) {
	this.pendingContainers = pendingContainers;
	}

	public Integer getReservedMB() {
	return reservedMB;
	}

	public void setReservedMB(Integer reservedMB) {
	this.reservedMB = reservedMB;
	}

	public Integer getReservedVCores() {
	return reservedVCores;
	}

	public void setReservedVCores(Integer reservedVCores) {
	this.reservedVCores = reservedVCores;
	}

	public Integer getReservedContainers() {
	return reservedContainers;
	}

	public void setReservedContainers(Integer reservedContainers) {
	this.reservedContainers = reservedContainers;
	}

	}