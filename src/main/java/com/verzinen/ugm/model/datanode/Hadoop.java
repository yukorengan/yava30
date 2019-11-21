
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hadoop {

    @SerializedName("hdfs")
    @Expose
    private Hdfs hdfs;

    public Hdfs getHdfs() {
        return hdfs;
    }

    public void setHdfs(Hdfs hdfs) {
        this.hdfs = hdfs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hadoop.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hdfs");
        sb.append('=');
        sb.append(((this.hdfs == null)?"<null>":this.hdfs));
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
        result = ((result* 31)+((this.hdfs == null)? 0 :this.hdfs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hadoop) == false) {
            return false;
        }
        Hadoop rhs = ((Hadoop) other);
        return ((this.hdfs == rhs.hdfs)||((this.hdfs!= null)&&this.hdfs.equals(rhs.hdfs)));
    }

}
