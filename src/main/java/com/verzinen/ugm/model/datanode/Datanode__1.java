
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datanode__1 {

    @SerializedName("fsdataset")
    @Expose
    private Fsdataset fsdataset;

    public Fsdataset getFsdataset() {
        return fsdataset;
    }

    public void setFsdataset(Fsdataset fsdataset) {
        this.fsdataset = fsdataset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datanode__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsdataset");
        sb.append('=');
        sb.append(((this.fsdataset == null)?"<null>":this.fsdataset));
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
        result = ((result* 31)+((this.fsdataset == null)? 0 :this.fsdataset.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datanode__1) == false) {
            return false;
        }
        Datanode__1 rhs = ((Datanode__1) other);
        return ((this.fsdataset == rhs.fsdataset)||((this.fsdataset!= null)&&this.fsdataset.equals(rhs.fsdataset)));
    }

}
