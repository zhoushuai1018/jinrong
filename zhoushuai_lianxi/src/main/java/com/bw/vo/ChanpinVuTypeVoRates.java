package com.bw.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class ChanpinVuTypeVoRates implements Serializable {
    private Long cid;

    private String qishu;

    private Long tid;

    private Double benjin;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startdate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date jisuandate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lastdate;

    private Long num;

    private Long status;

    private Double shouyi;

    private Long month;

    private Long lid;

    private Double lilv;

    private Long uid;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date udate;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getQishu() {
        return qishu;
    }

    public void setQishu(String qishu) {
        this.qishu = qishu;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Double getBenjin() {
        return benjin;
    }

    public void setBenjin(Double benjin) {
        this.benjin = benjin;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getJisuandate() {
        return jisuandate;
    }

    public void setJisuandate(Date jisuandate) {
        this.jisuandate = jisuandate;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Double getShouyi() {
        return shouyi;
    }

    public void setShouyi(Double shouyi) {
        this.shouyi = shouyi;
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
