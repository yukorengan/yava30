
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Impl {

    @SerializedName("FsDatasetImpl")
    @Expose
    private FsDatasetImpl fsDatasetImpl;

    public FsDatasetImpl getFsDatasetImpl() {
        return fsDatasetImpl;
    }

    public void setFsDatasetImpl(FsDatasetImpl fsDatasetImpl) {
        this.fsDatasetImpl = fsDatasetImpl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Impl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fsDatasetImpl");
        sb.append('=');
        sb.append(((this.fsDatasetImpl == null)?"<null>":this.fsDatasetImpl));
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
        result = ((result* 31)+((this.fsDatasetImpl == null)? 0 :this.fsDatasetImpl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Impl) == false) {
            return false;
        }
        Impl rhs = ((Impl) other);
        return ((this.fsDatasetImpl == rhs.fsDatasetImpl)||((this.fsDatasetImpl!= null)&&this.fsDatasetImpl.equals(rhs.fsDatasetImpl)));
    }

}
