package com.verzinen.ugm.model.jmx;
 import java.util.ArrayList;
 import java.util.List;
 import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;
 
 public class LastGcInfo {
 
     @SerializedName("GcThreadCount")
     @Expose
     private Integer gcThreadCount;
     @SerializedName("duration")
     @Expose
     private Integer duration;
     @SerializedName("endTime")
     @Expose
     private Integer endTime;
     @SerializedName("id")
     @Expose
     private Integer id;
     @SerializedName("memoryUsageAfterGc")
     @Expose
     private List<MemoryUsageAfterGc> memoryUsageAfterGc = new ArrayList<MemoryUsageAfterGc>();
     @SerializedName("memoryUsageBeforeGc")
     @Expose
     private List<MemoryUsageBeforeGc> memoryUsageBeforeGc = new ArrayList<MemoryUsageBeforeGc>();
     @SerializedName("startTime")
     @Expose
     private Integer startTime;
 
     public Integer getGcThreadCount() {
         return gcThreadCount;
     }
 
     public void setGcThreadCount(Integer gcThreadCount) {
         this.gcThreadCount = gcThreadCount;
     }
 
     public Integer getDuration() {
         return duration;
     }
 
     public void setDuration(Integer duration) {
         this.duration = duration;
     }
 
     public Integer getEndTime() {
         return endTime;
     }
 
     public void setEndTime(Integer endTime) {
         this.endTime = endTime;
     }
 
     public Integer getId() {
         return id;
     }
 
     public void setId(Integer id) {
         this.id = id;
     }
 
     public List<MemoryUsageAfterGc> getMemoryUsageAfterGc() {
         return memoryUsageAfterGc;
     }
 
     public void setMemoryUsageAfterGc(List<MemoryUsageAfterGc> memoryUsageAfterGc) {
         this.memoryUsageAfterGc = memoryUsageAfterGc;
     }
 
     public List<MemoryUsageBeforeGc> getMemoryUsageBeforeGc() {
         return memoryUsageBeforeGc;
     }
 
     public void setMemoryUsageBeforeGc(List<MemoryUsageBeforeGc> memoryUsageBeforeGc) {
         this.memoryUsageBeforeGc = memoryUsageBeforeGc;
     }
 
     public Integer getStartTime() {
         return startTime;
     }
 
     public void setStartTime(Integer startTime) {
         this.startTime = startTime;
     }
 
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(LastGcInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
         sb.append("gcThreadCount");
         sb.append('=');
         sb.append(((this.gcThreadCount == null)?"<null>":this.gcThreadCount));
         sb.append(',');
         sb.append("duration");
         sb.append('=');
         sb.append(((this.duration == null)?"<null>":this.duration));
         sb.append(',');
         sb.append("endTime");
         sb.append('=');
         sb.append(((this.endTime == null)?"<null>":this.endTime));
         sb.append(',');
         sb.append("id");
         sb.append('=');
         sb.append(((this.id == null)?"<null>":this.id));
         sb.append(',');
         sb.append("memoryUsageAfterGc");
         sb.append('=');
         sb.append(((this.memoryUsageAfterGc == null)?"<null>":this.memoryUsageAfterGc));
         sb.append(',');
         sb.append("memoryUsageBeforeGc");
         sb.append('=');
         sb.append(((this.memoryUsageBeforeGc == null)?"<null>":this.memoryUsageBeforeGc));
         sb.append(',');
         sb.append("startTime");
         sb.append('=');
         sb.append(((this.startTime == null)?"<null>":this.startTime));
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
         result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
         result = ((result* 31)+((this.memoryUsageBeforeGc == null)? 0 :this.memoryUsageBeforeGc.hashCode()));
         result = ((result* 31)+((this.gcThreadCount == null)? 0 :this.gcThreadCount.hashCode()));
         result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
         result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
         result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
         result = ((result* 31)+((this.memoryUsageAfterGc == null)? 0 :this.memoryUsageAfterGc.hashCode()));
         return result;
     }
 
     @Override
     public boolean equals(Object other) {
         if (other == this) {
             return true;
         }
         if ((other instanceof LastGcInfo) == false) {
             return false;
         }
         LastGcInfo rhs = ((LastGcInfo) other);
         return ((((((((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration)))&&((this.memoryUsageBeforeGc == rhs.memoryUsageBeforeGc)||((this.memoryUsageBeforeGc!= null)&&this.memoryUsageBeforeGc.equals(rhs.memoryUsageBeforeGc))))&&((this.gcThreadCount == rhs.gcThreadCount)||((this.gcThreadCount!= null)&&this.gcThreadCount.equals(rhs.gcThreadCount))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.memoryUsageAfterGc == rhs.memoryUsageAfterGc)||((this.memoryUsageAfterGc!= null)&&this.memoryUsageAfterGc.equals(rhs.memoryUsageAfterGc))));
     }
 
 }
