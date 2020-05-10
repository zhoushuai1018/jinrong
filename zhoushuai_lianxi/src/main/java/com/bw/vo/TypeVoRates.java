package com.bw.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TypeVoRates implements Serializable {

    private Long lid;

    private Double lilv;

    private Long uid;

    private Date udate;

    private Long tid;

    private Long month;

    private Long cid;

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public Double getLilv() {
        return lilv;
    }

    public void setLilv(Double lilv) {
        this.lilv = lilv;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }

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

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }
}
