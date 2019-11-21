
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fsdataset {

    @SerializedName("impl")
    @Expose
    private Impl impl;

    public Impl getImpl() {
        return impl;
    }

    public void setImpl(Impl impl) {
        this.impl = impl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fsdataset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("impl");
        sb.append('=');
        sb.append(((this.impl == null)?"<null>":this.impl));
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
        result = ((result* 31)+((this.impl == null)? 0 :this.impl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fsdataset) == false) {
            return false;
        }
        Fsdataset rhs = ((Fsdataset) other);
        return ((this.impl == rhs.impl)||((this.impl!= null)&&this.impl.equals(rhs.impl)));
    }

}
