package com.bw.pojo;

import java.io.Serializable;

public class Type implements Serializable {
    private Long tid;

    private Long month;

    private Long lid;

    private Long cid;

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getMonth() {
        return month;
    }

    public void setMonth(Long month) {
        this.month = month;
    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Type{" +
                "tid=" + tid +
                ", month=" + month +
                ", lid=" + lid +
                ", cid=" + cid +
                '}';
    }
}