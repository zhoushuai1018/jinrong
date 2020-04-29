package com.bw.pojo;

import java.io.Serializable;
import java.util.Date;

public class Rates  implements Serializable {
    private Long lid;

    private Double lilv;

    private Long uid;

    private Date udate;

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
}