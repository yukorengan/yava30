package com.roasted.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataNodeInfo {  // was Bean

@SerializedName("name")
@Expose
private String name;
@SerializedName("modelerType")
@Expose
private String modelerType;
@SerializedName("XceiverCount")
@Expose
private Integer xceiverCount;
@SerializedName("DatanodeNetworkCounts")
@Expose
private List<DatanodeNetworkCount> datanodeNetworkCounts = null;
@SerializedName("XmitsInProgress")
@Expose
private Integer xmitsInProgress;
@SerializedName("SoftwareVersion")
@Expose
private String softwareVersion;
@SerializedName("Version")
@Expose
private String version;
@SerializedName("RpcPort")
@Expose
private String rpcPort;
@SerializedName("DataPort")
@Expose
private String dataPort;
@SerializedName("HttpPort")
@Expose
private Object httpPort;
@SerializedName("NamenodeAddresses")
@Expose
private String namenodeAddresses;
@SerializedName("DatanodeHostname")
@Expose
private String datanodeHostname;
@SerializedName("BPServiceActorInfo")
@Expose
private String bPServiceActorInfo;
@SerializedName("VolumeInfo")
@Expose
private String volumeInfo;
@SerializedName("ClusterId")
@Expose
private String clusterId;
@SerializedName("DiskBalancerStatus")
@Expose
private String diskBalancerStatus;
@SerializedName("SendPacketDownstreamAvgInfo")
@Expose
private Object sendPacketDownstreamAvgInfo;
@SerializedName("SlowDisks")
@Expose
private Object slowDisks;

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

public Integer getXceiverCount() {
return xceiverCount;
}

public void setXceiverCount(Integer xceiverCount) {
this.xceiverCount = xceiverCount;
}

public List<DatanodeNetworkCount> getDatanodeNetworkCounts() {
return datanodeNetworkCounts;
}

public void setDatanodeNetworkCounts(List<DatanodeNetworkCount> datanodeNetworkCounts) {
this.datanodeNetworkCounts = datanodeNetworkCounts;
}

public Integer getXmitsInProgress() {
return xmitsInProgress;
}

public void setXmitsInProgress(Integer xmitsInProgress) {
this.xmitsInProgress = xmitsInProgress;
}

public String getSoftwareVersion() {
return softwareVersion;
}

public void setSoftwareVersion(String softwareVersion) {
this.softwareVersion = softwareVersion;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public String getRpcPort() {
return rpcPort;
}

public void setRpcPort(String rpcPort) {
this.rpcPort = rpcPort;
}

public String getDataPort() {
return dataPort;
}

public void setDataPort(String dataPort) {
this.dataPort = dataPort;
}

public Object getHttpPort() {
return httpPort;
}

public void setHttpPort(Object httpPort) {
this.httpPort = httpPort;
}

public String getNamenodeAddresses() {
return namenodeAddresses;
}

public void setNamenodeAddresses(String namenodeAddresses) {
this.namenodeAddresses = namenodeAddresses;
}

public String getDatanodeHostname() {
return datanodeHostname;
}

public void setDatanodeHostname(String datanodeHostname) {
this.datanodeHostname = datanodeHostname;
}

public String getBPServiceActorInfo() {
return bPServiceActorInfo;
}

public void setBPServiceActorInfo(String bPServiceActorInfo) {
this.bPServiceActorInfo = bPServiceActorInfo;
}

public String getVolumeInfo() {
return volumeInfo;
}

public void setVolumeInfo(String volumeInfo) {
this.volumeInfo = volumeInfo;
}

public String getClusterId() {
return clusterId;
}

public void setClusterId(String clusterId) {
this.clusterId = clusterId;
}

public String getDiskBalancerStatus() {
return diskBalancerStatus;
}

public void setDiskBalancerStatus(String diskBalancerStatus) {
this.diskBalancerStatus = diskBalancerStatus;
}

public Object getSendPacketDownstreamAvgInfo() {
return sendPacketDownstreamAvgInfo;
}

public void setSendPacketDownstreamAvgInfo(Object sendPacketDownstreamAvgInfo) {
this.sendPacketDownstreamAvgInfo = sendPacketDownstreamAvgInfo;
}

public Object getSlowDisks() {
return slowDisks;
}

public void setSlowDisks(Object slowDisks) {
this.slowDisks = slowDisks;
}

}
