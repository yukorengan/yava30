
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rpc {

    @SerializedName("NumOpenConnections")
    @Expose
    private Double numOpenConnections;
    @SerializedName("NumOpenConnections._avg")
    @Expose
    private Double numOpenConnectionsAvg;
    @SerializedName("NumOpenConnections._max")
    @Expose
    private Double numOpenConnectionsMax;
    @SerializedName("NumOpenConnections._min")
    @Expose
    private Double numOpenConnectionsMin;
    @SerializedName("NumOpenConnections._rate")
    @Expose
    private Integer numOpenConnectionsRate;
    @SerializedName("NumOpenConnections._sum")
    @Expose
    private Double numOpenConnectionsSum;
    @SerializedName("ReceivedBytes")
    @Expose
    private Double receivedBytes;
    @SerializedName("ReceivedBytes._avg")
    @Expose
    private Double receivedBytesAvg;
    @SerializedName("ReceivedBytes._max")
    @Expose
    private Double receivedBytesMax;
    @SerializedName("ReceivedBytes._min")
    @Expose
    private Double receivedBytesMin;
    @SerializedName("ReceivedBytes._rate")
    @Expose
    private Integer receivedBytesRate;
    @SerializedName("ReceivedBytes._sum")
    @Expose
    private Double receivedBytesSum;
    @SerializedName("RpcProcessingTime_avg_time")
    @Expose
    private Double rpcProcessingTimeAvgTime;
    @SerializedName("RpcProcessingTime_avg_time._avg")
    @Expose
    private Double rpcProcessingTimeAvgTimeAvg;
    @SerializedName("RpcProcessingTime_avg_time._max")
    @Expose
    private Double rpcProcessingTimeAvgTimeMax;
    @SerializedName("RpcProcessingTime_avg_time._min")
    @Expose
    private Double rpcProcessingTimeAvgTimeMin;
    @SerializedName("RpcProcessingTime_avg_time._rate")
    @Expose
    private Integer rpcProcessingTimeAvgTimeRate;
    @SerializedName("RpcProcessingTime_avg_time._sum")
    @Expose
    private Double rpcProcessingTimeAvgTimeSum;
    @SerializedName("RpcProcessingTime_num_ops")
    @Expose
    private Double rpcProcessingTimeNumOps;
    @SerializedName("RpcProcessingTime_num_ops._avg")
    @Expose
    private Double rpcProcessingTimeNumOpsAvg;
    @SerializedName("RpcProcessingTime_num_ops._max")
    @Expose
    private Double rpcProcessingTimeNumOpsMax;
    @SerializedName("RpcProcessingTime_num_ops._min")
    @Expose
    private Double rpcProcessingTimeNumOpsMin;
    @SerializedName("RpcProcessingTime_num_ops._rate")
    @Expose
    private Integer rpcProcessingTimeNumOpsRate;
    @SerializedName("RpcProcessingTime_num_ops._sum")
    @Expose
    private Double rpcProcessingTimeNumOpsSum;
    @SerializedName("RpcQueueTime_avg_time")
    @Expose
    private Double rpcQueueTimeAvgTime;
    @SerializedName("RpcQueueTime_avg_time._avg")
    @Expose
    private Double rpcQueueTimeAvgTimeAvg;
    @SerializedName("RpcQueueTime_avg_time._max")
    @Expose
    private Double rpcQueueTimeAvgTimeMax;
    @SerializedName("RpcQueueTime_avg_time._min")
    @Expose
    private Double rpcQueueTimeAvgTimeMin;
    @SerializedName("RpcQueueTime_avg_time._rate")
    @Expose
    private Integer rpcQueueTimeAvgTimeRate;
    @SerializedName("RpcQueueTime_avg_time._sum")
    @Expose
    private Double rpcQueueTimeAvgTimeSum;
    @SerializedName("RpcQueueTime_num_ops")
    @Expose
    private Double rpcQueueTimeNumOps;
    @SerializedName("RpcQueueTime_num_ops._avg")
    @Expose
    private Double rpcQueueTimeNumOpsAvg;
    @SerializedName("RpcQueueTime_num_ops._max")
    @Expose
    private Double rpcQueueTimeNumOpsMax;
    @SerializedName("RpcQueueTime_num_ops._min")
    @Expose
    private Double rpcQueueTimeNumOpsMin;
    @SerializedName("RpcQueueTime_num_ops._rate")
    @Expose
    private Integer rpcQueueTimeNumOpsRate;
    @SerializedName("RpcQueueTime_num_ops._sum")
    @Expose
    private Double rpcQueueTimeNumOpsSum;
    @SerializedName("SentBytes")
    @Expose
    private Double sentBytes;
    @SerializedName("SentBytes._avg")
    @Expose
    private Double sentBytesAvg;
    @SerializedName("SentBytes._max")
    @Expose
    private Double sentBytesMax;
    @SerializedName("SentBytes._min")
    @Expose
    private Double sentBytesMin;
    @SerializedName("SentBytes._rate")
    @Expose
    private Integer sentBytesRate;
    @SerializedName("SentBytes._sum")
    @Expose
    private Double sentBytesSum;
    @SerializedName("callQueueLen")
    @Expose
    private Double callQueueLen;
    @SerializedName("callQueueLen._avg")
    @Expose
    private Double callQueueLenAvg;
    @SerializedName("callQueueLen._max")
    @Expose
    private Double callQueueLenMax;
    @SerializedName("callQueueLen._min")
    @Expose
    private Double callQueueLenMin;
    @SerializedName("callQueueLen._rate")
    @Expose
    private Integer callQueueLenRate;
    @SerializedName("callQueueLen._sum")
    @Expose
    private Double callQueueLenSum;
    @SerializedName("rpcAuthenticationFailures")
    @Expose
    private Double rpcAuthenticationFailures;
    @SerializedName("rpcAuthenticationFailures._avg")
    @Expose
    private Double rpcAuthenticationFailuresAvg;
    @SerializedName("rpcAuthenticationFailures._max")
    @Expose
    private Double rpcAuthenticationFailuresMax;
    @SerializedName("rpcAuthenticationFailures._min")
    @Expose
    private Double rpcAuthenticationFailuresMin;
    @SerializedName("rpcAuthenticationFailures._rate")
    @Expose
    private Integer rpcAuthenticationFailuresRate;
    @SerializedName("rpcAuthenticationFailures._sum")
    @Expose
    private Double rpcAuthenticationFailuresSum;
    @SerializedName("rpcAuthenticationSuccesses")
    @Expose
    private Double rpcAuthenticationSuccesses;
    @SerializedName("rpcAuthenticationSuccesses._avg")
    @Expose
    private Double rpcAuthenticationSuccessesAvg;
    @SerializedName("rpcAuthenticationSuccesses._max")
    @Expose
    private Double rpcAuthenticationSuccessesMax;
    @SerializedName("rpcAuthenticationSuccesses._min")
    @Expose
    private Double rpcAuthenticationSuccessesMin;
    @SerializedName("rpcAuthenticationSuccesses._rate")
    @Expose
    private Integer rpcAuthenticationSuccessesRate;
    @SerializedName("rpcAuthenticationSuccesses._sum")
    @Expose
    private Double rpcAuthenticationSuccessesSum;
    @SerializedName("rpcAuthorizationFailures")
    @Expose
    private Double rpcAuthorizationFailures;
    @SerializedName("rpcAuthorizationFailures._avg")
    @Expose
    private Double rpcAuthorizationFailuresAvg;
    @SerializedName("rpcAuthorizationFailures._max")
    @Expose
    private Double rpcAuthorizationFailuresMax;
    @SerializedName("rpcAuthorizationFailures._min")
    @Expose
    private Double rpcAuthorizationFailuresMin;
    @SerializedName("rpcAuthorizationFailures._rate")
    @Expose
    private Integer rpcAuthorizationFailuresRate;
    @SerializedName("rpcAuthorizationFailures._sum")
    @Expose
    private Double rpcAuthorizationFailuresSum;
    @SerializedName("rpcAuthorizationSuccesses")
    @Expose
    private Double rpcAuthorizationSuccesses;
    @SerializedName("rpcAuthorizationSuccesses._avg")
    @Expose
    private Double rpcAuthorizationSuccessesAvg;
    @SerializedName("rpcAuthorizationSuccesses._max")
    @Expose
    private Double rpcAuthorizationSuccessesMax;
    @SerializedName("rpcAuthorizationSuccesses._min")
    @Expose
    private Double rpcAuthorizationSuccessesMin;
    @SerializedName("rpcAuthorizationSuccesses._rate")
    @Expose
    private Integer rpcAuthorizationSuccessesRate;
    @SerializedName("rpcAuthorizationSuccesses._sum")
    @Expose
    private Double rpcAuthorizationSuccessesSum;

    public Double getNumOpenConnections() {
        return numOpenConnections;
    }

    public void setNumOpenConnections(Double numOpenConnections) {
        this.numOpenConnections = numOpenConnections;
    }

    public Double getNumOpenConnectionsAvg() {
        return numOpenConnectionsAvg;
    }

    public void setNumOpenConnectionsAvg(Double numOpenConnectionsAvg) {
        this.numOpenConnectionsAvg = numOpenConnectionsAvg;
    }

    public Double getNumOpenConnectionsMax() {
        return numOpenConnectionsMax;
    }

    public void setNumOpenConnectionsMax(Double numOpenConnectionsMax) {
        this.numOpenConnectionsMax = numOpenConnectionsMax;
    }

    public Double getNumOpenConnectionsMin() {
        return numOpenConnectionsMin;
    }

    public void setNumOpenConnectionsMin(Double numOpenConnectionsMin) {
        this.numOpenConnectionsMin = numOpenConnectionsMin;
    }

    public Integer getNumOpenConnectionsRate() {
        return numOpenConnectionsRate;
    }

    public void setNumOpenConnectionsRate(Integer numOpenConnectionsRate) {
        this.numOpenConnectionsRate = numOpenConnectionsRate;
    }

    public Double getNumOpenConnectionsSum() {
        return numOpenConnectionsSum;
    }

    public void setNumOpenConnectionsSum(Double numOpenConnectionsSum) {
        this.numOpenConnectionsSum = numOpenConnectionsSum;
    }

    public Double getReceivedBytes() {
        return receivedBytes;
    }

    public void setReceivedBytes(Double receivedBytes) {
        this.receivedBytes = receivedBytes;
    }

    public Double getReceivedBytesAvg() {
        return receivedBytesAvg;
    }

    public void setReceivedBytesAvg(Double receivedBytesAvg) {
        this.receivedBytesAvg = receivedBytesAvg;
    }

    public Double getReceivedBytesMax() {
        return receivedBytesMax;
    }

    public void setReceivedBytesMax(Double receivedBytesMax) {
        this.receivedBytesMax = receivedBytesMax;
    }

    public Double getReceivedBytesMin() {
        return receivedBytesMin;
    }

    public void setReceivedBytesMin(Double receivedBytesMin) {
        this.receivedBytesMin = receivedBytesMin;
    }

    public Integer getReceivedBytesRate() {
        return receivedBytesRate;
    }

    public void setReceivedBytesRate(Integer receivedBytesRate) {
        this.receivedBytesRate = receivedBytesRate;
    }

    public Double getReceivedBytesSum() {
        return receivedBytesSum;
    }

    public void setReceivedBytesSum(Double receivedBytesSum) {
        this.receivedBytesSum = receivedBytesSum;
    }

    public Double getRpcProcessingTimeAvgTime() {
        return rpcProcessingTimeAvgTime;
    }

    public void setRpcProcessingTimeAvgTime(Double rpcProcessingTimeAvgTime) {
        this.rpcProcessingTimeAvgTime = rpcProcessingTimeAvgTime;
    }

    public Double getRpcProcessingTimeAvgTimeAvg() {
        return rpcProcessingTimeAvgTimeAvg;
    }

    public void setRpcProcessingTimeAvgTimeAvg(Double rpcProcessingTimeAvgTimeAvg) {
        this.rpcProcessingTimeAvgTimeAvg = rpcProcessingTimeAvgTimeAvg;
    }

    public Double getRpcProcessingTimeAvgTimeMax() {
        return rpcProcessingTimeAvgTimeMax;
    }

    public void setRpcProcessingTimeAvgTimeMax(Double rpcProcessingTimeAvgTimeMax) {
        this.rpcProcessingTimeAvgTimeMax = rpcProcessingTimeAvgTimeMax;
    }

    public Double getRpcProcessingTimeAvgTimeMin() {
        return rpcProcessingTimeAvgTimeMin;
    }

    public void setRpcProcessingTimeAvgTimeMin(Double rpcProcessingTimeAvgTimeMin) {
        this.rpcProcessingTimeAvgTimeMin = rpcProcessingTimeAvgTimeMin;
    }

    public Integer getRpcProcessingTimeAvgTimeRate() {
        return rpcProcessingTimeAvgTimeRate;
    }

    public void setRpcProcessingTimeAvgTimeRate(Integer rpcProcessingTimeAvgTimeRate) {
        this.rpcProcessingTimeAvgTimeRate = rpcProcessingTimeAvgTimeRate;
    }

    public Double getRpcProcessingTimeAvgTimeSum() {
        return rpcProcessingTimeAvgTimeSum;
    }

    public void setRpcProcessingTimeAvgTimeSum(Double rpcProcessingTimeAvgTimeSum) {
        this.rpcProcessingTimeAvgTimeSum = rpcProcessingTimeAvgTimeSum;
    }

    public Double getRpcProcessingTimeNumOps() {
        return rpcProcessingTimeNumOps;
    }

    public void setRpcProcessingTimeNumOps(Double rpcProcessingTimeNumOps) {
        this.rpcProcessingTimeNumOps = rpcProcessingTimeNumOps;
    }

    public Double getRpcProcessingTimeNumOpsAvg() {
        return rpcProcessingTimeNumOpsAvg;
    }

    public void setRpcProcessingTimeNumOpsAvg(Double rpcProcessingTimeNumOpsAvg) {
        this.rpcProcessingTimeNumOpsAvg = rpcProcessingTimeNumOpsAvg;
    }

    public Double getRpcProcessingTimeNumOpsMax() {
        return rpcProcessingTimeNumOpsMax;
    }

    public void setRpcProcessingTimeNumOpsMax(Double rpcProcessingTimeNumOpsMax) {
        this.rpcProcessingTimeNumOpsMax = rpcProcessingTimeNumOpsMax;
    }

    public Double getRpcProcessingTimeNumOpsMin() {
        return rpcProcessingTimeNumOpsMin;
    }

    public void setRpcProcessingTimeNumOpsMin(Double rpcProcessingTimeNumOpsMin) {
        this.rpcProcessingTimeNumOpsMin = rpcProcessingTimeNumOpsMin;
    }

    public Integer getRpcProcessingTimeNumOpsRate() {
        return rpcProcessingTimeNumOpsRate;
    }

    public void setRpcProcessingTimeNumOpsRate(Integer rpcProcessingTimeNumOpsRate) {
        this.rpcProcessingTimeNumOpsRate = rpcProcessingTimeNumOpsRate;
    }

    public Double getRpcProcessingTimeNumOpsSum() {
        return rpcProcessingTimeNumOpsSum;
    }

    public void setRpcProcessingTimeNumOpsSum(Double rpcProcessingTimeNumOpsSum) {
        this.rpcProcessingTimeNumOpsSum = rpcProcessingTimeNumOpsSum;
    }

    public Double getRpcQueueTimeAvgTime() {
        return rpcQueueTimeAvgTime;
    }

    public void setRpcQueueTimeAvgTime(Double rpcQueueTimeAvgTime) {
        this.rpcQueueTimeAvgTime = rpcQueueTimeAvgTime;
    }

    public Double getRpcQueueTimeAvgTimeAvg() {
        return rpcQueueTimeAvgTimeAvg;
    }

    public void setRpcQueueTimeAvgTimeAvg(Double rpcQueueTimeAvgTimeAvg) {
        this.rpcQueueTimeAvgTimeAvg = rpcQueueTimeAvgTimeAvg;
    }

    public Double getRpcQueueTimeAvgTimeMax() {
        return rpcQueueTimeAvgTimeMax;
    }

    public void setRpcQueueTimeAvgTimeMax(Double rpcQueueTimeAvgTimeMax) {
        this.rpcQueueTimeAvgTimeMax = rpcQueueTimeAvgTimeMax;
    }

    public Double getRpcQueueTimeAvgTimeMin() {
        return rpcQueueTimeAvgTimeMin;
    }

    public void setRpcQueueTimeAvgTimeMin(Double rpcQueueTimeAvgTimeMin) {
        this.rpcQueueTimeAvgTimeMin = rpcQueueTimeAvgTimeMin;
    }

    public Integer getRpcQueueTimeAvgTimeRate() {
        return rpcQueueTimeAvgTimeRate;
    }

    public void setRpcQueueTimeAvgTimeRate(Integer rpcQueueTimeAvgTimeRate) {
        this.rpcQueueTimeAvgTimeRate = rpcQueueTimeAvgTimeRate;
    }

    public Double getRpcQueueTimeAvgTimeSum() {
        return rpcQueueTimeAvgTimeSum;
    }

    public void setRpcQueueTimeAvgTimeSum(Double rpcQueueTimeAvgTimeSum) {
        this.rpcQueueTimeAvgTimeSum = rpcQueueTimeAvgTimeSum;
    }

    public Double getRpcQueueTimeNumOps() {
        return rpcQueueTimeNumOps;
    }

    public void setRpcQueueTimeNumOps(Double rpcQueueTimeNumOps) {
        this.rpcQueueTimeNumOps = rpcQueueTimeNumOps;
    }

    public Double getRpcQueueTimeNumOpsAvg() {
        return rpcQueueTimeNumOpsAvg;
    }

    public void setRpcQueueTimeNumOpsAvg(Double rpcQueueTimeNumOpsAvg) {
        this.rpcQueueTimeNumOpsAvg = rpcQueueTimeNumOpsAvg;
    }

    public Double getRpcQueueTimeNumOpsMax() {
        return rpcQueueTimeNumOpsMax;
    }

    public void setRpcQueueTimeNumOpsMax(Double rpcQueueTimeNumOpsMax) {
        this.rpcQueueTimeNumOpsMax = rpcQueueTimeNumOpsMax;
    }

    public Double getRpcQueueTimeNumOpsMin() {
        return rpcQueueTimeNumOpsMin;
    }

    public void setRpcQueueTimeNumOpsMin(Double rpcQueueTimeNumOpsMin) {
        this.rpcQueueTimeNumOpsMin = rpcQueueTimeNumOpsMin;
    }

    public Integer getRpcQueueTimeNumOpsRate() {
        return rpcQueueTimeNumOpsRate;
    }

    public void setRpcQueueTimeNumOpsRate(Integer rpcQueueTimeNumOpsRate) {
        this.rpcQueueTimeNumOpsRate = rpcQueueTimeNumOpsRate;
    }

    public Double getRpcQueueTimeNumOpsSum() {
        return rpcQueueTimeNumOpsSum;
    }

    public void setRpcQueueTimeNumOpsSum(Double rpcQueueTimeNumOpsSum) {
        this.rpcQueueTimeNumOpsSum = rpcQueueTimeNumOpsSum;
    }

    public Double getSentBytes() {
        return sentBytes;
    }

    public void setSentBytes(Double sentBytes) {
        this.sentBytes = sentBytes;
    }

    public Double getSentBytesAvg() {
        return sentBytesAvg;
    }

    public void setSentBytesAvg(Double sentBytesAvg) {
        this.sentBytesAvg = sentBytesAvg;
    }

    public Double getSentBytesMax() {
        return sentBytesMax;
    }

    public void setSentBytesMax(Double sentBytesMax) {
        this.sentBytesMax = sentBytesMax;
    }

    public Double getSentBytesMin() {
        return sentBytesMin;
    }

    public void setSentBytesMin(Double sentBytesMin) {
        this.sentBytesMin = sentBytesMin;
    }

    public Integer getSentBytesRate() {
        return sentBytesRate;
    }

    public void setSentBytesRate(Integer sentBytesRate) {
        this.sentBytesRate = sentBytesRate;
    }

    public Double getSentBytesSum() {
        return sentBytesSum;
    }

    public void setSentBytesSum(Double sentBytesSum) {
        this.sentBytesSum = sentBytesSum;
    }

    public Double getCallQueueLen() {
        return callQueueLen;
    }

    public void setCallQueueLen(Double callQueueLen) {
        this.callQueueLen = callQueueLen;
    }

    public Double getCallQueueLenAvg() {
        return callQueueLenAvg;
    }

    public void setCallQueueLenAvg(Double callQueueLenAvg) {
        this.callQueueLenAvg = callQueueLenAvg;
    }

    public Double getCallQueueLenMax() {
        return callQueueLenMax;
    }

    public void setCallQueueLenMax(Double callQueueLenMax) {
        this.callQueueLenMax = callQueueLenMax;
    }

    public Double getCallQueueLenMin() {
        return callQueueLenMin;
    }

    public void setCallQueueLenMin(Double callQueueLenMin) {
        this.callQueueLenMin = callQueueLenMin;
    }

    public Integer getCallQueueLenRate() {
        return callQueueLenRate;
    }

    public void setCallQueueLenRate(Integer callQueueLenRate) {
        this.callQueueLenRate = callQueueLenRate;
    }

    public Double getCallQueueLenSum() {
        return callQueueLenSum;
    }

    public void setCallQueueLenSum(Double callQueueLenSum) {
        this.callQueueLenSum = callQueueLenSum;
    }

    public Double getRpcAuthenticationFailures() {
        return rpcAuthenticationFailures;
    }

    public void setRpcAuthenticationFailures(Double rpcAuthenticationFailures) {
        this.rpcAuthenticationFailures = rpcAuthenticationFailures;
    }

    public Double getRpcAuthenticationFailuresAvg() {
        return rpcAuthenticationFailuresAvg;
    }

    public void setRpcAuthenticationFailuresAvg(Double rpcAuthenticationFailuresAvg) {
        this.rpcAuthenticationFailuresAvg = rpcAuthenticationFailuresAvg;
    }

    public Double getRpcAuthenticationFailuresMax() {
        return rpcAuthenticationFailuresMax;
    }

    public void setRpcAuthenticationFailuresMax(Double rpcAuthenticationFailuresMax) {
        this.rpcAuthenticationFailuresMax = rpcAuthenticationFailuresMax;
    }

    public Double getRpcAuthenticationFailuresMin() {
        return rpcAuthenticationFailuresMin;
    }

    public void setRpcAuthenticationFailuresMin(Double rpcAuthenticationFailuresMin) {
        this.rpcAuthenticationFailuresMin = rpcAuthenticationFailuresMin;
    }

    public Integer getRpcAuthenticationFailuresRate() {
        return rpcAuthenticationFailuresRate;
    }

    public void setRpcAuthenticationFailuresRate(Integer rpcAuthenticationFailuresRate) {
        this.rpcAuthenticationFailuresRate = rpcAuthenticationFailuresRate;
    }

    public Double getRpcAuthenticationFailuresSum() {
        return rpcAuthenticationFailuresSum;
    }

    public void setRpcAuthenticationFailuresSum(Double rpcAuthenticationFailuresSum) {
        this.rpcAuthenticationFailuresSum = rpcAuthenticationFailuresSum;
    }

    public Double getRpcAuthenticationSuccesses() {
        return rpcAuthenticationSuccesses;
    }

    public void setRpcAuthenticationSuccesses(Double rpcAuthenticationSuccesses) {
        this.rpcAuthenticationSuccesses = rpcAuthenticationSuccesses;
    }

    public Double getRpcAuthenticationSuccessesAvg() {
        return rpcAuthenticationSuccessesAvg;
    }

    public void setRpcAuthenticationSuccessesAvg(Double rpcAuthenticationSuccessesAvg) {
        this.rpcAuthenticationSuccessesAvg = rpcAuthenticationSuccessesAvg;
    }

    public Double getRpcAuthenticationSuccessesMax() {
        return rpcAuthenticationSuccessesMax;
    }

    public void setRpcAuthenticationSuccessesMax(Double rpcAuthenticationSuccessesMax) {
        this.rpcAuthenticationSuccessesMax = rpcAuthenticationSuccessesMax;
    }

    public Double getRpcAuthenticationSuccessesMin() {
        return rpcAuthenticationSuccessesMin;
    }

    public void setRpcAuthenticationSuccessesMin(Double rpcAuthenticationSuccessesMin) {
        this.rpcAuthenticationSuccessesMin = rpcAuthenticationSuccessesMin;
    }

    public Integer getRpcAuthenticationSuccessesRate() {
        return rpcAuthenticationSuccessesRate;
    }

    public void setRpcAuthenticationSuccessesRate(Integer rpcAuthenticationSuccessesRate) {
        this.rpcAuthenticationSuccessesRate = rpcAuthenticationSuccessesRate;
    }

    public Double getRpcAuthenticationSuccessesSum() {
        return rpcAuthenticationSuccessesSum;
    }

    public void setRpcAuthenticationSuccessesSum(Double rpcAuthenticationSuccessesSum) {
        this.rpcAuthenticationSuccessesSum = rpcAuthenticationSuccessesSum;
    }

    public Double getRpcAuthorizationFailures() {
        return rpcAuthorizationFailures;
    }

    public void setRpcAuthorizationFailures(Double rpcAuthorizationFailures) {
        this.rpcAuthorizationFailures = rpcAuthorizationFailures;
    }

    public Double getRpcAuthorizationFailuresAvg() {
        return rpcAuthorizationFailuresAvg;
    }

    public void setRpcAuthorizationFailuresAvg(Double rpcAuthorizationFailuresAvg) {
        this.rpcAuthorizationFailuresAvg = rpcAuthorizationFailuresAvg;
    }

    public Double getRpcAuthorizationFailuresMax() {
        return rpcAuthorizationFailuresMax;
    }

    public void setRpcAuthorizationFailuresMax(Double rpcAuthorizationFailuresMax) {
        this.rpcAuthorizationFailuresMax = rpcAuthorizationFailuresMax;
    }

    public Double getRpcAuthorizationFailuresMin() {
        return rpcAuthorizationFailuresMin;
    }

    public void setRpcAuthorizationFailuresMin(Double rpcAuthorizationFailuresMin) {
        this.rpcAuthorizationFailuresMin = rpcAuthorizationFailuresMin;
    }

    public Integer getRpcAuthorizationFailuresRate() {
        return rpcAuthorizationFailuresRate;
    }

    public void setRpcAuthorizationFailuresRate(Integer rpcAuthorizationFailuresRate) {
        this.rpcAuthorizationFailuresRate = rpcAuthorizationFailuresRate;
    }

    public Double getRpcAuthorizationFailuresSum() {
        return rpcAuthorizationFailuresSum;
    }

    public void setRpcAuthorizationFailuresSum(Double rpcAuthorizationFailuresSum) {
        this.rpcAuthorizationFailuresSum = rpcAuthorizationFailuresSum;
    }

    public Double getRpcAuthorizationSuccesses() {
        return rpcAuthorizationSuccesses;
    }

    public void setRpcAuthorizationSuccesses(Double rpcAuthorizationSuccesses) {
        this.rpcAuthorizationSuccesses = rpcAuthorizationSuccesses;
    }

    public Double getRpcAuthorizationSuccessesAvg() {
        return rpcAuthorizationSuccessesAvg;
    }

    public void setRpcAuthorizationSuccessesAvg(Double rpcAuthorizationSuccessesAvg) {
        this.rpcAuthorizationSuccessesAvg = rpcAuthorizationSuccessesAvg;
    }

    public Double getRpcAuthorizationSuccessesMax() {
        return rpcAuthorizationSuccessesMax;
    }

    public void setRpcAuthorizationSuccessesMax(Double rpcAuthorizationSuccessesMax) {
        this.rpcAuthorizationSuccessesMax = rpcAuthorizationSuccessesMax;
    }

    public Double getRpcAuthorizationSuccessesMin() {
        return rpcAuthorizationSuccessesMin;
    }

    public void setRpcAuthorizationSuccessesMin(Double rpcAuthorizationSuccessesMin) {
        this.rpcAuthorizationSuccessesMin = rpcAuthorizationSuccessesMin;
    }

    public Integer getRpcAuthorizationSuccessesRate() {
        return rpcAuthorizationSuccessesRate;
    }

    public void setRpcAuthorizationSuccessesRate(Integer rpcAuthorizationSuccessesRate) {
        this.rpcAuthorizationSuccessesRate = rpcAuthorizationSuccessesRate;
    }

    public Double getRpcAuthorizationSuccessesSum() {
        return rpcAuthorizationSuccessesSum;
    }

    public void setRpcAuthorizationSuccessesSum(Double rpcAuthorizationSuccessesSum) {
        this.rpcAuthorizationSuccessesSum = rpcAuthorizationSuccessesSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rpc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numOpenConnections");
        sb.append('=');
        sb.append(((this.numOpenConnections == null)?"<null>":this.numOpenConnections));
        sb.append(',');
        sb.append("numOpenConnectionsAvg");
        sb.append('=');
        sb.append(((this.numOpenConnectionsAvg == null)?"<null>":this.numOpenConnectionsAvg));
        sb.append(',');
        sb.append("numOpenConnectionsMax");
        sb.append('=');
        sb.append(((this.numOpenConnectionsMax == null)?"<null>":this.numOpenConnectionsMax));
        sb.append(',');
        sb.append("numOpenConnectionsMin");
        sb.append('=');
        sb.append(((this.numOpenConnectionsMin == null)?"<null>":this.numOpenConnectionsMin));
        sb.append(',');
        sb.append("numOpenConnectionsRate");
        sb.append('=');
        sb.append(((this.numOpenConnectionsRate == null)?"<null>":this.numOpenConnectionsRate));
        sb.append(',');
        sb.append("numOpenConnectionsSum");
        sb.append('=');
        sb.append(((this.numOpenConnectionsSum == null)?"<null>":this.numOpenConnectionsSum));
        sb.append(',');
        sb.append("receivedBytes");
        sb.append('=');
        sb.append(((this.receivedBytes == null)?"<null>":this.receivedBytes));
        sb.append(',');
        sb.append("receivedBytesAvg");
        sb.append('=');
        sb.append(((this.receivedBytesAvg == null)?"<null>":this.receivedBytesAvg));
        sb.append(',');
        sb.append("receivedBytesMax");
        sb.append('=');
        sb.append(((this.receivedBytesMax == null)?"<null>":this.receivedBytesMax));
        sb.append(',');
        sb.append("receivedBytesMin");
        sb.append('=');
        sb.append(((this.receivedBytesMin == null)?"<null>":this.receivedBytesMin));
        sb.append(',');
        sb.append("receivedBytesRate");
        sb.append('=');
        sb.append(((this.receivedBytesRate == null)?"<null>":this.receivedBytesRate));
        sb.append(',');
        sb.append("receivedBytesSum");
        sb.append('=');
        sb.append(((this.receivedBytesSum == null)?"<null>":this.receivedBytesSum));
        sb.append(',');
        sb.append("rpcProcessingTimeAvgTime");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeAvgTime == null)?"<null>":this.rpcProcessingTimeAvgTime));
        sb.append(',');
        sb.append("rpcProcessingTimeAvgTimeAvg");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeAvgTimeAvg == null)?"<null>":this.rpcProcessingTimeAvgTimeAvg));
        sb.append(',');
        sb.append("rpcProcessingTimeAvgTimeMax");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeAvgTimeMax == null)?"<null>":this.rpcProcessingTimeAvgTimeMax));
        sb.append(',');
        sb.append("rpcProcessingTimeAvgTimeMin");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeAvgTimeMin == null)?"<null>":this.rpcProcessingTimeAvgTimeMin));
        sb.append(',');
        sb.append("rpcProcessingTimeAvgTimeRate");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeAvgTimeRate == null)?"<null>":this.rpcProcessingTimeAvgTimeRate));
        sb.append(',');
        sb.append("rpcProcessingTimeAvgTimeSum");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeAvgTimeSum == null)?"<null>":this.rpcProcessingTimeAvgTimeSum));
        sb.append(',');
        sb.append("rpcProcessingTimeNumOps");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeNumOps == null)?"<null>":this.rpcProcessingTimeNumOps));
        sb.append(',');
        sb.append("rpcProcessingTimeNumOpsAvg");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeNumOpsAvg == null)?"<null>":this.rpcProcessingTimeNumOpsAvg));
        sb.append(',');
        sb.append("rpcProcessingTimeNumOpsMax");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeNumOpsMax == null)?"<null>":this.rpcProcessingTimeNumOpsMax));
        sb.append(',');
        sb.append("rpcProcessingTimeNumOpsMin");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeNumOpsMin == null)?"<null>":this.rpcProcessingTimeNumOpsMin));
        sb.append(',');
        sb.append("rpcProcessingTimeNumOpsRate");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeNumOpsRate == null)?"<null>":this.rpcProcessingTimeNumOpsRate));
        sb.append(',');
        sb.append("rpcProcessingTimeNumOpsSum");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeNumOpsSum == null)?"<null>":this.rpcProcessingTimeNumOpsSum));
        sb.append(',');
        sb.append("rpcQueueTimeAvgTime");
        sb.append('=');
        sb.append(((this.rpcQueueTimeAvgTime == null)?"<null>":this.rpcQueueTimeAvgTime));
        sb.append(',');
        sb.append("rpcQueueTimeAvgTimeAvg");
        sb.append('=');
        sb.append(((this.rpcQueueTimeAvgTimeAvg == null)?"<null>":this.rpcQueueTimeAvgTimeAvg));
        sb.append(',');
        sb.append("rpcQueueTimeAvgTimeMax");
        sb.append('=');
        sb.append(((this.rpcQueueTimeAvgTimeMax == null)?"<null>":this.rpcQueueTimeAvgTimeMax));
        sb.append(',');
        sb.append("rpcQueueTimeAvgTimeMin");
        sb.append('=');
        sb.append(((this.rpcQueueTimeAvgTimeMin == null)?"<null>":this.rpcQueueTimeAvgTimeMin));
        sb.append(',');
        sb.append("rpcQueueTimeAvgTimeRate");
        sb.append('=');
        sb.append(((this.rpcQueueTimeAvgTimeRate == null)?"<null>":this.rpcQueueTimeAvgTimeRate));
        sb.append(',');
        sb.append("rpcQueueTimeAvgTimeSum");
        sb.append('=');
        sb.append(((this.rpcQueueTimeAvgTimeSum == null)?"<null>":this.rpcQueueTimeAvgTimeSum));
        sb.append(',');
        sb.append("rpcQueueTimeNumOps");
        sb.append('=');
        sb.append(((this.rpcQueueTimeNumOps == null)?"<null>":this.rpcQueueTimeNumOps));
        sb.append(',');
        sb.append("rpcQueueTimeNumOpsAvg");
        sb.append('=');
        sb.append(((this.rpcQueueTimeNumOpsAvg == null)?"<null>":this.rpcQueueTimeNumOpsAvg));
        sb.append(',');
        sb.append("rpcQueueTimeNumOpsMax");
        sb.append('=');
        sb.append(((this.rpcQueueTimeNumOpsMax == null)?"<null>":this.rpcQueueTimeNumOpsMax));
        sb.append(',');
        sb.append("rpcQueueTimeNumOpsMin");
        sb.append('=');
        sb.append(((this.rpcQueueTimeNumOpsMin == null)?"<null>":this.rpcQueueTimeNumOpsMin));
        sb.append(',');
        sb.append("rpcQueueTimeNumOpsRate");
        sb.append('=');
        sb.append(((this.rpcQueueTimeNumOpsRate == null)?"<null>":this.rpcQueueTimeNumOpsRate));
        sb.append(',');
        sb.append("rpcQueueTimeNumOpsSum");
        sb.append('=');
        sb.append(((this.rpcQueueTimeNumOpsSum == null)?"<null>":this.rpcQueueTimeNumOpsSum));
        sb.append(',');
        sb.append("sentBytes");
        sb.append('=');
        sb.append(((this.sentBytes == null)?"<null>":this.sentBytes));
        sb.append(',');
        sb.append("sentBytesAvg");
        sb.append('=');
        sb.append(((this.sentBytesAvg == null)?"<null>":this.sentBytesAvg));
        sb.append(',');
        sb.append("sentBytesMax");
        sb.append('=');
        sb.append(((this.sentBytesMax == null)?"<null>":this.sentBytesMax));
        sb.append(',');
        sb.append("sentBytesMin");
        sb.append('=');
        sb.append(((this.sentBytesMin == null)?"<null>":this.sentBytesMin));
        sb.append(',');
        sb.append("sentBytesRate");
        sb.append('=');
        sb.append(((this.sentBytesRate == null)?"<null>":this.sentBytesRate));
        sb.append(',');
        sb.append("sentBytesSum");
        sb.append('=');
        sb.append(((this.sentBytesSum == null)?"<null>":this.sentBytesSum));
        sb.append(',');
        sb.append("callQueueLen");
        sb.append('=');
        sb.append(((this.callQueueLen == null)?"<null>":this.callQueueLen));
        sb.append(',');
        sb.append("callQueueLenAvg");
        sb.append('=');
        sb.append(((this.callQueueLenAvg == null)?"<null>":this.callQueueLenAvg));
        sb.append(',');
        sb.append("callQueueLenMax");
        sb.append('=');
        sb.append(((this.callQueueLenMax == null)?"<null>":this.callQueueLenMax));
        sb.append(',');
        sb.append("callQueueLenMin");
        sb.append('=');
        sb.append(((this.callQueueLenMin == null)?"<null>":this.callQueueLenMin));
        sb.append(',');
        sb.append("callQueueLenRate");
        sb.append('=');
        sb.append(((this.callQueueLenRate == null)?"<null>":this.callQueueLenRate));
        sb.append(',');
        sb.append("callQueueLenSum");
        sb.append('=');
        sb.append(((this.callQueueLenSum == null)?"<null>":this.callQueueLenSum));
        sb.append(',');
        sb.append("rpcAuthenticationFailures");
        sb.append('=');
        sb.append(((this.rpcAuthenticationFailures == null)?"<null>":this.rpcAuthenticationFailures));
        sb.append(',');
        sb.append("rpcAuthenticationFailuresAvg");
        sb.append('=');
        sb.append(((this.rpcAuthenticationFailuresAvg == null)?"<null>":this.rpcAuthenticationFailuresAvg));
        sb.append(',');
        sb.append("rpcAuthenticationFailuresMax");
        sb.append('=');
        sb.append(((this.rpcAuthenticationFailuresMax == null)?"<null>":this.rpcAuthenticationFailuresMax));
        sb.append(',');
        sb.append("rpcAuthenticationFailuresMin");
        sb.append('=');
        sb.append(((this.rpcAuthenticationFailuresMin == null)?"<null>":this.rpcAuthenticationFailuresMin));
        sb.append(',');
        sb.append("rpcAuthenticationFailuresRate");
        sb.append('=');
        sb.append(((this.rpcAuthenticationFailuresRate == null)?"<null>":this.rpcAuthenticationFailuresRate));
        sb.append(',');
        sb.append("rpcAuthenticationFailuresSum");
        sb.append('=');
        sb.append(((this.rpcAuthenticationFailuresSum == null)?"<null>":this.rpcAuthenticationFailuresSum));
        sb.append(',');
        sb.append("rpcAuthenticationSuccesses");
        sb.append('=');
        sb.append(((this.rpcAuthenticationSuccesses == null)?"<null>":this.rpcAuthenticationSuccesses));
        sb.append(',');
        sb.append("rpcAuthenticationSuccessesAvg");
        sb.append('=');
        sb.append(((this.rpcAuthenticationSuccessesAvg == null)?"<null>":this.rpcAuthenticationSuccessesAvg));
        sb.append(',');
        sb.append("rpcAuthenticationSuccessesMax");
        sb.append('=');
        sb.append(((this.rpcAuthenticationSuccessesMax == null)?"<null>":this.rpcAuthenticationSuccessesMax));
        sb.append(',');
        sb.append("rpcAuthenticationSuccessesMin");
        sb.append('=');
        sb.append(((this.rpcAuthenticationSuccessesMin == null)?"<null>":this.rpcAuthenticationSuccessesMin));
        sb.append(',');
        sb.append("rpcAuthenticationSuccessesRate");
        sb.append('=');
        sb.append(((this.rpcAuthenticationSuccessesRate == null)?"<null>":this.rpcAuthenticationSuccessesRate));
        sb.append(',');
        sb.append("rpcAuthenticationSuccessesSum");
        sb.append('=');
        sb.append(((this.rpcAuthenticationSuccessesSum == null)?"<null>":this.rpcAuthenticationSuccessesSum));
        sb.append(',');
        sb.append("rpcAuthorizationFailures");
        sb.append('=');
        sb.append(((this.rpcAuthorizationFailures == null)?"<null>":this.rpcAuthorizationFailures));
        sb.append(',');
        sb.append("rpcAuthorizationFailuresAvg");
        sb.append('=');
        sb.append(((this.rpcAuthorizationFailuresAvg == null)?"<null>":this.rpcAuthorizationFailuresAvg));
        sb.append(',');
        sb.append("rpcAuthorizationFailuresMax");
        sb.append('=');
        sb.append(((this.rpcAuthorizationFailuresMax == null)?"<null>":this.rpcAuthorizationFailuresMax));
        sb.append(',');
        sb.append("rpcAuthorizationFailuresMin");
        sb.append('=');
        sb.append(((this.rpcAuthorizationFailuresMin == null)?"<null>":this.rpcAuthorizationFailuresMin));
        sb.append(',');
        sb.append("rpcAuthorizationFailuresRate");
        sb.append('=');
        sb.append(((this.rpcAuthorizationFailuresRate == null)?"<null>":this.rpcAuthorizationFailuresRate));
        sb.append(',');
        sb.append("rpcAuthorizationFailuresSum");
        sb.append('=');
        sb.append(((this.rpcAuthorizationFailuresSum == null)?"<null>":this.rpcAuthorizationFailuresSum));
        sb.append(',');
        sb.append("rpcAuthorizationSuccesses");
        sb.append('=');
        sb.append(((this.rpcAuthorizationSuccesses == null)?"<null>":this.rpcAuthorizationSuccesses));
        sb.append(',');
        sb.append("rpcAuthorizationSuccessesAvg");
        sb.append('=');
        sb.append(((this.rpcAuthorizationSuccessesAvg == null)?"<null>":this.rpcAuthorizationSuccessesAvg));
        sb.append(',');
        sb.append("rpcAuthorizationSuccessesMax");
        sb.append('=');
        sb.append(((this.rpcAuthorizationSuccessesMax == null)?"<null>":this.rpcAuthorizationSuccessesMax));
        sb.append(',');
        sb.append("rpcAuthorizationSuccessesMin");
        sb.append('=');
        sb.append(((this.rpcAuthorizationSuccessesMin == null)?"<null>":this.rpcAuthorizationSuccessesMin));
        sb.append(',');
        sb.append("rpcAuthorizationSuccessesRate");
        sb.append('=');
        sb.append(((this.rpcAuthorizationSuccessesRate == null)?"<null>":this.rpcAuthorizationSuccessesRate));
        sb.append(',');
        sb.append("rpcAuthorizationSuccessesSum");
        sb.append('=');
        sb.append(((this.rpcAuthorizationSuccessesSum == null)?"<null>":this.rpcAuthorizationSuccessesSum));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.receivedBytes == null)? 0 :this.receivedBytes.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeAvgTimeSum == null)? 0 :this.rpcProcessingTimeAvgTimeSum.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationFailures == null)? 0 :this.rpcAuthenticationFailures.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationSuccessesAvg == null)? 0 :this.rpcAuthorizationSuccessesAvg.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationSuccessesMin == null)? 0 :this.rpcAuthorizationSuccessesMin.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationFailuresRate == null)? 0 :this.rpcAuthenticationFailuresRate.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeAvgTimeRate == null)? 0 :this.rpcQueueTimeAvgTimeRate.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeAvgTimeAvg == null)? 0 :this.rpcProcessingTimeAvgTimeAvg.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeAvgTimeMin == null)? 0 :this.rpcProcessingTimeAvgTimeMin.hashCode()));
        result = ((result* 31)+((this.callQueueLenAvg == null)? 0 :this.callQueueLenAvg.hashCode()));
        result = ((result* 31)+((this.callQueueLenMin == null)? 0 :this.callQueueLenMin.hashCode()));
        result = ((result* 31)+((this.sentBytesRate == null)? 0 :this.sentBytesRate.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationFailuresAvg == null)? 0 :this.rpcAuthorizationFailuresAvg.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationFailuresMin == null)? 0 :this.rpcAuthorizationFailuresMin.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationFailuresSum == null)? 0 :this.rpcAuthorizationFailuresSum.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationSuccessesRate == null)? 0 :this.rpcAuthenticationSuccessesRate.hashCode()));
        result = ((result* 31)+((this.callQueueLenSum == null)? 0 :this.callQueueLenSum.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeNumOpsSum == null)? 0 :this.rpcProcessingTimeNumOpsSum.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationSuccessesSum == null)? 0 :this.rpcAuthorizationSuccessesSum.hashCode()));
        result = ((result* 31)+((this.sentBytesMax == null)? 0 :this.sentBytesMax.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationSuccesses == null)? 0 :this.rpcAuthenticationSuccesses.hashCode()));
        result = ((result* 31)+((this.numOpenConnections == null)? 0 :this.numOpenConnections.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationSuccessesRate == null)? 0 :this.rpcAuthorizationSuccessesRate.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeNumOpsAvg == null)? 0 :this.rpcProcessingTimeNumOpsAvg.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeNumOpsMin == null)? 0 :this.rpcProcessingTimeNumOpsMin.hashCode()));
        result = ((result* 31)+((this.numOpenConnectionsMax == null)? 0 :this.numOpenConnectionsMax.hashCode()));
        result = ((result* 31)+((this.sentBytesAvg == null)? 0 :this.sentBytesAvg.hashCode()));
        result = ((result* 31)+((this.sentBytesMin == null)? 0 :this.sentBytesMin.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationSuccessesSum == null)? 0 :this.rpcAuthenticationSuccessesSum.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationSuccessesMax == null)? 0 :this.rpcAuthorizationSuccessesMax.hashCode()));
        result = ((result* 31)+((this.numOpenConnectionsSum == null)? 0 :this.numOpenConnectionsSum.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeNumOpsRate == null)? 0 :this.rpcQueueTimeNumOpsRate.hashCode()));
        result = ((result* 31)+((this.sentBytesSum == null)? 0 :this.sentBytesSum.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationSuccessesAvg == null)? 0 :this.rpcAuthenticationSuccessesAvg.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationSuccessesMin == null)? 0 :this.rpcAuthenticationSuccessesMin.hashCode()));
        result = ((result* 31)+((this.numOpenConnectionsAvg == null)? 0 :this.numOpenConnectionsAvg.hashCode()));
        result = ((result* 31)+((this.numOpenConnectionsMin == null)? 0 :this.numOpenConnectionsMin.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeNumOpsMax == null)? 0 :this.rpcProcessingTimeNumOpsMax.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeAvgTimeRate == null)? 0 :this.rpcProcessingTimeAvgTimeRate.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeNumOpsMax == null)? 0 :this.rpcQueueTimeNumOpsMax.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationFailuresMax == null)? 0 :this.rpcAuthenticationFailuresMax.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationFailuresRate == null)? 0 :this.rpcAuthorizationFailuresRate.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeNumOpsAvg == null)? 0 :this.rpcQueueTimeNumOpsAvg.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeNumOpsMin == null)? 0 :this.rpcQueueTimeNumOpsMin.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationFailuresAvg == null)? 0 :this.rpcAuthenticationFailuresAvg.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationFailuresMin == null)? 0 :this.rpcAuthenticationFailuresMin.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationSuccessesMax == null)? 0 :this.rpcAuthenticationSuccessesMax.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeNumOpsSum == null)? 0 :this.rpcQueueTimeNumOpsSum.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationSuccesses == null)? 0 :this.rpcAuthorizationSuccesses.hashCode()));
        result = ((result* 31)+((this.receivedBytesRate == null)? 0 :this.receivedBytesRate.hashCode()));
        result = ((result* 31)+((this.rpcAuthenticationFailuresSum == null)? 0 :this.rpcAuthenticationFailuresSum.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeNumOpsRate == null)? 0 :this.rpcProcessingTimeNumOpsRate.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeAvgTime == null)? 0 :this.rpcProcessingTimeAvgTime.hashCode()));
        result = ((result* 31)+((this.numOpenConnectionsRate == null)? 0 :this.numOpenConnectionsRate.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationFailures == null)? 0 :this.rpcAuthorizationFailures.hashCode()));
        result = ((result* 31)+((this.callQueueLenRate == null)? 0 :this.callQueueLenRate.hashCode()));
        result = ((result* 31)+((this.callQueueLen == null)? 0 :this.callQueueLen.hashCode()));
        result = ((result* 31)+((this.receivedBytesAvg == null)? 0 :this.receivedBytesAvg.hashCode()));
        result = ((result* 31)+((this.receivedBytesMin == null)? 0 :this.receivedBytesMin.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeNumOps == null)? 0 :this.rpcProcessingTimeNumOps.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeAvgTimeMax == null)? 0 :this.rpcQueueTimeAvgTimeMax.hashCode()));
        result = ((result* 31)+((this.receivedBytesSum == null)? 0 :this.receivedBytesSum.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeNumOps == null)? 0 :this.rpcQueueTimeNumOps.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeAvgTimeSum == null)? 0 :this.rpcQueueTimeAvgTimeSum.hashCode()));
        result = ((result* 31)+((this.receivedBytesMax == null)? 0 :this.receivedBytesMax.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeAvgTime == null)? 0 :this.rpcQueueTimeAvgTime.hashCode()));
        result = ((result* 31)+((this.callQueueLenMax == null)? 0 :this.callQueueLenMax.hashCode()));
        result = ((result* 31)+((this.rpcAuthorizationFailuresMax == null)? 0 :this.rpcAuthorizationFailuresMax.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeAvgTimeAvg == null)? 0 :this.rpcQueueTimeAvgTimeAvg.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeAvgTimeMin == null)? 0 :this.rpcQueueTimeAvgTimeMin.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeAvgTimeMax == null)? 0 :this.rpcProcessingTimeAvgTimeMax.hashCode()));
        result = ((result* 31)+((this.sentBytes == null)? 0 :this.sentBytes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rpc) == false) {
            return false;
        }
        Rpc rhs = ((Rpc) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.receivedBytes == rhs.receivedBytes)||((this.receivedBytes!= null)&&this.receivedBytes.equals(rhs.receivedBytes)))&&((this.rpcProcessingTimeAvgTimeSum == rhs.rpcProcessingTimeAvgTimeSum)||((this.rpcProcessingTimeAvgTimeSum!= null)&&this.rpcProcessingTimeAvgTimeSum.equals(rhs.rpcProcessingTimeAvgTimeSum))))&&((this.rpcAuthenticationFailures == rhs.rpcAuthenticationFailures)||((this.rpcAuthenticationFailures!= null)&&this.rpcAuthenticationFailures.equals(rhs.rpcAuthenticationFailures))))&&((this.rpcAuthorizationSuccessesAvg == rhs.rpcAuthorizationSuccessesAvg)||((this.rpcAuthorizationSuccessesAvg!= null)&&this.rpcAuthorizationSuccessesAvg.equals(rhs.rpcAuthorizationSuccessesAvg))))&&((this.rpcAuthorizationSuccessesMin == rhs.rpcAuthorizationSuccessesMin)||((this.rpcAuthorizationSuccessesMin!= null)&&this.rpcAuthorizationSuccessesMin.equals(rhs.rpcAuthorizationSuccessesMin))))&&((this.rpcAuthenticationFailuresRate == rhs.rpcAuthenticationFailuresRate)||((this.rpcAuthenticationFailuresRate!= null)&&this.rpcAuthenticationFailuresRate.equals(rhs.rpcAuthenticationFailuresRate))))&&((this.rpcQueueTimeAvgTimeRate == rhs.rpcQueueTimeAvgTimeRate)||((this.rpcQueueTimeAvgTimeRate!= null)&&this.rpcQueueTimeAvgTimeRate.equals(rhs.rpcQueueTimeAvgTimeRate))))&&((this.rpcProcessingTimeAvgTimeAvg == rhs.rpcProcessingTimeAvgTimeAvg)||((this.rpcProcessingTimeAvgTimeAvg!= null)&&this.rpcProcessingTimeAvgTimeAvg.equals(rhs.rpcProcessingTimeAvgTimeAvg))))&&((this.rpcProcessingTimeAvgTimeMin == rhs.rpcProcessingTimeAvgTimeMin)||((this.rpcProcessingTimeAvgTimeMin!= null)&&this.rpcProcessingTimeAvgTimeMin.equals(rhs.rpcProcessingTimeAvgTimeMin))))&&((this.callQueueLenAvg == rhs.callQueueLenAvg)||((this.callQueueLenAvg!= null)&&this.callQueueLenAvg.equals(rhs.callQueueLenAvg))))&&((this.callQueueLenMin == rhs.callQueueLenMin)||((this.callQueueLenMin!= null)&&this.callQueueLenMin.equals(rhs.callQueueLenMin))))&&((this.sentBytesRate == rhs.sentBytesRate)||((this.sentBytesRate!= null)&&this.sentBytesRate.equals(rhs.sentBytesRate))))&&((this.rpcAuthorizationFailuresAvg == rhs.rpcAuthorizationFailuresAvg)||((this.rpcAuthorizationFailuresAvg!= null)&&this.rpcAuthorizationFailuresAvg.equals(rhs.rpcAuthorizationFailuresAvg))))&&((this.rpcAuthorizationFailuresMin == rhs.rpcAuthorizationFailuresMin)||((this.rpcAuthorizationFailuresMin!= null)&&this.rpcAuthorizationFailuresMin.equals(rhs.rpcAuthorizationFailuresMin))))&&((this.rpcAuthorizationFailuresSum == rhs.rpcAuthorizationFailuresSum)||((this.rpcAuthorizationFailuresSum!= null)&&this.rpcAuthorizationFailuresSum.equals(rhs.rpcAuthorizationFailuresSum))))&&((this.rpcAuthenticationSuccessesRate == rhs.rpcAuthenticationSuccessesRate)||((this.rpcAuthenticationSuccessesRate!= null)&&this.rpcAuthenticationSuccessesRate.equals(rhs.rpcAuthenticationSuccessesRate))))&&((this.callQueueLenSum == rhs.callQueueLenSum)||((this.callQueueLenSum!= null)&&this.callQueueLenSum.equals(rhs.callQueueLenSum))))&&((this.rpcProcessingTimeNumOpsSum == rhs.rpcProcessingTimeNumOpsSum)||((this.rpcProcessingTimeNumOpsSum!= null)&&this.rpcProcessingTimeNumOpsSum.equals(rhs.rpcProcessingTimeNumOpsSum))))&&((this.rpcAuthorizationSuccessesSum == rhs.rpcAuthorizationSuccessesSum)||((this.rpcAuthorizationSuccessesSum!= null)&&this.rpcAuthorizationSuccessesSum.equals(rhs.rpcAuthorizationSuccessesSum))))&&((this.sentBytesMax == rhs.sentBytesMax)||((this.sentBytesMax!= null)&&this.sentBytesMax.equals(rhs.sentBytesMax))))&&((this.rpcAuthenticationSuccesses == rhs.rpcAuthenticationSuccesses)||((this.rpcAuthenticationSuccesses!= null)&&this.rpcAuthenticationSuccesses.equals(rhs.rpcAuthenticationSuccesses))))&&((this.numOpenConnections == rhs.numOpenConnections)||((this.numOpenConnections!= null)&&this.numOpenConnections.equals(rhs.numOpenConnections))))&&((this.rpcAuthorizationSuccessesRate == rhs.rpcAuthorizationSuccessesRate)||((this.rpcAuthorizationSuccessesRate!= null)&&this.rpcAuthorizationSuccessesRate.equals(rhs.rpcAuthorizationSuccessesRate))))&&((this.rpcProcessingTimeNumOpsAvg == rhs.rpcProcessingTimeNumOpsAvg)||((this.rpcProcessingTimeNumOpsAvg!= null)&&this.rpcProcessingTimeNumOpsAvg.equals(rhs.rpcProcessingTimeNumOpsAvg))))&&((this.rpcProcessingTimeNumOpsMin == rhs.rpcProcessingTimeNumOpsMin)||((this.rpcProcessingTimeNumOpsMin!= null)&&this.rpcProcessingTimeNumOpsMin.equals(rhs.rpcProcessingTimeNumOpsMin))))&&((this.numOpenConnectionsMax == rhs.numOpenConnectionsMax)||((this.numOpenConnectionsMax!= null)&&this.numOpenConnectionsMax.equals(rhs.numOpenConnectionsMax))))&&((this.sentBytesAvg == rhs.sentBytesAvg)||((this.sentBytesAvg!= null)&&this.sentBytesAvg.equals(rhs.sentBytesAvg))))&&((this.sentBytesMin == rhs.sentBytesMin)||((this.sentBytesMin!= null)&&this.sentBytesMin.equals(rhs.sentBytesMin))))&&((this.rpcAuthenticationSuccessesSum == rhs.rpcAuthenticationSuccessesSum)||((this.rpcAuthenticationSuccessesSum!= null)&&this.rpcAuthenticationSuccessesSum.equals(rhs.rpcAuthenticationSuccessesSum))))&&((this.rpcAuthorizationSuccessesMax == rhs.rpcAuthorizationSuccessesMax)||((this.rpcAuthorizationSuccessesMax!= null)&&this.rpcAuthorizationSuccessesMax.equals(rhs.rpcAuthorizationSuccessesMax))))&&((this.numOpenConnectionsSum == rhs.numOpenConnectionsSum)||((this.numOpenConnectionsSum!= null)&&this.numOpenConnectionsSum.equals(rhs.numOpenConnectionsSum))))&&((this.rpcQueueTimeNumOpsRate == rhs.rpcQueueTimeNumOpsRate)||((this.rpcQueueTimeNumOpsRate!= null)&&this.rpcQueueTimeNumOpsRate.equals(rhs.rpcQueueTimeNumOpsRate))))&&((this.sentBytesSum == rhs.sentBytesSum)||((this.sentBytesSum!= null)&&this.sentBytesSum.equals(rhs.sentBytesSum))))&&((this.rpcAuthenticationSuccessesAvg == rhs.rpcAuthenticationSuccessesAvg)||((this.rpcAuthenticationSuccessesAvg!= null)&&this.rpcAuthenticationSuccessesAvg.equals(rhs.rpcAuthenticationSuccessesAvg))))&&((this.rpcAuthenticationSuccessesMin == rhs.rpcAuthenticationSuccessesMin)||((this.rpcAuthenticationSuccessesMin!= null)&&this.rpcAuthenticationSuccessesMin.equals(rhs.rpcAuthenticationSuccessesMin))))&&((this.numOpenConnectionsAvg == rhs.numOpenConnectionsAvg)||((this.numOpenConnectionsAvg!= null)&&this.numOpenConnectionsAvg.equals(rhs.numOpenConnectionsAvg))))&&((this.numOpenConnectionsMin == rhs.numOpenConnectionsMin)||((this.numOpenConnectionsMin!= null)&&this.numOpenConnectionsMin.equals(rhs.numOpenConnectionsMin))))&&((this.rpcProcessingTimeNumOpsMax == rhs.rpcProcessingTimeNumOpsMax)||((this.rpcProcessingTimeNumOpsMax!= null)&&this.rpcProcessingTimeNumOpsMax.equals(rhs.rpcProcessingTimeNumOpsMax))))&&((this.rpcProcessingTimeAvgTimeRate == rhs.rpcProcessingTimeAvgTimeRate)||((this.rpcProcessingTimeAvgTimeRate!= null)&&this.rpcProcessingTimeAvgTimeRate.equals(rhs.rpcProcessingTimeAvgTimeRate))))&&((this.rpcQueueTimeNumOpsMax == rhs.rpcQueueTimeNumOpsMax)||((this.rpcQueueTimeNumOpsMax!= null)&&this.rpcQueueTimeNumOpsMax.equals(rhs.rpcQueueTimeNumOpsMax))))&&((this.rpcAuthenticationFailuresMax == rhs.rpcAuthenticationFailuresMax)||((this.rpcAuthenticationFailuresMax!= null)&&this.rpcAuthenticationFailuresMax.equals(rhs.rpcAuthenticationFailuresMax))))&&((this.rpcAuthorizationFailuresRate == rhs.rpcAuthorizationFailuresRate)||((this.rpcAuthorizationFailuresRate!= null)&&this.rpcAuthorizationFailuresRate.equals(rhs.rpcAuthorizationFailuresRate))))&&((this.rpcQueueTimeNumOpsAvg == rhs.rpcQueueTimeNumOpsAvg)||((this.rpcQueueTimeNumOpsAvg!= null)&&this.rpcQueueTimeNumOpsAvg.equals(rhs.rpcQueueTimeNumOpsAvg))))&&((this.rpcQueueTimeNumOpsMin == rhs.rpcQueueTimeNumOpsMin)||((this.rpcQueueTimeNumOpsMin!= null)&&this.rpcQueueTimeNumOpsMin.equals(rhs.rpcQueueTimeNumOpsMin))))&&((this.rpcAuthenticationFailuresAvg == rhs.rpcAuthenticationFailuresAvg)||((this.rpcAuthenticationFailuresAvg!= null)&&this.rpcAuthenticationFailuresAvg.equals(rhs.rpcAuthenticationFailuresAvg))))&&((this.rpcAuthenticationFailuresMin == rhs.rpcAuthenticationFailuresMin)||((this.rpcAuthenticationFailuresMin!= null)&&this.rpcAuthenticationFailuresMin.equals(rhs.rpcAuthenticationFailuresMin))))&&((this.rpcAuthenticationSuccessesMax == rhs.rpcAuthenticationSuccessesMax)||((this.rpcAuthenticationSuccessesMax!= null)&&this.rpcAuthenticationSuccessesMax.equals(rhs.rpcAuthenticationSuccessesMax))))&&((this.rpcQueueTimeNumOpsSum == rhs.rpcQueueTimeNumOpsSum)||((this.rpcQueueTimeNumOpsSum!= null)&&this.rpcQueueTimeNumOpsSum.equals(rhs.rpcQueueTimeNumOpsSum))))&&((this.rpcAuthorizationSuccesses == rhs.rpcAuthorizationSuccesses)||((this.rpcAuthorizationSuccesses!= null)&&this.rpcAuthorizationSuccesses.equals(rhs.rpcAuthorizationSuccesses))))&&((this.receivedBytesRate == rhs.receivedBytesRate)||((this.receivedBytesRate!= null)&&this.receivedBytesRate.equals(rhs.receivedBytesRate))))&&((this.rpcAuthenticationFailuresSum == rhs.rpcAuthenticationFailuresSum)||((this.rpcAuthenticationFailuresSum!= null)&&this.rpcAuthenticationFailuresSum.equals(rhs.rpcAuthenticationFailuresSum))))&&((this.rpcProcessingTimeNumOpsRate == rhs.rpcProcessingTimeNumOpsRate)||((this.rpcProcessingTimeNumOpsRate!= null)&&this.rpcProcessingTimeNumOpsRate.equals(rhs.rpcProcessingTimeNumOpsRate))))&&((this.rpcProcessingTimeAvgTime == rhs.rpcProcessingTimeAvgTime)||((this.rpcProcessingTimeAvgTime!= null)&&this.rpcProcessingTimeAvgTime.equals(rhs.rpcProcessingTimeAvgTime))))&&((this.numOpenConnectionsRate == rhs.numOpenConnectionsRate)||((this.numOpenConnectionsRate!= null)&&this.numOpenConnectionsRate.equals(rhs.numOpenConnectionsRate))))&&((this.rpcAuthorizationFailures == rhs.rpcAuthorizationFailures)||((this.rpcAuthorizationFailures!= null)&&this.rpcAuthorizationFailures.equals(rhs.rpcAuthorizationFailures))))&&((this.callQueueLenRate == rhs.callQueueLenRate)||((this.callQueueLenRate!= null)&&this.callQueueLenRate.equals(rhs.callQueueLenRate))))&&((this.callQueueLen == rhs.callQueueLen)||((this.callQueueLen!= null)&&this.callQueueLen.equals(rhs.callQueueLen))))&&((this.receivedBytesAvg == rhs.receivedBytesAvg)||((this.receivedBytesAvg!= null)&&this.receivedBytesAvg.equals(rhs.receivedBytesAvg))))&&((this.receivedBytesMin == rhs.receivedBytesMin)||((this.receivedBytesMin!= null)&&this.receivedBytesMin.equals(rhs.receivedBytesMin))))&&((this.rpcProcessingTimeNumOps == rhs.rpcProcessingTimeNumOps)||((this.rpcProcessingTimeNumOps!= null)&&this.rpcProcessingTimeNumOps.equals(rhs.rpcProcessingTimeNumOps))))&&((this.rpcQueueTimeAvgTimeMax == rhs.rpcQueueTimeAvgTimeMax)||((this.rpcQueueTimeAvgTimeMax!= null)&&this.rpcQueueTimeAvgTimeMax.equals(rhs.rpcQueueTimeAvgTimeMax))))&&((this.receivedBytesSum == rhs.receivedBytesSum)||((this.receivedBytesSum!= null)&&this.receivedBytesSum.equals(rhs.receivedBytesSum))))&&((this.rpcQueueTimeNumOps == rhs.rpcQueueTimeNumOps)||((this.rpcQueueTimeNumOps!= null)&&this.rpcQueueTimeNumOps.equals(rhs.rpcQueueTimeNumOps))))&&((this.rpcQueueTimeAvgTimeSum == rhs.rpcQueueTimeAvgTimeSum)||((this.rpcQueueTimeAvgTimeSum!= null)&&this.rpcQueueTimeAvgTimeSum.equals(rhs.rpcQueueTimeAvgTimeSum))))&&((this.receivedBytesMax == rhs.receivedBytesMax)||((this.receivedBytesMax!= null)&&this.receivedBytesMax.equals(rhs.receivedBytesMax))))&&((this.rpcQueueTimeAvgTime == rhs.rpcQueueTimeAvgTime)||((this.rpcQueueTimeAvgTime!= null)&&this.rpcQueueTimeAvgTime.equals(rhs.rpcQueueTimeAvgTime))))&&((this.callQueueLenMax == rhs.callQueueLenMax)||((this.callQueueLenMax!= null)&&this.callQueueLenMax.equals(rhs.callQueueLenMax))))&&((this.rpcAuthorizationFailuresMax == rhs.rpcAuthorizationFailuresMax)||((this.rpcAuthorizationFailuresMax!= null)&&this.rpcAuthorizationFailuresMax.equals(rhs.rpcAuthorizationFailuresMax))))&&((this.rpcQueueTimeAvgTimeAvg == rhs.rpcQueueTimeAvgTimeAvg)||((this.rpcQueueTimeAvgTimeAvg!= null)&&this.rpcQueueTimeAvgTimeAvg.equals(rhs.rpcQueueTimeAvgTimeAvg))))&&((this.rpcQueueTimeAvgTimeMin == rhs.rpcQueueTimeAvgTimeMin)||((this.rpcQueueTimeAvgTimeMin!= null)&&this.rpcQueueTimeAvgTimeMin.equals(rhs.rpcQueueTimeAvgTimeMin))))&&((this.rpcProcessingTimeAvgTimeMax == rhs.rpcProcessingTimeAvgTimeMax)||((this.rpcProcessingTimeAvgTimeMax!= null)&&this.rpcProcessingTimeAvgTimeMax.equals(rhs.rpcProcessingTimeAvgTimeMax))))&&((this.sentBytes == rhs.sentBytes)||((this.sentBytes!= null)&&this.sentBytes.equals(rhs.sentBytes))));
    }

}
