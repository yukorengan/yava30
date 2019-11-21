package com.verzinen.ugm.model.jmx;
 import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;
 
 public class Usage {
 
     @SerializedName("committed")
     @Expose
     private Integer committed;
     @SerializedName("init")
     @Expose
     private Integer init;
     @SerializedName("max")
     @Expose
     private Integer max;
     @SerializedName("used")
     @Expose
     private Integer used;
 
     public Integer getCommitted() {
         return committed;
     }
 
     public void setCommitted(Integer committed) {
         this.committed = committed;
     }
 
     public Integer getInit() {
         return init;
     }
 
     public void setInit(Integer init) {
         this.init = init;
     }
 
     public Integer getMax() {
         return max;
     }
 
     public void setMax(Integer max) {
         this.max = max;
     }
 
     public Integer getUsed() {
         return used;
     }
 
     public void setUsed(Integer used) {
         this.used = used;
     }
 
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(Usage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
         sb.append("committed");
         sb.append('=');
         sb.append(((this.committed == null)?"<null>":this.committed));
         sb.append(',');
         sb.append("init");
         sb.append('=');
         sb.append(((this.init == null)?"<null>":this.init));
         sb.append(',');
         sb.append("max");
         sb.append('=');
         sb.append(((this.max == null)?"<null>":this.max));
         sb.append(',');
         sb.append("used");
         sb.append('=');
         sb.append(((this.used == null)?"<null>":this.used));
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
         result = ((result* 31)+((this.init == null)? 0 :this.init.hashCode()));
         result = ((result* 31)+((this.committed == null)? 0 :this.committed.hashCode()));
         result = ((result* 31)+((this.used == null)? 0 :this.used.hashCode()));
         result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
         return result;
     }
 
     @Override
     public boolean equals(Object other) {
         if (other == this) {
             return true;
         }
         if ((other instanceof Usage) == false) {
             return false;
         }
         Usage rhs = ((Usage) other);
         return (((((this.init == rhs.init)||((this.init!= null)&&this.init.equals(rhs.init)))&&((this.committed == rhs.committed)||((this.committed!= null)&&this.committed.equals(rhs.committed))))&&((this.used == rhs.used)||((this.used!= null)&&this.used.equals(rhs.used))))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))));
     }
 
 }
