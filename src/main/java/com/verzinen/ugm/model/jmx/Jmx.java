package com.verzinen.ugm.model.jmx;
 import java.util.ArrayList;
 import java.util.List;
 import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;
 
 public class Jmx {
 
     @SerializedName("beans")
     @Expose
     private List<Bean> beans = new ArrayList<Bean>();
 
     public List<Bean> getBeans() {
         return beans;
     }
 
     public void setBeans(List<Bean> beans) {
         this.beans = beans;
     }
 
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(Jmx.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
         sb.append("beans");
         sb.append('=');
         sb.append(((this.beans == null)?"<null>":this.beans));
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
         result = ((result* 31)+((this.beans == null)? 0 :this.beans.hashCode()));
         return result;
     }
 
     @Override
     public boolean equals(Object other) {
         if (other == this) {
             return true;
         }
         if ((other instanceof Jmx) == false) {
             return false;
         }
         Jmx rhs = ((Jmx) other);
         return ((this.beans == rhs.beans)||((this.beans!= null)&&this.beans.equals(rhs.beans)));
     }
 
 }
