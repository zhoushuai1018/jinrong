package com.bw.pojo;

import java.io.Serializable;
import java.util.Date;

public class Dingdan  implements Serializable {
    private Long did;

    private Long cid;

    private Long uid;

    private Date udate;

    private Long dstatus;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
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

    public Long getDstatus() {
        return dstatus;
    }

    public void setDstatus(Long dstatus) {
        this.dstatus = dstatus;
    }
}