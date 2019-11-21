
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Org {

    @SerializedName("apache")
    @Expose
    private Apache apache;

    public Apache getApache() {
        return apache;
    }

    public void setApache(Apache apache) {
        this.apache = apache;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Org.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apache");
        sb.append('=');
        sb.append(((this.apache == null)?"<null>":this.apache));
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
        result = ((result* 31)+((this.apache == null)? 0 :this.apache.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Org) == false) {
            return false;
        }
        Org rhs = ((Org) other);
        return ((this.apache == rhs.apache)||((this.apache!= null)&&this.apache.equals(rhs.apache)));
    }

}
