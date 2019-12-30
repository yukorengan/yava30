package com.verzinen.polbeng.model;

public class ZKConfig {
    Integer purgeInterval;
    String dataDir;
    Integer snapRetainCount;
    Integer clientPort;
    Integer initLimit;
    Integer tickTime;
    Integer syncLimit;
    String type;
    String tag;

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

    public Integer getPurgeInterval() {
        return purgeInterval;
    }

    public void setPurgeInterval(Integer purgeInterval) {
        this.purgeInterval = purgeInterval;
    }

    public String getDataDir() {
        return dataDir;
    }

    public void setDataDir(String dataDir) {
        this.dataDir = dataDir;
    }

    public Integer getSnapRetainCount() {
        return snapRetainCount;
    }

    public void setSnapRetainCount(Integer snapRetainCount) {
        this.snapRetainCount = snapRetainCount;
    }

    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public Integer getInitLimit() {
        return initLimit;
    }

    public void setInitLimit(Integer initLimit) {
        this.initLimit = initLimit;
    }

    public Integer getTickTime() {
        return tickTime;
    }

    public void setTickTime(Integer tickTime) {
        this.tickTime = tickTime;
    }

    public Integer getSyncLimit() {
        return syncLimit;
    }

    public void setSyncLimit(Integer syncLimit) {
        this.syncLimit = syncLimit;
    }
}
