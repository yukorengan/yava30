package com.verzinen.ugm.model.jmx;
 import java.util.ArrayList;
 import java.util.List;
 import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;
 
 public class Bean {
 
     @SerializedName("name")
     @Expose
     private String beanname;
     @SerializedName("modelerType")
     @Expose
     private String modelerType;
     @SerializedName("Remaining")
     @Expose
     private Integer remaining;
     @SerializedName("NumFailedVolumes")
     @Expose
     private Integer numFailedVolumes;
     @SerializedName("FailedStorageLocations")
     @Expose
     private List<Object> failedStorageLocations = new ArrayList<Object>();
     @SerializedName("StorageInfo")
     @Expose
     private String storageInfo;
     @SerializedName("Capacity")
     @Expose
     private Integer capacity;
     @SerializedName("DfsUsed")
     @Expose
     private Integer dfsUsed;
     @SerializedName("CacheCapacity")
     @Expose
     private Integer cacheCapacity;
     @SerializedName("CacheUsed")
     @Expose
     private Integer cacheUsed;
     @SerializedName("LastVolumeFailureDate")
     @Expose
     private Integer lastVolumeFailureDate;
     @SerializedName("EstimatedCapacityLostTotal")
     @Expose
     private Integer estimatedCapacityLostTotal;
     @SerializedName("NumBlocksCached")
     @Expose
     private Integer numBlocksCached;
     @SerializedName("NumBlocksFailedToCache")
     @Expose
     private Integer numBlocksFailedToCache;
     @SerializedName("NumBlocksFailedToUncache")
     @Expose
     private Integer numBlocksFailedToUncache;
     @SerializedName("MBeanServerId")
     @Expose
     private String mBeanServerId;
     @SerializedName("SpecificationName")
     @Expose
     private String specificationName;
     @SerializedName("SpecificationVersion")
     @Expose
     private String specificationVersion;
     @SerializedName("SpecificationVendor")
     @Expose
     private String specificationVendor;
     @SerializedName("ImplementationName")
     @Expose
     private String implementationName;
     @SerializedName("ImplementationVersion")
     @Expose
     private String implementationVersion;
     @SerializedName("ImplementationVendor")
     @Expose
     private String implementationVendor;
     @SerializedName("BootClassPathSupported")
     @Expose
     private Boolean bootClassPathSupported;
     @SerializedName("VmName")
     @Expose
     private String vmName;
     @SerializedName("VmVendor")
     @Expose
     private String vmVendor;
     @SerializedName("VmVersion")
     @Expose
     private String vmVersion;
     @SerializedName("LibraryPath")
     @Expose
     private String libraryPath;
     @SerializedName("BootClassPath")
     @Expose
     private String bootClassPath;
     @SerializedName("SpecName")
     @Expose
     private String specName;
     @SerializedName("SpecVendor")
     @Expose
     private String specVendor;
     @SerializedName("SpecVersion")
     @Expose
     private String specVersion;
     @SerializedName("ManagementSpecVersion")
     @Expose
     private String managementSpecVersion;
     @SerializedName("InputArguments")
     @Expose
     private List<String> inputArguments = new ArrayList<String>();
     @SerializedName("SystemProperties")
     @Expose
     private List<SystemProperty> systemProperties = new ArrayList<SystemProperty>();
     @SerializedName("StartTime")
     @Expose
     private Integer startTime;
     @SerializedName("Uptime")
     @Expose
     private Integer uptime;
     @SerializedName("Name")
     @Expose
     private String name;
     @SerializedName("ClassPath")
     @Expose
     private String classPath;
     @SerializedName("ObjectName")
     @Expose
     private String objectName;
     @SerializedName("ThreadAllocatedMemorySupported")
     @Expose
     private Boolean threadAllocatedMemorySupported;
     @SerializedName("ThreadAllocatedMemoryEnabled")
     @Expose
     private Boolean threadAllocatedMemoryEnabled;
     @SerializedName("ThreadContentionMonitoringSupported")
     @Expose
     private Boolean threadContentionMonitoringSupported;
     @SerializedName("CurrentThreadCpuTimeSupported")
     @Expose
     private Boolean currentThreadCpuTimeSupported;
     @SerializedName("ObjectMonitorUsageSupported")
     @Expose
     private Boolean objectMonitorUsageSupported;
     @SerializedName("SynchronizerUsageSupported")
     @Expose
     private Boolean synchronizerUsageSupported;
     @SerializedName("ThreadCpuTimeEnabled")
     @Expose
     private Boolean threadCpuTimeEnabled;
     @SerializedName("PeakThreadCount")
     @Expose
     private Integer peakThreadCount;
     @SerializedName("DaemonThreadCount")
     @Expose
     private Integer daemonThreadCount;
     @SerializedName("ThreadCount")
     @Expose
     private Integer threadCount;
     @SerializedName("TotalStartedThreadCount")
     @Expose
     private Integer totalStartedThreadCount;
     @SerializedName("ThreadCpuTimeSupported")
     @Expose
     private Boolean threadCpuTimeSupported;
     @SerializedName("CurrentThreadCpuTime")
     @Expose
     private Integer currentThreadCpuTime;
     @SerializedName("CurrentThreadUserTime")
     @Expose
     private Integer currentThreadUserTime;
     @SerializedName("ThreadContentionMonitoringEnabled")
     @Expose
     private Boolean threadContentionMonitoringEnabled;
     @SerializedName("AllThreadIds")
     @Expose
     private List<Integer> allThreadIds = new ArrayList<Integer>();
     @SerializedName("OpenFileDescriptorCount")
     @Expose
     private Integer openFileDescriptorCount;
     @SerializedName("MaxFileDescriptorCount")
     @Expose
     private Integer maxFileDescriptorCount;
     @SerializedName("CommittedVirtualMemorySize")
     @Expose
     private Integer committedVirtualMemorySize;
     @SerializedName("TotalSwapSpaceSize")
     @Expose
     private Integer totalSwapSpaceSize;
     @SerializedName("FreeSwapSpaceSize")
     @Expose
     private Integer freeSwapSpaceSize;
     @SerializedName("ProcessCpuTime")
     @Expose
     private Integer processCpuTime;
     @SerializedName("FreePhysicalMemorySize")
     @Expose
     private Integer freePhysicalMemorySize;
     @SerializedName("TotalPhysicalMemorySize")
     @Expose
     private Integer totalPhysicalMemorySize;
     @SerializedName("SystemCpuLoad")
     @Expose
     private Double systemCpuLoad;
     @SerializedName("ProcessCpuLoad")
     @Expose
     private Double processCpuLoad;
     @SerializedName("AvailableProcessors")
     @Expose
     private Integer availableProcessors;
     @SerializedName("Arch")
     @Expose
     private String arch;
     @SerializedName("Version")
     @Expose
     private String version;
     @SerializedName("SystemLoadAverage")
     @Expose
     private Double systemLoadAverage;
     @SerializedName("Valid")
     @Expose
     private Boolean valid;
     @SerializedName("Usage")
     @Expose
     private Usage usage;
     @SerializedName("PeakUsage")
     @Expose
     private PeakUsage peakUsage;
     @SerializedName("MemoryManagerNames")
     @Expose
     private List<String> memoryManagerNames = new ArrayList<String>();
     @SerializedName("UsageThreshold")
     @Expose
     private Integer usageThreshold;
     @SerializedName("UsageThresholdExceeded")
     @Expose
     private Boolean usageThresholdExceeded;
     @SerializedName("UsageThresholdCount")
     @Expose
     private Integer usageThresholdCount;
     @SerializedName("UsageThresholdSupported")
     @Expose
     private Boolean usageThresholdSupported;
     @SerializedName("CollectionUsage")
     @Expose
     private CollectionUsage collectionUsage;
     @SerializedName("CollectionUsageThresholdSupported")
     @Expose
     private Boolean collectionUsageThresholdSupported;
     @SerializedName("Type")
     @Expose
     private String type;
     @SerializedName("TotalCapacity")
     @Expose
     private Integer totalCapacity;
     @SerializedName("MemoryUsed")
     @Expose
     private Integer memoryUsed;
     @SerializedName("Count")
     @Expose
     private Integer count;
     @SerializedName("CompilationTimeMonitoringSupported")
     @Expose
     private Boolean compilationTimeMonitoringSupported;
     @SerializedName("TotalCompilationTime")
     @Expose
     private Integer totalCompilationTime;
     @SerializedName("tag.Context")
     @Expose
     private String tagContext;
     @SerializedName("tag.ProcessName")
     @Expose
     private String tagProcessName;
     @SerializedName("tag.SessionId")
     @Expose
     private Object tagSessionId;
     @SerializedName("tag.Hostname")
     @Expose
     private String tagHostname;
     @SerializedName("MemNonHeapUsedM")
     @Expose
     private Double memNonHeapUsedM;
     @SerializedName("MemNonHeapCommittedM")
     @Expose
     private Double memNonHeapCommittedM;
     @SerializedName("MemNonHeapMaxM")
     @Expose
     private Double memNonHeapMaxM;
     @SerializedName("MemHeapUsedM")
     @Expose
     private Double memHeapUsedM;
     @SerializedName("MemHeapCommittedM")
     @Expose
     private Double memHeapCommittedM;
     @SerializedName("MemHeapMaxM")
     @Expose
     private Double memHeapMaxM;
     @SerializedName("MemMaxM")
     @Expose
     private Double memMaxM;
     @SerializedName("GcCountParNew")
     @Expose
     private Integer gcCountParNew;
     @SerializedName("GcTimeMillisParNew")
     @Expose
     private Integer gcTimeMillisParNew;
     @SerializedName("GcCountConcurrentMarkSweep")
     @Expose
     private Integer gcCountConcurrentMarkSweep;
     @SerializedName("GcTimeMillisConcurrentMarkSweep")
     @Expose
     private Integer gcTimeMillisConcurrentMarkSweep;
     @SerializedName("GcCount")
     @Expose
     private Integer gcCount;
     @SerializedName("GcTimeMillis")
     @Expose
     private Integer gcTimeMillis;
     @SerializedName("GcNumWarnThresholdExceeded")
     @Expose
     private Integer gcNumWarnThresholdExceeded;
     @SerializedName("GcNumInfoThresholdExceeded")
     @Expose
     private Integer gcNumInfoThresholdExceeded;
     @SerializedName("GcTotalExtraSleepTime")
     @Expose
     private Integer gcTotalExtraSleepTime;
     @SerializedName("ThreadsNew")
     @Expose
     private Integer threadsNew;
     @SerializedName("ThreadsRunnable")
     @Expose
     private Integer threadsRunnable;
     @SerializedName("ThreadsBlocked")
     @Expose
     private Integer threadsBlocked;
     @SerializedName("ThreadsWaiting")
     @Expose
     private Integer threadsWaiting;
     @SerializedName("ThreadsTimedWaiting")
     @Expose
     private Integer threadsTimedWaiting;
     @SerializedName("ThreadsTerminated")
     @Expose
     private Integer threadsTerminated;
     @SerializedName("LogFatal")
     @Expose
     private Integer logFatal;
     @SerializedName("LogError")
     @Expose
     private Integer logError;
     @SerializedName("LogWarn")
     @Expose
     private Integer logWarn;
     @SerializedName("LogInfo")
     @Expose
     private Integer logInfo;
     @SerializedName("MemoryPoolNames")
     @Expose
     private List<String> memoryPoolNames = new ArrayList<String>();
     @SerializedName("tag.port")
     @Expose
     private String tagPort;
     @SerializedName("tag.NumOpenConnectionsPerUser")
     @Expose
     private String tagNumOpenConnectionsPerUser;
     @SerializedName("ReceivedBytes")
     @Expose
     private Integer receivedBytes;
     @SerializedName("SentBytes")
     @Expose
     private Integer sentBytes;
     @SerializedName("RpcQueueTimeNumOps")
     @Expose
     private Integer rpcQueueTimeNumOps;
     @SerializedName("RpcQueueTimeAvgTime")
     @Expose
     private Double rpcQueueTimeAvgTime;
     @SerializedName("RpcProcessingTimeNumOps")
     @Expose
     private Integer rpcProcessingTimeNumOps;
     @SerializedName("RpcProcessingTimeAvgTime")
     @Expose
     private Double rpcProcessingTimeAvgTime;
     @SerializedName("DeferredRpcProcessingTimeNumOps")
     @Expose
     private Integer deferredRpcProcessingTimeNumOps;
     @SerializedName("DeferredRpcProcessingTimeAvgTime")
     @Expose
     private Double deferredRpcProcessingTimeAvgTime;
     @SerializedName("RpcAuthenticationFailures")
     @Expose
     private Integer rpcAuthenticationFailures;
     @SerializedName("RpcAuthenticationSuccesses")
     @Expose
     private Integer rpcAuthenticationSuccesses;
     @SerializedName("RpcAuthorizationFailures")
     @Expose
     private Integer rpcAuthorizationFailures;
     @SerializedName("RpcAuthorizationSuccesses")
     @Expose
     private Integer rpcAuthorizationSuccesses;
     @SerializedName("RpcClientBackoff")
     @Expose
     private Integer rpcClientBackoff;
     @SerializedName("RpcSlowCalls")
     @Expose
     private Integer rpcSlowCalls;
     @SerializedName("NumOpenConnections")
     @Expose
     private Integer numOpenConnections;
     @SerializedName("CallQueueLength")
     @Expose
     private Integer callQueueLength;
     @SerializedName("NumDroppedConnections")
     @Expose
     private Integer numDroppedConnections;
     @SerializedName("LoggerNames")
     @Expose
     private List<String> loggerNames = new ArrayList<String>();
     @SerializedName("TotalLoadedClassCount")
     @Expose
     private Integer totalLoadedClassCount;
     @SerializedName("Verbose")
     @Expose
     private Boolean verbose;
     @SerializedName("LoadedClassCount")
     @Expose
     private Integer loadedClassCount;
     @SerializedName("UnloadedClassCount")
     @Expose
     private Integer unloadedClassCount;
     @SerializedName("NumActiveSources")
     @Expose
     private Integer numActiveSources;
     @SerializedName("NumAllSources")
     @Expose
     private Integer numAllSources;
     @SerializedName("NumActiveSinks")
     @Expose
     private Integer numActiveSinks;
     @SerializedName("NumAllSinks")
     @Expose
     private Integer numAllSinks;
     @SerializedName("Sink_timelineNumOps")
     @Expose
     private Integer sinkTimelineNumOps;
     @SerializedName("Sink_timelineAvgTime")
     @Expose
     private Double sinkTimelineAvgTime;
     @SerializedName("Sink_timelineDropped")
     @Expose
     private Integer sinkTimelineDropped;
     @SerializedName("Sink_timelineQsize")
     @Expose
     private Integer sinkTimelineQsize;
     @SerializedName("SnapshotNumOps")
     @Expose
     private Integer snapshotNumOps;
     @SerializedName("SnapshotAvgTime")
     @Expose
     private Double snapshotAvgTime;
     @SerializedName("PublishNumOps")
     @Expose
     private Integer publishNumOps;
     @SerializedName("PublishAvgTime")
     @Expose
     private Double publishAvgTime;
     @SerializedName("DroppedPubAll")
     @Expose
     private Integer droppedPubAll;
     @SerializedName("tag.StorageInfo")
     @Expose
     private String tagStorageInfo;
     @SerializedName("NumBlocksFailedToUnCache")
     @Expose
     private Integer numBlocksFailedToUnCache;
     @SerializedName("CollectionUsageThreshold")
     @Expose
     private Integer collectionUsageThreshold;
     @SerializedName("CollectionUsageThresholdExceeded")
     @Expose
     private Boolean collectionUsageThresholdExceeded;
     @SerializedName("CollectionUsageThresholdCount")
     @Expose
     private Integer collectionUsageThresholdCount;
     @SerializedName("LastGcInfo")
     @Expose
     private LastGcInfo lastGcInfo;
     @SerializedName("CollectionCount")
     @Expose
     private Integer collectionCount;
     @SerializedName("CollectionTime")
     @Expose
     private Integer collectionTime;
     @SerializedName("XceiverCount")
     @Expose
     private Integer xceiverCount;
     @SerializedName("DatanodeNetworkCounts")
     @Expose
     private List<Object> datanodeNetworkCounts = new ArrayList<Object>();
     @SerializedName("XmitsInProgress")
     @Expose
     private Integer xmitsInProgress;
     @SerializedName("SoftwareVersion")
     @Expose
     private String softwareVersion;
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
     @SerializedName("BytesWritten")
     @Expose
     private Integer bytesWritten;
     @SerializedName("TotalWriteTime")
     @Expose
     private Integer totalWriteTime;
     @SerializedName("BytesRead")
     @Expose
     private Integer bytesRead;
     @SerializedName("TotalReadTime")
     @Expose
     private Integer totalReadTime;
     @SerializedName("BlocksWritten")
     @Expose
     private Integer blocksWritten;
     @SerializedName("BlocksRead")
     @Expose
     private Integer blocksRead;
     @SerializedName("BlocksReplicated")
     @Expose
     private Integer blocksReplicated;
     @SerializedName("BlocksRemoved")
     @Expose
     private Integer blocksRemoved;
     @SerializedName("BlocksVerified")
     @Expose
     private Integer blocksVerified;
     @SerializedName("BlockVerificationFailures")
     @Expose
     private Integer blockVerificationFailures;
     @SerializedName("BlocksCached")
     @Expose
     private Integer blocksCached;
     @SerializedName("BlocksUncached")
     @Expose
     private Integer blocksUncached;
     @SerializedName("ReadsFromLocalClient")
     @Expose
     private Integer readsFromLocalClient;
     @SerializedName("ReadsFromRemoteClient")
     @Expose
     private Integer readsFromRemoteClient;
     @SerializedName("WritesFromLocalClient")
     @Expose
     private Integer writesFromLocalClient;
     @SerializedName("WritesFromRemoteClient")
     @Expose
     private Integer writesFromRemoteClient;
     @SerializedName("BlocksGetLocalPathInfo")
     @Expose
     private Integer blocksGetLocalPathInfo;
     @SerializedName("RemoteBytesRead")
     @Expose
     private Integer remoteBytesRead;
     @SerializedName("RemoteBytesWritten")
     @Expose
     private Integer remoteBytesWritten;
     @SerializedName("RamDiskBlocksWrite")
     @Expose
     private Integer ramDiskBlocksWrite;
     @SerializedName("RamDiskBlocksWriteFallback")
     @Expose
     private Integer ramDiskBlocksWriteFallback;
     @SerializedName("RamDiskBytesWrite")
     @Expose
     private Integer ramDiskBytesWrite;
     @SerializedName("RamDiskBlocksReadHits")
     @Expose
     private Integer ramDiskBlocksReadHits;
     @SerializedName("RamDiskBlocksEvicted")
     @Expose
     private Integer ramDiskBlocksEvicted;
     @SerializedName("RamDiskBlocksEvictedWithoutRead")
     @Expose
     private Integer ramDiskBlocksEvictedWithoutRead;
     @SerializedName("RamDiskBlocksEvictionWindowMsNumOps")
     @Expose
     private Integer ramDiskBlocksEvictionWindowMsNumOps;
     @SerializedName("RamDiskBlocksEvictionWindowMsAvgTime")
     @Expose
     private Double ramDiskBlocksEvictionWindowMsAvgTime;
     @SerializedName("RamDiskBlocksLazyPersisted")
     @Expose
     private Integer ramDiskBlocksLazyPersisted;
     @SerializedName("RamDiskBlocksDeletedBeforeLazyPersisted")
     @Expose
     private Integer ramDiskBlocksDeletedBeforeLazyPersisted;
     @SerializedName("RamDiskBytesLazyPersisted")
     @Expose
     private Integer ramDiskBytesLazyPersisted;
     @SerializedName("RamDiskBlocksLazyPersistWindowMsNumOps")
     @Expose
     private Integer ramDiskBlocksLazyPersistWindowMsNumOps;
     @SerializedName("RamDiskBlocksLazyPersistWindowMsAvgTime")
     @Expose
     private Double ramDiskBlocksLazyPersistWindowMsAvgTime;
     @SerializedName("FsyncCount")
     @Expose
     private Integer fsyncCount;
     @SerializedName("VolumeFailures")
     @Expose
     private Integer volumeFailures;
     @SerializedName("DatanodeNetworkErrors")
     @Expose
     private Integer datanodeNetworkErrors;
     @SerializedName("DataNodeActiveXceiversCount")
     @Expose
     private Integer dataNodeActiveXceiversCount;
     @SerializedName("ReadBlockOpNumOps")
     @Expose
     private Integer readBlockOpNumOps;
     @SerializedName("ReadBlockOpAvgTime")
     @Expose
     private Double readBlockOpAvgTime;
     @SerializedName("WriteBlockOpNumOps")
     @Expose
     private Integer writeBlockOpNumOps;
     @SerializedName("WriteBlockOpAvgTime")
     @Expose
     private Double writeBlockOpAvgTime;
     @SerializedName("BlockChecksumOpNumOps")
     @Expose
     private Integer blockChecksumOpNumOps;
     @SerializedName("BlockChecksumOpAvgTime")
     @Expose
     private Double blockChecksumOpAvgTime;
     @SerializedName("CopyBlockOpNumOps")
     @Expose
     private Integer copyBlockOpNumOps;
     @SerializedName("CopyBlockOpAvgTime")
     @Expose
     private Double copyBlockOpAvgTime;
     @SerializedName("ReplaceBlockOpNumOps")
     @Expose
     private Integer replaceBlockOpNumOps;
     @SerializedName("ReplaceBlockOpAvgTime")
     @Expose
     private Double replaceBlockOpAvgTime;
     @SerializedName("HeartbeatsNumOps")
     @Expose
     private Integer heartbeatsNumOps;
     @SerializedName("HeartbeatsAvgTime")
     @Expose
     private Double heartbeatsAvgTime;
     @SerializedName("HeartbeatsTotalNumOps")
     @Expose
     private Integer heartbeatsTotalNumOps;
     @SerializedName("HeartbeatsTotalAvgTime")
     @Expose
     private Double heartbeatsTotalAvgTime;
     @SerializedName("LifelinesNumOps")
     @Expose
     private Integer lifelinesNumOps;
     @SerializedName("LifelinesAvgTime")
     @Expose
     private Double lifelinesAvgTime;
     @SerializedName("BlockReportsNumOps")
     @Expose
     private Integer blockReportsNumOps;
     @SerializedName("BlockReportsAvgTime")
     @Expose
     private Double blockReportsAvgTime;
     @SerializedName("IncrementalBlockReportsNumOps")
     @Expose
     private Integer incrementalBlockReportsNumOps;
     @SerializedName("IncrementalBlockReportsAvgTime")
     @Expose
     private Double incrementalBlockReportsAvgTime;
     @SerializedName("CacheReportsNumOps")
     @Expose
     private Integer cacheReportsNumOps;
     @SerializedName("CacheReportsAvgTime")
     @Expose
     private Double cacheReportsAvgTime;
     @SerializedName("PacketAckRoundTripTimeNanosNumOps")
     @Expose
     private Integer packetAckRoundTripTimeNanosNumOps;
     @SerializedName("PacketAckRoundTripTimeNanosAvgTime")
     @Expose
     private Double packetAckRoundTripTimeNanosAvgTime;
     @SerializedName("FlushNanosNumOps")
     @Expose
     private Integer flushNanosNumOps;
     @SerializedName("FlushNanosAvgTime")
     @Expose
     private Double flushNanosAvgTime;
     @SerializedName("FsyncNanosNumOps")
     @Expose
     private Integer fsyncNanosNumOps;
     @SerializedName("FsyncNanosAvgTime")
     @Expose
     private Double fsyncNanosAvgTime;
     @SerializedName("SendDataPacketBlockedOnNetworkNanosNumOps")
     @Expose
     private Integer sendDataPacketBlockedOnNetworkNanosNumOps;
     @SerializedName("SendDataPacketBlockedOnNetworkNanosAvgTime")
     @Expose
     private Double sendDataPacketBlockedOnNetworkNanosAvgTime;
     @SerializedName("SendDataPacketTransferNanosNumOps")
     @Expose
     private Integer sendDataPacketTransferNanosNumOps;
     @SerializedName("SendDataPacketTransferNanosAvgTime")
     @Expose
     private Double sendDataPacketTransferNanosAvgTime;
     @SerializedName("BlocksInPendingIBR")
     @Expose
     private Integer blocksInPendingIBR;
     @SerializedName("BlocksReceivingInPendingIBR")
     @Expose
     private Integer blocksReceivingInPendingIBR;
     @SerializedName("BlocksReceivedInPendingIBR")
     @Expose
     private Integer blocksReceivedInPendingIBR;
     @SerializedName("BlocksDeletedInPendingIBR")
     @Expose
     private Integer blocksDeletedInPendingIBR;
     @SerializedName("EcReconstructionTasks")
     @Expose
     private Integer ecReconstructionTasks;
     @SerializedName("EcFailedReconstructionTasks")
     @Expose
     private Integer ecFailedReconstructionTasks;
     @SerializedName("EcDecodingTimeNanos")
     @Expose
     private Integer ecDecodingTimeNanos;
     @SerializedName("EcReconstructionBytesRead")
     @Expose
     private Integer ecReconstructionBytesRead;
     @SerializedName("EcReconstructionBytesWritten")
     @Expose
     private Integer ecReconstructionBytesWritten;
     @SerializedName("EcReconstructionRemoteBytesRead")
     @Expose
     private Integer ecReconstructionRemoteBytesRead;
     @SerializedName("EcReconstructionReadTimeMillis")
     @Expose
     private Integer ecReconstructionReadTimeMillis;
     @SerializedName("EcReconstructionDecodingTimeMillis")
     @Expose
     private Integer ecReconstructionDecodingTimeMillis;
     @SerializedName("EcReconstructionWriteTimeMillis")
     @Expose
     private Integer ecReconstructionWriteTimeMillis;
     @SerializedName("TotalMetadataOperations")
     @Expose
     private Integer totalMetadataOperations;
     @SerializedName("MetadataOperationRateNumOps")
     @Expose
     private Integer metadataOperationRateNumOps;
     @SerializedName("MetadataOperationRateAvgTime")
     @Expose
     private Double metadataOperationRateAvgTime;
     @SerializedName("TotalDataFileIos")
     @Expose
     private Integer totalDataFileIos;
     @SerializedName("DataFileIoRateNumOps")
     @Expose
     private Integer dataFileIoRateNumOps;
     @SerializedName("DataFileIoRateAvgTime")
     @Expose
     private Double dataFileIoRateAvgTime;
     @SerializedName("FlushIoRateNumOps")
     @Expose
     private Integer flushIoRateNumOps;
     @SerializedName("FlushIoRateAvgTime")
     @Expose
     private Double flushIoRateAvgTime;
     @SerializedName("SyncIoRateNumOps")
     @Expose
     private Integer syncIoRateNumOps;
     @SerializedName("SyncIoRateAvgTime")
     @Expose
     private Double syncIoRateAvgTime;
     @SerializedName("ReadIoRateNumOps")
     @Expose
     private Integer readIoRateNumOps;
     @SerializedName("ReadIoRateAvgTime")
     @Expose
     private Double readIoRateAvgTime;
     @SerializedName("WriteIoRateNumOps")
     @Expose
     private Integer writeIoRateNumOps;
     @SerializedName("WriteIoRateAvgTime")
     @Expose
     private Double writeIoRateAvgTime;
     @SerializedName("TotalFileIoErrors")
     @Expose
     private Integer totalFileIoErrors;
     @SerializedName("FileIoErrorRateNumOps")
     @Expose
     private Integer fileIoErrorRateNumOps;
     @SerializedName("FileIoErrorRateAvgTime")
     @Expose
     private Double fileIoErrorRateAvgTime;
     @SerializedName("ObjectPendingFinalizationCount")
     @Expose
     private Integer objectPendingFinalizationCount;
     @SerializedName("HeapMemoryUsage")
     @Expose
     private HeapMemoryUsage heapMemoryUsage;
     @SerializedName("NonHeapMemoryUsage")
     @Expose
     private NonHeapMemoryUsage nonHeapMemoryUsage;
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
     @SerializedName("DiagnosticOptions")
     @Expose
     private List<DiagnosticOption> diagnosticOptions = new ArrayList<DiagnosticOption>();
 
     public String getBeanname() {
         return beanname;
     }
 
     public void setBeanname(String beanname) {
         this.beanname = beanname;
     }
 
     public String getModelerType() {
         return modelerType;
     }
 
     public void setModelerType(String modelerType) {
         this.modelerType = modelerType;
     }
 
     public Integer getRemaining() {
         return remaining;
     }
 
     public void setRemaining(Integer remaining) {
         this.remaining = remaining;
     }
 
     public Integer getNumFailedVolumes() {
         return numFailedVolumes;
     }
 
     public void setNumFailedVolumes(Integer numFailedVolumes) {
         this.numFailedVolumes = numFailedVolumes;
     }
 
     public List<Object> getFailedStorageLocations() {
         return failedStorageLocations;
     }
 
     public void setFailedStorageLocations(List<Object> failedStorageLocations) {
         this.failedStorageLocations = failedStorageLocations;
     }
 
     public String getStorageInfo() {
         return storageInfo;
     }
 
     public void setStorageInfo(String storageInfo) {
         this.storageInfo = storageInfo;
     }
 
     public Integer getCapacity() {
         return capacity;
     }
 
     public void setCapacity(Integer capacity) {
         this.capacity = capacity;
     }
 
     public Integer getDfsUsed() {
         return dfsUsed;
     }
 
     public void setDfsUsed(Integer dfsUsed) {
         this.dfsUsed = dfsUsed;
     }
 
     public Integer getCacheCapacity() {
         return cacheCapacity;
     }
 
     public void setCacheCapacity(Integer cacheCapacity) {
         this.cacheCapacity = cacheCapacity;
     }
 
     public Integer getCacheUsed() {
         return cacheUsed;
     }
 
     public void setCacheUsed(Integer cacheUsed) {
         this.cacheUsed = cacheUsed;
     }
 
     public Integer getLastVolumeFailureDate() {
         return lastVolumeFailureDate;
     }
 
     public void setLastVolumeFailureDate(Integer lastVolumeFailureDate) {
         this.lastVolumeFailureDate = lastVolumeFailureDate;
     }
 
     public Integer getEstimatedCapacityLostTotal() {
         return estimatedCapacityLostTotal;
     }
 
     public void setEstimatedCapacityLostTotal(Integer estimatedCapacityLostTotal) {
         this.estimatedCapacityLostTotal = estimatedCapacityLostTotal;
     }
 
     public Integer getNumBlocksCached() {
         return numBlocksCached;
     }
 
     public void setNumBlocksCached(Integer numBlocksCached) {
         this.numBlocksCached = numBlocksCached;
     }
 
     public Integer getNumBlocksFailedToCache() {
         return numBlocksFailedToCache;
     }
 
     public void setNumBlocksFailedToCache(Integer numBlocksFailedToCache) {
         this.numBlocksFailedToCache = numBlocksFailedToCache;
     }
 
     public Integer getNumBlocksFailedToUncache() {
         return numBlocksFailedToUncache;
     }
 
     public void setNumBlocksFailedToUncache(Integer numBlocksFailedToUncache) {
         this.numBlocksFailedToUncache = numBlocksFailedToUncache;
     }
 
     public String getMBeanServerId() {
         return mBeanServerId;
     }
 
     public void setMBeanServerId(String mBeanServerId) {
         this.mBeanServerId = mBeanServerId;
     }
 
     public String getSpecificationName() {
         return specificationName;
     }
 
     public void setSpecificationName(String specificationName) {
         this.specificationName = specificationName;
     }
 
     public String getSpecificationVersion() {
         return specificationVersion;
     }
 
     public void setSpecificationVersion(String specificationVersion) {
         this.specificationVersion = specificationVersion;
     }
 
     public String getSpecificationVendor() {
         return specificationVendor;
     }
 
     public void setSpecificationVendor(String specificationVendor) {
         this.specificationVendor = specificationVendor;
     }
 
     public String getImplementationName() {
         return implementationName;
     }
 
     public void setImplementationName(String implementationName) {
         this.implementationName = implementationName;
     }
 
     public String getImplementationVersion() {
         return implementationVersion;
     }
 
     public void setImplementationVersion(String implementationVersion) {
         this.implementationVersion = implementationVersion;
     }
 
     public String getImplementationVendor() {
         return implementationVendor;
     }
 
     public void setImplementationVendor(String implementationVendor) {
         this.implementationVendor = implementationVendor;
     }
 
     public Boolean getBootClassPathSupported() {
         return bootClassPathSupported;
     }
 
     public void setBootClassPathSupported(Boolean bootClassPathSupported) {
         this.bootClassPathSupported = bootClassPathSupported;
     }
 
     public String getVmName() {
         return vmName;
     }
 
     public void setVmName(String vmName) {
         this.vmName = vmName;
     }
 
     public String getVmVendor() {
         return vmVendor;
     }
 
     public void setVmVendor(String vmVendor) {
         this.vmVendor = vmVendor;
     }
 
     public String getVmVersion() {
         return vmVersion;
     }
 
     public void setVmVersion(String vmVersion) {
         this.vmVersion = vmVersion;
     }
 
     public String getLibraryPath() {
         return libraryPath;
     }
 
     public void setLibraryPath(String libraryPath) {
         this.libraryPath = libraryPath;
     }
 
     public String getBootClassPath() {
         return bootClassPath;
     }
 
     public void setBootClassPath(String bootClassPath) {
         this.bootClassPath = bootClassPath;
     }
 
     public String getSpecName() {
         return specName;
     }
 
     public void setSpecName(String specName) {
         this.specName = specName;
     }
 
     public String getSpecVendor() {
         return specVendor;
     }
 
     public void setSpecVendor(String specVendor) {
         this.specVendor = specVendor;
     }
 
     public String getSpecVersion() {
         return specVersion;
     }
 
     public void setSpecVersion(String specVersion) {
         this.specVersion = specVersion;
     }
 
     public String getManagementSpecVersion() {
         return managementSpecVersion;
     }
 
     public void setManagementSpecVersion(String managementSpecVersion) {
         this.managementSpecVersion = managementSpecVersion;
     }
 
     public List<String> getInputArguments() {
         return inputArguments;
     }
 
     public void setInputArguments(List<String> inputArguments) {
         this.inputArguments = inputArguments;
     }
 
     public List<SystemProperty> getSystemProperties() {
         return systemProperties;
     }
 
     public void setSystemProperties(List<SystemProperty> systemProperties) {
         this.systemProperties = systemProperties;
     }
 
     public Integer getStartTime() {
         return startTime;
     }
 
     public void setStartTime(Integer startTime) {
         this.startTime = startTime;
     }
 
     public Integer getUptime() {
         return uptime;
     }
 
     public void setUptime(Integer uptime) {
         this.uptime = uptime;
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String getClassPath() {
         return classPath;
     }
 
     public void setClassPath(String classPath) {
         this.classPath = classPath;
     }
 
     public String getObjectName() {
         return objectName;
     }
 
     public void setObjectName(String objectName) {
         this.objectName = objectName;
     }
 
     public Boolean getThreadAllocatedMemorySupported() {
         return threadAllocatedMemorySupported;
     }
 
     public void setThreadAllocatedMemorySupported(Boolean threadAllocatedMemorySupported) {
         this.threadAllocatedMemorySupported = threadAllocatedMemorySupported;
     }
 
     public Boolean getThreadAllocatedMemoryEnabled() {
         return threadAllocatedMemoryEnabled;
     }
 
     public void setThreadAllocatedMemoryEnabled(Boolean threadAllocatedMemoryEnabled) {
         this.threadAllocatedMemoryEnabled = threadAllocatedMemoryEnabled;
     }
 
     public Boolean getThreadContentionMonitoringSupported() {
         return threadContentionMonitoringSupported;
     }
 
     public void setThreadContentionMonitoringSupported(Boolean threadContentionMonitoringSupported) {
         this.threadContentionMonitoringSupported = threadContentionMonitoringSupported;
     }
 
     public Boolean getCurrentThreadCpuTimeSupported() {
         return currentThreadCpuTimeSupported;
     }
 
     public void setCurrentThreadCpuTimeSupported(Boolean currentThreadCpuTimeSupported) {
         this.currentThreadCpuTimeSupported = currentThreadCpuTimeSupported;
     }
 
     public Boolean getObjectMonitorUsageSupported() {
         return objectMonitorUsageSupported;
     }
 
     public void setObjectMonitorUsageSupported(Boolean objectMonitorUsageSupported) {
         this.objectMonitorUsageSupported = objectMonitorUsageSupported;
     }
 
     public Boolean getSynchronizerUsageSupported() {
         return synchronizerUsageSupported;
     }
 
     public void setSynchronizerUsageSupported(Boolean synchronizerUsageSupported) {
         this.synchronizerUsageSupported = synchronizerUsageSupported;
     }
 
     public Boolean getThreadCpuTimeEnabled() {
         return threadCpuTimeEnabled;
     }
 
     public void setThreadCpuTimeEnabled(Boolean threadCpuTimeEnabled) {
         this.threadCpuTimeEnabled = threadCpuTimeEnabled;
     }
 
     public Integer getPeakThreadCount() {
         return peakThreadCount;
     }
 
     public void setPeakThreadCount(Integer peakThreadCount) {
         this.peakThreadCount = peakThreadCount;
     }
 
     public Integer getDaemonThreadCount() {
         return daemonThreadCount;
     }
 
     public void setDaemonThreadCount(Integer daemonThreadCount) {
         this.daemonThreadCount = daemonThreadCount;
     }
 
     public Integer getThreadCount() {
         return threadCount;
     }
 
     public void setThreadCount(Integer threadCount) {
         this.threadCount = threadCount;
     }
 
     public Integer getTotalStartedThreadCount() {
         return totalStartedThreadCount;
     }
 
     public void setTotalStartedThreadCount(Integer totalStartedThreadCount) {
         this.totalStartedThreadCount = totalStartedThreadCount;
     }
 
     public Boolean getThreadCpuTimeSupported() {
         return threadCpuTimeSupported;
     }
 
     public void setThreadCpuTimeSupported(Boolean threadCpuTimeSupported) {
         this.threadCpuTimeSupported = threadCpuTimeSupported;
     }
 
     public Integer getCurrentThreadCpuTime() {
         return currentThreadCpuTime;
     }
 
     public void setCurrentThreadCpuTime(Integer currentThreadCpuTime) {
         this.currentThreadCpuTime = currentThreadCpuTime;
     }
 
     public Integer getCurrentThreadUserTime() {
         return currentThreadUserTime;
     }
 
     public void setCurrentThreadUserTime(Integer currentThreadUserTime) {
         this.currentThreadUserTime = currentThreadUserTime;
     }
 
     public Boolean getThreadContentionMonitoringEnabled() {
         return threadContentionMonitoringEnabled;
     }
 
     public void setThreadContentionMonitoringEnabled(Boolean threadContentionMonitoringEnabled) {
         this.threadContentionMonitoringEnabled = threadContentionMonitoringEnabled;
     }
 
     public List<Integer> getAllThreadIds() {
         return allThreadIds;
     }
 
     public void setAllThreadIds(List<Integer> allThreadIds) {
         this.allThreadIds = allThreadIds;
     }
 
     public Integer getOpenFileDescriptorCount() {
         return openFileDescriptorCount;
     }
 
     public void setOpenFileDescriptorCount(Integer openFileDescriptorCount) {
         this.openFileDescriptorCount = openFileDescriptorCount;
     }
 
     public Integer getMaxFileDescriptorCount() {
         return maxFileDescriptorCount;
     }
 
     public void setMaxFileDescriptorCount(Integer maxFileDescriptorCount) {
         this.maxFileDescriptorCount = maxFileDescriptorCount;
     }
 
     public Integer getCommittedVirtualMemorySize() {
         return committedVirtualMemorySize;
     }
 
     public void setCommittedVirtualMemorySize(Integer committedVirtualMemorySize) {
         this.committedVirtualMemorySize = committedVirtualMemorySize;
     }
 
     public Integer getTotalSwapSpaceSize() {
         return totalSwapSpaceSize;
     }
 
     public void setTotalSwapSpaceSize(Integer totalSwapSpaceSize) {
         this.totalSwapSpaceSize = totalSwapSpaceSize;
     }
 
     public Integer getFreeSwapSpaceSize() {
         return freeSwapSpaceSize;
     }
 
     public void setFreeSwapSpaceSize(Integer freeSwapSpaceSize) {
         this.freeSwapSpaceSize = freeSwapSpaceSize;
     }
 
     public Integer getProcessCpuTime() {
         return processCpuTime;
     }
 
     public void setProcessCpuTime(Integer processCpuTime) {
         this.processCpuTime = processCpuTime;
     }
 
     public Integer getFreePhysicalMemorySize() {
         return freePhysicalMemorySize;
     }
 
     public void setFreePhysicalMemorySize(Integer freePhysicalMemorySize) {
         this.freePhysicalMemorySize = freePhysicalMemorySize;
     }
 
     public Integer getTotalPhysicalMemorySize() {
         return totalPhysicalMemorySize;
     }
 
     public void setTotalPhysicalMemorySize(Integer totalPhysicalMemorySize) {
         this.totalPhysicalMemorySize = totalPhysicalMemorySize;
     }
 
     public Double getSystemCpuLoad() {
         return systemCpuLoad;
     }
 
     public void setSystemCpuLoad(Double systemCpuLoad) {
         this.systemCpuLoad = systemCpuLoad;
     }
 
     public Double getProcessCpuLoad() {
         return processCpuLoad;
     }
 
     public void setProcessCpuLoad(Double processCpuLoad) {
         this.processCpuLoad = processCpuLoad;
     }
 
     public Integer getAvailableProcessors() {
         return availableProcessors;
     }
 
     public void setAvailableProcessors(Integer availableProcessors) {
         this.availableProcessors = availableProcessors;
     }
 
     public String getArch() {
         return arch;
     }
 
     public void setArch(String arch) {
         this.arch = arch;
     }
 
     public String getVersion() {
         return version;
     }
 
     public void setVersion(String version) {
         this.version = version;
     }
 
     public Double getSystemLoadAverage() {
         return systemLoadAverage;
     }
 
     public void setSystemLoadAverage(Double systemLoadAverage) {
         this.systemLoadAverage = systemLoadAverage;
     }
 
     public Boolean getValid() {
         return valid;
     }
 
     public void setValid(Boolean valid) {
         this.valid = valid;
     }
 
     public Usage getUsage() {
         return usage;
     }
 
     public void setUsage(Usage usage) {
         this.usage = usage;
     }
 
     public PeakUsage getPeakUsage() {
         return peakUsage;
     }
 
     public void setPeakUsage(PeakUsage peakUsage) {
         this.peakUsage = peakUsage;
     }
 
     public List<String> getMemoryManagerNames() {
         return memoryManagerNames;
     }
 
     public void setMemoryManagerNames(List<String> memoryManagerNames) {
         this.memoryManagerNames = memoryManagerNames;
     }
 
     public Integer getUsageThreshold() {
         return usageThreshold;
     }
 
     public void setUsageThreshold(Integer usageThreshold) {
         this.usageThreshold = usageThreshold;
     }
 
     public Boolean getUsageThresholdExceeded() {
         return usageThresholdExceeded;
     }
 
     public void setUsageThresholdExceeded(Boolean usageThresholdExceeded) {
         this.usageThresholdExceeded = usageThresholdExceeded;
     }
 
     public Integer getUsageThresholdCount() {
         return usageThresholdCount;
     }
 
     public void setUsageThresholdCount(Integer usageThresholdCount) {
         this.usageThresholdCount = usageThresholdCount;
     }
 
     public Boolean getUsageThresholdSupported() {
         return usageThresholdSupported;
     }
 
     public void setUsageThresholdSupported(Boolean usageThresholdSupported) {
         this.usageThresholdSupported = usageThresholdSupported;
     }
 
     public CollectionUsage getCollectionUsage() {
         return collectionUsage;
     }
 
     public void setCollectionUsage(CollectionUsage collectionUsage) {
         this.collectionUsage = collectionUsage;
     }
 
     public Boolean getCollectionUsageThresholdSupported() {
         return collectionUsageThresholdSupported;
     }
 
     public void setCollectionUsageThresholdSupported(Boolean collectionUsageThresholdSupported) {
         this.collectionUsageThresholdSupported = collectionUsageThresholdSupported;
     }
 
     public String getType() {
         return type;
     }
 
     public void setType(String type) {
         this.type = type;
     }
 
     public Integer getTotalCapacity() {
         return totalCapacity;
     }
 
     public void setTotalCapacity(Integer totalCapacity) {
         this.totalCapacity = totalCapacity;
     }
 
     public Integer getMemoryUsed() {
         return memoryUsed;
     }
 
     public void setMemoryUsed(Integer memoryUsed) {
         this.memoryUsed = memoryUsed;
     }
 
     public Integer getCount() {
         return count;
     }
 
     public void setCount(Integer count) {
         this.count = count;
     }
 
     public Boolean getCompilationTimeMonitoringSupported() {
         return compilationTimeMonitoringSupported;
     }
 
     public void setCompilationTimeMonitoringSupported(Boolean compilationTimeMonitoringSupported) {
         this.compilationTimeMonitoringSupported = compilationTimeMonitoringSupported;
     }
 
     public Integer getTotalCompilationTime() {
         return totalCompilationTime;
     }
 
     public void setTotalCompilationTime(Integer totalCompilationTime) {
         this.totalCompilationTime = totalCompilationTime;
     }
 
     public String getTagContext() {
         return tagContext;
     }
 
     public void setTagContext(String tagContext) {
         this.tagContext = tagContext;
     }
 
     public String getTagProcessName() {
         return tagProcessName;
     }
 
     public void setTagProcessName(String tagProcessName) {
         this.tagProcessName = tagProcessName;
     }
 
     public Object getTagSessionId() {
         return tagSessionId;
     }
 
     public void setTagSessionId(Object tagSessionId) {
         this.tagSessionId = tagSessionId;
     }
 
     public String getTagHostname() {
         return tagHostname;
     }
 
     public void setTagHostname(String tagHostname) {
         this.tagHostname = tagHostname;
     }
 
     public Double getMemNonHeapUsedM() {
         return memNonHeapUsedM;
     }
 
     public void setMemNonHeapUsedM(Double memNonHeapUsedM) {
         this.memNonHeapUsedM = memNonHeapUsedM;
     }
 
     public Double getMemNonHeapCommittedM() {
         return memNonHeapCommittedM;
     }
 
     public void setMemNonHeapCommittedM(Double memNonHeapCommittedM) {
         this.memNonHeapCommittedM = memNonHeapCommittedM;
     }
 
     public Double getMemNonHeapMaxM() {
         return memNonHeapMaxM;
     }
 
     public void setMemNonHeapMaxM(Double memNonHeapMaxM) {
         this.memNonHeapMaxM = memNonHeapMaxM;
     }
 
     public Double getMemHeapUsedM() {
         return memHeapUsedM;
     }
 
     public void setMemHeapUsedM(Double memHeapUsedM) {
         this.memHeapUsedM = memHeapUsedM;
     }
 
     public Double getMemHeapCommittedM() {
         return memHeapCommittedM;
     }
 
     public void setMemHeapCommittedM(Double memHeapCommittedM) {
         this.memHeapCommittedM = memHeapCommittedM;
     }
 
     public Double getMemHeapMaxM() {
         return memHeapMaxM;
     }
 
     public void setMemHeapMaxM(Double memHeapMaxM) {
         this.memHeapMaxM = memHeapMaxM;
     }
 
     public Double getMemMaxM() {
         return memMaxM;
     }
 
     public void setMemMaxM(Double memMaxM) {
         this.memMaxM = memMaxM;
     }
 
     public Integer getGcCountParNew() {
         return gcCountParNew;
     }
 
     public void setGcCountParNew(Integer gcCountParNew) {
         this.gcCountParNew = gcCountParNew;
     }
 
     public Integer getGcTimeMillisParNew() {
         return gcTimeMillisParNew;
     }
 
     public void setGcTimeMillisParNew(Integer gcTimeMillisParNew) {
         this.gcTimeMillisParNew = gcTimeMillisParNew;
     }
 
     public Integer getGcCountConcurrentMarkSweep() {
         return gcCountConcurrentMarkSweep;
     }
 
     public void setGcCountConcurrentMarkSweep(Integer gcCountConcurrentMarkSweep) {
         this.gcCountConcurrentMarkSweep = gcCountConcurrentMarkSweep;
     }
 
     public Integer getGcTimeMillisConcurrentMarkSweep() {
         return gcTimeMillisConcurrentMarkSweep;
     }
 
     public void setGcTimeMillisConcurrentMarkSweep(Integer gcTimeMillisConcurrentMarkSweep) {
         this.gcTimeMillisConcurrentMarkSweep = gcTimeMillisConcurrentMarkSweep;
     }
 
     public Integer getGcCount() {
         return gcCount;
     }
 
     public void setGcCount(Integer gcCount) {
         this.gcCount = gcCount;
     }
 
     public Integer getGcTimeMillis() {
         return gcTimeMillis;
     }
 
     public void setGcTimeMillis(Integer gcTimeMillis) {
         this.gcTimeMillis = gcTimeMillis;
     }
 
     public Integer getGcNumWarnThresholdExceeded() {
         return gcNumWarnThresholdExceeded;
     }
 
     public void setGcNumWarnThresholdExceeded(Integer gcNumWarnThresholdExceeded) {
         this.gcNumWarnThresholdExceeded = gcNumWarnThresholdExceeded;
     }
 
     public Integer getGcNumInfoThresholdExceeded() {
         return gcNumInfoThresholdExceeded;
     }
 
     public void setGcNumInfoThresholdExceeded(Integer gcNumInfoThresholdExceeded) {
         this.gcNumInfoThresholdExceeded = gcNumInfoThresholdExceeded;
     }
 
     public Integer getGcTotalExtraSleepTime() {
         return gcTotalExtraSleepTime;
     }
 
     public void setGcTotalExtraSleepTime(Integer gcTotalExtraSleepTime) {
         this.gcTotalExtraSleepTime = gcTotalExtraSleepTime;
     }
 
     public Integer getThreadsNew() {
         return threadsNew;
     }
 
     public void setThreadsNew(Integer threadsNew) {
         this.threadsNew = threadsNew;
     }
 
     public Integer getThreadsRunnable() {
         return threadsRunnable;
     }
 
     public void setThreadsRunnable(Integer threadsRunnable) {
         this.threadsRunnable = threadsRunnable;
     }
 
     public Integer getThreadsBlocked() {
         return threadsBlocked;
     }
 
     public void setThreadsBlocked(Integer threadsBlocked) {
         this.threadsBlocked = threadsBlocked;
     }
 
     public Integer getThreadsWaiting() {
         return threadsWaiting;
     }
 
     public void setThreadsWaiting(Integer threadsWaiting) {
         this.threadsWaiting = threadsWaiting;
     }
 
     public Integer getThreadsTimedWaiting() {
         return threadsTimedWaiting;
     }
 
     public void setThreadsTimedWaiting(Integer threadsTimedWaiting) {
         this.threadsTimedWaiting = threadsTimedWaiting;
     }
 
     public Integer getThreadsTerminated() {
         return threadsTerminated;
     }
 
     public void setThreadsTerminated(Integer threadsTerminated) {
         this.threadsTerminated = threadsTerminated;
     }
 
     public Integer getLogFatal() {
         return logFatal;
     }
 
     public void setLogFatal(Integer logFatal) {
         this.logFatal = logFatal;
     }
 
     public Integer getLogError() {
         return logError;
     }
 
     public void setLogError(Integer logError) {
         this.logError = logError;
     }
 
     public Integer getLogWarn() {
         return logWarn;
     }
 
     public void setLogWarn(Integer logWarn) {
         this.logWarn = logWarn;
     }
 
     public Integer getLogInfo() {
         return logInfo;
     }
 
     public void setLogInfo(Integer logInfo) {
         this.logInfo = logInfo;
     }
 
     public List<String> getMemoryPoolNames() {
         return memoryPoolNames;
     }
 
     public void setMemoryPoolNames(List<String> memoryPoolNames) {
         this.memoryPoolNames = memoryPoolNames;
     }
 
     public String getTagPort() {
         return tagPort;
     }
 
     public void setTagPort(String tagPort) {
         this.tagPort = tagPort;
     }
 
     public String getTagNumOpenConnectionsPerUser() {
         return tagNumOpenConnectionsPerUser;
     }
 
     public void setTagNumOpenConnectionsPerUser(String tagNumOpenConnectionsPerUser) {
         this.tagNumOpenConnectionsPerUser = tagNumOpenConnectionsPerUser;
     }
 
     public Integer getReceivedBytes() {
         return receivedBytes;
     }
 
     public void setReceivedBytes(Integer receivedBytes) {
         this.receivedBytes = receivedBytes;
     }
 
     public Integer getSentBytes() {
         return sentBytes;
     }
 
     public void setSentBytes(Integer sentBytes) {
         this.sentBytes = sentBytes;
     }
 
     public Integer getRpcQueueTimeNumOps() {
         return rpcQueueTimeNumOps;
     }
 
     public void setRpcQueueTimeNumOps(Integer rpcQueueTimeNumOps) {
         this.rpcQueueTimeNumOps = rpcQueueTimeNumOps;
     }
 
     public Double getRpcQueueTimeAvgTime() {
         return rpcQueueTimeAvgTime;
     }
 
     public void setRpcQueueTimeAvgTime(Double rpcQueueTimeAvgTime) {
         this.rpcQueueTimeAvgTime = rpcQueueTimeAvgTime;
     }
 
     public Integer getRpcProcessingTimeNumOps() {
         return rpcProcessingTimeNumOps;
     }
 
     public void setRpcProcessingTimeNumOps(Integer rpcProcessingTimeNumOps) {
         this.rpcProcessingTimeNumOps = rpcProcessingTimeNumOps;
     }
 
     public Double getRpcProcessingTimeAvgTime() {
         return rpcProcessingTimeAvgTime;
     }
 
     public void setRpcProcessingTimeAvgTime(Double rpcProcessingTimeAvgTime) {
         this.rpcProcessingTimeAvgTime = rpcProcessingTimeAvgTime;
     }
 
     public Integer getDeferredRpcProcessingTimeNumOps() {
         return deferredRpcProcessingTimeNumOps;
     }
 
     public void setDeferredRpcProcessingTimeNumOps(Integer deferredRpcProcessingTimeNumOps) {
         this.deferredRpcProcessingTimeNumOps = deferredRpcProcessingTimeNumOps;
     }
 
     public Double getDeferredRpcProcessingTimeAvgTime() {
         return deferredRpcProcessingTimeAvgTime;
     }
 
     public void setDeferredRpcProcessingTimeAvgTime(Double deferredRpcProcessingTimeAvgTime) {
         this.deferredRpcProcessingTimeAvgTime = deferredRpcProcessingTimeAvgTime;
     }
 
     public Integer getRpcAuthenticationFailures() {
         return rpcAuthenticationFailures;
     }
 
     public void setRpcAuthenticationFailures(Integer rpcAuthenticationFailures) {
         this.rpcAuthenticationFailures = rpcAuthenticationFailures;
     }
 
     public Integer getRpcAuthenticationSuccesses() {
         return rpcAuthenticationSuccesses;
     }
 
     public void setRpcAuthenticationSuccesses(Integer rpcAuthenticationSuccesses) {
         this.rpcAuthenticationSuccesses = rpcAuthenticationSuccesses;
     }
 
     public Integer getRpcAuthorizationFailures() {
         return rpcAuthorizationFailures;
     }
 
     public void setRpcAuthorizationFailures(Integer rpcAuthorizationFailures) {
         this.rpcAuthorizationFailures = rpcAuthorizationFailures;
     }
 
     public Integer getRpcAuthorizationSuccesses() {
         return rpcAuthorizationSuccesses;
     }
 
     public void setRpcAuthorizationSuccesses(Integer rpcAuthorizationSuccesses) {
         this.rpcAuthorizationSuccesses = rpcAuthorizationSuccesses;
     }
 
     public Integer getRpcClientBackoff() {
         return rpcClientBackoff;
     }
 
     public void setRpcClientBackoff(Integer rpcClientBackoff) {
         this.rpcClientBackoff = rpcClientBackoff;
     }
 
     public Integer getRpcSlowCalls() {
         return rpcSlowCalls;
     }
 
     public void setRpcSlowCalls(Integer rpcSlowCalls) {
         this.rpcSlowCalls = rpcSlowCalls;
     }
 
     public Integer getNumOpenConnections() {
         return numOpenConnections;
     }
 
     public void setNumOpenConnections(Integer numOpenConnections) {
         this.numOpenConnections = numOpenConnections;
     }
 
     public Integer getCallQueueLength() {
         return callQueueLength;
     }
 
     public void setCallQueueLength(Integer callQueueLength) {
         this.callQueueLength = callQueueLength;
     }
 
     public Integer getNumDroppedConnections() {
         return numDroppedConnections;
     }
 
     public void setNumDroppedConnections(Integer numDroppedConnections) {
         this.numDroppedConnections = numDroppedConnections;
     }
 
     public List<String> getLoggerNames() {
         return loggerNames;
     }
 
     public void setLoggerNames(List<String> loggerNames) {
         this.loggerNames = loggerNames;
     }
 
     public Integer getTotalLoadedClassCount() {
         return totalLoadedClassCount;
     }
 
     public void setTotalLoadedClassCount(Integer totalLoadedClassCount) {
         this.totalLoadedClassCount = totalLoadedClassCount;
     }
 
     public Boolean getVerbose() {
         return verbose;
     }
 
     public void setVerbose(Boolean verbose) {
         this.verbose = verbose;
     }
 
     public Integer getLoadedClassCount() {
         return loadedClassCount;
     }
 
     public void setLoadedClassCount(Integer loadedClassCount) {
         this.loadedClassCount = loadedClassCount;
     }
 
     public Integer getUnloadedClassCount() {
         return unloadedClassCount;
     }
 
     public void setUnloadedClassCount(Integer unloadedClassCount) {
         this.unloadedClassCount = unloadedClassCount;
     }
 
     public Integer getNumActiveSources() {
         return numActiveSources;
     }
 
     public void setNumActiveSources(Integer numActiveSources) {
         this.numActiveSources = numActiveSources;
     }
 
     public Integer getNumAllSources() {
         return numAllSources;
     }
 
     public void setNumAllSources(Integer numAllSources) {
         this.numAllSources = numAllSources;
     }
 
     public Integer getNumActiveSinks() {
         return numActiveSinks;
     }
 
     public void setNumActiveSinks(Integer numActiveSinks) {
         this.numActiveSinks = numActiveSinks;
     }
 
     public Integer getNumAllSinks() {
         return numAllSinks;
     }
 
     public void setNumAllSinks(Integer numAllSinks) {
         this.numAllSinks = numAllSinks;
     }
 
     public Integer getSinkTimelineNumOps() {
         return sinkTimelineNumOps;
     }
 
     public void setSinkTimelineNumOps(Integer sinkTimelineNumOps) {
         this.sinkTimelineNumOps = sinkTimelineNumOps;
     }
 
     public Double getSinkTimelineAvgTime() {
         return sinkTimelineAvgTime;
     }
 
     public void setSinkTimelineAvgTime(Double sinkTimelineAvgTime) {
         this.sinkTimelineAvgTime = sinkTimelineAvgTime;
     }
 
     public Integer getSinkTimelineDropped() {
         return sinkTimelineDropped;
     }
 
     public void setSinkTimelineDropped(Integer sinkTimelineDropped) {
         this.sinkTimelineDropped = sinkTimelineDropped;
     }
 
     public Integer getSinkTimelineQsize() {
         return sinkTimelineQsize;
     }
 
     public void setSinkTimelineQsize(Integer sinkTimelineQsize) {
         this.sinkTimelineQsize = sinkTimelineQsize;
     }
 
     public Integer getSnapshotNumOps() {
         return snapshotNumOps;
     }
 
     public void setSnapshotNumOps(Integer snapshotNumOps) {
         this.snapshotNumOps = snapshotNumOps;
     }
 
     public Double getSnapshotAvgTime() {
         return snapshotAvgTime;
     }
 
     public void setSnapshotAvgTime(Double snapshotAvgTime) {
         this.snapshotAvgTime = snapshotAvgTime;
     }
 
     public Integer getPublishNumOps() {
         return publishNumOps;
     }
 
     public void setPublishNumOps(Integer publishNumOps) {
         this.publishNumOps = publishNumOps;
     }
 
     public Double getPublishAvgTime() {
         return publishAvgTime;
     }
 
     public void setPublishAvgTime(Double publishAvgTime) {
         this.publishAvgTime = publishAvgTime;
     }
 
     public Integer getDroppedPubAll() {
         return droppedPubAll;
     }
 
     public void setDroppedPubAll(Integer droppedPubAll) {
         this.droppedPubAll = droppedPubAll;
     }
 
     public String getTagStorageInfo() {
         return tagStorageInfo;
     }
 
     public void setTagStorageInfo(String tagStorageInfo) {
         this.tagStorageInfo = tagStorageInfo;
     }
 
     public Integer getNumBlocksFailedToUnCache() {
         return numBlocksFailedToUnCache;
     }
 
     public void setNumBlocksFailedToUnCache(Integer numBlocksFailedToUnCache) {
         this.numBlocksFailedToUnCache = numBlocksFailedToUnCache;
     }
 
     public Integer getCollectionUsageThreshold() {
         return collectionUsageThreshold;
     }
 
     public void setCollectionUsageThreshold(Integer collectionUsageThreshold) {
         this.collectionUsageThreshold = collectionUsageThreshold;
     }
 
     public Boolean getCollectionUsageThresholdExceeded() {
         return collectionUsageThresholdExceeded;
     }
 
     public void setCollectionUsageThresholdExceeded(Boolean collectionUsageThresholdExceeded) {
         this.collectionUsageThresholdExceeded = collectionUsageThresholdExceeded;
     }
 
     public Integer getCollectionUsageThresholdCount() {
         return collectionUsageThresholdCount;
     }
 
     public void setCollectionUsageThresholdCount(Integer collectionUsageThresholdCount) {
         this.collectionUsageThresholdCount = collectionUsageThresholdCount;
     }
 
     public LastGcInfo getLastGcInfo() {
         return lastGcInfo;
     }
 
     public void setLastGcInfo(LastGcInfo lastGcInfo) {
         this.lastGcInfo = lastGcInfo;
     }
 
     public Integer getCollectionCount() {
         return collectionCount;
     }
 
     public void setCollectionCount(Integer collectionCount) {
         this.collectionCount = collectionCount;
     }
 
     public Integer getCollectionTime() {
         return collectionTime;
     }
 
     public void setCollectionTime(Integer collectionTime) {
         this.collectionTime = collectionTime;
     }
 
     public Integer getXceiverCount() {
         return xceiverCount;
     }
 
     public void setXceiverCount(Integer xceiverCount) {
         this.xceiverCount = xceiverCount;
     }
 
     public List<Object> getDatanodeNetworkCounts() {
         return datanodeNetworkCounts;
     }
 
     public void setDatanodeNetworkCounts(List<Object> datanodeNetworkCounts) {
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
 
     public Integer getBytesWritten() {
         return bytesWritten;
     }
 
     public void setBytesWritten(Integer bytesWritten) {
         this.bytesWritten = bytesWritten;
     }
 
     public Integer getTotalWriteTime() {
         return totalWriteTime;
     }
 
     public void setTotalWriteTime(Integer totalWriteTime) {
         this.totalWriteTime = totalWriteTime;
     }
 
     public Integer getBytesRead() {
         return bytesRead;
     }
 
     public void setBytesRead(Integer bytesRead) {
         this.bytesRead = bytesRead;
     }
 
     public Integer getTotalReadTime() {
         return totalReadTime;
     }
 
     public void setTotalReadTime(Integer totalReadTime) {
         this.totalReadTime = totalReadTime;
     }
 
     public Integer getBlocksWritten() {
         return blocksWritten;
     }
 
     public void setBlocksWritten(Integer blocksWritten) {
         this.blocksWritten = blocksWritten;
     }
 
     public Integer getBlocksRead() {
         return blocksRead;
     }
 
     public void setBlocksRead(Integer blocksRead) {
         this.blocksRead = blocksRead;
     }
 
     public Integer getBlocksReplicated() {
         return blocksReplicated;
     }
 
     public void setBlocksReplicated(Integer blocksReplicated) {
         this.blocksReplicated = blocksReplicated;
     }
 
     public Integer getBlocksRemoved() {
         return blocksRemoved;
     }
 
     public void setBlocksRemoved(Integer blocksRemoved) {
         this.blocksRemoved = blocksRemoved;
     }
 
     public Integer getBlocksVerified() {
         return blocksVerified;
     }
 
     public void setBlocksVerified(Integer blocksVerified) {
         this.blocksVerified = blocksVerified;
     }
 
     public Integer getBlockVerificationFailures() {
         return blockVerificationFailures;
     }
 
     public void setBlockVerificationFailures(Integer blockVerificationFailures) {
         this.blockVerificationFailures = blockVerificationFailures;
     }
 
     public Integer getBlocksCached() {
         return blocksCached;
     }
 
     public void setBlocksCached(Integer blocksCached) {
         this.blocksCached = blocksCached;
     }
 
     public Integer getBlocksUncached() {
         return blocksUncached;
     }
 
     public void setBlocksUncached(Integer blocksUncached) {
         this.blocksUncached = blocksUncached;
     }
 
     public Integer getReadsFromLocalClient() {
         return readsFromLocalClient;
     }
 
     public void setReadsFromLocalClient(Integer readsFromLocalClient) {
         this.readsFromLocalClient = readsFromLocalClient;
     }
 
     public Integer getReadsFromRemoteClient() {
         return readsFromRemoteClient;
     }
 
     public void setReadsFromRemoteClient(Integer readsFromRemoteClient) {
         this.readsFromRemoteClient = readsFromRemoteClient;
     }
 
     public Integer getWritesFromLocalClient() {
         return writesFromLocalClient;
     }
 
     public void setWritesFromLocalClient(Integer writesFromLocalClient) {
         this.writesFromLocalClient = writesFromLocalClient;
     }
 
     public Integer getWritesFromRemoteClient() {
         return writesFromRemoteClient;
     }
 
     public void setWritesFromRemoteClient(Integer writesFromRemoteClient) {
         this.writesFromRemoteClient = writesFromRemoteClient;
     }
 
     public Integer getBlocksGetLocalPathInfo() {
         return blocksGetLocalPathInfo;
     }
 
     public void setBlocksGetLocalPathInfo(Integer blocksGetLocalPathInfo) {
         this.blocksGetLocalPathInfo = blocksGetLocalPathInfo;
     }
 
     public Integer getRemoteBytesRead() {
         return remoteBytesRead;
     }
 
     public void setRemoteBytesRead(Integer remoteBytesRead) {
         this.remoteBytesRead = remoteBytesRead;
     }
 
     public Integer getRemoteBytesWritten() {
         return remoteBytesWritten;
     }
 
     public void setRemoteBytesWritten(Integer remoteBytesWritten) {
         this.remoteBytesWritten = remoteBytesWritten;
     }
 
     public Integer getRamDiskBlocksWrite() {
         return ramDiskBlocksWrite;
     }
 
     public void setRamDiskBlocksWrite(Integer ramDiskBlocksWrite) {
         this.ramDiskBlocksWrite = ramDiskBlocksWrite;
     }
 
     public Integer getRamDiskBlocksWriteFallback() {
         return ramDiskBlocksWriteFallback;
     }
 
     public void setRamDiskBlocksWriteFallback(Integer ramDiskBlocksWriteFallback) {
         this.ramDiskBlocksWriteFallback = ramDiskBlocksWriteFallback;
     }
 
     public Integer getRamDiskBytesWrite() {
         return ramDiskBytesWrite;
     }
 
     public void setRamDiskBytesWrite(Integer ramDiskBytesWrite) {
         this.ramDiskBytesWrite = ramDiskBytesWrite;
     }
 
     public Integer getRamDiskBlocksReadHits() {
         return ramDiskBlocksReadHits;
     }
 
     public void setRamDiskBlocksReadHits(Integer ramDiskBlocksReadHits) {
         this.ramDiskBlocksReadHits = ramDiskBlocksReadHits;
     }
 
     public Integer getRamDiskBlocksEvicted() {
         return ramDiskBlocksEvicted;
     }
 
     public void setRamDiskBlocksEvicted(Integer ramDiskBlocksEvicted) {
         this.ramDiskBlocksEvicted = ramDiskBlocksEvicted;
     }
 
     public Integer getRamDiskBlocksEvictedWithoutRead() {
         return ramDiskBlocksEvictedWithoutRead;
     }
 
     public void setRamDiskBlocksEvictedWithoutRead(Integer ramDiskBlocksEvictedWithoutRead) {
         this.ramDiskBlocksEvictedWithoutRead = ramDiskBlocksEvictedWithoutRead;
     }
 
     public Integer getRamDiskBlocksEvictionWindowMsNumOps() {
         return ramDiskBlocksEvictionWindowMsNumOps;
     }
 
     public void setRamDiskBlocksEvictionWindowMsNumOps(Integer ramDiskBlocksEvictionWindowMsNumOps) {
         this.ramDiskBlocksEvictionWindowMsNumOps = ramDiskBlocksEvictionWindowMsNumOps;
     }
 
     public Double getRamDiskBlocksEvictionWindowMsAvgTime() {
         return ramDiskBlocksEvictionWindowMsAvgTime;
     }
 
     public void setRamDiskBlocksEvictionWindowMsAvgTime(Double ramDiskBlocksEvictionWindowMsAvgTime) {
         this.ramDiskBlocksEvictionWindowMsAvgTime = ramDiskBlocksEvictionWindowMsAvgTime;
     }
 
     public Integer getRamDiskBlocksLazyPersisted() {
         return ramDiskBlocksLazyPersisted;
     }
 
     public void setRamDiskBlocksLazyPersisted(Integer ramDiskBlocksLazyPersisted) {
         this.ramDiskBlocksLazyPersisted = ramDiskBlocksLazyPersisted;
     }
 
     public Integer getRamDiskBlocksDeletedBeforeLazyPersisted() {
         return ramDiskBlocksDeletedBeforeLazyPersisted;
     }
 
     public void setRamDiskBlocksDeletedBeforeLazyPersisted(Integer ramDiskBlocksDeletedBeforeLazyPersisted) {
         this.ramDiskBlocksDeletedBeforeLazyPersisted = ramDiskBlocksDeletedBeforeLazyPersisted;
     }
 
     public Integer getRamDiskBytesLazyPersisted() {
         return ramDiskBytesLazyPersisted;
     }
 
     public void setRamDiskBytesLazyPersisted(Integer ramDiskBytesLazyPersisted) {
         this.ramDiskBytesLazyPersisted = ramDiskBytesLazyPersisted;
     }
 
     public Integer getRamDiskBlocksLazyPersistWindowMsNumOps() {
         return ramDiskBlocksLazyPersistWindowMsNumOps;
     }
 
     public void setRamDiskBlocksLazyPersistWindowMsNumOps(Integer ramDiskBlocksLazyPersistWindowMsNumOps) {
         this.ramDiskBlocksLazyPersistWindowMsNumOps = ramDiskBlocksLazyPersistWindowMsNumOps;
     }
 
     public Double getRamDiskBlocksLazyPersistWindowMsAvgTime() {
         return ramDiskBlocksLazyPersistWindowMsAvgTime;
     }
 
     public void setRamDiskBlocksLazyPersistWindowMsAvgTime(Double ramDiskBlocksLazyPersistWindowMsAvgTime) {
         this.ramDiskBlocksLazyPersistWindowMsAvgTime = ramDiskBlocksLazyPersistWindowMsAvgTime;
     }
 
     public Integer getFsyncCount() {
         return fsyncCount;
     }
 
     public void setFsyncCount(Integer fsyncCount) {
         this.fsyncCount = fsyncCount;
     }
 
     public Integer getVolumeFailures() {
         return volumeFailures;
     }
 
     public void setVolumeFailures(Integer volumeFailures) {
         this.volumeFailures = volumeFailures;
     }
 
     public Integer getDatanodeNetworkErrors() {
         return datanodeNetworkErrors;
     }
 
     public void setDatanodeNetworkErrors(Integer datanodeNetworkErrors) {
         this.datanodeNetworkErrors = datanodeNetworkErrors;
     }
 
     public Integer getDataNodeActiveXceiversCount() {
         return dataNodeActiveXceiversCount;
     }
 
     public void setDataNodeActiveXceiversCount(Integer dataNodeActiveXceiversCount) {
         this.dataNodeActiveXceiversCount = dataNodeActiveXceiversCount;
     }
 
     public Integer getReadBlockOpNumOps() {
         return readBlockOpNumOps;
     }
 
     public void setReadBlockOpNumOps(Integer readBlockOpNumOps) {
         this.readBlockOpNumOps = readBlockOpNumOps;
     }
 
     public Double getReadBlockOpAvgTime() {
         return readBlockOpAvgTime;
     }
 
     public void setReadBlockOpAvgTime(Double readBlockOpAvgTime) {
         this.readBlockOpAvgTime = readBlockOpAvgTime;
     }
 
     public Integer getWriteBlockOpNumOps() {
         return writeBlockOpNumOps;
     }
 
     public void setWriteBlockOpNumOps(Integer writeBlockOpNumOps) {
         this.writeBlockOpNumOps = writeBlockOpNumOps;
     }
 
     public Double getWriteBlockOpAvgTime() {
         return writeBlockOpAvgTime;
     }
 
     public void setWriteBlockOpAvgTime(Double writeBlockOpAvgTime) {
         this.writeBlockOpAvgTime = writeBlockOpAvgTime;
     }
 
     public Integer getBlockChecksumOpNumOps() {
         return blockChecksumOpNumOps;
     }
 
     public void setBlockChecksumOpNumOps(Integer blockChecksumOpNumOps) {
         this.blockChecksumOpNumOps = blockChecksumOpNumOps;
     }
 
     public Double getBlockChecksumOpAvgTime() {
         return blockChecksumOpAvgTime;
     }
 
     public void setBlockChecksumOpAvgTime(Double blockChecksumOpAvgTime) {
         this.blockChecksumOpAvgTime = blockChecksumOpAvgTime;
     }
 
     public Integer getCopyBlockOpNumOps() {
         return copyBlockOpNumOps;
     }
 
     public void setCopyBlockOpNumOps(Integer copyBlockOpNumOps) {
         this.copyBlockOpNumOps = copyBlockOpNumOps;
     }
 
     public Double getCopyBlockOpAvgTime() {
         return copyBlockOpAvgTime;
     }
 
     public void setCopyBlockOpAvgTime(Double copyBlockOpAvgTime) {
         this.copyBlockOpAvgTime = copyBlockOpAvgTime;
     }
 
     public Integer getReplaceBlockOpNumOps() {
         return replaceBlockOpNumOps;
     }
 
     public void setReplaceBlockOpNumOps(Integer replaceBlockOpNumOps) {
         this.replaceBlockOpNumOps = replaceBlockOpNumOps;
     }
 
     public Double getReplaceBlockOpAvgTime() {
         return replaceBlockOpAvgTime;
     }
 
     public void setReplaceBlockOpAvgTime(Double replaceBlockOpAvgTime) {
         this.replaceBlockOpAvgTime = replaceBlockOpAvgTime;
     }
 
     public Integer getHeartbeatsNumOps() {
         return heartbeatsNumOps;
     }
 
     public void setHeartbeatsNumOps(Integer heartbeatsNumOps) {
         this.heartbeatsNumOps = heartbeatsNumOps;
     }
 
     public Double getHeartbeatsAvgTime() {
         return heartbeatsAvgTime;
     }
 
     public void setHeartbeatsAvgTime(Double heartbeatsAvgTime) {
         this.heartbeatsAvgTime = heartbeatsAvgTime;
     }
 
     public Integer getHeartbeatsTotalNumOps() {
         return heartbeatsTotalNumOps;
     }
 
     public void setHeartbeatsTotalNumOps(Integer heartbeatsTotalNumOps) {
         this.heartbeatsTotalNumOps = heartbeatsTotalNumOps;
     }
 
     public Double getHeartbeatsTotalAvgTime() {
         return heartbeatsTotalAvgTime;
     }
 
     public void setHeartbeatsTotalAvgTime(Double heartbeatsTotalAvgTime) {
         this.heartbeatsTotalAvgTime = heartbeatsTotalAvgTime;
     }
 
     public Integer getLifelinesNumOps() {
         return lifelinesNumOps;
     }
 
     public void setLifelinesNumOps(Integer lifelinesNumOps) {
         this.lifelinesNumOps = lifelinesNumOps;
     }
 
     public Double getLifelinesAvgTime() {
         return lifelinesAvgTime;
     }
 
     public void setLifelinesAvgTime(Double lifelinesAvgTime) {
         this.lifelinesAvgTime = lifelinesAvgTime;
     }
 
     public Integer getBlockReportsNumOps() {
         return blockReportsNumOps;
     }
 
     public void setBlockReportsNumOps(Integer blockReportsNumOps) {
         this.blockReportsNumOps = blockReportsNumOps;
     }
 
     public Double getBlockReportsAvgTime() {
         return blockReportsAvgTime;
     }
 
     public void setBlockReportsAvgTime(Double blockReportsAvgTime) {
         this.blockReportsAvgTime = blockReportsAvgTime;
     }
 
     public Integer getIncrementalBlockReportsNumOps() {
         return incrementalBlockReportsNumOps;
     }
 
     public void setIncrementalBlockReportsNumOps(Integer incrementalBlockReportsNumOps) {
         this.incrementalBlockReportsNumOps = incrementalBlockReportsNumOps;
     }
 
     public Double getIncrementalBlockReportsAvgTime() {
         return incrementalBlockReportsAvgTime;
     }
 
     public void setIncrementalBlockReportsAvgTime(Double incrementalBlockReportsAvgTime) {
         this.incrementalBlockReportsAvgTime = incrementalBlockReportsAvgTime;
     }
 
     public Integer getCacheReportsNumOps() {
         return cacheReportsNumOps;
     }
 
     public void setCacheReportsNumOps(Integer cacheReportsNumOps) {
         this.cacheReportsNumOps = cacheReportsNumOps;
     }
 
     public Double getCacheReportsAvgTime() {
         return cacheReportsAvgTime;
     }
 
     public void setCacheReportsAvgTime(Double cacheReportsAvgTime) {
         this.cacheReportsAvgTime = cacheReportsAvgTime;
     }
 
     public Integer getPacketAckRoundTripTimeNanosNumOps() {
         return packetAckRoundTripTimeNanosNumOps;
     }
 
     public void setPacketAckRoundTripTimeNanosNumOps(Integer packetAckRoundTripTimeNanosNumOps) {
         this.packetAckRoundTripTimeNanosNumOps = packetAckRoundTripTimeNanosNumOps;
     }
 
     public Double getPacketAckRoundTripTimeNanosAvgTime() {
         return packetAckRoundTripTimeNanosAvgTime;
     }
 
     public void setPacketAckRoundTripTimeNanosAvgTime(Double packetAckRoundTripTimeNanosAvgTime) {
         this.packetAckRoundTripTimeNanosAvgTime = packetAckRoundTripTimeNanosAvgTime;
     }
 
     public Integer getFlushNanosNumOps() {
         return flushNanosNumOps;
     }
 
     public void setFlushNanosNumOps(Integer flushNanosNumOps) {
         this.flushNanosNumOps = flushNanosNumOps;
     }
 
     public Double getFlushNanosAvgTime() {
         return flushNanosAvgTime;
     }
 
     public void setFlushNanosAvgTime(Double flushNanosAvgTime) {
         this.flushNanosAvgTime = flushNanosAvgTime;
     }
 
     public Integer getFsyncNanosNumOps() {
         return fsyncNanosNumOps;
     }
 
     public void setFsyncNanosNumOps(Integer fsyncNanosNumOps) {
         this.fsyncNanosNumOps = fsyncNanosNumOps;
     }
 
     public Double getFsyncNanosAvgTime() {
         return fsyncNanosAvgTime;
     }
 
     public void setFsyncNanosAvgTime(Double fsyncNanosAvgTime) {
         this.fsyncNanosAvgTime = fsyncNanosAvgTime;
     }
 
     public Integer getSendDataPacketBlockedOnNetworkNanosNumOps() {
         return sendDataPacketBlockedOnNetworkNanosNumOps;
     }
 
     public void setSendDataPacketBlockedOnNetworkNanosNumOps(Integer sendDataPacketBlockedOnNetworkNanosNumOps) {
         this.sendDataPacketBlockedOnNetworkNanosNumOps = sendDataPacketBlockedOnNetworkNanosNumOps;
     }
 
     public Double getSendDataPacketBlockedOnNetworkNanosAvgTime() {
         return sendDataPacketBlockedOnNetworkNanosAvgTime;
     }
 
     public void setSendDataPacketBlockedOnNetworkNanosAvgTime(Double sendDataPacketBlockedOnNetworkNanosAvgTime) {
         this.sendDataPacketBlockedOnNetworkNanosAvgTime = sendDataPacketBlockedOnNetworkNanosAvgTime;
     }
 
     public Integer getSendDataPacketTransferNanosNumOps() {
         return sendDataPacketTransferNanosNumOps;
     }
 
     public void setSendDataPacketTransferNanosNumOps(Integer sendDataPacketTransferNanosNumOps) {
         this.sendDataPacketTransferNanosNumOps = sendDataPacketTransferNanosNumOps;
     }
 
     public Double getSendDataPacketTransferNanosAvgTime() {
         return sendDataPacketTransferNanosAvgTime;
     }
 
     public void setSendDataPacketTransferNanosAvgTime(Double sendDataPacketTransferNanosAvgTime) {
         this.sendDataPacketTransferNanosAvgTime = sendDataPacketTransferNanosAvgTime;
     }
 
     public Integer getBlocksInPendingIBR() {
         return blocksInPendingIBR;
     }
 
     public void setBlocksInPendingIBR(Integer blocksInPendingIBR) {
         this.blocksInPendingIBR = blocksInPendingIBR;
     }
 
     public Integer getBlocksReceivingInPendingIBR() {
         return blocksReceivingInPendingIBR;
     }
 
     public void setBlocksReceivingInPendingIBR(Integer blocksReceivingInPendingIBR) {
         this.blocksReceivingInPendingIBR = blocksReceivingInPendingIBR;
     }
 
     public Integer getBlocksReceivedInPendingIBR() {
         return blocksReceivedInPendingIBR;
     }
 
     public void setBlocksReceivedInPendingIBR(Integer blocksReceivedInPendingIBR) {
         this.blocksReceivedInPendingIBR = blocksReceivedInPendingIBR;
     }
 
     public Integer getBlocksDeletedInPendingIBR() {
         return blocksDeletedInPendingIBR;
     }
 
     public void setBlocksDeletedInPendingIBR(Integer blocksDeletedInPendingIBR) {
         this.blocksDeletedInPendingIBR = blocksDeletedInPendingIBR;
     }
 
     public Integer getEcReconstructionTasks() {
         return ecReconstructionTasks;
     }
 
     public void setEcReconstructionTasks(Integer ecReconstructionTasks) {
         this.ecReconstructionTasks = ecReconstructionTasks;
     }
 
     public Integer getEcFailedReconstructionTasks() {
         return ecFailedReconstructionTasks;
     }
 
     public void setEcFailedReconstructionTasks(Integer ecFailedReconstructionTasks) {
         this.ecFailedReconstructionTasks = ecFailedReconstructionTasks;
     }
 
     public Integer getEcDecodingTimeNanos() {
         return ecDecodingTimeNanos;
     }
 
     public void setEcDecodingTimeNanos(Integer ecDecodingTimeNanos) {
         this.ecDecodingTimeNanos = ecDecodingTimeNanos;
     }
 
     public Integer getEcReconstructionBytesRead() {
         return ecReconstructionBytesRead;
     }
 
     public void setEcReconstructionBytesRead(Integer ecReconstructionBytesRead) {
         this.ecReconstructionBytesRead = ecReconstructionBytesRead;
     }
 
     public Integer getEcReconstructionBytesWritten() {
         return ecReconstructionBytesWritten;
     }
 
     public void setEcReconstructionBytesWritten(Integer ecReconstructionBytesWritten) {
         this.ecReconstructionBytesWritten = ecReconstructionBytesWritten;
     }
 
     public Integer getEcReconstructionRemoteBytesRead() {
         return ecReconstructionRemoteBytesRead;
     }
 
     public void setEcReconstructionRemoteBytesRead(Integer ecReconstructionRemoteBytesRead) {
         this.ecReconstructionRemoteBytesRead = ecReconstructionRemoteBytesRead;
     }
 
     public Integer getEcReconstructionReadTimeMillis() {
         return ecReconstructionReadTimeMillis;
     }
 
     public void setEcReconstructionReadTimeMillis(Integer ecReconstructionReadTimeMillis) {
         this.ecReconstructionReadTimeMillis = ecReconstructionReadTimeMillis;
     }
 
     public Integer getEcReconstructionDecodingTimeMillis() {
         return ecReconstructionDecodingTimeMillis;
     }
 
     public void setEcReconstructionDecodingTimeMillis(Integer ecReconstructionDecodingTimeMillis) {
         this.ecReconstructionDecodingTimeMillis = ecReconstructionDecodingTimeMillis;
     }
 
     public Integer getEcReconstructionWriteTimeMillis() {
         return ecReconstructionWriteTimeMillis;
     }
 
     public void setEcReconstructionWriteTimeMillis(Integer ecReconstructionWriteTimeMillis) {
         this.ecReconstructionWriteTimeMillis = ecReconstructionWriteTimeMillis;
     }
 
     public Integer getTotalMetadataOperations() {
         return totalMetadataOperations;
     }
 
     public void setTotalMetadataOperations(Integer totalMetadataOperations) {
         this.totalMetadataOperations = totalMetadataOperations;
     }
 
     public Integer getMetadataOperationRateNumOps() {
         return metadataOperationRateNumOps;
     }
 
     public void setMetadataOperationRateNumOps(Integer metadataOperationRateNumOps) {
         this.metadataOperationRateNumOps = metadataOperationRateNumOps;
     }
 
     public Double getMetadataOperationRateAvgTime() {
         return metadataOperationRateAvgTime;
     }
 
     public void setMetadataOperationRateAvgTime(Double metadataOperationRateAvgTime) {
         this.metadataOperationRateAvgTime = metadataOperationRateAvgTime;
     }
 
     public Integer getTotalDataFileIos() {
         return totalDataFileIos;
     }
 
     public void setTotalDataFileIos(Integer totalDataFileIos) {
         this.totalDataFileIos = totalDataFileIos;
     }
 
     public Integer getDataFileIoRateNumOps() {
         return dataFileIoRateNumOps;
     }
 
     public void setDataFileIoRateNumOps(Integer dataFileIoRateNumOps) {
         this.dataFileIoRateNumOps = dataFileIoRateNumOps;
     }
 
     public Double getDataFileIoRateAvgTime() {
         return dataFileIoRateAvgTime;
     }
 
     public void setDataFileIoRateAvgTime(Double dataFileIoRateAvgTime) {
         this.dataFileIoRateAvgTime = dataFileIoRateAvgTime;
     }
 
     public Integer getFlushIoRateNumOps() {
         return flushIoRateNumOps;
     }
 
     public void setFlushIoRateNumOps(Integer flushIoRateNumOps) {
         this.flushIoRateNumOps = flushIoRateNumOps;
     }
 
     public Double getFlushIoRateAvgTime() {
         return flushIoRateAvgTime;
     }
 
     public void setFlushIoRateAvgTime(Double flushIoRateAvgTime) {
         this.flushIoRateAvgTime = flushIoRateAvgTime;
     }
 
     public Integer getSyncIoRateNumOps() {
         return syncIoRateNumOps;
     }
 
     public void setSyncIoRateNumOps(Integer syncIoRateNumOps) {
         this.syncIoRateNumOps = syncIoRateNumOps;
     }
 
     public Double getSyncIoRateAvgTime() {
         return syncIoRateAvgTime;
     }
 
     public void setSyncIoRateAvgTime(Double syncIoRateAvgTime) {
         this.syncIoRateAvgTime = syncIoRateAvgTime;
     }
 
     public Integer getReadIoRateNumOps() {
         return readIoRateNumOps;
     }
 
     public void setReadIoRateNumOps(Integer readIoRateNumOps) {
         this.readIoRateNumOps = readIoRateNumOps;
     }
 
     public Double getReadIoRateAvgTime() {
         return readIoRateAvgTime;
     }
 
     public void setReadIoRateAvgTime(Double readIoRateAvgTime) {
         this.readIoRateAvgTime = readIoRateAvgTime;
     }
 
     public Integer getWriteIoRateNumOps() {
         return writeIoRateNumOps;
     }
 
     public void setWriteIoRateNumOps(Integer writeIoRateNumOps) {
         this.writeIoRateNumOps = writeIoRateNumOps;
     }
 
     public Double getWriteIoRateAvgTime() {
         return writeIoRateAvgTime;
     }
 
     public void setWriteIoRateAvgTime(Double writeIoRateAvgTime) {
         this.writeIoRateAvgTime = writeIoRateAvgTime;
     }
 
     public Integer getTotalFileIoErrors() {
         return totalFileIoErrors;
     }
 
     public void setTotalFileIoErrors(Integer totalFileIoErrors) {
         this.totalFileIoErrors = totalFileIoErrors;
     }
 
     public Integer getFileIoErrorRateNumOps() {
         return fileIoErrorRateNumOps;
     }
 
     public void setFileIoErrorRateNumOps(Integer fileIoErrorRateNumOps) {
         this.fileIoErrorRateNumOps = fileIoErrorRateNumOps;
     }
 
     public Double getFileIoErrorRateAvgTime() {
         return fileIoErrorRateAvgTime;
     }
 
     public void setFileIoErrorRateAvgTime(Double fileIoErrorRateAvgTime) {
         this.fileIoErrorRateAvgTime = fileIoErrorRateAvgTime;
     }
 
     public Integer getObjectPendingFinalizationCount() {
         return objectPendingFinalizationCount;
     }
 
     public void setObjectPendingFinalizationCount(Integer objectPendingFinalizationCount) {
         this.objectPendingFinalizationCount = objectPendingFinalizationCount;
     }
 
     public HeapMemoryUsage getHeapMemoryUsage() {
         return heapMemoryUsage;
     }
 
     public void setHeapMemoryUsage(HeapMemoryUsage heapMemoryUsage) {
         this.heapMemoryUsage = heapMemoryUsage;
     }
 
     public NonHeapMemoryUsage getNonHeapMemoryUsage() {
         return nonHeapMemoryUsage;
     }
 
     public void setNonHeapMemoryUsage(NonHeapMemoryUsage nonHeapMemoryUsage) {
         this.nonHeapMemoryUsage = nonHeapMemoryUsage;
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
 
     public List<DiagnosticOption> getDiagnosticOptions() {
         return diagnosticOptions;
     }
 
     public void setDiagnosticOptions(List<DiagnosticOption> diagnosticOptions) {
         this.diagnosticOptions = diagnosticOptions;
     }
 
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(Bean.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
         sb.append("beanname");
         sb.append('=');
         sb.append(((this.beanname == null)?"<null>":this.beanname));
         sb.append(',');
         sb.append("modelerType");
         sb.append('=');
         sb.append(((this.modelerType == null)?"<null>":this.modelerType));
         sb.append(',');
         sb.append("remaining");
         sb.append('=');
         sb.append(((this.remaining == null)?"<null>":this.remaining));
         sb.append(',');
         sb.append("numFailedVolumes");
         sb.append('=');
         sb.append(((this.numFailedVolumes == null)?"<null>":this.numFailedVolumes));
         sb.append(',');
         sb.append("failedStorageLocations");
         sb.append('=');
         sb.append(((this.failedStorageLocations == null)?"<null>":this.failedStorageLocations));
         sb.append(',');
         sb.append("storageInfo");
         sb.append('=');
         sb.append(((this.storageInfo == null)?"<null>":this.storageInfo));
         sb.append(',');
         sb.append("capacity");
         sb.append('=');
         sb.append(((this.capacity == null)?"<null>":this.capacity));
         sb.append(',');
         sb.append("dfsUsed");
         sb.append('=');
         sb.append(((this.dfsUsed == null)?"<null>":this.dfsUsed));
         sb.append(',');
         sb.append("cacheCapacity");
         sb.append('=');
         sb.append(((this.cacheCapacity == null)?"<null>":this.cacheCapacity));
         sb.append(',');
         sb.append("cacheUsed");
         sb.append('=');
         sb.append(((this.cacheUsed == null)?"<null>":this.cacheUsed));
         sb.append(',');
         sb.append("lastVolumeFailureDate");
         sb.append('=');
         sb.append(((this.lastVolumeFailureDate == null)?"<null>":this.lastVolumeFailureDate));
         sb.append(',');
         sb.append("estimatedCapacityLostTotal");
         sb.append('=');
         sb.append(((this.estimatedCapacityLostTotal == null)?"<null>":this.estimatedCapacityLostTotal));
         sb.append(',');
         sb.append("numBlocksCached");
         sb.append('=');
         sb.append(((this.numBlocksCached == null)?"<null>":this.numBlocksCached));
         sb.append(',');
         sb.append("numBlocksFailedToCache");
         sb.append('=');
         sb.append(((this.numBlocksFailedToCache == null)?"<null>":this.numBlocksFailedToCache));
         sb.append(',');
         sb.append("numBlocksFailedToUncache");
         sb.append('=');
         sb.append(((this.numBlocksFailedToUncache == null)?"<null>":this.numBlocksFailedToUncache));
         sb.append(',');
         sb.append("mBeanServerId");
         sb.append('=');
         sb.append(((this.mBeanServerId == null)?"<null>":this.mBeanServerId));
         sb.append(',');
         sb.append("specificationName");
         sb.append('=');
         sb.append(((this.specificationName == null)?"<null>":this.specificationName));
         sb.append(',');
         sb.append("specificationVersion");
         sb.append('=');
         sb.append(((this.specificationVersion == null)?"<null>":this.specificationVersion));
         sb.append(',');
         sb.append("specificationVendor");
         sb.append('=');
         sb.append(((this.specificationVendor == null)?"<null>":this.specificationVendor));
         sb.append(',');
         sb.append("implementationName");
         sb.append('=');
         sb.append(((this.implementationName == null)?"<null>":this.implementationName));
         sb.append(',');
         sb.append("implementationVersion");
         sb.append('=');
         sb.append(((this.implementationVersion == null)?"<null>":this.implementationVersion));
         sb.append(',');
         sb.append("implementationVendor");
         sb.append('=');
         sb.append(((this.implementationVendor == null)?"<null>":this.implementationVendor));
         sb.append(',');
         sb.append("bootClassPathSupported");
         sb.append('=');
         sb.append(((this.bootClassPathSupported == null)?"<null>":this.bootClassPathSupported));
         sb.append(',');
         sb.append("vmName");
         sb.append('=');
         sb.append(((this.vmName == null)?"<null>":this.vmName));
         sb.append(',');
         sb.append("vmVendor");
         sb.append('=');
         sb.append(((this.vmVendor == null)?"<null>":this.vmVendor));
         sb.append(',');
         sb.append("vmVersion");
         sb.append('=');
         sb.append(((this.vmVersion == null)?"<null>":this.vmVersion));
         sb.append(',');
         sb.append("libraryPath");
         sb.append('=');
         sb.append(((this.libraryPath == null)?"<null>":this.libraryPath));
         sb.append(',');
         sb.append("bootClassPath");
         sb.append('=');
         sb.append(((this.bootClassPath == null)?"<null>":this.bootClassPath));
         sb.append(',');
         sb.append("specName");
         sb.append('=');
         sb.append(((this.specName == null)?"<null>":this.specName));
         sb.append(',');
         sb.append("specVendor");
         sb.append('=');
         sb.append(((this.specVendor == null)?"<null>":this.specVendor));
         sb.append(',');
         sb.append("specVersion");
         sb.append('=');
         sb.append(((this.specVersion == null)?"<null>":this.specVersion));
         sb.append(',');
         sb.append("managementSpecVersion");
         sb.append('=');
         sb.append(((this.managementSpecVersion == null)?"<null>":this.managementSpecVersion));
         sb.append(',');
         sb.append("inputArguments");
         sb.append('=');
         sb.append(((this.inputArguments == null)?"<null>":this.inputArguments));
         sb.append(',');
         sb.append("systemProperties");
         sb.append('=');
         sb.append(((this.systemProperties == null)?"<null>":this.systemProperties));
         sb.append(',');
         sb.append("startTime");
         sb.append('=');
         sb.append(((this.startTime == null)?"<null>":this.startTime));
         sb.append(',');
         sb.append("uptime");
         sb.append('=');
         sb.append(((this.uptime == null)?"<null>":this.uptime));
         sb.append(',');
         sb.append("name");
         sb.append('=');
         sb.append(((this.name == null)?"<null>":this.name));
         sb.append(',');
         sb.append("classPath");
         sb.append('=');
         sb.append(((this.classPath == null)?"<null>":this.classPath));
         sb.append(',');
         sb.append("objectName");
         sb.append('=');
         sb.append(((this.objectName == null)?"<null>":this.objectName));
         sb.append(',');
         sb.append("threadAllocatedMemorySupported");
         sb.append('=');
         sb.append(((this.threadAllocatedMemorySupported == null)?"<null>":this.threadAllocatedMemorySupported));
         sb.append(',');
         sb.append("threadAllocatedMemoryEnabled");
         sb.append('=');
         sb.append(((this.threadAllocatedMemoryEnabled == null)?"<null>":this.threadAllocatedMemoryEnabled));
         sb.append(',');
         sb.append("threadContentionMonitoringSupported");
         sb.append('=');
         sb.append(((this.threadContentionMonitoringSupported == null)?"<null>":this.threadContentionMonitoringSupported));
         sb.append(',');
         sb.append("currentThreadCpuTimeSupported");
         sb.append('=');
         sb.append(((this.currentThreadCpuTimeSupported == null)?"<null>":this.currentThreadCpuTimeSupported));
         sb.append(',');
         sb.append("objectMonitorUsageSupported");
         sb.append('=');
         sb.append(((this.objectMonitorUsageSupported == null)?"<null>":this.objectMonitorUsageSupported));
         sb.append(',');
         sb.append("synchronizerUsageSupported");
         sb.append('=');
         sb.append(((this.synchronizerUsageSupported == null)?"<null>":this.synchronizerUsageSupported));
         sb.append(',');
         sb.append("threadCpuTimeEnabled");
         sb.append('=');
         sb.append(((this.threadCpuTimeEnabled == null)?"<null>":this.threadCpuTimeEnabled));
         sb.append(',');
         sb.append("peakThreadCount");
         sb.append('=');
         sb.append(((this.peakThreadCount == null)?"<null>":this.peakThreadCount));
         sb.append(',');
         sb.append("daemonThreadCount");
         sb.append('=');
         sb.append(((this.daemonThreadCount == null)?"<null>":this.daemonThreadCount));
         sb.append(',');
         sb.append("threadCount");
         sb.append('=');
         sb.append(((this.threadCount == null)?"<null>":this.threadCount));
         sb.append(',');
         sb.append("totalStartedThreadCount");
         sb.append('=');
         sb.append(((this.totalStartedThreadCount == null)?"<null>":this.totalStartedThreadCount));
         sb.append(',');
         sb.append("threadCpuTimeSupported");
         sb.append('=');
         sb.append(((this.threadCpuTimeSupported == null)?"<null>":this.threadCpuTimeSupported));
         sb.append(',');
         sb.append("currentThreadCpuTime");
         sb.append('=');
         sb.append(((this.currentThreadCpuTime == null)?"<null>":this.currentThreadCpuTime));
         sb.append(',');
         sb.append("currentThreadUserTime");
         sb.append('=');
         sb.append(((this.currentThreadUserTime == null)?"<null>":this.currentThreadUserTime));
         sb.append(',');
         sb.append("threadContentionMonitoringEnabled");
         sb.append('=');
         sb.append(((this.threadContentionMonitoringEnabled == null)?"<null>":this.threadContentionMonitoringEnabled));
         sb.append(',');
         sb.append("allThreadIds");
         sb.append('=');
         sb.append(((this.allThreadIds == null)?"<null>":this.allThreadIds));
         sb.append(',');
         sb.append("openFileDescriptorCount");
         sb.append('=');
         sb.append(((this.openFileDescriptorCount == null)?"<null>":this.openFileDescriptorCount));
         sb.append(',');
         sb.append("maxFileDescriptorCount");
         sb.append('=');
         sb.append(((this.maxFileDescriptorCount == null)?"<null>":this.maxFileDescriptorCount));
         sb.append(',');
         sb.append("committedVirtualMemorySize");
         sb.append('=');
         sb.append(((this.committedVirtualMemorySize == null)?"<null>":this.committedVirtualMemorySize));
         sb.append(',');
         sb.append("totalSwapSpaceSize");
         sb.append('=');
         sb.append(((this.totalSwapSpaceSize == null)?"<null>":this.totalSwapSpaceSize));
         sb.append(',');
         sb.append("freeSwapSpaceSize");
         sb.append('=');
         sb.append(((this.freeSwapSpaceSize == null)?"<null>":this.freeSwapSpaceSize));
         sb.append(',');
         sb.append("processCpuTime");
         sb.append('=');
         sb.append(((this.processCpuTime == null)?"<null>":this.processCpuTime));
         sb.append(',');
         sb.append("freePhysicalMemorySize");
         sb.append('=');
         sb.append(((this.freePhysicalMemorySize == null)?"<null>":this.freePhysicalMemorySize));
         sb.append(',');
         sb.append("totalPhysicalMemorySize");
         sb.append('=');
         sb.append(((this.totalPhysicalMemorySize == null)?"<null>":this.totalPhysicalMemorySize));
         sb.append(',');
         sb.append("systemCpuLoad");
         sb.append('=');
         sb.append(((this.systemCpuLoad == null)?"<null>":this.systemCpuLoad));
         sb.append(',');
         sb.append("processCpuLoad");
         sb.append('=');
         sb.append(((this.processCpuLoad == null)?"<null>":this.processCpuLoad));
         sb.append(',');
         sb.append("availableProcessors");
         sb.append('=');
         sb.append(((this.availableProcessors == null)?"<null>":this.availableProcessors));
         sb.append(',');
         sb.append("arch");
         sb.append('=');
         sb.append(((this.arch == null)?"<null>":this.arch));
         sb.append(',');
         sb.append("version");
         sb.append('=');
         sb.append(((this.version == null)?"<null>":this.version));
         sb.append(',');
         sb.append("systemLoadAverage");
         sb.append('=');
         sb.append(((this.systemLoadAverage == null)?"<null>":this.systemLoadAverage));
         sb.append(',');
         sb.append("valid");
         sb.append('=');
         sb.append(((this.valid == null)?"<null>":this.valid));
         sb.append(',');
         sb.append("usage");
         sb.append('=');
         sb.append(((this.usage == null)?"<null>":this.usage));
         sb.append(',');
         sb.append("peakUsage");
         sb.append('=');
         sb.append(((this.peakUsage == null)?"<null>":this.peakUsage));
         sb.append(',');
         sb.append("memoryManagerNames");
         sb.append('=');
         sb.append(((this.memoryManagerNames == null)?"<null>":this.memoryManagerNames));
         sb.append(',');
         sb.append("usageThreshold");
         sb.append('=');
         sb.append(((this.usageThreshold == null)?"<null>":this.usageThreshold));
         sb.append(',');
         sb.append("usageThresholdExceeded");
         sb.append('=');
         sb.append(((this.usageThresholdExceeded == null)?"<null>":this.usageThresholdExceeded));
         sb.append(',');
         sb.append("usageThresholdCount");
         sb.append('=');
         sb.append(((this.usageThresholdCount == null)?"<null>":this.usageThresholdCount));
         sb.append(',');
         sb.append("usageThresholdSupported");
         sb.append('=');
         sb.append(((this.usageThresholdSupported == null)?"<null>":this.usageThresholdSupported));
         sb.append(',');
         sb.append("collectionUsage");
         sb.append('=');
         sb.append(((this.collectionUsage == null)?"<null>":this.collectionUsage));
         sb.append(',');
         sb.append("collectionUsageThresholdSupported");
         sb.append('=');
         sb.append(((this.collectionUsageThresholdSupported == null)?"<null>":this.collectionUsageThresholdSupported));
         sb.append(',');
         sb.append("type");
         sb.append('=');
         sb.append(((this.type == null)?"<null>":this.type));
         sb.append(',');
         sb.append("totalCapacity");
         sb.append('=');
         sb.append(((this.totalCapacity == null)?"<null>":this.totalCapacity));
         sb.append(',');
         sb.append("memoryUsed");
         sb.append('=');
         sb.append(((this.memoryUsed == null)?"<null>":this.memoryUsed));
         sb.append(',');
         sb.append("count");
         sb.append('=');
         sb.append(((this.count == null)?"<null>":this.count));
         sb.append(',');
         sb.append("compilationTimeMonitoringSupported");
         sb.append('=');
         sb.append(((this.compilationTimeMonitoringSupported == null)?"<null>":this.compilationTimeMonitoringSupported));
         sb.append(',');
         sb.append("totalCompilationTime");
         sb.append('=');
         sb.append(((this.totalCompilationTime == null)?"<null>":this.totalCompilationTime));
         sb.append(',');
         sb.append("tagContext");
         sb.append('=');
         sb.append(((this.tagContext == null)?"<null>":this.tagContext));
         sb.append(',');
         sb.append("tagProcessName");
         sb.append('=');
         sb.append(((this.tagProcessName == null)?"<null>":this.tagProcessName));
         sb.append(',');
         sb.append("tagSessionId");
         sb.append('=');
         sb.append(((this.tagSessionId == null)?"<null>":this.tagSessionId));
         sb.append(',');
         sb.append("tagHostname");
         sb.append('=');
         sb.append(((this.tagHostname == null)?"<null>":this.tagHostname));
         sb.append(',');
         sb.append("memNonHeapUsedM");
         sb.append('=');
         sb.append(((this.memNonHeapUsedM == null)?"<null>":this.memNonHeapUsedM));
         sb.append(',');
         sb.append("memNonHeapCommittedM");
         sb.append('=');
         sb.append(((this.memNonHeapCommittedM == null)?"<null>":this.memNonHeapCommittedM));
         sb.append(',');
         sb.append("memNonHeapMaxM");
         sb.append('=');
         sb.append(((this.memNonHeapMaxM == null)?"<null>":this.memNonHeapMaxM));
         sb.append(',');
         sb.append("memHeapUsedM");
         sb.append('=');
         sb.append(((this.memHeapUsedM == null)?"<null>":this.memHeapUsedM));
         sb.append(',');
         sb.append("memHeapCommittedM");
         sb.append('=');
         sb.append(((this.memHeapCommittedM == null)?"<null>":this.memHeapCommittedM));
         sb.append(',');
         sb.append("memHeapMaxM");
         sb.append('=');
         sb.append(((this.memHeapMaxM == null)?"<null>":this.memHeapMaxM));
         sb.append(',');
         sb.append("memMaxM");
         sb.append('=');
         sb.append(((this.memMaxM == null)?"<null>":this.memMaxM));
         sb.append(',');
         sb.append("gcCountParNew");
         sb.append('=');
         sb.append(((this.gcCountParNew == null)?"<null>":this.gcCountParNew));
         sb.append(',');
         sb.append("gcTimeMillisParNew");
         sb.append('=');
         sb.append(((this.gcTimeMillisParNew == null)?"<null>":this.gcTimeMillisParNew));
         sb.append(',');
         sb.append("gcCountConcurrentMarkSweep");
         sb.append('=');
         sb.append(((this.gcCountConcurrentMarkSweep == null)?"<null>":this.gcCountConcurrentMarkSweep));
         sb.append(',');
         sb.append("gcTimeMillisConcurrentMarkSweep");
         sb.append('=');
         sb.append(((this.gcTimeMillisConcurrentMarkSweep == null)?"<null>":this.gcTimeMillisConcurrentMarkSweep));
         sb.append(',');
         sb.append("gcCount");
         sb.append('=');
         sb.append(((this.gcCount == null)?"<null>":this.gcCount));
         sb.append(',');
         sb.append("gcTimeMillis");
         sb.append('=');
         sb.append(((this.gcTimeMillis == null)?"<null>":this.gcTimeMillis));
         sb.append(',');
         sb.append("gcNumWarnThresholdExceeded");
         sb.append('=');
         sb.append(((this.gcNumWarnThresholdExceeded == null)?"<null>":this.gcNumWarnThresholdExceeded));
         sb.append(',');
         sb.append("gcNumInfoThresholdExceeded");
         sb.append('=');
         sb.append(((this.gcNumInfoThresholdExceeded == null)?"<null>":this.gcNumInfoThresholdExceeded));
         sb.append(',');
         sb.append("gcTotalExtraSleepTime");
         sb.append('=');
         sb.append(((this.gcTotalExtraSleepTime == null)?"<null>":this.gcTotalExtraSleepTime));
         sb.append(',');
         sb.append("threadsNew");
         sb.append('=');
         sb.append(((this.threadsNew == null)?"<null>":this.threadsNew));
         sb.append(',');
         sb.append("threadsRunnable");
         sb.append('=');
         sb.append(((this.threadsRunnable == null)?"<null>":this.threadsRunnable));
         sb.append(',');
         sb.append("threadsBlocked");
         sb.append('=');
         sb.append(((this.threadsBlocked == null)?"<null>":this.threadsBlocked));
         sb.append(',');
         sb.append("threadsWaiting");
         sb.append('=');
         sb.append(((this.threadsWaiting == null)?"<null>":this.threadsWaiting));
         sb.append(',');
         sb.append("threadsTimedWaiting");
         sb.append('=');
         sb.append(((this.threadsTimedWaiting == null)?"<null>":this.threadsTimedWaiting));
         sb.append(',');
         sb.append("threadsTerminated");
         sb.append('=');
         sb.append(((this.threadsTerminated == null)?"<null>":this.threadsTerminated));
         sb.append(',');
         sb.append("logFatal");
         sb.append('=');
         sb.append(((this.logFatal == null)?"<null>":this.logFatal));
         sb.append(',');
         sb.append("logError");
         sb.append('=');
         sb.append(((this.logError == null)?"<null>":this.logError));
         sb.append(',');
         sb.append("logWarn");
         sb.append('=');
         sb.append(((this.logWarn == null)?"<null>":this.logWarn));
         sb.append(',');
         sb.append("logInfo");
         sb.append('=');
         sb.append(((this.logInfo == null)?"<null>":this.logInfo));
         sb.append(',');
         sb.append("memoryPoolNames");
         sb.append('=');
         sb.append(((this.memoryPoolNames == null)?"<null>":this.memoryPoolNames));
         sb.append(',');
         sb.append("tagPort");
         sb.append('=');
         sb.append(((this.tagPort == null)?"<null>":this.tagPort));
         sb.append(',');
         sb.append("tagNumOpenConnectionsPerUser");
         sb.append('=');
         sb.append(((this.tagNumOpenConnectionsPerUser == null)?"<null>":this.tagNumOpenConnectionsPerUser));
         sb.append(',');
         sb.append("receivedBytes");
         sb.append('=');
         sb.append(((this.receivedBytes == null)?"<null>":this.receivedBytes));
         sb.append(',');
         sb.append("sentBytes");
         sb.append('=');
         sb.append(((this.sentBytes == null)?"<null>":this.sentBytes));
         sb.append(',');
         sb.append("rpcQueueTimeNumOps");
         sb.append('=');
         sb.append(((this.rpcQueueTimeNumOps == null)?"<null>":this.rpcQueueTimeNumOps));
         sb.append(',');
         sb.append("rpcQueueTimeAvgTime");
         sb.append('=');
         sb.append(((this.rpcQueueTimeAvgTime == null)?"<null>":this.rpcQueueTimeAvgTime));
         sb.append(',');
         sb.append("rpcProcessingTimeNumOps");
         sb.append('=');
         sb.append(((this.rpcProcessingTimeNumOps == null)?"<null>":this.rpcProcessingTimeNumOps));
         sb.append(',');
         sb.append("rpcProcessingTimeAvgTime");
         sb.append('=');
         sb.append(((this.rpcProcessingTimeAvgTime == null)?"<null>":this.rpcProcessingTimeAvgTime));
         sb.append(',');
         sb.append("deferredRpcProcessingTimeNumOps");
         sb.append('=');
         sb.append(((this.deferredRpcProcessingTimeNumOps == null)?"<null>":this.deferredRpcProcessingTimeNumOps));
         sb.append(',');
         sb.append("deferredRpcProcessingTimeAvgTime");
         sb.append('=');
         sb.append(((this.deferredRpcProcessingTimeAvgTime == null)?"<null>":this.deferredRpcProcessingTimeAvgTime));
         sb.append(',');
         sb.append("rpcAuthenticationFailures");
         sb.append('=');
         sb.append(((this.rpcAuthenticationFailures == null)?"<null>":this.rpcAuthenticationFailures));
         sb.append(',');
         sb.append("rpcAuthenticationSuccesses");
         sb.append('=');
         sb.append(((this.rpcAuthenticationSuccesses == null)?"<null>":this.rpcAuthenticationSuccesses));
         sb.append(',');
         sb.append("rpcAuthorizationFailures");
         sb.append('=');
         sb.append(((this.rpcAuthorizationFailures == null)?"<null>":this.rpcAuthorizationFailures));
         sb.append(',');
         sb.append("rpcAuthorizationSuccesses");
         sb.append('=');
         sb.append(((this.rpcAuthorizationSuccesses == null)?"<null>":this.rpcAuthorizationSuccesses));
         sb.append(',');
         sb.append("rpcClientBackoff");
         sb.append('=');
         sb.append(((this.rpcClientBackoff == null)?"<null>":this.rpcClientBackoff));
         sb.append(',');
         sb.append("rpcSlowCalls");
         sb.append('=');
         sb.append(((this.rpcSlowCalls == null)?"<null>":this.rpcSlowCalls));
         sb.append(',');
         sb.append("numOpenConnections");
         sb.append('=');
         sb.append(((this.numOpenConnections == null)?"<null>":this.numOpenConnections));
         sb.append(',');
         sb.append("callQueueLength");
         sb.append('=');
         sb.append(((this.callQueueLength == null)?"<null>":this.callQueueLength));
         sb.append(',');
         sb.append("numDroppedConnections");
         sb.append('=');
         sb.append(((this.numDroppedConnections == null)?"<null>":this.numDroppedConnections));
         sb.append(',');
         sb.append("loggerNames");
         sb.append('=');
         sb.append(((this.loggerNames == null)?"<null>":this.loggerNames));
         sb.append(',');
         sb.append("totalLoadedClassCount");
         sb.append('=');
         sb.append(((this.totalLoadedClassCount == null)?"<null>":this.totalLoadedClassCount));
         sb.append(',');
         sb.append("verbose");
         sb.append('=');
         sb.append(((this.verbose == null)?"<null>":this.verbose));
         sb.append(',');
         sb.append("loadedClassCount");
         sb.append('=');
         sb.append(((this.loadedClassCount == null)?"<null>":this.loadedClassCount));
         sb.append(',');
         sb.append("unloadedClassCount");
         sb.append('=');
         sb.append(((this.unloadedClassCount == null)?"<null>":this.unloadedClassCount));
         sb.append(',');
         sb.append("numActiveSources");
         sb.append('=');
         sb.append(((this.numActiveSources == null)?"<null>":this.numActiveSources));
         sb.append(',');
         sb.append("numAllSources");
         sb.append('=');
         sb.append(((this.numAllSources == null)?"<null>":this.numAllSources));
         sb.append(',');
         sb.append("numActiveSinks");
         sb.append('=');
         sb.append(((this.numActiveSinks == null)?"<null>":this.numActiveSinks));
         sb.append(',');
         sb.append("numAllSinks");
         sb.append('=');
         sb.append(((this.numAllSinks == null)?"<null>":this.numAllSinks));
         sb.append(',');
         sb.append("sinkTimelineNumOps");
         sb.append('=');
         sb.append(((this.sinkTimelineNumOps == null)?"<null>":this.sinkTimelineNumOps));
         sb.append(',');
         sb.append("sinkTimelineAvgTime");
         sb.append('=');
         sb.append(((this.sinkTimelineAvgTime == null)?"<null>":this.sinkTimelineAvgTime));
         sb.append(',');
         sb.append("sinkTimelineDropped");
         sb.append('=');
         sb.append(((this.sinkTimelineDropped == null)?"<null>":this.sinkTimelineDropped));
         sb.append(',');
         sb.append("sinkTimelineQsize");
         sb.append('=');
         sb.append(((this.sinkTimelineQsize == null)?"<null>":this.sinkTimelineQsize));
         sb.append(',');
         sb.append("snapshotNumOps");
         sb.append('=');
         sb.append(((this.snapshotNumOps == null)?"<null>":this.snapshotNumOps));
         sb.append(',');
         sb.append("snapshotAvgTime");
         sb.append('=');
         sb.append(((this.snapshotAvgTime == null)?"<null>":this.snapshotAvgTime));
         sb.append(',');
         sb.append("publishNumOps");
         sb.append('=');
         sb.append(((this.publishNumOps == null)?"<null>":this.publishNumOps));
         sb.append(',');
         sb.append("publishAvgTime");
         sb.append('=');
         sb.append(((this.publishAvgTime == null)?"<null>":this.publishAvgTime));
         sb.append(',');
         sb.append("droppedPubAll");
         sb.append('=');
         sb.append(((this.droppedPubAll == null)?"<null>":this.droppedPubAll));
         sb.append(',');
         sb.append("tagStorageInfo");
         sb.append('=');
         sb.append(((this.tagStorageInfo == null)?"<null>":this.tagStorageInfo));
         sb.append(',');
         sb.append("numBlocksFailedToUnCache");
         sb.append('=');
         sb.append(((this.numBlocksFailedToUnCache == null)?"<null>":this.numBlocksFailedToUnCache));
         sb.append(',');
         sb.append("collectionUsageThreshold");
         sb.append('=');
         sb.append(((this.collectionUsageThreshold == null)?"<null>":this.collectionUsageThreshold));
         sb.append(',');
         sb.append("collectionUsageThresholdExceeded");
         sb.append('=');
         sb.append(((this.collectionUsageThresholdExceeded == null)?"<null>":this.collectionUsageThresholdExceeded));
         sb.append(',');
         sb.append("collectionUsageThresholdCount");
         sb.append('=');
         sb.append(((this.collectionUsageThresholdCount == null)?"<null>":this.collectionUsageThresholdCount));
         sb.append(',');
         sb.append("lastGcInfo");
         sb.append('=');
         sb.append(((this.lastGcInfo == null)?"<null>":this.lastGcInfo));
         sb.append(',');
         sb.append("collectionCount");
         sb.append('=');
         sb.append(((this.collectionCount == null)?"<null>":this.collectionCount));
         sb.append(',');
         sb.append("collectionTime");
         sb.append('=');
         sb.append(((this.collectionTime == null)?"<null>":this.collectionTime));
         sb.append(',');
         sb.append("xceiverCount");
         sb.append('=');
         sb.append(((this.xceiverCount == null)?"<null>":this.xceiverCount));
         sb.append(',');
         sb.append("datanodeNetworkCounts");
         sb.append('=');
         sb.append(((this.datanodeNetworkCounts == null)?"<null>":this.datanodeNetworkCounts));
         sb.append(',');
         sb.append("xmitsInProgress");
         sb.append('=');
         sb.append(((this.xmitsInProgress == null)?"<null>":this.xmitsInProgress));
         sb.append(',');
         sb.append("softwareVersion");
         sb.append('=');
         sb.append(((this.softwareVersion == null)?"<null>":this.softwareVersion));
         sb.append(',');
         sb.append("rpcPort");
         sb.append('=');
         sb.append(((this.rpcPort == null)?"<null>":this.rpcPort));
         sb.append(',');
         sb.append("dataPort");
         sb.append('=');
         sb.append(((this.dataPort == null)?"<null>":this.dataPort));
         sb.append(',');
         sb.append("httpPort");
         sb.append('=');
         sb.append(((this.httpPort == null)?"<null>":this.httpPort));
         sb.append(',');
         sb.append("namenodeAddresses");
         sb.append('=');
         sb.append(((this.namenodeAddresses == null)?"<null>":this.namenodeAddresses));
         sb.append(',');
         sb.append("datanodeHostname");
         sb.append('=');
         sb.append(((this.datanodeHostname == null)?"<null>":this.datanodeHostname));
         sb.append(',');
         sb.append("bPServiceActorInfo");
         sb.append('=');
         sb.append(((this.bPServiceActorInfo == null)?"<null>":this.bPServiceActorInfo));
         sb.append(',');
         sb.append("volumeInfo");
         sb.append('=');
         sb.append(((this.volumeInfo == null)?"<null>":this.volumeInfo));
         sb.append(',');
         sb.append("clusterId");
         sb.append('=');
         sb.append(((this.clusterId == null)?"<null>":this.clusterId));
         sb.append(',');
         sb.append("diskBalancerStatus");
         sb.append('=');
         sb.append(((this.diskBalancerStatus == null)?"<null>":this.diskBalancerStatus));
         sb.append(',');
         sb.append("sendPacketDownstreamAvgInfo");
         sb.append('=');
         sb.append(((this.sendPacketDownstreamAvgInfo == null)?"<null>":this.sendPacketDownstreamAvgInfo));
         sb.append(',');
         sb.append("slowDisks");
         sb.append('=');
         sb.append(((this.slowDisks == null)?"<null>":this.slowDisks));
         sb.append(',');
         sb.append("bytesWritten");
         sb.append('=');
         sb.append(((this.bytesWritten == null)?"<null>":this.bytesWritten));
         sb.append(',');
         sb.append("totalWriteTime");
         sb.append('=');
         sb.append(((this.totalWriteTime == null)?"<null>":this.totalWriteTime));
         sb.append(',');
         sb.append("bytesRead");
         sb.append('=');
         sb.append(((this.bytesRead == null)?"<null>":this.bytesRead));
         sb.append(',');
         sb.append("totalReadTime");
         sb.append('=');
         sb.append(((this.totalReadTime == null)?"<null>":this.totalReadTime));
         sb.append(',');
         sb.append("blocksWritten");
         sb.append('=');
         sb.append(((this.blocksWritten == null)?"<null>":this.blocksWritten));
         sb.append(',');
         sb.append("blocksRead");
         sb.append('=');
         sb.append(((this.blocksRead == null)?"<null>":this.blocksRead));
         sb.append(',');
         sb.append("blocksReplicated");
         sb.append('=');
         sb.append(((this.blocksReplicated == null)?"<null>":this.blocksReplicated));
         sb.append(',');
         sb.append("blocksRemoved");
         sb.append('=');
         sb.append(((this.blocksRemoved == null)?"<null>":this.blocksRemoved));
         sb.append(',');
         sb.append("blocksVerified");
         sb.append('=');
         sb.append(((this.blocksVerified == null)?"<null>":this.blocksVerified));
         sb.append(',');
         sb.append("blockVerificationFailures");
         sb.append('=');
         sb.append(((this.blockVerificationFailures == null)?"<null>":this.blockVerificationFailures));
         sb.append(',');
         sb.append("blocksCached");
         sb.append('=');
         sb.append(((this.blocksCached == null)?"<null>":this.blocksCached));
         sb.append(',');
         sb.append("blocksUncached");
         sb.append('=');
         sb.append(((this.blocksUncached == null)?"<null>":this.blocksUncached));
         sb.append(',');
         sb.append("readsFromLocalClient");
         sb.append('=');
         sb.append(((this.readsFromLocalClient == null)?"<null>":this.readsFromLocalClient));
         sb.append(',');
         sb.append("readsFromRemoteClient");
         sb.append('=');
         sb.append(((this.readsFromRemoteClient == null)?"<null>":this.readsFromRemoteClient));
         sb.append(',');
         sb.append("writesFromLocalClient");
         sb.append('=');
         sb.append(((this.writesFromLocalClient == null)?"<null>":this.writesFromLocalClient));
         sb.append(',');
         sb.append("writesFromRemoteClient");
         sb.append('=');
         sb.append(((this.writesFromRemoteClient == null)?"<null>":this.writesFromRemoteClient));
         sb.append(',');
         sb.append("blocksGetLocalPathInfo");
         sb.append('=');
         sb.append(((this.blocksGetLocalPathInfo == null)?"<null>":this.blocksGetLocalPathInfo));
         sb.append(',');
         sb.append("remoteBytesRead");
         sb.append('=');
         sb.append(((this.remoteBytesRead == null)?"<null>":this.remoteBytesRead));
         sb.append(',');
         sb.append("remoteBytesWritten");
         sb.append('=');
         sb.append(((this.remoteBytesWritten == null)?"<null>":this.remoteBytesWritten));
         sb.append(',');
         sb.append("ramDiskBlocksWrite");
         sb.append('=');
         sb.append(((this.ramDiskBlocksWrite == null)?"<null>":this.ramDiskBlocksWrite));
         sb.append(',');
         sb.append("ramDiskBlocksWriteFallback");
         sb.append('=');
         sb.append(((this.ramDiskBlocksWriteFallback == null)?"<null>":this.ramDiskBlocksWriteFallback));
         sb.append(',');
         sb.append("ramDiskBytesWrite");
         sb.append('=');
         sb.append(((this.ramDiskBytesWrite == null)?"<null>":this.ramDiskBytesWrite));
         sb.append(',');
         sb.append("ramDiskBlocksReadHits");
         sb.append('=');
         sb.append(((this.ramDiskBlocksReadHits == null)?"<null>":this.ramDiskBlocksReadHits));
         sb.append(',');
         sb.append("ramDiskBlocksEvicted");
         sb.append('=');
         sb.append(((this.ramDiskBlocksEvicted == null)?"<null>":this.ramDiskBlocksEvicted));
         sb.append(',');
         sb.append("ramDiskBlocksEvictedWithoutRead");
         sb.append('=');
         sb.append(((this.ramDiskBlocksEvictedWithoutRead == null)?"<null>":this.ramDiskBlocksEvictedWithoutRead));
         sb.append(',');
         sb.append("ramDiskBlocksEvictionWindowMsNumOps");
         sb.append('=');
         sb.append(((this.ramDiskBlocksEvictionWindowMsNumOps == null)?"<null>":this.ramDiskBlocksEvictionWindowMsNumOps));
         sb.append(',');
         sb.append("ramDiskBlocksEvictionWindowMsAvgTime");
         sb.append('=');
         sb.append(((this.ramDiskBlocksEvictionWindowMsAvgTime == null)?"<null>":this.ramDiskBlocksEvictionWindowMsAvgTime));
         sb.append(',');
         sb.append("ramDiskBlocksLazyPersisted");
         sb.append('=');
         sb.append(((this.ramDiskBlocksLazyPersisted == null)?"<null>":this.ramDiskBlocksLazyPersisted));
         sb.append(',');
         sb.append("ramDiskBlocksDeletedBeforeLazyPersisted");
         sb.append('=');
         sb.append(((this.ramDiskBlocksDeletedBeforeLazyPersisted == null)?"<null>":this.ramDiskBlocksDeletedBeforeLazyPersisted));
         sb.append(',');
         sb.append("ramDiskBytesLazyPersisted");
         sb.append('=');
         sb.append(((this.ramDiskBytesLazyPersisted == null)?"<null>":this.ramDiskBytesLazyPersisted));
         sb.append(',');
         sb.append("ramDiskBlocksLazyPersistWindowMsNumOps");
         sb.append('=');
         sb.append(((this.ramDiskBlocksLazyPersistWindowMsNumOps == null)?"<null>":this.ramDiskBlocksLazyPersistWindowMsNumOps));
         sb.append(',');
         sb.append("ramDiskBlocksLazyPersistWindowMsAvgTime");
         sb.append('=');
         sb.append(((this.ramDiskBlocksLazyPersistWindowMsAvgTime == null)?"<null>":this.ramDiskBlocksLazyPersistWindowMsAvgTime));
         sb.append(',');
         sb.append("fsyncCount");
         sb.append('=');
         sb.append(((this.fsyncCount == null)?"<null>":this.fsyncCount));
         sb.append(',');
         sb.append("volumeFailures");
         sb.append('=');
         sb.append(((this.volumeFailures == null)?"<null>":this.volumeFailures));
         sb.append(',');
         sb.append("datanodeNetworkErrors");
         sb.append('=');
         sb.append(((this.datanodeNetworkErrors == null)?"<null>":this.datanodeNetworkErrors));
         sb.append(',');
         sb.append("dataNodeActiveXceiversCount");
         sb.append('=');
         sb.append(((this.dataNodeActiveXceiversCount == null)?"<null>":this.dataNodeActiveXceiversCount));
         sb.append(',');
         sb.append("readBlockOpNumOps");
         sb.append('=');
         sb.append(((this.readBlockOpNumOps == null)?"<null>":this.readBlockOpNumOps));
         sb.append(',');
         sb.append("readBlockOpAvgTime");
         sb.append('=');
         sb.append(((this.readBlockOpAvgTime == null)?"<null>":this.readBlockOpAvgTime));
         sb.append(',');
         sb.append("writeBlockOpNumOps");
         sb.append('=');
         sb.append(((this.writeBlockOpNumOps == null)?"<null>":this.writeBlockOpNumOps));
         sb.append(',');
         sb.append("writeBlockOpAvgTime");
         sb.append('=');
         sb.append(((this.writeBlockOpAvgTime == null)?"<null>":this.writeBlockOpAvgTime));
         sb.append(',');
         sb.append("blockChecksumOpNumOps");
         sb.append('=');
         sb.append(((this.blockChecksumOpNumOps == null)?"<null>":this.blockChecksumOpNumOps));
         sb.append(',');
         sb.append("blockChecksumOpAvgTime");
         sb.append('=');
         sb.append(((this.blockChecksumOpAvgTime == null)?"<null>":this.blockChecksumOpAvgTime));
         sb.append(',');
         sb.append("copyBlockOpNumOps");
         sb.append('=');
         sb.append(((this.copyBlockOpNumOps == null)?"<null>":this.copyBlockOpNumOps));
         sb.append(',');
         sb.append("copyBlockOpAvgTime");
         sb.append('=');
         sb.append(((this.copyBlockOpAvgTime == null)?"<null>":this.copyBlockOpAvgTime));
         sb.append(',');
         sb.append("replaceBlockOpNumOps");
         sb.append('=');
         sb.append(((this.replaceBlockOpNumOps == null)?"<null>":this.replaceBlockOpNumOps));
         sb.append(',');
         sb.append("replaceBlockOpAvgTime");
         sb.append('=');
         sb.append(((this.replaceBlockOpAvgTime == null)?"<null>":this.replaceBlockOpAvgTime));
         sb.append(',');
         sb.append("heartbeatsNumOps");
         sb.append('=');
         sb.append(((this.heartbeatsNumOps == null)?"<null>":this.heartbeatsNumOps));
         sb.append(',');
         sb.append("heartbeatsAvgTime");
         sb.append('=');
         sb.append(((this.heartbeatsAvgTime == null)?"<null>":this.heartbeatsAvgTime));
         sb.append(',');
         sb.append("heartbeatsTotalNumOps");
         sb.append('=');
         sb.append(((this.heartbeatsTotalNumOps == null)?"<null>":this.heartbeatsTotalNumOps));
         sb.append(',');
         sb.append("heartbeatsTotalAvgTime");
         sb.append('=');
         sb.append(((this.heartbeatsTotalAvgTime == null)?"<null>":this.heartbeatsTotalAvgTime));
         sb.append(',');
         sb.append("lifelinesNumOps");
         sb.append('=');
         sb.append(((this.lifelinesNumOps == null)?"<null>":this.lifelinesNumOps));
         sb.append(',');
         sb.append("lifelinesAvgTime");
         sb.append('=');
         sb.append(((this.lifelinesAvgTime == null)?"<null>":this.lifelinesAvgTime));
         sb.append(',');
         sb.append("blockReportsNumOps");
         sb.append('=');
         sb.append(((this.blockReportsNumOps == null)?"<null>":this.blockReportsNumOps));
         sb.append(',');
         sb.append("blockReportsAvgTime");
         sb.append('=');
         sb.append(((this.blockReportsAvgTime == null)?"<null>":this.blockReportsAvgTime));
         sb.append(',');
         sb.append("incrementalBlockReportsNumOps");
         sb.append('=');
         sb.append(((this.incrementalBlockReportsNumOps == null)?"<null>":this.incrementalBlockReportsNumOps));
         sb.append(',');
         sb.append("incrementalBlockReportsAvgTime");
         sb.append('=');
         sb.append(((this.incrementalBlockReportsAvgTime == null)?"<null>":this.incrementalBlockReportsAvgTime));
         sb.append(',');
         sb.append("cacheReportsNumOps");
         sb.append('=');
         sb.append(((this.cacheReportsNumOps == null)?"<null>":this.cacheReportsNumOps));
         sb.append(',');
         sb.append("cacheReportsAvgTime");
         sb.append('=');
         sb.append(((this.cacheReportsAvgTime == null)?"<null>":this.cacheReportsAvgTime));
         sb.append(',');
         sb.append("packetAckRoundTripTimeNanosNumOps");
         sb.append('=');
         sb.append(((this.packetAckRoundTripTimeNanosNumOps == null)?"<null>":this.packetAckRoundTripTimeNanosNumOps));
         sb.append(',');
         sb.append("packetAckRoundTripTimeNanosAvgTime");
         sb.append('=');
         sb.append(((this.packetAckRoundTripTimeNanosAvgTime == null)?"<null>":this.packetAckRoundTripTimeNanosAvgTime));
         sb.append(',');
         sb.append("flushNanosNumOps");
         sb.append('=');
         sb.append(((this.flushNanosNumOps == null)?"<null>":this.flushNanosNumOps));
         sb.append(',');
         sb.append("flushNanosAvgTime");
         sb.append('=');
         sb.append(((this.flushNanosAvgTime == null)?"<null>":this.flushNanosAvgTime));
         sb.append(',');
         sb.append("fsyncNanosNumOps");
         sb.append('=');
         sb.append(((this.fsyncNanosNumOps == null)?"<null>":this.fsyncNanosNumOps));
         sb.append(',');
         sb.append("fsyncNanosAvgTime");
         sb.append('=');
         sb.append(((this.fsyncNanosAvgTime == null)?"<null>":this.fsyncNanosAvgTime));
         sb.append(',');
         sb.append("sendDataPacketBlockedOnNetworkNanosNumOps");
         sb.append('=');
         sb.append(((this.sendDataPacketBlockedOnNetworkNanosNumOps == null)?"<null>":this.sendDataPacketBlockedOnNetworkNanosNumOps));
         sb.append(',');
         sb.append("sendDataPacketBlockedOnNetworkNanosAvgTime");
         sb.append('=');
         sb.append(((this.sendDataPacketBlockedOnNetworkNanosAvgTime == null)?"<null>":this.sendDataPacketBlockedOnNetworkNanosAvgTime));
         sb.append(',');
         sb.append("sendDataPacketTransferNanosNumOps");
         sb.append('=');
         sb.append(((this.sendDataPacketTransferNanosNumOps == null)?"<null>":this.sendDataPacketTransferNanosNumOps));
         sb.append(',');
         sb.append("sendDataPacketTransferNanosAvgTime");
         sb.append('=');
         sb.append(((this.sendDataPacketTransferNanosAvgTime == null)?"<null>":this.sendDataPacketTransferNanosAvgTime));
         sb.append(',');
         sb.append("blocksInPendingIBR");
         sb.append('=');
         sb.append(((this.blocksInPendingIBR == null)?"<null>":this.blocksInPendingIBR));
         sb.append(',');
         sb.append("blocksReceivingInPendingIBR");
         sb.append('=');
         sb.append(((this.blocksReceivingInPendingIBR == null)?"<null>":this.blocksReceivingInPendingIBR));
         sb.append(',');
         sb.append("blocksReceivedInPendingIBR");
         sb.append('=');
         sb.append(((this.blocksReceivedInPendingIBR == null)?"<null>":this.blocksReceivedInPendingIBR));
         sb.append(',');
         sb.append("blocksDeletedInPendingIBR");
         sb.append('=');
         sb.append(((this.blocksDeletedInPendingIBR == null)?"<null>":this.blocksDeletedInPendingIBR));
         sb.append(',');
         sb.append("ecReconstructionTasks");
         sb.append('=');
         sb.append(((this.ecReconstructionTasks == null)?"<null>":this.ecReconstructionTasks));
         sb.append(',');
         sb.append("ecFailedReconstructionTasks");
         sb.append('=');
         sb.append(((this.ecFailedReconstructionTasks == null)?"<null>":this.ecFailedReconstructionTasks));
         sb.append(',');
         sb.append("ecDecodingTimeNanos");
         sb.append('=');
         sb.append(((this.ecDecodingTimeNanos == null)?"<null>":this.ecDecodingTimeNanos));
         sb.append(',');
         sb.append("ecReconstructionBytesRead");
         sb.append('=');
         sb.append(((this.ecReconstructionBytesRead == null)?"<null>":this.ecReconstructionBytesRead));
         sb.append(',');
         sb.append("ecReconstructionBytesWritten");
         sb.append('=');
         sb.append(((this.ecReconstructionBytesWritten == null)?"<null>":this.ecReconstructionBytesWritten));
         sb.append(',');
         sb.append("ecReconstructionRemoteBytesRead");
         sb.append('=');
         sb.append(((this.ecReconstructionRemoteBytesRead == null)?"<null>":this.ecReconstructionRemoteBytesRead));
         sb.append(',');
         sb.append("ecReconstructionReadTimeMillis");
         sb.append('=');
         sb.append(((this.ecReconstructionReadTimeMillis == null)?"<null>":this.ecReconstructionReadTimeMillis));
         sb.append(',');
         sb.append("ecReconstructionDecodingTimeMillis");
         sb.append('=');
         sb.append(((this.ecReconstructionDecodingTimeMillis == null)?"<null>":this.ecReconstructionDecodingTimeMillis));
         sb.append(',');
         sb.append("ecReconstructionWriteTimeMillis");
         sb.append('=');
         sb.append(((this.ecReconstructionWriteTimeMillis == null)?"<null>":this.ecReconstructionWriteTimeMillis));
         sb.append(',');
         sb.append("totalMetadataOperations");
         sb.append('=');
         sb.append(((this.totalMetadataOperations == null)?"<null>":this.totalMetadataOperations));
         sb.append(',');
         sb.append("metadataOperationRateNumOps");
         sb.append('=');
         sb.append(((this.metadataOperationRateNumOps == null)?"<null>":this.metadataOperationRateNumOps));
         sb.append(',');
         sb.append("metadataOperationRateAvgTime");
         sb.append('=');
         sb.append(((this.metadataOperationRateAvgTime == null)?"<null>":this.metadataOperationRateAvgTime));
         sb.append(',');
         sb.append("totalDataFileIos");
         sb.append('=');
         sb.append(((this.totalDataFileIos == null)?"<null>":this.totalDataFileIos));
         sb.append(',');
         sb.append("dataFileIoRateNumOps");
         sb.append('=');
         sb.append(((this.dataFileIoRateNumOps == null)?"<null>":this.dataFileIoRateNumOps));
         sb.append(',');
         sb.append("dataFileIoRateAvgTime");
         sb.append('=');
         sb.append(((this.dataFileIoRateAvgTime == null)?"<null>":this.dataFileIoRateAvgTime));
         sb.append(',');
         sb.append("flushIoRateNumOps");
         sb.append('=');
         sb.append(((this.flushIoRateNumOps == null)?"<null>":this.flushIoRateNumOps));
         sb.append(',');
         sb.append("flushIoRateAvgTime");
         sb.append('=');
         sb.append(((this.flushIoRateAvgTime == null)?"<null>":this.flushIoRateAvgTime));
         sb.append(',');
         sb.append("syncIoRateNumOps");
         sb.append('=');
         sb.append(((this.syncIoRateNumOps == null)?"<null>":this.syncIoRateNumOps));
         sb.append(',');
         sb.append("syncIoRateAvgTime");
         sb.append('=');
         sb.append(((this.syncIoRateAvgTime == null)?"<null>":this.syncIoRateAvgTime));
         sb.append(',');
         sb.append("readIoRateNumOps");
         sb.append('=');
         sb.append(((this.readIoRateNumOps == null)?"<null>":this.readIoRateNumOps));
         sb.append(',');
         sb.append("readIoRateAvgTime");
         sb.append('=');
         sb.append(((this.readIoRateAvgTime == null)?"<null>":this.readIoRateAvgTime));
         sb.append(',');
         sb.append("writeIoRateNumOps");
         sb.append('=');
         sb.append(((this.writeIoRateNumOps == null)?"<null>":this.writeIoRateNumOps));
         sb.append(',');
         sb.append("writeIoRateAvgTime");
         sb.append('=');
         sb.append(((this.writeIoRateAvgTime == null)?"<null>":this.writeIoRateAvgTime));
         sb.append(',');
         sb.append("totalFileIoErrors");
         sb.append('=');
         sb.append(((this.totalFileIoErrors == null)?"<null>":this.totalFileIoErrors));
         sb.append(',');
         sb.append("fileIoErrorRateNumOps");
         sb.append('=');
         sb.append(((this.fileIoErrorRateNumOps == null)?"<null>":this.fileIoErrorRateNumOps));
         sb.append(',');
         sb.append("fileIoErrorRateAvgTime");
         sb.append('=');
         sb.append(((this.fileIoErrorRateAvgTime == null)?"<null>":this.fileIoErrorRateAvgTime));
         sb.append(',');
         sb.append("objectPendingFinalizationCount");
         sb.append('=');
         sb.append(((this.objectPendingFinalizationCount == null)?"<null>":this.objectPendingFinalizationCount));
         sb.append(',');
         sb.append("heapMemoryUsage");
         sb.append('=');
         sb.append(((this.heapMemoryUsage == null)?"<null>":this.heapMemoryUsage));
         sb.append(',');
         sb.append("nonHeapMemoryUsage");
         sb.append('=');
         sb.append(((this.nonHeapMemoryUsage == null)?"<null>":this.nonHeapMemoryUsage));
         sb.append(',');
         sb.append("loginSuccessNumOps");
         sb.append('=');
         sb.append(((this.loginSuccessNumOps == null)?"<null>":this.loginSuccessNumOps));
         sb.append(',');
         sb.append("loginSuccessAvgTime");
         sb.append('=');
         sb.append(((this.loginSuccessAvgTime == null)?"<null>":this.loginSuccessAvgTime));
         sb.append(',');
         sb.append("loginFailureNumOps");
         sb.append('=');
         sb.append(((this.loginFailureNumOps == null)?"<null>":this.loginFailureNumOps));
         sb.append(',');
         sb.append("loginFailureAvgTime");
         sb.append('=');
         sb.append(((this.loginFailureAvgTime == null)?"<null>":this.loginFailureAvgTime));
         sb.append(',');
         sb.append("getGroupsNumOps");
         sb.append('=');
         sb.append(((this.getGroupsNumOps == null)?"<null>":this.getGroupsNumOps));
         sb.append(',');
         sb.append("getGroupsAvgTime");
         sb.append('=');
         sb.append(((this.getGroupsAvgTime == null)?"<null>":this.getGroupsAvgTime));
         sb.append(',');
         sb.append("renewalFailuresTotal");
         sb.append('=');
         sb.append(((this.renewalFailuresTotal == null)?"<null>":this.renewalFailuresTotal));
         sb.append(',');
         sb.append("renewalFailures");
         sb.append('=');
         sb.append(((this.renewalFailures == null)?"<null>":this.renewalFailures));
         sb.append(',');
         sb.append("diagnosticOptions");
         sb.append('=');
         sb.append(((this.diagnosticOptions == null)?"<null>":this.diagnosticOptions));
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
         result = ((result* 31)+((this.gcNumInfoThresholdExceeded == null)? 0 :this.gcNumInfoThresholdExceeded.hashCode()));
         result = ((result* 31)+((this.flushIoRateAvgTime == null)? 0 :this.flushIoRateAvgTime.hashCode()));
         result = ((result* 31)+((this.loginSuccessAvgTime == null)? 0 :this.loginSuccessAvgTime.hashCode()));
         result = ((result* 31)+((this.collectionTime == null)? 0 :this.collectionTime.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksLazyPersistWindowMsAvgTime == null)? 0 :this.ramDiskBlocksLazyPersistWindowMsAvgTime.hashCode()));
         result = ((result* 31)+((this.tagNumOpenConnectionsPerUser == null)? 0 :this.tagNumOpenConnectionsPerUser.hashCode()));
         result = ((result* 31)+((this.currentThreadCpuTime == null)? 0 :this.currentThreadCpuTime.hashCode()));
         result = ((result* 31)+((this.tagContext == null)? 0 :this.tagContext.hashCode()));
         result = ((result* 31)+((this.flushIoRateNumOps == null)? 0 :this.flushIoRateNumOps.hashCode()));
         result = ((result* 31)+((this.memoryUsed == null)? 0 :this.memoryUsed.hashCode()));
         result = ((result* 31)+((this.lifelinesAvgTime == null)? 0 :this.lifelinesAvgTime.hashCode()));
         result = ((result* 31)+((this.totalSwapSpaceSize == null)? 0 :this.totalSwapSpaceSize.hashCode()));
         result = ((result* 31)+((this.flushNanosNumOps == null)? 0 :this.flushNanosNumOps.hashCode()));
         result = ((result* 31)+((this.usageThreshold == null)? 0 :this.usageThreshold.hashCode()));
         result = ((result* 31)+((this.loadedClassCount == null)? 0 :this.loadedClassCount.hashCode()));
         result = ((result* 31)+((this.heartbeatsTotalNumOps == null)? 0 :this.heartbeatsTotalNumOps.hashCode()));
         result = ((result* 31)+((this.readBlockOpAvgTime == null)? 0 :this.readBlockOpAvgTime.hashCode()));
         result = ((result* 31)+((this.rpcAuthenticationSuccesses == null)? 0 :this.rpcAuthenticationSuccesses.hashCode()));
         result = ((result* 31)+((this.sendDataPacketTransferNanosNumOps == null)? 0 :this.sendDataPacketTransferNanosNumOps.hashCode()));
         result = ((result* 31)+((this.sinkTimelineQsize == null)? 0 :this.sinkTimelineQsize.hashCode()));
         result = ((result* 31)+((this.remoteBytesRead == null)? 0 :this.remoteBytesRead.hashCode()));
         result = ((result* 31)+((this.callQueueLength == null)? 0 :this.callQueueLength.hashCode()));
         result = ((result* 31)+((this.implementationName == null)? 0 :this.implementationName.hashCode()));
         result = ((result* 31)+((this.heartbeatsTotalAvgTime == null)? 0 :this.heartbeatsTotalAvgTime.hashCode()));
         result = ((result* 31)+((this.libraryPath == null)? 0 :this.libraryPath.hashCode()));
         result = ((result* 31)+((this.memoryManagerNames == null)? 0 :this.memoryManagerNames.hashCode()));
         result = ((result* 31)+((this.sinkTimelineDropped == null)? 0 :this.sinkTimelineDropped.hashCode()));
         result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
         result = ((result* 31)+((this.replaceBlockOpAvgTime == null)? 0 :this.replaceBlockOpAvgTime.hashCode()));
         result = ((result* 31)+((this.remaining == null)? 0 :this.remaining.hashCode()));
         result = ((result* 31)+((this.memNonHeapUsedM == null)? 0 :this.memNonHeapUsedM.hashCode()));
         result = ((result* 31)+((this.writeIoRateAvgTime == null)? 0 :this.writeIoRateAvgTime.hashCode()));
         result = ((result* 31)+((this.specName == null)? 0 :this.specName.hashCode()));
         result = ((result* 31)+((this.writeBlockOpAvgTime == null)? 0 :this.writeBlockOpAvgTime.hashCode()));
         result = ((result* 31)+((this.gcCountParNew == null)? 0 :this.gcCountParNew.hashCode()));
         result = ((result* 31)+((this.sinkTimelineNumOps == null)? 0 :this.sinkTimelineNumOps.hashCode()));
         result = ((result* 31)+((this.diagnosticOptions == null)? 0 :this.diagnosticOptions.hashCode()));
         result = ((result* 31)+((this.blocksRemoved == null)? 0 :this.blocksRemoved.hashCode()));
         result = ((result* 31)+((this.modelerType == null)? 0 :this.modelerType.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksEvicted == null)? 0 :this.ramDiskBlocksEvicted.hashCode()));
         result = ((result* 31)+((this.blockReportsAvgTime == null)? 0 :this.blockReportsAvgTime.hashCode()));
         result = ((result* 31)+((this.logInfo == null)? 0 :this.logInfo.hashCode()));
         result = ((result* 31)+((this.managementSpecVersion == null)? 0 :this.managementSpecVersion.hashCode()));
         result = ((result* 31)+((this.collectionUsageThresholdSupported == null)? 0 :this.collectionUsageThresholdSupported.hashCode()));
         result = ((result* 31)+((this.cacheCapacity == null)? 0 :this.cacheCapacity.hashCode()));
         result = ((result* 31)+((this.compilationTimeMonitoringSupported == null)? 0 :this.compilationTimeMonitoringSupported.hashCode()));
         result = ((result* 31)+((this.collectionUsageThresholdExceeded == null)? 0 :this.collectionUsageThresholdExceeded.hashCode()));
         result = ((result* 31)+((this.syncIoRateNumOps == null)? 0 :this.syncIoRateNumOps.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksDeletedBeforeLazyPersisted == null)? 0 :this.ramDiskBlocksDeletedBeforeLazyPersisted.hashCode()));
         result = ((result* 31)+((this.memMaxM == null)? 0 :this.memMaxM.hashCode()));
         result = ((result* 31)+((this.threadsNew == null)? 0 :this.threadsNew.hashCode()));
         result = ((result* 31)+((this.datanodeNetworkCounts == null)? 0 :this.datanodeNetworkCounts.hashCode()));
         result = ((result* 31)+((this.metadataOperationRateAvgTime == null)? 0 :this.metadataOperationRateAvgTime.hashCode()));
         result = ((result* 31)+((this.vmName == null)? 0 :this.vmName.hashCode()));
         result = ((result* 31)+((this.slowDisks == null)? 0 :this.slowDisks.hashCode()));
         result = ((result* 31)+((this.bytesRead == null)? 0 :this.bytesRead.hashCode()));
         result = ((result* 31)+((this.threadCpuTimeSupported == null)? 0 :this.threadCpuTimeSupported.hashCode()));
         result = ((result* 31)+((this.writeIoRateNumOps == null)? 0 :this.writeIoRateNumOps.hashCode()));
         result = ((result* 31)+((this.rpcSlowCalls == null)? 0 :this.rpcSlowCalls.hashCode()));
         result = ((result* 31)+((this.sendDataPacketBlockedOnNetworkNanosAvgTime == null)? 0 :this.sendDataPacketBlockedOnNetworkNanosAvgTime.hashCode()));
         result = ((result* 31)+((this.ecReconstructionReadTimeMillis == null)? 0 :this.ecReconstructionReadTimeMillis.hashCode()));
         result = ((result* 31)+((this.rpcQueueTimeAvgTime == null)? 0 :this.rpcQueueTimeAvgTime.hashCode()));
         result = ((result* 31)+((this.fileIoErrorRateAvgTime == null)? 0 :this.fileIoErrorRateAvgTime.hashCode()));
         result = ((result* 31)+((this.ecReconstructionBytesRead == null)? 0 :this.ecReconstructionBytesRead.hashCode()));
         result = ((result* 31)+((this.lifelinesNumOps == null)? 0 :this.lifelinesNumOps.hashCode()));
         result = ((result* 31)+((this.arch == null)? 0 :this.arch.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksLazyPersisted == null)? 0 :this.ramDiskBlocksLazyPersisted.hashCode()));
         result = ((result* 31)+((this.snapshotAvgTime == null)? 0 :this.snapshotAvgTime.hashCode()));
         result = ((result* 31)+((this.peakUsage == null)? 0 :this.peakUsage.hashCode()));
         result = ((result* 31)+((this.specificationVendor == null)? 0 :this.specificationVendor.hashCode()));
         result = ((result* 31)+((this.rpcAuthenticationFailures == null)? 0 :this.rpcAuthenticationFailures.hashCode()));
         result = ((result* 31)+((this.blocksWritten == null)? 0 :this.blocksWritten.hashCode()));
         result = ((result* 31)+((this.specVersion == null)? 0 :this.specVersion.hashCode()));
         result = ((result* 31)+((this.sinkTimelineAvgTime == null)? 0 :this.sinkTimelineAvgTime.hashCode()));
         result = ((result* 31)+((this.failedStorageLocations == null)? 0 :this.failedStorageLocations.hashCode()));
         result = ((result* 31)+((this.vmVendor == null)? 0 :this.vmVendor.hashCode()));
         result = ((result* 31)+((this.totalStartedThreadCount == null)? 0 :this.totalStartedThreadCount.hashCode()));
         result = ((result* 31)+((this.readBlockOpNumOps == null)? 0 :this.readBlockOpNumOps.hashCode()));
         result = ((result* 31)+((this.flushNanosAvgTime == null)? 0 :this.flushNanosAvgTime.hashCode()));
         result = ((result* 31)+((this.gcTimeMillisConcurrentMarkSweep == null)? 0 :this.gcTimeMillisConcurrentMarkSweep.hashCode()));
         result = ((result* 31)+((this.tagPort == null)? 0 :this.tagPort.hashCode()));
         result = ((result* 31)+((this.fsyncNanosAvgTime == null)? 0 :this.fsyncNanosAvgTime.hashCode()));
         result = ((result* 31)+((this.lastVolumeFailureDate == null)? 0 :this.lastVolumeFailureDate.hashCode()));
         result = ((result* 31)+((this.datanodeHostname == null)? 0 :this.datanodeHostname.hashCode()));
         result = ((result* 31)+((this.processCpuLoad == null)? 0 :this.processCpuLoad.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksEvictionWindowMsAvgTime == null)? 0 :this.ramDiskBlocksEvictionWindowMsAvgTime.hashCode()));
         result = ((result* 31)+((this.writeBlockOpNumOps == null)? 0 :this.writeBlockOpNumOps.hashCode()));
         result = ((result* 31)+((this.processCpuTime == null)? 0 :this.processCpuTime.hashCode()));
         result = ((result* 31)+((this.numActiveSinks == null)? 0 :this.numActiveSinks.hashCode()));
         result = ((result* 31)+((this.peakThreadCount == null)? 0 :this.peakThreadCount.hashCode()));
         result = ((result* 31)+((this.blockChecksumOpNumOps == null)? 0 :this.blockChecksumOpNumOps.hashCode()));
         result = ((result* 31)+((this.numBlocksFailedToCache == null)? 0 :this.numBlocksFailedToCache.hashCode()));
         result = ((result* 31)+((this.blocksReceivedInPendingIBR == null)? 0 :this.blocksReceivedInPendingIBR.hashCode()));
         result = ((result* 31)+((this.getGroupsNumOps == null)? 0 :this.getGroupsNumOps.hashCode()));
         result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
         result = ((result* 31)+((this.ecReconstructionDecodingTimeMillis == null)? 0 :this.ecReconstructionDecodingTimeMillis.hashCode()));
         result = ((result* 31)+((this.threadCount == null)? 0 :this.threadCount.hashCode()));
         result = ((result* 31)+((this.numDroppedConnections == null)? 0 :this.numDroppedConnections.hashCode()));
         result = ((result* 31)+((this.sendDataPacketTransferNanosAvgTime == null)? 0 :this.sendDataPacketTransferNanosAvgTime.hashCode()));
         result = ((result* 31)+((this.specVendor == null)? 0 :this.specVendor.hashCode()));
         result = ((result* 31)+((this.publishNumOps == null)? 0 :this.publishNumOps.hashCode()));
         result = ((result* 31)+((this.loginFailureNumOps == null)? 0 :this.loginFailureNumOps.hashCode()));
         result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
         result = ((result* 31)+((this.collectionCount == null)? 0 :this.collectionCount.hashCode()));
         result = ((result* 31)+((this.vmVersion == null)? 0 :this.vmVersion.hashCode()));
         result = ((result* 31)+((this.memNonHeapCommittedM == null)? 0 :this.memNonHeapCommittedM.hashCode()));
         result = ((result* 31)+((this.estimatedCapacityLostTotal == null)? 0 :this.estimatedCapacityLostTotal.hashCode()));
         result = ((result* 31)+((this.logFatal == null)? 0 :this.logFatal.hashCode()));
         result = ((result* 31)+((this.fsyncCount == null)? 0 :this.fsyncCount.hashCode()));
         result = ((result* 31)+((this.datanodeNetworkErrors == null)? 0 :this.datanodeNetworkErrors.hashCode()));
         result = ((result* 31)+((this.blocksReceivingInPendingIBR == null)? 0 :this.blocksReceivingInPendingIBR.hashCode()));
         result = ((result* 31)+((this.gcTimeMillisParNew == null)? 0 :this.gcTimeMillisParNew.hashCode()));
         result = ((result* 31)+((this.currentThreadUserTime == null)? 0 :this.currentThreadUserTime.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksWriteFallback == null)? 0 :this.ramDiskBlocksWriteFallback.hashCode()));
         result = ((result* 31)+((this.loggerNames == null)? 0 :this.loggerNames.hashCode()));
         result = ((result* 31)+((this.systemCpuLoad == null)? 0 :this.systemCpuLoad.hashCode()));
         result = ((result* 31)+((this.classPath == null)? 0 :this.classPath.hashCode()));
         result = ((result* 31)+((this.gcTotalExtraSleepTime == null)? 0 :this.gcTotalExtraSleepTime.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksLazyPersistWindowMsNumOps == null)? 0 :this.ramDiskBlocksLazyPersistWindowMsNumOps.hashCode()));
         result = ((result* 31)+((this.packetAckRoundTripTimeNanosAvgTime == null)? 0 :this.packetAckRoundTripTimeNanosAvgTime.hashCode()));
         result = ((result* 31)+((this.blocksGetLocalPathInfo == null)? 0 :this.blocksGetLocalPathInfo.hashCode()));
         result = ((result* 31)+((this.renewalFailuresTotal == null)? 0 :this.renewalFailuresTotal.hashCode()));
         result = ((result* 31)+((this.gcCount == null)? 0 :this.gcCount.hashCode()));
         result = ((result* 31)+((this.rpcProcessingTimeNumOps == null)? 0 :this.rpcProcessingTimeNumOps.hashCode()));
         result = ((result* 31)+((this.ecReconstructionTasks == null)? 0 :this.ecReconstructionTasks.hashCode()));
         result = ((result* 31)+((this.beanname == null)? 0 :this.beanname.hashCode()));
         result = ((result* 31)+((this.freeSwapSpaceSize == null)? 0 :this.freeSwapSpaceSize.hashCode()));
         result = ((result* 31)+((this.packetAckRoundTripTimeNanosNumOps == null)? 0 :this.packetAckRoundTripTimeNanosNumOps.hashCode()));
         result = ((result* 31)+((this.rpcQueueTimeNumOps == null)? 0 :this.rpcQueueTimeNumOps.hashCode()));
         result = ((result* 31)+((this.ecReconstructionBytesWritten == null)? 0 :this.ecReconstructionBytesWritten.hashCode()));
         result = ((result* 31)+((this.snapshotNumOps == null)? 0 :this.snapshotNumOps.hashCode()));
         result = ((result* 31)+((this.memNonHeapMaxM == null)? 0 :this.memNonHeapMaxM.hashCode()));
         result = ((result* 31)+((this.sentBytes == null)? 0 :this.sentBytes.hashCode()));
         result = ((result* 31)+((this.blockChecksumOpAvgTime == null)? 0 :this.blockChecksumOpAvgTime.hashCode()));
         result = ((result* 31)+((this.threadsTimedWaiting == null)? 0 :this.threadsTimedWaiting.hashCode()));
         result = ((result* 31)+((this.receivedBytes == null)? 0 :this.receivedBytes.hashCode()));
         result = ((result* 31)+((this.nonHeapMemoryUsage == null)? 0 :this.nonHeapMemoryUsage.hashCode()));
         result = ((result* 31)+((this.implementationVersion == null)? 0 :this.implementationVersion.hashCode()));
         result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
         result = ((result* 31)+((this.unloadedClassCount == null)? 0 :this.unloadedClassCount.hashCode()));
         result = ((result* 31)+((this.openFileDescriptorCount == null)? 0 :this.openFileDescriptorCount.hashCode()));
         result = ((result* 31)+((this.collectionUsage == null)? 0 :this.collectionUsage.hashCode()));
         result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
         result = ((result* 31)+((this.remoteBytesWritten == null)? 0 :this.remoteBytesWritten.hashCode()));
         result = ((result* 31)+((this.memHeapMaxM == null)? 0 :this.memHeapMaxM.hashCode()));
         result = ((result* 31)+((this.tagHostname == null)? 0 :this.tagHostname.hashCode()));
         result = ((result* 31)+((this.usageThresholdCount == null)? 0 :this.usageThresholdCount.hashCode()));
         result = ((result* 31)+((this.copyBlockOpAvgTime == null)? 0 :this.copyBlockOpAvgTime.hashCode()));
         result = ((result* 31)+((this.specificationName == null)? 0 :this.specificationName.hashCode()));
         result = ((result* 31)+((this.loginFailureAvgTime == null)? 0 :this.loginFailureAvgTime.hashCode()));
         result = ((result* 31)+((this.availableProcessors == null)? 0 :this.availableProcessors.hashCode()));
         result = ((result* 31)+((this.numOpenConnections == null)? 0 :this.numOpenConnections.hashCode()));
         result = ((result* 31)+((this.sendDataPacketBlockedOnNetworkNanosNumOps == null)? 0 :this.sendDataPacketBlockedOnNetworkNanosNumOps.hashCode()));
         result = ((result* 31)+((this.httpPort == null)? 0 :this.httpPort.hashCode()));
         result = ((result* 31)+((this.droppedPubAll == null)? 0 :this.droppedPubAll.hashCode()));
         result = ((result* 31)+((this.blocksInPendingIBR == null)? 0 :this.blocksInPendingIBR.hashCode()));
         result = ((result* 31)+((this.bootClassPathSupported == null)? 0 :this.bootClassPathSupported.hashCode()));
         result = ((result* 31)+((this.maxFileDescriptorCount == null)? 0 :this.maxFileDescriptorCount.hashCode()));
         result = ((result* 31)+((this.readIoRateAvgTime == null)? 0 :this.readIoRateAvgTime.hashCode()));
         result = ((result* 31)+((this.blockVerificationFailures == null)? 0 :this.blockVerificationFailures.hashCode()));
         result = ((result* 31)+((this.incrementalBlockReportsAvgTime == null)? 0 :this.incrementalBlockReportsAvgTime.hashCode()));
         result = ((result* 31)+((this.collectionUsageThreshold == null)? 0 :this.collectionUsageThreshold.hashCode()));
         result = ((result* 31)+((this.threadAllocatedMemoryEnabled == null)? 0 :this.threadAllocatedMemoryEnabled.hashCode()));
         result = ((result* 31)+((this.ecReconstructionWriteTimeMillis == null)? 0 :this.ecReconstructionWriteTimeMillis.hashCode()));
         result = ((result* 31)+((this.xceiverCount == null)? 0 :this.xceiverCount.hashCode()));
         result = ((result* 31)+((this.memHeapUsedM == null)? 0 :this.memHeapUsedM.hashCode()));
         result = ((result* 31)+((this.rpcPort == null)? 0 :this.rpcPort.hashCode()));
         result = ((result* 31)+((this.totalReadTime == null)? 0 :this.totalReadTime.hashCode()));
         result = ((result* 31)+((this.threadContentionMonitoringSupported == null)? 0 :this.threadContentionMonitoringSupported.hashCode()));
         result = ((result* 31)+((this.threadContentionMonitoringEnabled == null)? 0 :this.threadContentionMonitoringEnabled.hashCode()));
         result = ((result* 31)+((this.dataFileIoRateNumOps == null)? 0 :this.dataFileIoRateNumOps.hashCode()));
         result = ((result* 31)+((this.getGroupsAvgTime == null)? 0 :this.getGroupsAvgTime.hashCode()));
         result = ((result* 31)+((this.softwareVersion == null)? 0 :this.softwareVersion.hashCode()));
         result = ((result* 31)+((this.freePhysicalMemorySize == null)? 0 :this.freePhysicalMemorySize.hashCode()));
         result = ((result* 31)+((this.diskBalancerStatus == null)? 0 :this.diskBalancerStatus.hashCode()));
         result = ((result* 31)+((this.inputArguments == null)? 0 :this.inputArguments.hashCode()));
         result = ((result* 31)+((this.loginSuccessNumOps == null)? 0 :this.loginSuccessNumOps.hashCode()));
         result = ((result* 31)+((this.gcTimeMillis == null)? 0 :this.gcTimeMillis.hashCode()));
         result = ((result* 31)+((this.totalMetadataOperations == null)? 0 :this.totalMetadataOperations.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksEvictedWithoutRead == null)? 0 :this.ramDiskBlocksEvictedWithoutRead.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksReadHits == null)? 0 :this.ramDiskBlocksReadHits.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksEvictionWindowMsNumOps == null)? 0 :this.ramDiskBlocksEvictionWindowMsNumOps.hashCode()));
         result = ((result* 31)+((this.rpcClientBackoff == null)? 0 :this.rpcClientBackoff.hashCode()));
         result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
         result = ((result* 31)+((this.valid == null)? 0 :this.valid.hashCode()));
         result = ((result* 31)+((this.ecDecodingTimeNanos == null)? 0 :this.ecDecodingTimeNanos.hashCode()));
         result = ((result* 31)+((this.totalCompilationTime == null)? 0 :this.totalCompilationTime.hashCode()));
         result = ((result* 31)+((this.readIoRateNumOps == null)? 0 :this.readIoRateNumOps.hashCode()));
         result = ((result* 31)+((this.implementationVendor == null)? 0 :this.implementationVendor.hashCode()));
         result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
         result = ((result* 31)+((this.rpcAuthorizationSuccesses == null)? 0 :this.rpcAuthorizationSuccesses.hashCode()));
         result = ((result* 31)+((this.sendPacketDownstreamAvgInfo == null)? 0 :this.sendPacketDownstreamAvgInfo.hashCode()));
         result = ((result* 31)+((this.cacheUsed == null)? 0 :this.cacheUsed.hashCode()));
         result = ((result* 31)+((this.specificationVersion == null)? 0 :this.specificationVersion.hashCode()));
         result = ((result* 31)+((this.copyBlockOpNumOps == null)? 0 :this.copyBlockOpNumOps.hashCode()));
         result = ((result* 31)+((this.tagStorageInfo == null)? 0 :this.tagStorageInfo.hashCode()));
         result = ((result* 31)+((this.bytesWritten == null)? 0 :this.bytesWritten.hashCode()));
         result = ((result* 31)+((this.memoryPoolNames == null)? 0 :this.memoryPoolNames.hashCode()));
         result = ((result* 31)+((this.readsFromLocalClient == null)? 0 :this.readsFromLocalClient.hashCode()));
         result = ((result* 31)+((this.totalLoadedClassCount == null)? 0 :this.totalLoadedClassCount.hashCode()));
         result = ((result* 31)+((this.storageInfo == null)? 0 :this.storageInfo.hashCode()));
         result = ((result* 31)+((this.verbose == null)? 0 :this.verbose.hashCode()));
         result = ((result* 31)+((this.namenodeAddresses == null)? 0 :this.namenodeAddresses.hashCode()));
         result = ((result* 31)+((this.systemLoadAverage == null)? 0 :this.systemLoadAverage.hashCode()));
         result = ((result* 31)+((this.incrementalBlockReportsNumOps == null)? 0 :this.incrementalBlockReportsNumOps.hashCode()));
         result = ((result* 31)+((this.totalWriteTime == null)? 0 :this.totalWriteTime.hashCode()));
         result = ((result* 31)+((this.blocksCached == null)? 0 :this.blocksCached.hashCode()));
         result = ((result* 31)+((this.totalDataFileIos == null)? 0 :this.totalDataFileIos.hashCode()));
         result = ((result* 31)+((this.threadAllocatedMemorySupported == null)? 0 :this.threadAllocatedMemorySupported.hashCode()));
         result = ((result* 31)+((this.gcNumWarnThresholdExceeded == null)? 0 :this.gcNumWarnThresholdExceeded.hashCode()));
         result = ((result* 31)+((this.heartbeatsNumOps == null)? 0 :this.heartbeatsNumOps.hashCode()));
         result = ((result* 31)+((this.heartbeatsAvgTime == null)? 0 :this.heartbeatsAvgTime.hashCode()));
         result = ((result* 31)+((this.blocksVerified == null)? 0 :this.blocksVerified.hashCode()));
         result = ((result* 31)+((this.renewalFailures == null)? 0 :this.renewalFailures.hashCode()));
         result = ((result* 31)+((this.mBeanServerId == null)? 0 :this.mBeanServerId.hashCode()));
         result = ((result* 31)+((this.numBlocksCached == null)? 0 :this.numBlocksCached.hashCode()));
         result = ((result* 31)+((this.blocksRead == null)? 0 :this.blocksRead.hashCode()));
         result = ((result* 31)+((this.numFailedVolumes == null)? 0 :this.numFailedVolumes.hashCode()));
         result = ((result* 31)+((this.tagSessionId == null)? 0 :this.tagSessionId.hashCode()));
         result = ((result* 31)+((this.bPServiceActorInfo == null)? 0 :this.bPServiceActorInfo.hashCode()));
         result = ((result* 31)+((this.volumeFailures == null)? 0 :this.volumeFailures.hashCode()));
         result = ((result* 31)+((this.collectionUsageThresholdCount == null)? 0 :this.collectionUsageThresholdCount.hashCode()));
         result = ((result* 31)+((this.systemProperties == null)? 0 :this.systemProperties.hashCode()));
         result = ((result* 31)+((this.committedVirtualMemorySize == null)? 0 :this.committedVirtualMemorySize.hashCode()));
         result = ((result* 31)+((this.numAllSinks == null)? 0 :this.numAllSinks.hashCode()));
         result = ((result* 31)+((this.dataNodeActiveXceiversCount == null)? 0 :this.dataNodeActiveXceiversCount.hashCode()));
         result = ((result* 31)+((this.fsyncNanosNumOps == null)? 0 :this.fsyncNanosNumOps.hashCode()));
         result = ((result* 31)+((this.totalCapacity == null)? 0 :this.totalCapacity.hashCode()));
         result = ((result* 31)+((this.ramDiskBytesLazyPersisted == null)? 0 :this.ramDiskBytesLazyPersisted.hashCode()));
         result = ((result* 31)+((this.bootClassPath == null)? 0 :this.bootClassPath.hashCode()));
         result = ((result* 31)+((this.usageThresholdExceeded == null)? 0 :this.usageThresholdExceeded.hashCode()));
         result = ((result* 31)+((this.totalPhysicalMemorySize == null)? 0 :this.totalPhysicalMemorySize.hashCode()));
         result = ((result* 31)+((this.volumeInfo == null)? 0 :this.volumeInfo.hashCode()));
         result = ((result* 31)+((this.blocksUncached == null)? 0 :this.blocksUncached.hashCode()));
         result = ((result* 31)+((this.syncIoRateAvgTime == null)? 0 :this.syncIoRateAvgTime.hashCode()));
         result = ((result* 31)+((this.writesFromRemoteClient == null)? 0 :this.writesFromRemoteClient.hashCode()));
         result = ((result* 31)+((this.totalFileIoErrors == null)? 0 :this.totalFileIoErrors.hashCode()));
         result = ((result* 31)+((this.blocksDeletedInPendingIBR == null)? 0 :this.blocksDeletedInPendingIBR.hashCode()));
         result = ((result* 31)+((this.threadsTerminated == null)? 0 :this.threadsTerminated.hashCode()));
         result = ((result* 31)+((this.xmitsInProgress == null)? 0 :this.xmitsInProgress.hashCode()));
         result = ((result* 31)+((this.ramDiskBytesWrite == null)? 0 :this.ramDiskBytesWrite.hashCode()));
         result = ((result* 31)+((this.blockReportsNumOps == null)? 0 :this.blockReportsNumOps.hashCode()));
         result = ((result* 31)+((this.threadsRunnable == null)? 0 :this.threadsRunnable.hashCode()));
         result = ((result* 31)+((this.logError == null)? 0 :this.logError.hashCode()));
         result = ((result* 31)+((this.blocksReplicated == null)? 0 :this.blocksReplicated.hashCode()));
         result = ((result* 31)+((this.logWarn == null)? 0 :this.logWarn.hashCode()));
         result = ((result* 31)+((this.allThreadIds == null)? 0 :this.allThreadIds.hashCode()));
         result = ((result* 31)+((this.tagProcessName == null)? 0 :this.tagProcessName.hashCode()));
         result = ((result* 31)+((this.deferredRpcProcessingTimeAvgTime == null)? 0 :this.deferredRpcProcessingTimeAvgTime.hashCode()));
         result = ((result* 31)+((this.daemonThreadCount == null)? 0 :this.daemonThreadCount.hashCode()));
         result = ((result* 31)+((this.threadsBlocked == null)? 0 :this.threadsBlocked.hashCode()));
         result = ((result* 31)+((this.lastGcInfo == null)? 0 :this.lastGcInfo.hashCode()));
         result = ((result* 31)+((this.usageThresholdSupported == null)? 0 :this.usageThresholdSupported.hashCode()));
         result = ((result* 31)+((this.objectPendingFinalizationCount == null)? 0 :this.objectPendingFinalizationCount.hashCode()));
         result = ((result* 31)+((this.dataFileIoRateAvgTime == null)? 0 :this.dataFileIoRateAvgTime.hashCode()));
         result = ((result* 31)+((this.numBlocksFailedToUncache == null)? 0 :this.numBlocksFailedToUncache.hashCode()));
         result = ((result* 31)+((this.clusterId == null)? 0 :this.clusterId.hashCode()));
         result = ((result* 31)+((this.fileIoErrorRateNumOps == null)? 0 :this.fileIoErrorRateNumOps.hashCode()));
         result = ((result* 31)+((this.gcCountConcurrentMarkSweep == null)? 0 :this.gcCountConcurrentMarkSweep.hashCode()));
         result = ((result* 31)+((this.publishAvgTime == null)? 0 :this.publishAvgTime.hashCode()));
         result = ((result* 31)+((this.ecFailedReconstructionTasks == null)? 0 :this.ecFailedReconstructionTasks.hashCode()));
         result = ((result* 31)+((this.replaceBlockOpNumOps == null)? 0 :this.replaceBlockOpNumOps.hashCode()));
         result = ((result* 31)+((this.deferredRpcProcessingTimeNumOps == null)? 0 :this.deferredRpcProcessingTimeNumOps.hashCode()));
         result = ((result* 31)+((this.memHeapCommittedM == null)? 0 :this.memHeapCommittedM.hashCode()));
         result = ((result* 31)+((this.rpcProcessingTimeAvgTime == null)? 0 :this.rpcProcessingTimeAvgTime.hashCode()));
         result = ((result* 31)+((this.rpcAuthorizationFailures == null)? 0 :this.rpcAuthorizationFailures.hashCode()));
         result = ((result* 31)+((this.numActiveSources == null)? 0 :this.numActiveSources.hashCode()));
         result = ((result* 31)+((this.ecReconstructionRemoteBytesRead == null)? 0 :this.ecReconstructionRemoteBytesRead.hashCode()));
         result = ((result* 31)+((this.metadataOperationRateNumOps == null)? 0 :this.metadataOperationRateNumOps.hashCode()));
         result = ((result* 31)+((this.threadCpuTimeEnabled == null)? 0 :this.threadCpuTimeEnabled.hashCode()));
         result = ((result* 31)+((this.dataPort == null)? 0 :this.dataPort.hashCode()));
         result = ((result* 31)+((this.numAllSources == null)? 0 :this.numAllSources.hashCode()));
         result = ((result* 31)+((this.ramDiskBlocksWrite == null)? 0 :this.ramDiskBlocksWrite.hashCode()));
         result = ((result* 31)+((this.threadsWaiting == null)? 0 :this.threadsWaiting.hashCode()));
         result = ((result* 31)+((this.cacheReportsAvgTime == null)? 0 :this.cacheReportsAvgTime.hashCode()));
         result = ((result* 31)+((this.numBlocksFailedToUnCache == null)? 0 :this.numBlocksFailedToUnCache.hashCode()));
         result = ((result* 31)+((this.uptime == null)? 0 :this.uptime.hashCode()));
         result = ((result* 31)+((this.currentThreadCpuTimeSupported == null)? 0 :this.currentThreadCpuTimeSupported.hashCode()));
         result = ((result* 31)+((this.writesFromLocalClient == null)? 0 :this.writesFromLocalClient.hashCode()));
         result = ((result* 31)+((this.synchronizerUsageSupported == null)? 0 :this.synchronizerUsageSupported.hashCode()));
         result = ((result* 31)+((this.dfsUsed == null)? 0 :this.dfsUsed.hashCode()));
         result = ((result* 31)+((this.objectName == null)? 0 :this.objectName.hashCode()));
         result = ((result* 31)+((this.heapMemoryUsage == null)? 0 :this.heapMemoryUsage.hashCode()));
         result = ((result* 31)+((this.objectMonitorUsageSupported == null)? 0 :this.objectMonitorUsageSupported.hashCode()));
         result = ((result* 31)+((this.readsFromRemoteClient == null)? 0 :this.readsFromRemoteClient.hashCode()));
         result = ((result* 31)+((this.cacheReportsNumOps == null)? 0 :this.cacheReportsNumOps.hashCode()));
         return result;
     }
 
     @Override
     public boolean equals(Object other) {
         if (other == this) {
             return true;
         }
         if ((other instanceof Bean) == false) {
             return false;
         }
         Bean rhs = ((Bean) other);
         return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.gcNumInfoThresholdExceeded == rhs.gcNumInfoThresholdExceeded)||((this.gcNumInfoThresholdExceeded!= null)&&this.gcNumInfoThresholdExceeded.equals(rhs.gcNumInfoThresholdExceeded)))&&((this.flushIoRateAvgTime == rhs.flushIoRateAvgTime)||((this.flushIoRateAvgTime!= null)&&this.flushIoRateAvgTime.equals(rhs.flushIoRateAvgTime))))&&((this.loginSuccessAvgTime == rhs.loginSuccessAvgTime)||((this.loginSuccessAvgTime!= null)&&this.loginSuccessAvgTime.equals(rhs.loginSuccessAvgTime))))&&((this.collectionTime == rhs.collectionTime)||((this.collectionTime!= null)&&this.collectionTime.equals(rhs.collectionTime))))&&((this.ramDiskBlocksLazyPersistWindowMsAvgTime == rhs.ramDiskBlocksLazyPersistWindowMsAvgTime)||((this.ramDiskBlocksLazyPersistWindowMsAvgTime!= null)&&this.ramDiskBlocksLazyPersistWindowMsAvgTime.equals(rhs.ramDiskBlocksLazyPersistWindowMsAvgTime))))&&((this.tagNumOpenConnectionsPerUser == rhs.tagNumOpenConnectionsPerUser)||((this.tagNumOpenConnectionsPerUser!= null)&&this.tagNumOpenConnectionsPerUser.equals(rhs.tagNumOpenConnectionsPerUser))))&&((this.currentThreadCpuTime == rhs.currentThreadCpuTime)||((this.currentThreadCpuTime!= null)&&this.currentThreadCpuTime.equals(rhs.currentThreadCpuTime))))&&((this.tagContext == rhs.tagContext)||((this.tagContext!= null)&&this.tagContext.equals(rhs.tagContext))))&&((this.flushIoRateNumOps == rhs.flushIoRateNumOps)||((this.flushIoRateNumOps!= null)&&this.flushIoRateNumOps.equals(rhs.flushIoRateNumOps))))&&((this.memoryUsed == rhs.memoryUsed)||((this.memoryUsed!= null)&&this.memoryUsed.equals(rhs.memoryUsed))))&&((this.lifelinesAvgTime == rhs.lifelinesAvgTime)||((this.lifelinesAvgTime!= null)&&this.lifelinesAvgTime.equals(rhs.lifelinesAvgTime))))&&((this.totalSwapSpaceSize == rhs.totalSwapSpaceSize)||((this.totalSwapSpaceSize!= null)&&this.totalSwapSpaceSize.equals(rhs.totalSwapSpaceSize))))&&((this.flushNanosNumOps == rhs.flushNanosNumOps)||((this.flushNanosNumOps!= null)&&this.flushNanosNumOps.equals(rhs.flushNanosNumOps))))&&((this.usageThreshold == rhs.usageThreshold)||((this.usageThreshold!= null)&&this.usageThreshold.equals(rhs.usageThreshold))))&&((this.loadedClassCount == rhs.loadedClassCount)||((this.loadedClassCount!= null)&&this.loadedClassCount.equals(rhs.loadedClassCount))))&&((this.heartbeatsTotalNumOps == rhs.heartbeatsTotalNumOps)||((this.heartbeatsTotalNumOps!= null)&&this.heartbeatsTotalNumOps.equals(rhs.heartbeatsTotalNumOps))))&&((this.readBlockOpAvgTime == rhs.readBlockOpAvgTime)||((this.readBlockOpAvgTime!= null)&&this.readBlockOpAvgTime.equals(rhs.readBlockOpAvgTime))))&&((this.rpcAuthenticationSuccesses == rhs.rpcAuthenticationSuccesses)||((this.rpcAuthenticationSuccesses!= null)&&this.rpcAuthenticationSuccesses.equals(rhs.rpcAuthenticationSuccesses))))&&((this.sendDataPacketTransferNanosNumOps == rhs.sendDataPacketTransferNanosNumOps)||((this.sendDataPacketTransferNanosNumOps!= null)&&this.sendDataPacketTransferNanosNumOps.equals(rhs.sendDataPacketTransferNanosNumOps))))&&((this.sinkTimelineQsize == rhs.sinkTimelineQsize)||((this.sinkTimelineQsize!= null)&&this.sinkTimelineQsize.equals(rhs.sinkTimelineQsize))))&&((this.remoteBytesRead == rhs.remoteBytesRead)||((this.remoteBytesRead!= null)&&this.remoteBytesRead.equals(rhs.remoteBytesRead))))&&((this.callQueueLength == rhs.callQueueLength)||((this.callQueueLength!= null)&&this.callQueueLength.equals(rhs.callQueueLength))))&&((this.implementationName == rhs.implementationName)||((this.implementationName!= null)&&this.implementationName.equals(rhs.implementationName))))&&((this.heartbeatsTotalAvgTime == rhs.heartbeatsTotalAvgTime)||((this.heartbeatsTotalAvgTime!= null)&&this.heartbeatsTotalAvgTime.equals(rhs.heartbeatsTotalAvgTime))))&&((this.libraryPath == rhs.libraryPath)||((this.libraryPath!= null)&&this.libraryPath.equals(rhs.libraryPath))))&&((this.memoryManagerNames == rhs.memoryManagerNames)||((this.memoryManagerNames!= null)&&this.memoryManagerNames.equals(rhs.memoryManagerNames))))&&((this.sinkTimelineDropped == rhs.sinkTimelineDropped)||((this.sinkTimelineDropped!= null)&&this.sinkTimelineDropped.equals(rhs.sinkTimelineDropped))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.replaceBlockOpAvgTime == rhs.replaceBlockOpAvgTime)||((this.replaceBlockOpAvgTime!= null)&&this.replaceBlockOpAvgTime.equals(rhs.replaceBlockOpAvgTime))))&&((this.remaining == rhs.remaining)||((this.remaining!= null)&&this.remaining.equals(rhs.remaining))))&&((this.memNonHeapUsedM == rhs.memNonHeapUsedM)||((this.memNonHeapUsedM!= null)&&this.memNonHeapUsedM.equals(rhs.memNonHeapUsedM))))&&((this.writeIoRateAvgTime == rhs.writeIoRateAvgTime)||((this.writeIoRateAvgTime!= null)&&this.writeIoRateAvgTime.equals(rhs.writeIoRateAvgTime))))&&((this.specName == rhs.specName)||((this.specName!= null)&&this.specName.equals(rhs.specName))))&&((this.writeBlockOpAvgTime == rhs.writeBlockOpAvgTime)||((this.writeBlockOpAvgTime!= null)&&this.writeBlockOpAvgTime.equals(rhs.writeBlockOpAvgTime))))&&((this.gcCountParNew == rhs.gcCountParNew)||((this.gcCountParNew!= null)&&this.gcCountParNew.equals(rhs.gcCountParNew))))&&((this.sinkTimelineNumOps == rhs.sinkTimelineNumOps)||((this.sinkTimelineNumOps!= null)&&this.sinkTimelineNumOps.equals(rhs.sinkTimelineNumOps))))&&((this.diagnosticOptions == rhs.diagnosticOptions)||((this.diagnosticOptions!= null)&&this.diagnosticOptions.equals(rhs.diagnosticOptions))))&&((this.blocksRemoved == rhs.blocksRemoved)||((this.blocksRemoved!= null)&&this.blocksRemoved.equals(rhs.blocksRemoved))))&&((this.modelerType == rhs.modelerType)||((this.modelerType!= null)&&this.modelerType.equals(rhs.modelerType))))&&((this.ramDiskBlocksEvicted == rhs.ramDiskBlocksEvicted)||((this.ramDiskBlocksEvicted!= null)&&this.ramDiskBlocksEvicted.equals(rhs.ramDiskBlocksEvicted))))&&((this.blockReportsAvgTime == rhs.blockReportsAvgTime)||((this.blockReportsAvgTime!= null)&&this.blockReportsAvgTime.equals(rhs.blockReportsAvgTime))))&&((this.logInfo == rhs.logInfo)||((this.logInfo!= null)&&this.logInfo.equals(rhs.logInfo))))&&((this.managementSpecVersion == rhs.managementSpecVersion)||((this.managementSpecVersion!= null)&&this.managementSpecVersion.equals(rhs.managementSpecVersion))))&&((this.collectionUsageThresholdSupported == rhs.collectionUsageThresholdSupported)||((this.collectionUsageThresholdSupported!= null)&&this.collectionUsageThresholdSupported.equals(rhs.collectionUsageThresholdSupported))))&&((this.cacheCapacity == rhs.cacheCapacity)||((this.cacheCapacity!= null)&&this.cacheCapacity.equals(rhs.cacheCapacity))))&&((this.compilationTimeMonitoringSupported == rhs.compilationTimeMonitoringSupported)||((this.compilationTimeMonitoringSupported!= null)&&this.compilationTimeMonitoringSupported.equals(rhs.compilationTimeMonitoringSupported))))&&((this.collectionUsageThresholdExceeded == rhs.collectionUsageThresholdExceeded)||((this.collectionUsageThresholdExceeded!= null)&&this.collectionUsageThresholdExceeded.equals(rhs.collectionUsageThresholdExceeded))))&&((this.syncIoRateNumOps == rhs.syncIoRateNumOps)||((this.syncIoRateNumOps!= null)&&this.syncIoRateNumOps.equals(rhs.syncIoRateNumOps))))&&((this.ramDiskBlocksDeletedBeforeLazyPersisted == rhs.ramDiskBlocksDeletedBeforeLazyPersisted)||((this.ramDiskBlocksDeletedBeforeLazyPersisted!= null)&&this.ramDiskBlocksDeletedBeforeLazyPersisted.equals(rhs.ramDiskBlocksDeletedBeforeLazyPersisted))))&&((this.memMaxM == rhs.memMaxM)||((this.memMaxM!= null)&&this.memMaxM.equals(rhs.memMaxM))))&&((this.threadsNew == rhs.threadsNew)||((this.threadsNew!= null)&&this.threadsNew.equals(rhs.threadsNew))))&&((this.datanodeNetworkCounts == rhs.datanodeNetworkCounts)||((this.datanodeNetworkCounts!= null)&&this.datanodeNetworkCounts.equals(rhs.datanodeNetworkCounts))))&&((this.metadataOperationRateAvgTime == rhs.metadataOperationRateAvgTime)||((this.metadataOperationRateAvgTime!= null)&&this.metadataOperationRateAvgTime.equals(rhs.metadataOperationRateAvgTime))))&&((this.vmName == rhs.vmName)||((this.vmName!= null)&&this.vmName.equals(rhs.vmName))))&&((this.slowDisks == rhs.slowDisks)||((this.slowDisks!= null)&&this.slowDisks.equals(rhs.slowDisks))))&&((this.bytesRead == rhs.bytesRead)||((this.bytesRead!= null)&&this.bytesRead.equals(rhs.bytesRead))))&&((this.threadCpuTimeSupported == rhs.threadCpuTimeSupported)||((this.threadCpuTimeSupported!= null)&&this.threadCpuTimeSupported.equals(rhs.threadCpuTimeSupported))))&&((this.writeIoRateNumOps == rhs.writeIoRateNumOps)||((this.writeIoRateNumOps!= null)&&this.writeIoRateNumOps.equals(rhs.writeIoRateNumOps))))&&((this.rpcSlowCalls == rhs.rpcSlowCalls)||((this.rpcSlowCalls!= null)&&this.rpcSlowCalls.equals(rhs.rpcSlowCalls))))&&((this.sendDataPacketBlockedOnNetworkNanosAvgTime == rhs.sendDataPacketBlockedOnNetworkNanosAvgTime)||((this.sendDataPacketBlockedOnNetworkNanosAvgTime!= null)&&this.sendDataPacketBlockedOnNetworkNanosAvgTime.equals(rhs.sendDataPacketBlockedOnNetworkNanosAvgTime))))&&((this.ecReconstructionReadTimeMillis == rhs.ecReconstructionReadTimeMillis)||((this.ecReconstructionReadTimeMillis!= null)&&this.ecReconstructionReadTimeMillis.equals(rhs.ecReconstructionReadTimeMillis))))&&((this.rpcQueueTimeAvgTime == rhs.rpcQueueTimeAvgTime)||((this.rpcQueueTimeAvgTime!= null)&&this.rpcQueueTimeAvgTime.equals(rhs.rpcQueueTimeAvgTime))))&&((this.fileIoErrorRateAvgTime == rhs.fileIoErrorRateAvgTime)||((this.fileIoErrorRateAvgTime!= null)&&this.fileIoErrorRateAvgTime.equals(rhs.fileIoErrorRateAvgTime))))&&((this.ecReconstructionBytesRead == rhs.ecReconstructionBytesRead)||((this.ecReconstructionBytesRead!= null)&&this.ecReconstructionBytesRead.equals(rhs.ecReconstructionBytesRead))))&&((this.lifelinesNumOps == rhs.lifelinesNumOps)||((this.lifelinesNumOps!= null)&&this.lifelinesNumOps.equals(rhs.lifelinesNumOps))))&&((this.arch == rhs.arch)||((this.arch!= null)&&this.arch.equals(rhs.arch))))&&((this.ramDiskBlocksLazyPersisted == rhs.ramDiskBlocksLazyPersisted)||((this.ramDiskBlocksLazyPersisted!= null)&&this.ramDiskBlocksLazyPersisted.equals(rhs.ramDiskBlocksLazyPersisted))))&&((this.snapshotAvgTime == rhs.snapshotAvgTime)||((this.snapshotAvgTime!= null)&&this.snapshotAvgTime.equals(rhs.snapshotAvgTime))))&&((this.peakUsage == rhs.peakUsage)||((this.peakUsage!= null)&&this.peakUsage.equals(rhs.peakUsage))))&&((this.specificationVendor == rhs.specificationVendor)||((this.specificationVendor!= null)&&this.specificationVendor.equals(rhs.specificationVendor))))&&((this.rpcAuthenticationFailures == rhs.rpcAuthenticationFailures)||((this.rpcAuthenticationFailures!= null)&&this.rpcAuthenticationFailures.equals(rhs.rpcAuthenticationFailures))))&&((this.blocksWritten == rhs.blocksWritten)||((this.blocksWritten!= null)&&this.blocksWritten.equals(rhs.blocksWritten))))&&((this.specVersion == rhs.specVersion)||((this.specVersion!= null)&&this.specVersion.equals(rhs.specVersion))))&&((this.sinkTimelineAvgTime == rhs.sinkTimelineAvgTime)||((this.sinkTimelineAvgTime!= null)&&this.sinkTimelineAvgTime.equals(rhs.sinkTimelineAvgTime))))&&((this.failedStorageLocations == rhs.failedStorageLocations)||((this.failedStorageLocations!= null)&&this.failedStorageLocations.equals(rhs.failedStorageLocations))))&&((this.vmVendor == rhs.vmVendor)||((this.vmVendor!= null)&&this.vmVendor.equals(rhs.vmVendor))))&&((this.totalStartedThreadCount == rhs.totalStartedThreadCount)||((this.totalStartedThreadCount!= null)&&this.totalStartedThreadCount.equals(rhs.totalStartedThreadCount))))&&((this.readBlockOpNumOps == rhs.readBlockOpNumOps)||((this.readBlockOpNumOps!= null)&&this.readBlockOpNumOps.equals(rhs.readBlockOpNumOps))))&&((this.flushNanosAvgTime == rhs.flushNanosAvgTime)||((this.flushNanosAvgTime!= null)&&this.flushNanosAvgTime.equals(rhs.flushNanosAvgTime))))&&((this.gcTimeMillisConcurrentMarkSweep == rhs.gcTimeMillisConcurrentMarkSweep)||((this.gcTimeMillisConcurrentMarkSweep!= null)&&this.gcTimeMillisConcurrentMarkSweep.equals(rhs.gcTimeMillisConcurrentMarkSweep))))&&((this.tagPort == rhs.tagPort)||((this.tagPort!= null)&&this.tagPort.equals(rhs.tagPort))))&&((this.fsyncNanosAvgTime == rhs.fsyncNanosAvgTime)||((this.fsyncNanosAvgTime!= null)&&this.fsyncNanosAvgTime.equals(rhs.fsyncNanosAvgTime))))&&((this.lastVolumeFailureDate == rhs.lastVolumeFailureDate)||((this.lastVolumeFailureDate!= null)&&this.lastVolumeFailureDate.equals(rhs.lastVolumeFailureDate))))&&((this.datanodeHostname == rhs.datanodeHostname)||((this.datanodeHostname!= null)&&this.datanodeHostname.equals(rhs.datanodeHostname))))&&((this.processCpuLoad == rhs.processCpuLoad)||((this.processCpuLoad!= null)&&this.processCpuLoad.equals(rhs.processCpuLoad))))&&((this.ramDiskBlocksEvictionWindowMsAvgTime == rhs.ramDiskBlocksEvictionWindowMsAvgTime)||((this.ramDiskBlocksEvictionWindowMsAvgTime!= null)&&this.ramDiskBlocksEvictionWindowMsAvgTime.equals(rhs.ramDiskBlocksEvictionWindowMsAvgTime))))&&((this.writeBlockOpNumOps == rhs.writeBlockOpNumOps)||((this.writeBlockOpNumOps!= null)&&this.writeBlockOpNumOps.equals(rhs.writeBlockOpNumOps))))&&((this.processCpuTime == rhs.processCpuTime)||((this.processCpuTime!= null)&&this.processCpuTime.equals(rhs.processCpuTime))))&&((this.numActiveSinks == rhs.numActiveSinks)||((this.numActiveSinks!= null)&&this.numActiveSinks.equals(rhs.numActiveSinks))))&&((this.peakThreadCount == rhs.peakThreadCount)||((this.peakThreadCount!= null)&&this.peakThreadCount.equals(rhs.peakThreadCount))))&&((this.blockChecksumOpNumOps == rhs.blockChecksumOpNumOps)||((this.blockChecksumOpNumOps!= null)&&this.blockChecksumOpNumOps.equals(rhs.blockChecksumOpNumOps))))&&((this.numBlocksFailedToCache == rhs.numBlocksFailedToCache)||((this.numBlocksFailedToCache!= null)&&this.numBlocksFailedToCache.equals(rhs.numBlocksFailedToCache))))&&((this.blocksReceivedInPendingIBR == rhs.blocksReceivedInPendingIBR)||((this.blocksReceivedInPendingIBR!= null)&&this.blocksReceivedInPendingIBR.equals(rhs.blocksReceivedInPendingIBR))))&&((this.getGroupsNumOps == rhs.getGroupsNumOps)||((this.getGroupsNumOps!= null)&&this.getGroupsNumOps.equals(rhs.getGroupsNumOps))))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this.ecReconstructionDecodingTimeMillis == rhs.ecReconstructionDecodingTimeMillis)||((this.ecReconstructionDecodingTimeMillis!= null)&&this.ecReconstructionDecodingTimeMillis.equals(rhs.ecReconstructionDecodingTimeMillis))))&&((this.threadCount == rhs.threadCount)||((this.threadCount!= null)&&this.threadCount.equals(rhs.threadCount))))&&((this.numDroppedConnections == rhs.numDroppedConnections)||((this.numDroppedConnections!= null)&&this.numDroppedConnections.equals(rhs.numDroppedConnections))))&&((this.sendDataPacketTransferNanosAvgTime == rhs.sendDataPacketTransferNanosAvgTime)||((this.sendDataPacketTransferNanosAvgTime!= null)&&this.sendDataPacketTransferNanosAvgTime.equals(rhs.sendDataPacketTransferNanosAvgTime))))&&((this.specVendor == rhs.specVendor)||((this.specVendor!= null)&&this.specVendor.equals(rhs.specVendor))))&&((this.publishNumOps == rhs.publishNumOps)||((this.publishNumOps!= null)&&this.publishNumOps.equals(rhs.publishNumOps))))&&((this.loginFailureNumOps == rhs.loginFailureNumOps)||((this.loginFailureNumOps!= null)&&this.loginFailureNumOps.equals(rhs.loginFailureNumOps))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.collectionCount == rhs.collectionCount)||((this.collectionCount!= null)&&this.collectionCount.equals(rhs.collectionCount))))&&((this.vmVersion == rhs.vmVersion)||((this.vmVersion!= null)&&this.vmVersion.equals(rhs.vmVersion))))&&((this.memNonHeapCommittedM == rhs.memNonHeapCommittedM)||((this.memNonHeapCommittedM!= null)&&this.memNonHeapCommittedM.equals(rhs.memNonHeapCommittedM))))&&((this.estimatedCapacityLostTotal == rhs.estimatedCapacityLostTotal)||((this.estimatedCapacityLostTotal!= null)&&this.estimatedCapacityLostTotal.equals(rhs.estimatedCapacityLostTotal))))&&((this.logFatal == rhs.logFatal)||((this.logFatal!= null)&&this.logFatal.equals(rhs.logFatal))))&&((this.fsyncCount == rhs.fsyncCount)||((this.fsyncCount!= null)&&this.fsyncCount.equals(rhs.fsyncCount))))&&((this.datanodeNetworkErrors == rhs.datanodeNetworkErrors)||((this.datanodeNetworkErrors!= null)&&this.datanodeNetworkErrors.equals(rhs.datanodeNetworkErrors))))&&((this.blocksReceivingInPendingIBR == rhs.blocksReceivingInPendingIBR)||((this.blocksReceivingInPendingIBR!= null)&&this.blocksReceivingInPendingIBR.equals(rhs.blocksReceivingInPendingIBR))))&&((this.gcTimeMillisParNew == rhs.gcTimeMillisParNew)||((this.gcTimeMillisParNew!= null)&&this.gcTimeMillisParNew.equals(rhs.gcTimeMillisParNew))))&&((this.currentThreadUserTime == rhs.currentThreadUserTime)||((this.currentThreadUserTime!= null)&&this.currentThreadUserTime.equals(rhs.currentThreadUserTime))))&&((this.ramDiskBlocksWriteFallback == rhs.ramDiskBlocksWriteFallback)||((this.ramDiskBlocksWriteFallback!= null)&&this.ramDiskBlocksWriteFallback.equals(rhs.ramDiskBlocksWriteFallback))))&&((this.loggerNames == rhs.loggerNames)||((this.loggerNames!= null)&&this.loggerNames.equals(rhs.loggerNames))))&&((this.systemCpuLoad == rhs.systemCpuLoad)||((this.systemCpuLoad!= null)&&this.systemCpuLoad.equals(rhs.systemCpuLoad))))&&((this.classPath == rhs.classPath)||((this.classPath!= null)&&this.classPath.equals(rhs.classPath))))&&((this.gcTotalExtraSleepTime == rhs.gcTotalExtraSleepTime)||((this.gcTotalExtraSleepTime!= null)&&this.gcTotalExtraSleepTime.equals(rhs.gcTotalExtraSleepTime))))&&((this.ramDiskBlocksLazyPersistWindowMsNumOps == rhs.ramDiskBlocksLazyPersistWindowMsNumOps)||((this.ramDiskBlocksLazyPersistWindowMsNumOps!= null)&&this.ramDiskBlocksLazyPersistWindowMsNumOps.equals(rhs.ramDiskBlocksLazyPersistWindowMsNumOps))))&&((this.packetAckRoundTripTimeNanosAvgTime == rhs.packetAckRoundTripTimeNanosAvgTime)||((this.packetAckRoundTripTimeNanosAvgTime!= null)&&this.packetAckRoundTripTimeNanosAvgTime.equals(rhs.packetAckRoundTripTimeNanosAvgTime))))&&((this.blocksGetLocalPathInfo == rhs.blocksGetLocalPathInfo)||((this.blocksGetLocalPathInfo!= null)&&this.blocksGetLocalPathInfo.equals(rhs.blocksGetLocalPathInfo))))&&((this.renewalFailuresTotal == rhs.renewalFailuresTotal)||((this.renewalFailuresTotal!= null)&&this.renewalFailuresTotal.equals(rhs.renewalFailuresTotal))))&&((this.gcCount == rhs.gcCount)||((this.gcCount!= null)&&this.gcCount.equals(rhs.gcCount))))&&((this.rpcProcessingTimeNumOps == rhs.rpcProcessingTimeNumOps)||((this.rpcProcessingTimeNumOps!= null)&&this.rpcProcessingTimeNumOps.equals(rhs.rpcProcessingTimeNumOps))))&&((this.ecReconstructionTasks == rhs.ecReconstructionTasks)||((this.ecReconstructionTasks!= null)&&this.ecReconstructionTasks.equals(rhs.ecReconstructionTasks))))&&((this.beanname == rhs.beanname)||((this.beanname!= null)&&this.beanname.equals(rhs.beanname))))&&((this.freeSwapSpaceSize == rhs.freeSwapSpaceSize)||((this.freeSwapSpaceSize!= null)&&this.freeSwapSpaceSize.equals(rhs.freeSwapSpaceSize))))&&((this.packetAckRoundTripTimeNanosNumOps == rhs.packetAckRoundTripTimeNanosNumOps)||((this.packetAckRoundTripTimeNanosNumOps!= null)&&this.packetAckRoundTripTimeNanosNumOps.equals(rhs.packetAckRoundTripTimeNanosNumOps))))&&((this.rpcQueueTimeNumOps == rhs.rpcQueueTimeNumOps)||((this.rpcQueueTimeNumOps!= null)&&this.rpcQueueTimeNumOps.equals(rhs.rpcQueueTimeNumOps))))&&((this.ecReconstructionBytesWritten == rhs.ecReconstructionBytesWritten)||((this.ecReconstructionBytesWritten!= null)&&this.ecReconstructionBytesWritten.equals(rhs.ecReconstructionBytesWritten))))&&((this.snapshotNumOps == rhs.snapshotNumOps)||((this.snapshotNumOps!= null)&&this.snapshotNumOps.equals(rhs.snapshotNumOps))))&&((this.memNonHeapMaxM == rhs.memNonHeapMaxM)||((this.memNonHeapMaxM!= null)&&this.memNonHeapMaxM.equals(rhs.memNonHeapMaxM))))&&((this.sentBytes == rhs.sentBytes)||((this.sentBytes!= null)&&this.sentBytes.equals(rhs.sentBytes))))&&((this.blockChecksumOpAvgTime == rhs.blockChecksumOpAvgTime)||((this.blockChecksumOpAvgTime!= null)&&this.blockChecksumOpAvgTime.equals(rhs.blockChecksumOpAvgTime))))&&((this.threadsTimedWaiting == rhs.threadsTimedWaiting)||((this.threadsTimedWaiting!= null)&&this.threadsTimedWaiting.equals(rhs.threadsTimedWaiting))))&&((this.receivedBytes == rhs.receivedBytes)||((this.receivedBytes!= null)&&this.receivedBytes.equals(rhs.receivedBytes))))&&((this.nonHeapMemoryUsage == rhs.nonHeapMemoryUsage)||((this.nonHeapMemoryUsage!= null)&&this.nonHeapMemoryUsage.equals(rhs.nonHeapMemoryUsage))))&&((this.implementationVersion == rhs.implementationVersion)||((this.implementationVersion!= null)&&this.implementationVersion.equals(rhs.implementationVersion))))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.unloadedClassCount == rhs.unloadedClassCount)||((this.unloadedClassCount!= null)&&this.unloadedClassCount.equals(rhs.unloadedClassCount))))&&((this.openFileDescriptorCount == rhs.openFileDescriptorCount)||((this.openFileDescriptorCount!= null)&&this.openFileDescriptorCount.equals(rhs.openFileDescriptorCount))))&&((this.collectionUsage == rhs.collectionUsage)||((this.collectionUsage!= null)&&this.collectionUsage.equals(rhs.collectionUsage))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.remoteBytesWritten == rhs.remoteBytesWritten)||((this.remoteBytesWritten!= null)&&this.remoteBytesWritten.equals(rhs.remoteBytesWritten))))&&((this.memHeapMaxM == rhs.memHeapMaxM)||((this.memHeapMaxM!= null)&&this.memHeapMaxM.equals(rhs.memHeapMaxM))))&&((this.tagHostname == rhs.tagHostname)||((this.tagHostname!= null)&&this.tagHostname.equals(rhs.tagHostname))))&&((this.usageThresholdCount == rhs.usageThresholdCount)||((this.usageThresholdCount!= null)&&this.usageThresholdCount.equals(rhs.usageThresholdCount))))&&((this.copyBlockOpAvgTime == rhs.copyBlockOpAvgTime)||((this.copyBlockOpAvgTime!= null)&&this.copyBlockOpAvgTime.equals(rhs.copyBlockOpAvgTime))))&&((this.specificationName == rhs.specificationName)||((this.specificationName!= null)&&this.specificationName.equals(rhs.specificationName))))&&((this.loginFailureAvgTime == rhs.loginFailureAvgTime)||((this.loginFailureAvgTime!= null)&&this.loginFailureAvgTime.equals(rhs.loginFailureAvgTime))))&&((this.availableProcessors == rhs.availableProcessors)||((this.availableProcessors!= null)&&this.availableProcessors.equals(rhs.availableProcessors))))&&((this.numOpenConnections == rhs.numOpenConnections)||((this.numOpenConnections!= null)&&this.numOpenConnections.equals(rhs.numOpenConnections))))&&((this.sendDataPacketBlockedOnNetworkNanosNumOps == rhs.sendDataPacketBlockedOnNetworkNanosNumOps)||((this.sendDataPacketBlockedOnNetworkNanosNumOps!= null)&&this.sendDataPacketBlockedOnNetworkNanosNumOps.equals(rhs.sendDataPacketBlockedOnNetworkNanosNumOps))))&&((this.httpPort == rhs.httpPort)||((this.httpPort!= null)&&this.httpPort.equals(rhs.httpPort))))&&((this.droppedPubAll == rhs.droppedPubAll)||((this.droppedPubAll!= null)&&this.droppedPubAll.equals(rhs.droppedPubAll))))&&((this.blocksInPendingIBR == rhs.blocksInPendingIBR)||((this.blocksInPendingIBR!= null)&&this.blocksInPendingIBR.equals(rhs.blocksInPendingIBR))))&&((this.bootClassPathSupported == rhs.bootClassPathSupported)||((this.bootClassPathSupported!= null)&&this.bootClassPathSupported.equals(rhs.bootClassPathSupported))))&&((this.maxFileDescriptorCount == rhs.maxFileDescriptorCount)||((this.maxFileDescriptorCount!= null)&&this.maxFileDescriptorCount.equals(rhs.maxFileDescriptorCount))))&&((this.readIoRateAvgTime == rhs.readIoRateAvgTime)||((this.readIoRateAvgTime!= null)&&this.readIoRateAvgTime.equals(rhs.readIoRateAvgTime))))&&((this.blockVerificationFailures == rhs.blockVerificationFailures)||((this.blockVerificationFailures!= null)&&this.blockVerificationFailures.equals(rhs.blockVerificationFailures))))&&((this.incrementalBlockReportsAvgTime == rhs.incrementalBlockReportsAvgTime)||((this.incrementalBlockReportsAvgTime!= null)&&this.incrementalBlockReportsAvgTime.equals(rhs.incrementalBlockReportsAvgTime))))&&((this.collectionUsageThreshold == rhs.collectionUsageThreshold)||((this.collectionUsageThreshold!= null)&&this.collectionUsageThreshold.equals(rhs.collectionUsageThreshold))))&&((this.threadAllocatedMemoryEnabled == rhs.threadAllocatedMemoryEnabled)||((this.threadAllocatedMemoryEnabled!= null)&&this.threadAllocatedMemoryEnabled.equals(rhs.threadAllocatedMemoryEnabled))))&&((this.ecReconstructionWriteTimeMillis == rhs.ecReconstructionWriteTimeMillis)||((this.ecReconstructionWriteTimeMillis!= null)&&this.ecReconstructionWriteTimeMillis.equals(rhs.ecReconstructionWriteTimeMillis))))&&((this.xceiverCount == rhs.xceiverCount)||((this.xceiverCount!= null)&&this.xceiverCount.equals(rhs.xceiverCount))))&&((this.memHeapUsedM == rhs.memHeapUsedM)||((this.memHeapUsedM!= null)&&this.memHeapUsedM.equals(rhs.memHeapUsedM))))&&((this.rpcPort == rhs.rpcPort)||((this.rpcPort!= null)&&this.rpcPort.equals(rhs.rpcPort))))&&((this.totalReadTime == rhs.totalReadTime)||((this.totalReadTime!= null)&&this.totalReadTime.equals(rhs.totalReadTime))))&&((this.threadContentionMonitoringSupported == rhs.threadContentionMonitoringSupported)||((this.threadContentionMonitoringSupported!= null)&&this.threadContentionMonitoringSupported.equals(rhs.threadContentionMonitoringSupported))))&&((this.threadContentionMonitoringEnabled == rhs.threadContentionMonitoringEnabled)||((this.threadContentionMonitoringEnabled!= null)&&this.threadContentionMonitoringEnabled.equals(rhs.threadContentionMonitoringEnabled))))&&((this.dataFileIoRateNumOps == rhs.dataFileIoRateNumOps)||((this.dataFileIoRateNumOps!= null)&&this.dataFileIoRateNumOps.equals(rhs.dataFileIoRateNumOps))))&&((this.getGroupsAvgTime == rhs.getGroupsAvgTime)||((this.getGroupsAvgTime!= null)&&this.getGroupsAvgTime.equals(rhs.getGroupsAvgTime))))&&((this.softwareVersion == rhs.softwareVersion)||((this.softwareVersion!= null)&&this.softwareVersion.equals(rhs.softwareVersion))))&&((this.freePhysicalMemorySize == rhs.freePhysicalMemorySize)||((this.freePhysicalMemorySize!= null)&&this.freePhysicalMemorySize.equals(rhs.freePhysicalMemorySize))))&&((this.diskBalancerStatus == rhs.diskBalancerStatus)||((this.diskBalancerStatus!= null)&&this.diskBalancerStatus.equals(rhs.diskBalancerStatus))))&&((this.inputArguments == rhs.inputArguments)||((this.inputArguments!= null)&&this.inputArguments.equals(rhs.inputArguments))))&&((this.loginSuccessNumOps == rhs.loginSuccessNumOps)||((this.loginSuccessNumOps!= null)&&this.loginSuccessNumOps.equals(rhs.loginSuccessNumOps))))&&((this.gcTimeMillis == rhs.gcTimeMillis)||((this.gcTimeMillis!= null)&&this.gcTimeMillis.equals(rhs.gcTimeMillis))))&&((this.totalMetadataOperations == rhs.totalMetadataOperations)||((this.totalMetadataOperations!= null)&&this.totalMetadataOperations.equals(rhs.totalMetadataOperations))))&&((this.ramDiskBlocksEvictedWithoutRead == rhs.ramDiskBlocksEvictedWithoutRead)||((this.ramDiskBlocksEvictedWithoutRead!= null)&&this.ramDiskBlocksEvictedWithoutRead.equals(rhs.ramDiskBlocksEvictedWithoutRead))))&&((this.ramDiskBlocksReadHits == rhs.ramDiskBlocksReadHits)||((this.ramDiskBlocksReadHits!= null)&&this.ramDiskBlocksReadHits.equals(rhs.ramDiskBlocksReadHits))))&&((this.ramDiskBlocksEvictionWindowMsNumOps == rhs.ramDiskBlocksEvictionWindowMsNumOps)||((this.ramDiskBlocksEvictionWindowMsNumOps!= null)&&this.ramDiskBlocksEvictionWindowMsNumOps.equals(rhs.ramDiskBlocksEvictionWindowMsNumOps))))&&((this.rpcClientBackoff == rhs.rpcClientBackoff)||((this.rpcClientBackoff!= null)&&this.rpcClientBackoff.equals(rhs.rpcClientBackoff))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))))&&((this.valid == rhs.valid)||((this.valid!= null)&&this.valid.equals(rhs.valid))))&&((this.ecDecodingTimeNanos == rhs.ecDecodingTimeNanos)||((this.ecDecodingTimeNanos!= null)&&this.ecDecodingTimeNanos.equals(rhs.ecDecodingTimeNanos))))&&((this.totalCompilationTime == rhs.totalCompilationTime)||((this.totalCompilationTime!= null)&&this.totalCompilationTime.equals(rhs.totalCompilationTime))))&&((this.readIoRateNumOps == rhs.readIoRateNumOps)||((this.readIoRateNumOps!= null)&&this.readIoRateNumOps.equals(rhs.readIoRateNumOps))))&&((this.implementationVendor == rhs.implementationVendor)||((this.implementationVendor!= null)&&this.implementationVendor.equals(rhs.implementationVendor))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.rpcAuthorizationSuccesses == rhs.rpcAuthorizationSuccesses)||((this.rpcAuthorizationSuccesses!= null)&&this.rpcAuthorizationSuccesses.equals(rhs.rpcAuthorizationSuccesses))))&&((this.sendPacketDownstreamAvgInfo == rhs.sendPacketDownstreamAvgInfo)||((this.sendPacketDownstreamAvgInfo!= null)&&this.sendPacketDownstreamAvgInfo.equals(rhs.sendPacketDownstreamAvgInfo))))&&((this.cacheUsed == rhs.cacheUsed)||((this.cacheUsed!= null)&&this.cacheUsed.equals(rhs.cacheUsed))))&&((this.specificationVersion == rhs.specificationVersion)||((this.specificationVersion!= null)&&this.specificationVersion.equals(rhs.specificationVersion))))&&((this.copyBlockOpNumOps == rhs.copyBlockOpNumOps)||((this.copyBlockOpNumOps!= null)&&this.copyBlockOpNumOps.equals(rhs.copyBlockOpNumOps))))&&((this.tagStorageInfo == rhs.tagStorageInfo)||((this.tagStorageInfo!= null)&&this.tagStorageInfo.equals(rhs.tagStorageInfo))))&&((this.bytesWritten == rhs.bytesWritten)||((this.bytesWritten!= null)&&this.bytesWritten.equals(rhs.bytesWritten))))&&((this.memoryPoolNames == rhs.memoryPoolNames)||((this.memoryPoolNames!= null)&&this.memoryPoolNames.equals(rhs.memoryPoolNames))))&&((this.readsFromLocalClient == rhs.readsFromLocalClient)||((this.readsFromLocalClient!= null)&&this.readsFromLocalClient.equals(rhs.readsFromLocalClient))))&&((this.totalLoadedClassCount == rhs.totalLoadedClassCount)||((this.totalLoadedClassCount!= null)&&this.totalLoadedClassCount.equals(rhs.totalLoadedClassCount))))&&((this.storageInfo == rhs.storageInfo)||((this.storageInfo!= null)&&this.storageInfo.equals(rhs.storageInfo))))&&((this.verbose == rhs.verbose)||((this.verbose!= null)&&this.verbose.equals(rhs.verbose))))&&((this.namenodeAddresses == rhs.namenodeAddresses)||((this.namenodeAddresses!= null)&&this.namenodeAddresses.equals(rhs.namenodeAddresses))))&&((this.systemLoadAverage == rhs.systemLoadAverage)||((this.systemLoadAverage!= null)&&this.systemLoadAverage.equals(rhs.systemLoadAverage))))&&((this.incrementalBlockReportsNumOps == rhs.incrementalBlockReportsNumOps)||((this.incrementalBlockReportsNumOps!= null)&&this.incrementalBlockReportsNumOps.equals(rhs.incrementalBlockReportsNumOps))))&&((this.totalWriteTime == rhs.totalWriteTime)||((this.totalWriteTime!= null)&&this.totalWriteTime.equals(rhs.totalWriteTime))))&&((this.blocksCached == rhs.blocksCached)||((this.blocksCached!= null)&&this.blocksCached.equals(rhs.blocksCached))))&&((this.totalDataFileIos == rhs.totalDataFileIos)||((this.totalDataFileIos!= null)&&this.totalDataFileIos.equals(rhs.totalDataFileIos))))&&((this.threadAllocatedMemorySupported == rhs.threadAllocatedMemorySupported)||((this.threadAllocatedMemorySupported!= null)&&this.threadAllocatedMemorySupported.equals(rhs.threadAllocatedMemorySupported))))&&((this.gcNumWarnThresholdExceeded == rhs.gcNumWarnThresholdExceeded)||((this.gcNumWarnThresholdExceeded!= null)&&this.gcNumWarnThresholdExceeded.equals(rhs.gcNumWarnThresholdExceeded))))&&((this.heartbeatsNumOps == rhs.heartbeatsNumOps)||((this.heartbeatsNumOps!= null)&&this.heartbeatsNumOps.equals(rhs.heartbeatsNumOps))))&&((this.heartbeatsAvgTime == rhs.heartbeatsAvgTime)||((this.heartbeatsAvgTime!= null)&&this.heartbeatsAvgTime.equals(rhs.heartbeatsAvgTime))))&&((this.blocksVerified == rhs.blocksVerified)||((this.blocksVerified!= null)&&this.blocksVerified.equals(rhs.blocksVerified))))&&((this.renewalFailures == rhs.renewalFailures)||((this.renewalFailures!= null)&&this.renewalFailures.equals(rhs.renewalFailures))))&&((this.mBeanServerId == rhs.mBeanServerId)||((this.mBeanServerId!= null)&&this.mBeanServerId.equals(rhs.mBeanServerId))))&&((this.numBlocksCached == rhs.numBlocksCached)||((this.numBlocksCached!= null)&&this.numBlocksCached.equals(rhs.numBlocksCached))))&&((this.blocksRead == rhs.blocksRead)||((this.blocksRead!= null)&&this.blocksRead.equals(rhs.blocksRead))))&&((this.numFailedVolumes == rhs.numFailedVolumes)||((this.numFailedVolumes!= null)&&this.numFailedVolumes.equals(rhs.numFailedVolumes))))&&((this.tagSessionId == rhs.tagSessionId)||((this.tagSessionId!= null)&&this.tagSessionId.equals(rhs.tagSessionId))))&&((this.bPServiceActorInfo == rhs.bPServiceActorInfo)||((this.bPServiceActorInfo!= null)&&this.bPServiceActorInfo.equals(rhs.bPServiceActorInfo))))&&((this.volumeFailures == rhs.volumeFailures)||((this.volumeFailures!= null)&&this.volumeFailures.equals(rhs.volumeFailures))))&&((this.collectionUsageThresholdCount == rhs.collectionUsageThresholdCount)||((this.collectionUsageThresholdCount!= null)&&this.collectionUsageThresholdCount.equals(rhs.collectionUsageThresholdCount))))&&((this.systemProperties == rhs.systemProperties)||((this.systemProperties!= null)&&this.systemProperties.equals(rhs.systemProperties))))&&((this.committedVirtualMemorySize == rhs.committedVirtualMemorySize)||((this.committedVirtualMemorySize!= null)&&this.committedVirtualMemorySize.equals(rhs.committedVirtualMemorySize))))&&((this.numAllSinks == rhs.numAllSinks)||((this.numAllSinks!= null)&&this.numAllSinks.equals(rhs.numAllSinks))))&&((this.dataNodeActiveXceiversCount == rhs.dataNodeActiveXceiversCount)||((this.dataNodeActiveXceiversCount!= null)&&this.dataNodeActiveXceiversCount.equals(rhs.dataNodeActiveXceiversCount))))&&((this.fsyncNanosNumOps == rhs.fsyncNanosNumOps)||((this.fsyncNanosNumOps!= null)&&this.fsyncNanosNumOps.equals(rhs.fsyncNanosNumOps))))&&((this.totalCapacity == rhs.totalCapacity)||((this.totalCapacity!= null)&&this.totalCapacity.equals(rhs.totalCapacity))))&&((this.ramDiskBytesLazyPersisted == rhs.ramDiskBytesLazyPersisted)||((this.ramDiskBytesLazyPersisted!= null)&&this.ramDiskBytesLazyPersisted.equals(rhs.ramDiskBytesLazyPersisted))))&&((this.bootClassPath == rhs.bootClassPath)||((this.bootClassPath!= null)&&this.bootClassPath.equals(rhs.bootClassPath))))&&((this.usageThresholdExceeded == rhs.usageThresholdExceeded)||((this.usageThresholdExceeded!= null)&&this.usageThresholdExceeded.equals(rhs.usageThresholdExceeded))))&&((this.totalPhysicalMemorySize == rhs.totalPhysicalMemorySize)||((this.totalPhysicalMemorySize!= null)&&this.totalPhysicalMemorySize.equals(rhs.totalPhysicalMemorySize))))&&((this.volumeInfo == rhs.volumeInfo)||((this.volumeInfo!= null)&&this.volumeInfo.equals(rhs.volumeInfo))))&&((this.blocksUncached == rhs.blocksUncached)||((this.blocksUncached!= null)&&this.blocksUncached.equals(rhs.blocksUncached))))&&((this.syncIoRateAvgTime == rhs.syncIoRateAvgTime)||((this.syncIoRateAvgTime!= null)&&this.syncIoRateAvgTime.equals(rhs.syncIoRateAvgTime))))&&((this.writesFromRemoteClient == rhs.writesFromRemoteClient)||((this.writesFromRemoteClient!= null)&&this.writesFromRemoteClient.equals(rhs.writesFromRemoteClient))))&&((this.totalFileIoErrors == rhs.totalFileIoErrors)||((this.totalFileIoErrors!= null)&&this.totalFileIoErrors.equals(rhs.totalFileIoErrors))))&&((this.blocksDeletedInPendingIBR == rhs.blocksDeletedInPendingIBR)||((this.blocksDeletedInPendingIBR!= null)&&this.blocksDeletedInPendingIBR.equals(rhs.blocksDeletedInPendingIBR))))&&((this.threadsTerminated == rhs.threadsTerminated)||((this.threadsTerminated!= null)&&this.threadsTerminated.equals(rhs.threadsTerminated))))&&((this.xmitsInProgress == rhs.xmitsInProgress)||((this.xmitsInProgress!= null)&&this.xmitsInProgress.equals(rhs.xmitsInProgress))))&&((this.ramDiskBytesWrite == rhs.ramDiskBytesWrite)||((this.ramDiskBytesWrite!= null)&&this.ramDiskBytesWrite.equals(rhs.ramDiskBytesWrite))))&&((this.blockReportsNumOps == rhs.blockReportsNumOps)||((this.blockReportsNumOps!= null)&&this.blockReportsNumOps.equals(rhs.blockReportsNumOps))))&&((this.threadsRunnable == rhs.threadsRunnable)||((this.threadsRunnable!= null)&&this.threadsRunnable.equals(rhs.threadsRunnable))))&&((this.logError == rhs.logError)||((this.logError!= null)&&this.logError.equals(rhs.logError))))&&((this.blocksReplicated == rhs.blocksReplicated)||((this.blocksReplicated!= null)&&this.blocksReplicated.equals(rhs.blocksReplicated))))&&((this.logWarn == rhs.logWarn)||((this.logWarn!= null)&&this.logWarn.equals(rhs.logWarn))))&&((this.allThreadIds == rhs.allThreadIds)||((this.allThreadIds!= null)&&this.allThreadIds.equals(rhs.allThreadIds))))&&((this.tagProcessName == rhs.tagProcessName)||((this.tagProcessName!= null)&&this.tagProcessName.equals(rhs.tagProcessName))))&&((this.deferredRpcProcessingTimeAvgTime == rhs.deferredRpcProcessingTimeAvgTime)||((this.deferredRpcProcessingTimeAvgTime!= null)&&this.deferredRpcProcessingTimeAvgTime.equals(rhs.deferredRpcProcessingTimeAvgTime))))&&((this.daemonThreadCount == rhs.daemonThreadCount)||((this.daemonThreadCount!= null)&&this.daemonThreadCount.equals(rhs.daemonThreadCount))))&&((this.threadsBlocked == rhs.threadsBlocked)||((this.threadsBlocked!= null)&&this.threadsBlocked.equals(rhs.threadsBlocked))))&&((this.lastGcInfo == rhs.lastGcInfo)||((this.lastGcInfo!= null)&&this.lastGcInfo.equals(rhs.lastGcInfo))))&&((this.usageThresholdSupported == rhs.usageThresholdSupported)||((this.usageThresholdSupported!= null)&&this.usageThresholdSupported.equals(rhs.usageThresholdSupported))))&&((this.objectPendingFinalizationCount == rhs.objectPendingFinalizationCount)||((this.objectPendingFinalizationCount!= null)&&this.objectPendingFinalizationCount.equals(rhs.objectPendingFinalizationCount))))&&((this.dataFileIoRateAvgTime == rhs.dataFileIoRateAvgTime)||((this.dataFileIoRateAvgTime!= null)&&this.dataFileIoRateAvgTime.equals(rhs.dataFileIoRateAvgTime))))&&((this.numBlocksFailedToUncache == rhs.numBlocksFailedToUncache)||((this.numBlocksFailedToUncache!= null)&&this.numBlocksFailedToUncache.equals(rhs.numBlocksFailedToUncache))))&&((this.clusterId == rhs.clusterId)||((this.clusterId!= null)&&this.clusterId.equals(rhs.clusterId))))&&((this.fileIoErrorRateNumOps == rhs.fileIoErrorRateNumOps)||((this.fileIoErrorRateNumOps!= null)&&this.fileIoErrorRateNumOps.equals(rhs.fileIoErrorRateNumOps))))&&((this.gcCountConcurrentMarkSweep == rhs.gcCountConcurrentMarkSweep)||((this.gcCountConcurrentMarkSweep!= null)&&this.gcCountConcurrentMarkSweep.equals(rhs.gcCountConcurrentMarkSweep))))&&((this.publishAvgTime == rhs.publishAvgTime)||((this.publishAvgTime!= null)&&this.publishAvgTime.equals(rhs.publishAvgTime))))&&((this.ecFailedReconstructionTasks == rhs.ecFailedReconstructionTasks)||((this.ecFailedReconstructionTasks!= null)&&this.ecFailedReconstructionTasks.equals(rhs.ecFailedReconstructionTasks))))&&((this.replaceBlockOpNumOps == rhs.replaceBlockOpNumOps)||((this.replaceBlockOpNumOps!= null)&&this.replaceBlockOpNumOps.equals(rhs.replaceBlockOpNumOps))))&&((this.deferredRpcProcessingTimeNumOps == rhs.deferredRpcProcessingTimeNumOps)||((this.deferredRpcProcessingTimeNumOps!= null)&&this.deferredRpcProcessingTimeNumOps.equals(rhs.deferredRpcProcessingTimeNumOps))))&&((this.memHeapCommittedM == rhs.memHeapCommittedM)||((this.memHeapCommittedM!= null)&&this.memHeapCommittedM.equals(rhs.memHeapCommittedM))))&&((this.rpcProcessingTimeAvgTime == rhs.rpcProcessingTimeAvgTime)||((this.rpcProcessingTimeAvgTime!= null)&&this.rpcProcessingTimeAvgTime.equals(rhs.rpcProcessingTimeAvgTime))))&&((this.rpcAuthorizationFailures == rhs.rpcAuthorizationFailures)||((this.rpcAuthorizationFailures!= null)&&this.rpcAuthorizationFailures.equals(rhs.rpcAuthorizationFailures))))&&((this.numActiveSources == rhs.numActiveSources)||((this.numActiveSources!= null)&&this.numActiveSources.equals(rhs.numActiveSources))))&&((this.ecReconstructionRemoteBytesRead == rhs.ecReconstructionRemoteBytesRead)||((this.ecReconstructionRemoteBytesRead!= null)&&this.ecReconstructionRemoteBytesRead.equals(rhs.ecReconstructionRemoteBytesRead))))&&((this.metadataOperationRateNumOps == rhs.metadataOperationRateNumOps)||((this.metadataOperationRateNumOps!= null)&&this.metadataOperationRateNumOps.equals(rhs.metadataOperationRateNumOps))))&&((this.threadCpuTimeEnabled == rhs.threadCpuTimeEnabled)||((this.threadCpuTimeEnabled!= null)&&this.threadCpuTimeEnabled.equals(rhs.threadCpuTimeEnabled))))&&((this.dataPort == rhs.dataPort)||((this.dataPort!= null)&&this.dataPort.equals(rhs.dataPort))))&&((this.numAllSources == rhs.numAllSources)||((this.numAllSources!= null)&&this.numAllSources.equals(rhs.numAllSources))))&&((this.ramDiskBlocksWrite == rhs.ramDiskBlocksWrite)||((this.ramDiskBlocksWrite!= null)&&this.ramDiskBlocksWrite.equals(rhs.ramDiskBlocksWrite))))&&((this.threadsWaiting == rhs.threadsWaiting)||((this.threadsWaiting!= null)&&this.threadsWaiting.equals(rhs.threadsWaiting))))&&((this.cacheReportsAvgTime == rhs.cacheReportsAvgTime)||((this.cacheReportsAvgTime!= null)&&this.cacheReportsAvgTime.equals(rhs.cacheReportsAvgTime))))&&((this.numBlocksFailedToUnCache == rhs.numBlocksFailedToUnCache)||((this.numBlocksFailedToUnCache!= null)&&this.numBlocksFailedToUnCache.equals(rhs.numBlocksFailedToUnCache))))&&((this.uptime == rhs.uptime)||((this.uptime!= null)&&this.uptime.equals(rhs.uptime))))&&((this.currentThreadCpuTimeSupported == rhs.currentThreadCpuTimeSupported)||((this.currentThreadCpuTimeSupported!= null)&&this.currentThreadCpuTimeSupported.equals(rhs.currentThreadCpuTimeSupported))))&&((this.writesFromLocalClient == rhs.writesFromLocalClient)||((this.writesFromLocalClient!= null)&&this.writesFromLocalClient.equals(rhs.writesFromLocalClient))))&&((this.synchronizerUsageSupported == rhs.synchronizerUsageSupported)||((this.synchronizerUsageSupported!= null)&&this.synchronizerUsageSupported.equals(rhs.synchronizerUsageSupported))))&&((this.dfsUsed == rhs.dfsUsed)||((this.dfsUsed!= null)&&this.dfsUsed.equals(rhs.dfsUsed))))&&((this.objectName == rhs.objectName)||((this.objectName!= null)&&this.objectName.equals(rhs.objectName))))&&((this.heapMemoryUsage == rhs.heapMemoryUsage)||((this.heapMemoryUsage!= null)&&this.heapMemoryUsage.equals(rhs.heapMemoryUsage))))&&((this.objectMonitorUsageSupported == rhs.objectMonitorUsageSupported)||((this.objectMonitorUsageSupported!= null)&&this.objectMonitorUsageSupported.equals(rhs.objectMonitorUsageSupported))))&&((this.readsFromRemoteClient == rhs.readsFromRemoteClient)||((this.readsFromRemoteClient!= null)&&this.readsFromRemoteClient.equals(rhs.readsFromRemoteClient))))&&((this.cacheReportsNumOps == rhs.cacheReportsNumOps)||((this.cacheReportsNumOps!= null)&&this.cacheReportsNumOps.equals(rhs.cacheReportsNumOps))));
     }
 
 }
