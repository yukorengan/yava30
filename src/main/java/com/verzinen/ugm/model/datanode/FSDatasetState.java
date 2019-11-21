
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FSDatasetState {

    @SerializedName("org")
    @Expose
    private Org org;

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FSDatasetState.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("org");
        sb.append('=');
        sb.append(((this.org == null)?"<null>":this.org));
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
        result = ((result* 31)+((this.org == null)? 0 :this.org.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FSDatasetState) == false) {
            return false;
        }
        FSDatasetState rhs = ((FSDatasetState) other);
        return ((this.org == rhs.org)||((this.org!= null)&&this.org.equals(rhs.org)));
    }

}
