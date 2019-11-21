
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hdfs {

    @SerializedName("server")
    @Expose
    private Server server;

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hdfs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("server");
        sb.append('=');
        sb.append(((this.server == null)?"<null>":this.server));
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
        result = ((result* 31)+((this.server == null)? 0 :this.server.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hdfs) == false) {
            return false;
        }
        Hdfs rhs = ((Hdfs) other);
        return ((this.server == rhs.server)||((this.server!= null)&&this.server.equals(rhs.server)));
    }

}
