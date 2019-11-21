package com.verzinen.ugm.model.jmx;
 import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;
 
 public class MemoryUsageAfterGc {
 
     @SerializedName("key")
     @Expose
     private String key;
     @SerializedName("value")
     @Expose
     private Value value;
 
     public String getKey() {
         return key;
     }
 
     public void setKey(String key) {
         this.key = key;
     }
 
     public Value getValue() {
         return value;
     }
 
     public void setValue(Value value) {
         this.value = value;
     }
 
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(MemoryUsageAfterGc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
         sb.append("key");
         sb.append('=');
         sb.append(((this.key == null)?"<null>":this.key));
         sb.append(',');
         sb.append("value");
         sb.append('=');
         sb.append(((this.value == null)?"<null>":this.value));
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
         result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
         result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
         return result;
     }
 
     @Override
     public boolean equals(Object other) {
         if (other == this) {
             return true;
         }
         if ((other instanceof MemoryUsageAfterGc) == false) {
             return false;
         }
         MemoryUsageAfterGc rhs = ((MemoryUsageAfterGc) other);
         return (((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))));
     }
 
 }
