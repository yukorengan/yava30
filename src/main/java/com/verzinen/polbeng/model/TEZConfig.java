package com.verzinen.polbeng.model;

import com.verzinen.polbeng.ejb.TEZConfigDA;

public class TEZConfig {
    String type;
    String tag;
    String heartbeatInterval;
    String releaseTimeoutMax;
    String releaseTimeoutMin;
    Boolean reuseEnabled;
    String ioSort;
    String groupingMaxSize;
    String groupingMinSize;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getHeartbeatInterval() {
        return heartbeatInterval;
    }

    public void setHeartbeatInterval(String heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    public String getReleaseTimeoutMax() {
        return releaseTimeoutMax;
    }

    public void setReleaseTimeoutMax(String releaseTimeoutMax) {
        this.releaseTimeoutMax = releaseTimeoutMax;
    }

    public String getReleaseTimeoutMin() {
        return releaseTimeoutMin;
    }

    public void setReleaseTimeoutMin(String releaseTimeoutMin) {
        this.releaseTimeoutMin = releaseTimeoutMin;
    }

    public Boolean getReuseEnabled() {
        return reuseEnabled;
    }

    public void setReuseEnabled(Boolean reuseEnabled) {
        this.reuseEnabled = reuseEnabled;
    }

    public String getIoSort() {
        return ioSort;
    }

    public void setIoSort(String ioSort) {
        this.ioSort = ioSort;
    }

    public String getGroupingMaxSize() {
        return groupingMaxSize;
    }

    public void setGroupingMaxSize(String groupingMaxSize) {
        this.groupingMaxSize = groupingMaxSize;
    }

    public String getGroupingMinSize() {
        return groupingMinSize;
    }

    public void setGroupingMinSize(String groupingMinSize) {
        this.groupingMinSize = groupingMinSize;
    }

    public String saveConfig(TEZConfig tezConfig) {
        return TEZConfigDA.save(tezConfig);
    }
}
