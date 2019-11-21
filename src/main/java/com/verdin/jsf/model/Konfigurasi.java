package com.verdin.jsf.model;

import java.util.Map;

public class Konfigurasi {

    private String type;
    private Integer version;
 
    private Map<String, Object> _properties;
     
    public Map<String, Object> get_Properties() {
        return _properties;
    }

    public void set_Properties(Map<String, Object>  properties_as_map) {
        this._properties  = properties_as_map ;
    }
  
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Konfigurasi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
       
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
         
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        
        sb.append("_properties");
        sb.append('=');
        sb.append(((this._properties  == null)?"<null>":this._properties ));
        sb.append(',');
         
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    

}
