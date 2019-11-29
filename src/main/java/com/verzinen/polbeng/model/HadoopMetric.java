package com.verzinen.polbeng.model;

public class HadoopMetric {
    String name;
    String modelerType;
    String hostName;
    int memNonHeapUsedM;
    int memNonHeapCommittedM;
    int memNonHeapMaxM;
    int memHeapUsedM;
    int memHeapCommittedM;
    int memHeapMaxM;
    int memMaxM;
    int gcCountParNew;
    int gcTimeMillisParNew;
    int gcCountConcurrentMarkSweep;
    int gcTimeMillisConcurrentMarkSweep;
    int gcCount;
    int gcTimeMillis;
    int gcNumWarnThresholdExceeded;
    int gcNumInfoThresholdExceeded;
    int gcTotalExtraSleepTime;
    int threadsNew;
    int threadsRunnable;
    int threadsBlocked;
    int threadsWaiting;
    int threadsTimedWaiting;
    int threadsTerminated;
    int logFatal;
    int logError;
    int logWarn;
    int logInfo;

    public HadoopMetric() {
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

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getMemNonHeapUsedM() {
        return memNonHeapUsedM;
    }

    public void setMemNonHeapUsedM(int memNonHeapUsedM) {
        this.memNonHeapUsedM = memNonHeapUsedM;
    }

    public int getMemNonHeapCommittedM() {
        return memNonHeapCommittedM;
    }

    public void setMemNonHeapCommittedM(int memNonHeapCommittedM) {
        this.memNonHeapCommittedM = memNonHeapCommittedM;
    }

    public int getMemNonHeapMaxM() {
        return memNonHeapMaxM;
    }

    public void setMemNonHeapMaxM(int memNonHeapMaxM) {
        this.memNonHeapMaxM = memNonHeapMaxM;
    }

    public int getMemHeapUsedM() {
        return memHeapUsedM;
    }

    public void setMemHeapUsedM(int memHeapUsedM) {
        this.memHeapUsedM = memHeapUsedM;
    }

    public int getMemHeapCommittedM() {
        return memHeapCommittedM;
    }

    public void setMemHeapCommittedM(int memHeapCommittedM) {
        this.memHeapCommittedM = memHeapCommittedM;
    }

    public int getMemHeapMaxM() {
        return memHeapMaxM;
    }

    public void setMemHeapMaxM(int memHeapMaxM) {
        this.memHeapMaxM = memHeapMaxM;
    }

    public int getMemMaxM() {
        return memMaxM;
    }

    public void setMemMaxM(int memMaxM) {
        this.memMaxM = memMaxM;
    }

    public int getGcCountParNew() {
        return gcCountParNew;
    }

    public void setGcCountParNew(int gcCountParNew) {
        this.gcCountParNew = gcCountParNew;
    }

    public int getGcTimeMillisParNew() {
        return gcTimeMillisParNew;
    }

    public void setGcTimeMillisParNew(int gcTimeMillisParNew) {
        this.gcTimeMillisParNew = gcTimeMillisParNew;
    }

    public int getGcCountConcurrentMarkSweep() {
        return gcCountConcurrentMarkSweep;
    }

    public void setGcCountConcurrentMarkSweep(int gcCountConcurrentMarkSweep) {
        this.gcCountConcurrentMarkSweep = gcCountConcurrentMarkSweep;
    }

    public int getGcTimeMillisConcurrentMarkSweep() {
        return gcTimeMillisConcurrentMarkSweep;
    }

    public void setGcTimeMillisConcurrentMarkSweep(int gcTimeMillisConcurrentMarkSweep) {
        this.gcTimeMillisConcurrentMarkSweep = gcTimeMillisConcurrentMarkSweep;
    }

    public int getGcCount() {
        return gcCount;
    }

    public void setGcCount(int gcCount) {
        this.gcCount = gcCount;
    }

    public int getGcTimeMillis() {
        return gcTimeMillis;
    }

    public void setGcTimeMillis(int gcTimeMillis) {
        this.gcTimeMillis = gcTimeMillis;
    }

    public int getGcNumWarnThresholdExceeded() {
        return gcNumWarnThresholdExceeded;
    }

    public void setGcNumWarnThresholdExceeded(int gcNumWarnThresholdExceeded) {
        this.gcNumWarnThresholdExceeded = gcNumWarnThresholdExceeded;
    }

    public int getGcNumInfoThresholdExceeded() {
        return gcNumInfoThresholdExceeded;
    }

    public void setGcNumInfoThresholdExceeded(int gcNumInfoThresholdExceeded) {
        this.gcNumInfoThresholdExceeded = gcNumInfoThresholdExceeded;
    }

    public int getGcTotalExtraSleepTime() {
        return gcTotalExtraSleepTime;
    }

    public void setGcTotalExtraSleepTime(int gcTotalExtraSleepTime) {
        this.gcTotalExtraSleepTime = gcTotalExtraSleepTime;
    }

    public int getThreadsNew() {
        return threadsNew;
    }

    public void setThreadsNew(int threadsNew) {
        this.threadsNew = threadsNew;
    }

    public int getThreadsRunnable() {
        return threadsRunnable;
    }

    public void setThreadsRunnable(int threadsRunnable) {
        this.threadsRunnable = threadsRunnable;
    }

    public int getThreadsBlocked() {
        return threadsBlocked;
    }

    public void setThreadsBlocked(int threadsBlocked) {
        this.threadsBlocked = threadsBlocked;
    }

    public int getThreadsWaiting() {
        return threadsWaiting;
    }

    public void setThreadsWaiting(int threadsWaiting) {
        this.threadsWaiting = threadsWaiting;
    }

    public int getThreadsTimedWaiting() {
        return threadsTimedWaiting;
    }

    public void setThreadsTimedWaiting(int threadsTimedWaiting) {
        this.threadsTimedWaiting = threadsTimedWaiting;
    }

    public int getThreadsTerminated() {
        return threadsTerminated;
    }

    public void setThreadsTerminated(int threadsTerminated) {
        this.threadsTerminated = threadsTerminated;
    }

    public int getLogFatal() {
        return logFatal;
    }

    public void setLogFatal(int logFatal) {
        this.logFatal = logFatal;
    }

    public int getLogError() {
        return logError;
    }

    public void setLogError(int logError) {
        this.logError = logError;
    }

    public int getLogWarn() {
        return logWarn;
    }

    public void setLogWarn(int logWarn) {
        this.logWarn = logWarn;
    }

    public int getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(int logInfo) {
        this.logInfo = logInfo;
    }
}
