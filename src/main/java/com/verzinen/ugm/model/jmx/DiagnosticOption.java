package com.verzinen.ugm.model.jmx;
 import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;
 
 public class DiagnosticOption {
 
     @SerializedName("name")
     @Expose
     private String name;
     @SerializedName("origin")
     @Expose
     private String origin;
     @SerializedName("value")
     @Expose
     private String value;
     @SerializedName("writeable")
     @Expose
     private Boolean writeable;
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String getOrigin() {
         return origin;
     }
 
     public void setOrigin(String origin) {
         this.origin = origin;
     }
 
     public String getValue() {
         return value;
     }
 
     public void setValue(String value) {
         this.value = value;
     }
 
     public Boolean getWriteable() {
         return writeable;
     }
 
     public void setWriteable(Boolean writeable) {
         this.writeable = writeable;
     }
 
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(DiagnosticOption.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
         sb.append("name");
         sb.append('=');
         sb.append(((this.name == null)?"<null>":this.name));
         sb.append(',');
         sb.append("origin");
         sb.append('=');
         sb.append(((this.origin == null)?"<null>":this.origin));
         sb.append(',');
         sb.append("value");
         sb.append('=');
         sb.append(((this.value == null)?"<null>":this.value));
         sb.append(',');
         sb.append("writeable");
         sb.append('=');
         sb.append(((this.writeable == null)?"<null>":this.writeable));
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
         result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
         result = ((result* 31)+((this.writeable == null)? 0 :this.writeable.hashCode()));
         result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
         result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
         return result;
     }
 
     @Override
     public boolean equals(Object other) {
         if (other == this) {
             return true;
         }
         if ((other instanceof DiagnosticOption) == false) {
             return false;
         }
         DiagnosticOption rhs = ((DiagnosticOption) other);
         return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.writeable == rhs.writeable)||((this.writeable!= null)&&this.writeable.equals(rhs.writeable))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))));
     }
 
 }
