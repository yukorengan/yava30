
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServiceComponentInfo {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("component_name")
    @Expose
    private String componentName;
    @SerializedName("desired_stack")
    @Expose
    private String desiredStack;
    @SerializedName("desired_version")
    @Expose
    private String desiredVersion;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("init_count")
    @Expose
    private Integer initCount;
    @SerializedName("install_failed_count")
    @Expose
    private Integer installFailedCount;
    @SerializedName("installed_and_maintenance_off_count")
    @Expose
    private Integer installedAndMaintenanceOffCount;
    @SerializedName("installed_count")
    @Expose
    private Integer installedCount;
    @SerializedName("recovery_enabled")
    @Expose
    private String recoveryEnabled;
    @SerializedName("repository_state")
    @Expose
    private String repositoryState;
    @SerializedName("service_name")
    @Expose
    private String serviceName;
    @SerializedName("started_count")
    @Expose
    private Integer startedCount;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("unknown_count")
    @Expose
    private Integer unknownCount;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getDesiredStack() {
        return desiredStack;
    }

    public void setDesiredStack(String desiredStack) {
        this.desiredStack = desiredStack;
    }

    public String getDesiredVersion() {
        return desiredVersion;
    }

    public void setDesiredVersion(String desiredVersion) {
        this.desiredVersion = desiredVersion;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getInitCount() {
        return initCount;
    }

    public void setInitCount(Integer initCount) {
        this.initCount = initCount;
    }

    public Integer getInstallFailedCount() {
        return installFailedCount;
    }

    public void setInstallFailedCount(Integer installFailedCount) {
        this.installFailedCount = installFailedCount;
    }

    public Integer getInstalledAndMaintenanceOffCount() {
        return installedAndMaintenanceOffCount;
    }

    public void setInstalledAndMaintenanceOffCount(Integer installedAndMaintenanceOffCount) {
        this.installedAndMaintenanceOffCount = installedAndMaintenanceOffCount;
    }

    public Integer getInstalledCount() {
        return installedCount;
    }

    public void setInstalledCount(Integer installedCount) {
        this.installedCount = installedCount;
    }

    public String getRecoveryEnabled() {
        return recoveryEnabled;
    }

    public void setRecoveryEnabled(String recoveryEnabled) {
        this.recoveryEnabled = recoveryEnabled;
    }

    public String getRepositoryState() {
        return repositoryState;
    }

    public void setRepositoryState(String repositoryState) {
        this.repositoryState = repositoryState;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getStartedCount() {
        return startedCount;
    }

    public void setStartedCount(Integer startedCount) {
        this.startedCount = startedCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUnknownCount() {
        return unknownCount;
    }

    public void setUnknownCount(Integer unknownCount) {
        this.unknownCount = unknownCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceComponentInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("clusterName");
        sb.append('=');
        sb.append(((this.clusterName == null)?"<null>":this.clusterName));
        sb.append(',');
        sb.append("componentName");
        sb.append('=');
        sb.append(((this.componentName == null)?"<null>":this.componentName));
        sb.append(',');
        sb.append("desiredStack");
        sb.append('=');
        sb.append(((this.desiredStack == null)?"<null>":this.desiredStack));
        sb.append(',');
        sb.append("desiredVersion");
        sb.append('=');
        sb.append(((this.desiredVersion == null)?"<null>":this.desiredVersion));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("initCount");
        sb.append('=');
        sb.append(((this.initCount == null)?"<null>":this.initCount));
        sb.append(',');
        sb.append("installFailedCount");
        sb.append('=');
        sb.append(((this.installFailedCount == null)?"<null>":this.installFailedCount));
        sb.append(',');
        sb.append("installedAndMaintenanceOffCount");
        sb.append('=');
        sb.append(((this.installedAndMaintenanceOffCount == null)?"<null>":this.installedAndMaintenanceOffCount));
        sb.append(',');
        sb.append("installedCount");
        sb.append('=');
        sb.append(((this.installedCount == null)?"<null>":this.installedCount));
        sb.append(',');
        sb.append("recoveryEnabled");
        sb.append('=');
        sb.append(((this.recoveryEnabled == null)?"<null>":this.recoveryEnabled));
        sb.append(',');
        sb.append("repositoryState");
        sb.append('=');
        sb.append(((this.repositoryState == null)?"<null>":this.repositoryState));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("startedCount");
        sb.append('=');
        sb.append(((this.startedCount == null)?"<null>":this.startedCount));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("unknownCount");
        sb.append('=');
        sb.append(((this.unknownCount == null)?"<null>":this.unknownCount));
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
        result = ((result* 31)+((this.installFailedCount == null)? 0 :this.installFailedCount.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.initCount == null)? 0 :this.initCount.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.startedCount == null)? 0 :this.startedCount.hashCode()));
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        result = ((result* 31)+((this.unknownCount == null)? 0 :this.unknownCount.hashCode()));
        result = ((result* 31)+((this.clusterName == null)? 0 :this.clusterName.hashCode()));
        result = ((result* 31)+((this.installedCount == null)? 0 :this.installedCount.hashCode()));
        result = ((result* 31)+((this.recoveryEnabled == null)? 0 :this.recoveryEnabled.hashCode()));
        result = ((result* 31)+((this.desiredStack == null)? 0 :this.desiredStack.hashCode()));
        result = ((result* 31)+((this.desiredVersion == null)? 0 :this.desiredVersion.hashCode()));
        result = ((result* 31)+((this.installedAndMaintenanceOffCount == null)? 0 :this.installedAndMaintenanceOffCount.hashCode()));
        result = ((result* 31)+((this.componentName == null)? 0 :this.componentName.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.repositoryState == null)? 0 :this.repositoryState.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceComponentInfo) == false) {
            return false;
        }
        ServiceComponentInfo rhs = ((ServiceComponentInfo) other);
        return ((((((((((((((((((this.installFailedCount == rhs.installFailedCount)||((this.installFailedCount!= null)&&this.installFailedCount.equals(rhs.installFailedCount)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.initCount == rhs.initCount)||((this.initCount!= null)&&this.initCount.equals(rhs.initCount))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.startedCount == rhs.startedCount)||((this.startedCount!= null)&&this.startedCount.equals(rhs.startedCount))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))))&&((this.unknownCount == rhs.unknownCount)||((this.unknownCount!= null)&&this.unknownCount.equals(rhs.unknownCount))))&&((this.clusterName == rhs.clusterName)||((this.clusterName!= null)&&this.clusterName.equals(rhs.clusterName))))&&((this.installedCount == rhs.installedCount)||((this.installedCount!= null)&&this.installedCount.equals(rhs.installedCount))))&&((this.recoveryEnabled == rhs.recoveryEnabled)||((this.recoveryEnabled!= null)&&this.recoveryEnabled.equals(rhs.recoveryEnabled))))&&((this.desiredStack == rhs.desiredStack)||((this.desiredStack!= null)&&this.desiredStack.equals(rhs.desiredStack))))&&((this.desiredVersion == rhs.desiredVersion)||((this.desiredVersion!= null)&&this.desiredVersion.equals(rhs.desiredVersion))))&&((this.installedAndMaintenanceOffCount == rhs.installedAndMaintenanceOffCount)||((this.installedAndMaintenanceOffCount!= null)&&this.installedAndMaintenanceOffCount.equals(rhs.installedAndMaintenanceOffCount))))&&((this.componentName == rhs.componentName)||((this.componentName!= null)&&this.componentName.equals(rhs.componentName))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.repositoryState == rhs.repositoryState)||((this.repositoryState!= null)&&this.repositoryState.equals(rhs.repositoryState))));
    }

}
