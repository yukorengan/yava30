
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Apache {

    @SerializedName("hadoop")
    @Expose
    private Hadoop hadoop;

    public Hadoop getHadoop() {
        return hadoop;
    }

    public void setHadoop(Hadoop hadoop) {
        this.hadoop = hadoop;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Apache.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hadoop");
        sb.append('=');
        sb.append(((this.hadoop == null)?"<null>":this.hadoop));
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
        result = ((result* 31)+((this.hadoop == null)? 0 :this.hadoop.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Apache) == false) {
            return false;
        }
        Apache rhs = ((Apache) other);
        return ((this.hadoop == rhs.hadoop)||((this.hadoop!= null)&&this.hadoop.equals(rhs.hadoop)));
    }

}
