
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FsDatasetImpl {

    @SerializedName("CacheCapacity")
    @Expose
    private Double cacheCapacity;
    @SerializedName("CacheCapacity._avg")
    @Expose
    private Double cacheCapacityAvg;
    @SerializedName("CacheCapacity._max")
    @Expose
    private Double cacheCapacityMax;
    @SerializedName("CacheCapacity._min")
    @Expose
    private Double cacheCapacityMin;
    @SerializedName("CacheCapacity._rate")
    @Expose
    private Integer cacheCapacityRate;
    @SerializedName("CacheCapacity._sum")
    @Expose
    private Double cacheCapacitySum;
    @SerializedName("CacheUsed")
    @Expose
    private Double cacheUsed;
    @SerializedName("CacheUsed._avg")
    @Expose
    private Double cacheUsedAvg;
    @SerializedName("CacheUsed._max")
    @Expose
    private Double cacheUsedMax;
    @SerializedName("CacheUsed._min")
    @Expose
    private Double cacheUsedMin;
    @SerializedName("CacheUsed._rate")
    @Expose
    private Integer cacheUsedRate;
    @SerializedName("CacheUsed._sum")
    @Expose
    private Double cacheUsedSum;
    @SerializedName("EstimatedCapacityLostTotal")
    @Expose
    private Double estimatedCapacityLostTotal;
    @SerializedName("EstimatedCapacityLostTotal._avg")
    @Expose
    private Double estimatedCapacityLostTotalAvg;
    @SerializedName("EstimatedCapacityLostTotal._max")
    @Expose
    private Double estimatedCapacityLostTotalMax;
    @SerializedName("EstimatedCapacityLostTotal._min")
    @Expose
    private Double estimatedCapacityLostTotalMin;
    @SerializedName("EstimatedCapacityLostTotal._rate")
    @Expose
    private Integer estimatedCapacityLostTotalRate;
    @SerializedName("EstimatedCapacityLostTotal._sum")
    @Expose
    private Double estimatedCapacityLostTotalSum;
    @SerializedName("LastVolumeFailureDate")
    @Expose
    private Double lastVolumeFailureDate;
    @SerializedName("LastVolumeFailureDate._avg")
    @Expose
    private Double lastVolumeFailureDateAvg;
    @SerializedName("LastVolumeFailureDate._max")
    @Expose
    private Double lastVolumeFailureDateMax;
    @SerializedName("LastVolumeFailureDate._min")
    @Expose
    private Double lastVolumeFailureDateMin;
    @SerializedName("LastVolumeFailureDate._rate")
    @Expose
    private Integer lastVolumeFailureDateRate;
    @SerializedName("LastVolumeFailureDate._sum")
    @Expose
    private Double lastVolumeFailureDateSum;
    @SerializedName("NumBlocksCached")
    @Expose
    private Double numBlocksCached;
    @SerializedName("NumBlocksCached._avg")
    @Expose
    private Double numBlocksCachedAvg;
    @SerializedName("NumBlocksCached._max")
    @Expose
    private Double numBlocksCachedMax;
    @SerializedName("NumBlocksCached._min")
    @Expose
    private Double numBlocksCachedMin;
    @SerializedName("NumBlocksCached._rate")
    @Expose
    private Integer numBlocksCachedRate;
    @SerializedName("NumBlocksCached._sum")
    @Expose
    private Double numBlocksCachedSum;
    @SerializedName("NumBlocksFailedToCache")
    @Expose
    private Double numBlocksFailedToCache;
    @SerializedName("NumBlocksFailedToCache._avg")
    @Expose
    private Double numBlocksFailedToCacheAvg;
    @SerializedName("NumBlocksFailedToCache._max")
    @Expose
    private Double numBlocksFailedToCacheMax;
    @SerializedName("NumBlocksFailedToCache._min")
    @Expose
    private Double numBlocksFailedToCacheMin;
    @SerializedName("NumBlocksFailedToCache._rate")
    @Expose
    private Integer numBlocksFailedToCacheRate;
    @SerializedName("NumBlocksFailedToCache._sum")
    @Expose
    private Double numBlocksFailedToCacheSum;
    @SerializedName("NumBlocksFailedToUnCache")
    @Expose
    private Double numBlocksFailedToUnCache;
    @SerializedName("NumBlocksFailedToUnCache._avg")
    @Expose
    private Double numBlocksFailedToUnCacheAvg;
    @SerializedName("NumBlocksFailedToUnCache._max")
    @Expose
    private Double numBlocksFailedToUnCacheMax;
    @SerializedName("NumBlocksFailedToUnCache._min")
    @Expose
    private Double numBlocksFailedToUnCacheMin;
    @SerializedName("NumBlocksFailedToUnCache._rate")
    @Expose
    private Integer numBlocksFailedToUnCacheRate;
    @SerializedName("NumBlocksFailedToUnCache._sum")
    @Expose
    private Double numBlocksFailedToUnCacheSum;
    @SerializedName("Remaining")
    @Expose
    private Double remaining;
    @SerializedName("Remaining._avg")
    @Expose
    private Double remainingAvg;
    @SerializedName("Remaining._max")
    @Expose
    private Double remainingMax;
    @SerializedName("Remaining._min")
    @Expose
    private Double remainingMin;
    @SerializedName("Remaining._rate")
    @Expose
    private Integer remainingRate;
    @SerializedName("Remaining._sum")
    @Expose
    private Double remainingSum;

    public Double getCacheCapacity() {
        return cacheCapacity;
    }

    public void setCacheCapacity(Double cacheCapacity) {
        this.cacheCapacity = cacheCapacity;
    }

    public Double getCacheCapacityAvg() {
        return cacheCapacityAvg;
    }

    public void setCacheCapacityAvg(Double cacheCapacityAvg) {
        this.cacheCapacityAvg = cacheCapacityAvg;
    }

    public Double getCacheCapacityMax() {
        return cacheCapacityMax;
    }

    public void setCacheCapacityMax(Double cacheCapacityMax) {
        this.cacheCapacityMax = cacheCapacityMax;
    }

    public Double getCacheCapacityMin() {
        return cacheCapacityMin;
    }

    public void setCacheCapacityMin(Double cacheCapacityMin) {
        this.cacheCapacityMin = cacheCapacityMin;
    }

    public Integer getCacheCapacityRate() {
        return cacheCapacityRate;
    }

    public void setCacheCapacityRate(Integer cacheCapacityRate) {
        this.cacheCapacityRate = cacheCapacityRate;
    }

    public Double getCacheCapacitySum() {
        return cacheCapacitySum;
    }

    public void setCacheCapacitySum(Double cacheCapacitySum) {
        this.cacheCapacitySum = cacheCapacitySum;
    }

    public Double getCacheUsed() {
        return cacheUsed;
    }

    public void setCacheUsed(Double cacheUsed) {
        this.cacheUsed = cacheUsed;
    }

    public Double getCacheUsedAvg() {
        return cacheUsedAvg;
    }

    public void setCacheUsedAvg(Double cacheUsedAvg) {
        this.cacheUsedAvg = cacheUsedAvg;
    }

    public Double getCacheUsedMax() {
        return cacheUsedMax;
    }

    public void setCacheUsedMax(Double cacheUsedMax) {
        this.cacheUsedMax = cacheUsedMax;
    }

    public Double getCacheUsedMin() {
        return cacheUsedMin;
    }

    public void setCacheUsedMin(Double cacheUsedMin) {
        this.cacheUsedMin = cacheUsedMin;
    }

    public Integer getCacheUsedRate() {
        return cacheUsedRate;
    }

    public void setCacheUsedRate(Integer cacheUsedRate) {
        this.cacheUsedRate = cacheUsedRate;
    }

    public Double getCacheUsedSum() {
        return cacheUsedSum;
    }

    public void setCacheUsedSum(Double cacheUsedSum) {
        this.cacheUsedSum = cacheUsedSum;
    }

    public Double getEstimatedCapacityLostTotal() {
        return estimatedCapacityLostTotal;
    }

    public void setEstimatedCapacityLostTotal(Double estimatedCapacityLostTotal) {
        this.estimatedCapacityLostTotal = estimatedCapacityLostTotal;
    }

    public Double getEstimatedCapacityLostTotalAvg() {
        return estimatedCapacityLostTotalAvg;
    }

    public void setEstimatedCapacityLostTotalAvg(Double estimatedCapacityLostTotalAvg) {
        this.estimatedCapacityLostTotalAvg = estimatedCapacityLostTotalAvg;
    }

    public Double getEstimatedCapacityLostTotalMax() {
        return estimatedCapacityLostTotalMax;
    }

    public void setEstimatedCapacityLostTotalMax(Double estimatedCapacityLostTotalMax) {
        this.estimatedCapacityLostTotalMax = estimatedCapacityLostTotalMax;
    }

    public Double getEstimatedCapacityLostTotalMin() {
        return estimatedCapacityLostTotalMin;
    }

    public void setEstimatedCapacityLostTotalMin(Double estimatedCapacityLostTotalMin) {
        this.estimatedCapacityLostTotalMin = estimatedCapacityLostTotalMin;
    }

    public Integer getEstimatedCapacityLostTotalRate() {
        return estimatedCapacityLostTotalRate;
    }

    public void setEstimatedCapacityLostTotalRate(Integer estimatedCapacityLostTotalRate) {
        this.estimatedCapacityLostTotalRate = estimatedCapacityLostTotalRate;
    }

    public Double getEstimatedCapacityLostTotalSum() {
        return estimatedCapacityLostTotalSum;
    }

    public void setEstimatedCapacityLostTotalSum(Double estimatedCapacityLostTotalSum) {
        this.estimatedCapacityLostTotalSum = estimatedCapacityLostTotalSum;
    }

    public Double getLastVolumeFailureDate() {
        return lastVolumeFailureDate;
    }

    public void setLastVolumeFailureDate(Double lastVolumeFailureDate) {
        this.lastVolumeFailureDate = lastVolumeFailureDate;
    }

    public Double getLastVolumeFailureDateAvg() {
        return lastVolumeFailureDateAvg;
    }

    public void setLastVolumeFailureDateAvg(Double lastVolumeFailureDateAvg) {
        this.lastVolumeFailureDateAvg = lastVolumeFailureDateAvg;
    }

    public Double getLastVolumeFailureDateMax() {
        return lastVolumeFailureDateMax;
    }

    public void setLastVolumeFailureDateMax(Double lastVolumeFailureDateMax) {
        this.lastVolumeFailureDateMax = lastVolumeFailureDateMax;
    }

    public Double getLastVolumeFailureDateMin() {
        return lastVolumeFailureDateMin;
    }

    public void setLastVolumeFailureDateMin(Double lastVolumeFailureDateMin) {
        this.lastVolumeFailureDateMin = lastVolumeFailureDateMin;
    }

    public Integer getLastVolumeFailureDateRate() {
        return lastVolumeFailureDateRate;
    }

    public void setLastVolumeFailureDateRate(Integer lastVolumeFailureDateRate) {
        this.lastVolumeFailureDateRate = lastVolumeFailureDateRate;
    }

    public Double getLastVolumeFailureDateSum() {
        return lastVolumeFailureDateSum;
    }

    public void setLastVolumeFailureDateSum(Double lastVolumeFailureDateSum) {
        this.lastVolumeFailureDateSum = lastVolumeFailureDateSum;
    }

    public Double getNumBlocksCached() {
        return numBlocksCached;
    }

    public void setNumBlocksCached(Double numBlocksCached) {
        this.numBlocksCached = numBlocksCached;
    }

    public Double getNumBlocksCachedAvg() {
        return numBlocksCachedAvg;
    }

    public void setNumBlocksCachedAvg(Double numBlocksCachedAvg) {
        this.numBlocksCachedAvg = numBlocksCachedAvg;
    }

    public Double getNumBlocksCachedMax() {
        return numBlocksCachedMax;
    }

    public void setNumBlocksCachedMax(Double numBlocksCachedMax) {
        this.numBlocksCachedMax = numBlocksCachedMax;
    }

    public Double getNumBlocksCachedMin() {
        return numBlocksCachedMin;
    }

    public void setNumBlocksCachedMin(Double numBlocksCachedMin) {
        this.numBlocksCachedMin = numBlocksCachedMin;
    }

    public Integer getNumBlocksCachedRate() {
        return numBlocksCachedRate;
    }

    public void setNumBlocksCachedRate(Integer numBlocksCachedRate) {
        this.numBlocksCachedRate = numBlocksCachedRate;
    }

    public Double getNumBlocksCachedSum() {
        return numBlocksCachedSum;
    }

    public void setNumBlocksCachedSum(Double numBlocksCachedSum) {
        this.numBlocksCachedSum = numBlocksCachedSum;
    }

    public Double getNumBlocksFailedToCache() {
        return numBlocksFailedToCache;
    }

    public void setNumBlocksFailedToCache(Double numBlocksFailedToCache) {
        this.numBlocksFailedToCache = numBlocksFailedToCache;
    }

    public Double getNumBlocksFailedToCacheAvg() {
        return numBlocksFailedToCacheAvg;
    }

    public void setNumBlocksFailedToCacheAvg(Double numBlocksFailedToCacheAvg) {
        this.numBlocksFailedToCacheAvg = numBlocksFailedToCacheAvg;
    }

    public Double getNumBlocksFailedToCacheMax() {
        return numBlocksFailedToCacheMax;
    }

    public void setNumBlocksFailedToCacheMax(Double numBlocksFailedToCacheMax) {
        this.numBlocksFailedToCacheMax = numBlocksFailedToCacheMax;
    }

    public Double getNumBlocksFailedToCacheMin() {
        return numBlocksFailedToCacheMin;
    }

    public void setNumBlocksFailedToCacheMin(Double numBlocksFailedToCacheMin) {
        this.numBlocksFailedToCacheMin = numBlocksFailedToCacheMin;
    }

    public Integer getNumBlocksFailedToCacheRate() {
        return numBlocksFailedToCacheRate;
    }

    public void setNumBlocksFailedToCacheRate(Integer numBlocksFailedToCacheRate) {
        this.numBlocksFailedToCacheRate = numBlocksFailedToCacheRate;
    }

    public Double getNumBlocksFailedToCacheSum() {
        return numBlocksFailedToCacheSum;
    }

    public void setNumBlocksFailedToCacheSum(Double numBlocksFailedToCacheSum) {
        this.numBlocksFailedToCacheSum = numBlocksFailedToCacheSum;
    }

    public Double getNumBlocksFailedToUnCache() {
        return numBlocksFailedToUnCache;
    }

    public void setNumBlocksFailedToUnCache(Double numBlocksFailedToUnCache) {
        this.numBlocksFailedToUnCache = numBlocksFailedToUnCache;
    }

    public Double getNumBlocksFailedToUnCacheAvg() {
        return numBlocksFailedToUnCacheAvg;
    }

    public void setNumBlocksFailedToUnCacheAvg(Double numBlocksFailedToUnCacheAvg) {
        this.numBlocksFailedToUnCacheAvg = numBlocksFailedToUnCacheAvg;
    }

    public Double getNumBlocksFailedToUnCacheMax() {
        return numBlocksFailedToUnCacheMax;
    }

    public void setNumBlocksFailedToUnCacheMax(Double numBlocksFailedToUnCacheMax) {
        this.numBlocksFailedToUnCacheMax = numBlocksFailedToUnCacheMax;
    }

    public Double getNumBlocksFailedToUnCacheMin() {
        return numBlocksFailedToUnCacheMin;
    }

    public void setNumBlocksFailedToUnCacheMin(Double numBlocksFailedToUnCacheMin) {
        this.numBlocksFailedToUnCacheMin = numBlocksFailedToUnCacheMin;
    }

    public Integer getNumBlocksFailedToUnCacheRate() {
        return numBlocksFailedToUnCacheRate;
    }

    public void setNumBlocksFailedToUnCacheRate(Integer numBlocksFailedToUnCacheRate) {
        this.numBlocksFailedToUnCacheRate = numBlocksFailedToUnCacheRate;
    }

    public Double getNumBlocksFailedToUnCacheSum() {
        return numBlocksFailedToUnCacheSum;
    }

    public void setNumBlocksFailedToUnCacheSum(Double numBlocksFailedToUnCacheSum) {
        this.numBlocksFailedToUnCacheSum = numBlocksFailedToUnCacheSum;
    }

    public Double getRemaining() {
        return remaining;
    }

    public void setRemaining(Double remaining) {
        this.remaining = remaining;
    }

    public Double getRemainingAvg() {
        return remainingAvg;
    }

    public void setRemainingAvg(Double remainingAvg) {
        this.remainingAvg = remainingAvg;
    }

    public Double getRemainingMax() {
        return remainingMax;
    }

    public void setRemainingMax(Double remainingMax) {
        this.remainingMax = remainingMax;
    }

    public Double getRemainingMin() {
        return remainingMin;
    }

    public void setRemainingMin(Double remainingMin) {
        this.remainingMin = remainingMin;
    }

    public Integer getRemainingRate() {
        return remainingRate;
    }

    public void setRemainingRate(Integer remainingRate) {
        this.remainingRate = remainingRate;
    }

    public Double getRemainingSum() {
        return remainingSum;
    }

    public void setRemainingSum(Double remainingSum) {
        this.remainingSum = remainingSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FsDatasetImpl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cacheCapacity");
        sb.append('=');
        sb.append(((this.cacheCapacity == null)?"<null>":this.cacheCapacity));
        sb.append(',');
        sb.append("cacheCapacityAvg");
        sb.append('=');
        sb.append(((this.cacheCapacityAvg == null)?"<null>":this.cacheCapacityAvg));
        sb.append(',');
        sb.append("cacheCapacityMax");
        sb.append('=');
        sb.append(((this.cacheCapacityMax == null)?"<null>":this.cacheCapacityMax));
        sb.append(',');
        sb.append("cacheCapacityMin");
        sb.append('=');
        sb.append(((this.cacheCapacityMin == null)?"<null>":this.cacheCapacityMin));
        sb.append(',');
        sb.append("cacheCapacityRate");
        sb.append('=');
        sb.append(((this.cacheCapacityRate == null)?"<null>":this.cacheCapacityRate));
        sb.append(',');
        sb.append("cacheCapacitySum");
        sb.append('=');
        sb.append(((this.cacheCapacitySum == null)?"<null>":this.cacheCapacitySum));
        sb.append(',');
        sb.append("cacheUsed");
        sb.append('=');
        sb.append(((this.cacheUsed == null)?"<null>":this.cacheUsed));
        sb.append(',');
        sb.append("cacheUsedAvg");
        sb.append('=');
        sb.append(((this.cacheUsedAvg == null)?"<null>":this.cacheUsedAvg));
        sb.append(',');
        sb.append("cacheUsedMax");
        sb.append('=');
        sb.append(((this.cacheUsedMax == null)?"<null>":this.cacheUsedMax));
        sb.append(',');
        sb.append("cacheUsedMin");
        sb.append('=');
        sb.append(((this.cacheUsedMin == null)?"<null>":this.cacheUsedMin));
        sb.append(',');
        sb.append("cacheUsedRate");
        sb.append('=');
        sb.append(((this.cacheUsedRate == null)?"<null>":this.cacheUsedRate));
        sb.append(',');
        sb.append("cacheUsedSum");
        sb.append('=');
        sb.append(((this.cacheUsedSum == null)?"<null>":this.cacheUsedSum));
        sb.append(',');
        sb.append("estimatedCapacityLostTotal");
        sb.append('=');
        sb.append(((this.estimatedCapacityLostTotal == null)?"<null>":this.estimatedCapacityLostTotal));
        sb.append(',');
        sb.append("estimatedCapacityLostTotalAvg");
        sb.append('=');
        sb.append(((this.estimatedCapacityLostTotalAvg == null)?"<null>":this.estimatedCapacityLostTotalAvg));
        sb.append(',');
        sb.append("estimatedCapacityLostTotalMax");
        sb.append('=');
        sb.append(((this.estimatedCapacityLostTotalMax == null)?"<null>":this.estimatedCapacityLostTotalMax));
        sb.append(',');
        sb.append("estimatedCapacityLostTotalMin");
        sb.append('=');
        sb.append(((this.estimatedCapacityLostTotalMin == null)?"<null>":this.estimatedCapacityLostTotalMin));
        sb.append(',');
        sb.append("estimatedCapacityLostTotalRate");
        sb.append('=');
        sb.append(((this.estimatedCapacityLostTotalRate == null)?"<null>":this.estimatedCapacityLostTotalRate));
        sb.append(',');
        sb.append("estimatedCapacityLostTotalSum");
        sb.append('=');
        sb.append(((this.estimatedCapacityLostTotalSum == null)?"<null>":this.estimatedCapacityLostTotalSum));
        sb.append(',');
        sb.append("lastVolumeFailureDate");
        sb.append('=');
        sb.append(((this.lastVolumeFailureDate == null)?"<null>":this.lastVolumeFailureDate));
        sb.append(',');
        sb.append("lastVolumeFailureDateAvg");
        sb.append('=');
        sb.append(((this.lastVolumeFailureDateAvg == null)?"<null>":this.lastVolumeFailureDateAvg));
        sb.append(',');
        sb.append("lastVolumeFailureDateMax");
        sb.append('=');
        sb.append(((this.lastVolumeFailureDateMax == null)?"<null>":this.lastVolumeFailureDateMax));
        sb.append(',');
        sb.append("lastVolumeFailureDateMin");
        sb.append('=');
        sb.append(((this.lastVolumeFailureDateMin == null)?"<null>":this.lastVolumeFailureDateMin));
        sb.append(',');
        sb.append("lastVolumeFailureDateRate");
        sb.append('=');
        sb.append(((this.lastVolumeFailureDateRate == null)?"<null>":this.lastVolumeFailureDateRate));
        sb.append(',');
        sb.append("lastVolumeFailureDateSum");
        sb.append('=');
        sb.append(((this.lastVolumeFailureDateSum == null)?"<null>":this.lastVolumeFailureDateSum));
        sb.append(',');
        sb.append("numBlocksCached");
        sb.append('=');
        sb.append(((this.numBlocksCached == null)?"<null>":this.numBlocksCached));
        sb.append(',');
        sb.append("numBlocksCachedAvg");
        sb.append('=');
        sb.append(((this.numBlocksCachedAvg == null)?"<null>":this.numBlocksCachedAvg));
        sb.append(',');
        sb.append("numBlocksCachedMax");
        sb.append('=');
        sb.append(((this.numBlocksCachedMax == null)?"<null>":this.numBlocksCachedMax));
        sb.append(',');
        sb.append("numBlocksCachedMin");
        sb.append('=');
        sb.append(((this.numBlocksCachedMin == null)?"<null>":this.numBlocksCachedMin));
        sb.append(',');
        sb.append("numBlocksCachedRate");
        sb.append('=');
        sb.append(((this.numBlocksCachedRate == null)?"<null>":this.numBlocksCachedRate));
        sb.append(',');
        sb.append("numBlocksCachedSum");
        sb.append('=');
        sb.append(((this.numBlocksCachedSum == null)?"<null>":this.numBlocksCachedSum));
        sb.append(',');
        sb.append("numBlocksFailedToCache");
        sb.append('=');
        sb.append(((this.numBlocksFailedToCache == null)?"<null>":this.numBlocksFailedToCache));
        sb.append(',');
        sb.append("numBlocksFailedToCacheAvg");
        sb.append('=');
        sb.append(((this.numBlocksFailedToCacheAvg == null)?"<null>":this.numBlocksFailedToCacheAvg));
        sb.append(',');
        sb.append("numBlocksFailedToCacheMax");
        sb.append('=');
        sb.append(((this.numBlocksFailedToCacheMax == null)?"<null>":this.numBlocksFailedToCacheMax));
        sb.append(',');
        sb.append("numBlocksFailedToCacheMin");
        sb.append('=');
        sb.append(((this.numBlocksFailedToCacheMin == null)?"<null>":this.numBlocksFailedToCacheMin));
        sb.append(',');
        sb.append("numBlocksFailedToCacheRate");
        sb.append('=');
        sb.append(((this.numBlocksFailedToCacheRate == null)?"<null>":this.numBlocksFailedToCacheRate));
        sb.append(',');
        sb.append("numBlocksFailedToCacheSum");
        sb.append('=');
        sb.append(((this.numBlocksFailedToCacheSum == null)?"<null>":this.numBlocksFailedToCacheSum));
        sb.append(',');
        sb.append("numBlocksFailedToUnCache");
        sb.append('=');
        sb.append(((this.numBlocksFailedToUnCache == null)?"<null>":this.numBlocksFailedToUnCache));
        sb.append(',');
        sb.append("numBlocksFailedToUnCacheAvg");
        sb.append('=');
        sb.append(((this.numBlocksFailedToUnCacheAvg == null)?"<null>":this.numBlocksFailedToUnCacheAvg));
        sb.append(',');
        sb.append("numBlocksFailedToUnCacheMax");
        sb.append('=');
        sb.append(((this.numBlocksFailedToUnCacheMax == null)?"<null>":this.numBlocksFailedToUnCacheMax));
        sb.append(',');
        sb.append("numBlocksFailedToUnCacheMin");
        sb.append('=');
        sb.append(((this.numBlocksFailedToUnCacheMin == null)?"<null>":this.numBlocksFailedToUnCacheMin));
        sb.append(',');
        sb.append("numBlocksFailedToUnCacheRate");
        sb.append('=');
        sb.append(((this.numBlocksFailedToUnCacheRate == null)?"<null>":this.numBlocksFailedToUnCacheRate));
        sb.append(',');
        sb.append("numBlocksFailedToUnCacheSum");
        sb.append('=');
        sb.append(((this.numBlocksFailedToUnCacheSum == null)?"<null>":this.numBlocksFailedToUnCacheSum));
        sb.append(',');
        sb.append("remaining");
        sb.append('=');
        sb.append(((this.remaining == null)?"<null>":this.remaining));
        sb.append(',');
        sb.append("remainingAvg");
        sb.append('=');
        sb.append(((this.remainingAvg == null)?"<null>":this.remainingAvg));
        sb.append(',');
        sb.append("remainingMax");
        sb.append('=');
        sb.append(((this.remainingMax == null)?"<null>":this.remainingMax));
        sb.append(',');
        sb.append("remainingMin");
        sb.append('=');
        sb.append(((this.remainingMin == null)?"<null>":this.remainingMin));
        sb.append(',');
        sb.append("remainingRate");
        sb.append('=');
        sb.append(((this.remainingRate == null)?"<null>":this.remainingRate));
        sb.append(',');
        sb.append("remainingSum");
        sb.append('=');
        sb.append(((this.remainingSum == null)?"<null>":this.remainingSum));
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
        result = ((result* 31)+((this.numBlocksCached == null)? 0 :this.numBlocksCached.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToCacheSum == null)? 0 :this.numBlocksFailedToCacheSum.hashCode()));
        result = ((result* 31)+((this.cacheCapacityMax == null)? 0 :this.cacheCapacityMax.hashCode()));
        result = ((result* 31)+((this.estimatedCapacityLostTotalMax == null)? 0 :this.estimatedCapacityLostTotalMax.hashCode()));
        result = ((result* 31)+((this.lastVolumeFailureDate == null)? 0 :this.lastVolumeFailureDate.hashCode()));
        result = ((result* 31)+((this.lastVolumeFailureDateRate == null)? 0 :this.lastVolumeFailureDateRate.hashCode()));
        result = ((result* 31)+((this.estimatedCapacityLostTotalSum == null)? 0 :this.estimatedCapacityLostTotalSum.hashCode()));
        result = ((result* 31)+((this.numBlocksCachedRate == null)? 0 :this.numBlocksCachedRate.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToCacheAvg == null)? 0 :this.numBlocksFailedToCacheAvg.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToCacheMin == null)? 0 :this.numBlocksFailedToCacheMin.hashCode()));
        result = ((result* 31)+((this.estimatedCapacityLostTotalAvg == null)? 0 :this.estimatedCapacityLostTotalAvg.hashCode()));
        result = ((result* 31)+((this.estimatedCapacityLostTotalMin == null)? 0 :this.estimatedCapacityLostTotalMin.hashCode()));
        result = ((result* 31)+((this.remainingRate == null)? 0 :this.remainingRate.hashCode()));
        result = ((result* 31)+((this.cacheUsedMin == null)? 0 :this.cacheUsedMin.hashCode()));
        result = ((result* 31)+((this.cacheUsedAvg == null)? 0 :this.cacheUsedAvg.hashCode()));
        result = ((result* 31)+((this.numBlocksCachedAvg == null)? 0 :this.numBlocksCachedAvg.hashCode()));
        result = ((result* 31)+((this.numBlocksCachedMin == null)? 0 :this.numBlocksCachedMin.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToCache == null)? 0 :this.numBlocksFailedToCache.hashCode()));
        result = ((result* 31)+((this.cacheCapacitySum == null)? 0 :this.cacheCapacitySum.hashCode()));
        result = ((result* 31)+((this.cacheUsedRate == null)? 0 :this.cacheUsedRate.hashCode()));
        result = ((result* 31)+((this.remaining == null)? 0 :this.remaining.hashCode()));
        result = ((result* 31)+((this.remainingMax == null)? 0 :this.remainingMax.hashCode()));
        result = ((result* 31)+((this.cacheCapacityAvg == null)? 0 :this.cacheCapacityAvg.hashCode()));
        result = ((result* 31)+((this.cacheCapacityMin == null)? 0 :this.cacheCapacityMin.hashCode()));
        result = ((result* 31)+((this.numBlocksCachedMax == null)? 0 :this.numBlocksCachedMax.hashCode()));
        result = ((result* 31)+((this.estimatedCapacityLostTotalRate == null)? 0 :this.estimatedCapacityLostTotalRate.hashCode()));
        result = ((result* 31)+((this.cacheUsedSum == null)? 0 :this.cacheUsedSum.hashCode()));
        result = ((result* 31)+((this.estimatedCapacityLostTotal == null)? 0 :this.estimatedCapacityLostTotal.hashCode()));
        result = ((result* 31)+((this.remainingAvg == null)? 0 :this.remainingAvg.hashCode()));
        result = ((result* 31)+((this.remainingMin == null)? 0 :this.remainingMin.hashCode()));
        result = ((result* 31)+((this.remainingSum == null)? 0 :this.remainingSum.hashCode()));
        result = ((result* 31)+((this.cacheCapacityRate == null)? 0 :this.cacheCapacityRate.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToUnCacheMax == null)? 0 :this.numBlocksFailedToUnCacheMax.hashCode()));
        result = ((result* 31)+((this.cacheCapacity == null)? 0 :this.cacheCapacity.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToUnCacheSum == null)? 0 :this.numBlocksFailedToUnCacheSum.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToCacheRate == null)? 0 :this.numBlocksFailedToCacheRate.hashCode()));
        result = ((result* 31)+((this.cacheUsedMax == null)? 0 :this.cacheUsedMax.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToUnCacheAvg == null)? 0 :this.numBlocksFailedToUnCacheAvg.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToUnCacheMin == null)? 0 :this.numBlocksFailedToUnCacheMin.hashCode()));
        result = ((result* 31)+((this.numBlocksCachedSum == null)? 0 :this.numBlocksCachedSum.hashCode()));
        result = ((result* 31)+((this.cacheUsed == null)? 0 :this.cacheUsed.hashCode()));
        result = ((result* 31)+((this.lastVolumeFailureDateMax == null)? 0 :this.lastVolumeFailureDateMax.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToCacheMax == null)? 0 :this.numBlocksFailedToCacheMax.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToUnCache == null)? 0 :this.numBlocksFailedToUnCache.hashCode()));
        result = ((result* 31)+((this.lastVolumeFailureDateSum == null)? 0 :this.lastVolumeFailureDateSum.hashCode()));
        result = ((result* 31)+((this.lastVolumeFailureDateAvg == null)? 0 :this.lastVolumeFailureDateAvg.hashCode()));
        result = ((result* 31)+((this.lastVolumeFailureDateMin == null)? 0 :this.lastVolumeFailureDateMin.hashCode()));
        result = ((result* 31)+((this.numBlocksFailedToUnCacheRate == null)? 0 :this.numBlocksFailedToUnCacheRate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FsDatasetImpl) == false) {
            return false;
        }
        FsDatasetImpl rhs = ((FsDatasetImpl) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.numBlocksCached == rhs.numBlocksCached)||((this.numBlocksCached!= null)&&this.numBlocksCached.equals(rhs.numBlocksCached)))&&((this.numBlocksFailedToCacheSum == rhs.numBlocksFailedToCacheSum)||((this.numBlocksFailedToCacheSum!= null)&&this.numBlocksFailedToCacheSum.equals(rhs.numBlocksFailedToCacheSum))))&&((this.cacheCapacityMax == rhs.cacheCapacityMax)||((this.cacheCapacityMax!= null)&&this.cacheCapacityMax.equals(rhs.cacheCapacityMax))))&&((this.estimatedCapacityLostTotalMax == rhs.estimatedCapacityLostTotalMax)||((this.estimatedCapacityLostTotalMax!= null)&&this.estimatedCapacityLostTotalMax.equals(rhs.estimatedCapacityLostTotalMax))))&&((this.lastVolumeFailureDate == rhs.lastVolumeFailureDate)||((this.lastVolumeFailureDate!= null)&&this.lastVolumeFailureDate.equals(rhs.lastVolumeFailureDate))))&&((this.lastVolumeFailureDateRate == rhs.lastVolumeFailureDateRate)||((this.lastVolumeFailureDateRate!= null)&&this.lastVolumeFailureDateRate.equals(rhs.lastVolumeFailureDateRate))))&&((this.estimatedCapacityLostTotalSum == rhs.estimatedCapacityLostTotalSum)||((this.estimatedCapacityLostTotalSum!= null)&&this.estimatedCapacityLostTotalSum.equals(rhs.estimatedCapacityLostTotalSum))))&&((this.numBlocksCachedRate == rhs.numBlocksCachedRate)||((this.numBlocksCachedRate!= null)&&this.numBlocksCachedRate.equals(rhs.numBlocksCachedRate))))&&((this.numBlocksFailedToCacheAvg == rhs.numBlocksFailedToCacheAvg)||((this.numBlocksFailedToCacheAvg!= null)&&this.numBlocksFailedToCacheAvg.equals(rhs.numBlocksFailedToCacheAvg))))&&((this.numBlocksFailedToCacheMin == rhs.numBlocksFailedToCacheMin)||((this.numBlocksFailedToCacheMin!= null)&&this.numBlocksFailedToCacheMin.equals(rhs.numBlocksFailedToCacheMin))))&&((this.estimatedCapacityLostTotalAvg == rhs.estimatedCapacityLostTotalAvg)||((this.estimatedCapacityLostTotalAvg!= null)&&this.estimatedCapacityLostTotalAvg.equals(rhs.estimatedCapacityLostTotalAvg))))&&((this.estimatedCapacityLostTotalMin == rhs.estimatedCapacityLostTotalMin)||((this.estimatedCapacityLostTotalMin!= null)&&this.estimatedCapacityLostTotalMin.equals(rhs.estimatedCapacityLostTotalMin))))&&((this.remainingRate == rhs.remainingRate)||((this.remainingRate!= null)&&this.remainingRate.equals(rhs.remainingRate))))&&((this.cacheUsedMin == rhs.cacheUsedMin)||((this.cacheUsedMin!= null)&&this.cacheUsedMin.equals(rhs.cacheUsedMin))))&&((this.cacheUsedAvg == rhs.cacheUsedAvg)||((this.cacheUsedAvg!= null)&&this.cacheUsedAvg.equals(rhs.cacheUsedAvg))))&&((this.numBlocksCachedAvg == rhs.numBlocksCachedAvg)||((this.numBlocksCachedAvg!= null)&&this.numBlocksCachedAvg.equals(rhs.numBlocksCachedAvg))))&&((this.numBlocksCachedMin == rhs.numBlocksCachedMin)||((this.numBlocksCachedMin!= null)&&this.numBlocksCachedMin.equals(rhs.numBlocksCachedMin))))&&((this.numBlocksFailedToCache == rhs.numBlocksFailedToCache)||((this.numBlocksFailedToCache!= null)&&this.numBlocksFailedToCache.equals(rhs.numBlocksFailedToCache))))&&((this.cacheCapacitySum == rhs.cacheCapacitySum)||((this.cacheCapacitySum!= null)&&this.cacheCapacitySum.equals(rhs.cacheCapacitySum))))&&((this.cacheUsedRate == rhs.cacheUsedRate)||((this.cacheUsedRate!= null)&&this.cacheUsedRate.equals(rhs.cacheUsedRate))))&&((this.remaining == rhs.remaining)||((this.remaining!= null)&&this.remaining.equals(rhs.remaining))))&&((this.remainingMax == rhs.remainingMax)||((this.remainingMax!= null)&&this.remainingMax.equals(rhs.remainingMax))))&&((this.cacheCapacityAvg == rhs.cacheCapacityAvg)||((this.cacheCapacityAvg!= null)&&this.cacheCapacityAvg.equals(rhs.cacheCapacityAvg))))&&((this.cacheCapacityMin == rhs.cacheCapacityMin)||((this.cacheCapacityMin!= null)&&this.cacheCapacityMin.equals(rhs.cacheCapacityMin))))&&((this.numBlocksCachedMax == rhs.numBlocksCachedMax)||((this.numBlocksCachedMax!= null)&&this.numBlocksCachedMax.equals(rhs.numBlocksCachedMax))))&&((this.estimatedCapacityLostTotalRate == rhs.estimatedCapacityLostTotalRate)||((this.estimatedCapacityLostTotalRate!= null)&&this.estimatedCapacityLostTotalRate.equals(rhs.estimatedCapacityLostTotalRate))))&&((this.cacheUsedSum == rhs.cacheUsedSum)||((this.cacheUsedSum!= null)&&this.cacheUsedSum.equals(rhs.cacheUsedSum))))&&((this.estimatedCapacityLostTotal == rhs.estimatedCapacityLostTotal)||((this.estimatedCapacityLostTotal!= null)&&this.estimatedCapacityLostTotal.equals(rhs.estimatedCapacityLostTotal))))&&((this.remainingAvg == rhs.remainingAvg)||((this.remainingAvg!= null)&&this.remainingAvg.equals(rhs.remainingAvg))))&&((this.remainingMin == rhs.remainingMin)||((this.remainingMin!= null)&&this.remainingMin.equals(rhs.remainingMin))))&&((this.remainingSum == rhs.remainingSum)||((this.remainingSum!= null)&&this.remainingSum.equals(rhs.remainingSum))))&&((this.cacheCapacityRate == rhs.cacheCapacityRate)||((this.cacheCapacityRate!= null)&&this.cacheCapacityRate.equals(rhs.cacheCapacityRate))))&&((this.numBlocksFailedToUnCacheMax == rhs.numBlocksFailedToUnCacheMax)||((this.numBlocksFailedToUnCacheMax!= null)&&this.numBlocksFailedToUnCacheMax.equals(rhs.numBlocksFailedToUnCacheMax))))&&((this.cacheCapacity == rhs.cacheCapacity)||((this.cacheCapacity!= null)&&this.cacheCapacity.equals(rhs.cacheCapacity))))&&((this.numBlocksFailedToUnCacheSum == rhs.numBlocksFailedToUnCacheSum)||((this.numBlocksFailedToUnCacheSum!= null)&&this.numBlocksFailedToUnCacheSum.equals(rhs.numBlocksFailedToUnCacheSum))))&&((this.numBlocksFailedToCacheRate == rhs.numBlocksFailedToCacheRate)||((this.numBlocksFailedToCacheRate!= null)&&this.numBlocksFailedToCacheRate.equals(rhs.numBlocksFailedToCacheRate))))&&((this.cacheUsedMax == rhs.cacheUsedMax)||((this.cacheUsedMax!= null)&&this.cacheUsedMax.equals(rhs.cacheUsedMax))))&&((this.numBlocksFailedToUnCacheAvg == rhs.numBlocksFailedToUnCacheAvg)||((this.numBlocksFailedToUnCacheAvg!= null)&&this.numBlocksFailedToUnCacheAvg.equals(rhs.numBlocksFailedToUnCacheAvg))))&&((this.numBlocksFailedToUnCacheMin == rhs.numBlocksFailedToUnCacheMin)||((this.numBlocksFailedToUnCacheMin!= null)&&this.numBlocksFailedToUnCacheMin.equals(rhs.numBlocksFailedToUnCacheMin))))&&((this.numBlocksCachedSum == rhs.numBlocksCachedSum)||((this.numBlocksCachedSum!= null)&&this.numBlocksCachedSum.equals(rhs.numBlocksCachedSum))))&&((this.cacheUsed == rhs.cacheUsed)||((this.cacheUsed!= null)&&this.cacheUsed.equals(rhs.cacheUsed))))&&((this.lastVolumeFailureDateMax == rhs.lastVolumeFailureDateMax)||((this.lastVolumeFailureDateMax!= null)&&this.lastVolumeFailureDateMax.equals(rhs.lastVolumeFailureDateMax))))&&((this.numBlocksFailedToCacheMax == rhs.numBlocksFailedToCacheMax)||((this.numBlocksFailedToCacheMax!= null)&&this.numBlocksFailedToCacheMax.equals(rhs.numBlocksFailedToCacheMax))))&&((this.numBlocksFailedToUnCache == rhs.numBlocksFailedToUnCache)||((this.numBlocksFailedToUnCache!= null)&&this.numBlocksFailedToUnCache.equals(rhs.numBlocksFailedToUnCache))))&&((this.lastVolumeFailureDateSum == rhs.lastVolumeFailureDateSum)||((this.lastVolumeFailureDateSum!= null)&&this.lastVolumeFailureDateSum.equals(rhs.lastVolumeFailureDateSum))))&&((this.lastVolumeFailureDateAvg == rhs.lastVolumeFailureDateAvg)||((this.lastVolumeFailureDateAvg!= null)&&this.lastVolumeFailureDateAvg.equals(rhs.lastVolumeFailureDateAvg))))&&((this.lastVolumeFailureDateMin == rhs.lastVolumeFailureDateMin)||((this.lastVolumeFailureDateMin!= null)&&this.lastVolumeFailureDateMin.equals(rhs.lastVolumeFailureDateMin))))&&((this.numBlocksFailedToUnCacheRate == rhs.numBlocksFailedToUnCacheRate)||((this.numBlocksFailedToUnCacheRate!= null)&&this.numBlocksFailedToUnCacheRate.equals(rhs.numBlocksFailedToUnCacheRate))));
    }

}
