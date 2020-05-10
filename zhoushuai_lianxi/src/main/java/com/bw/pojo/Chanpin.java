package com.bw.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Chanpin implements Serializable {
    private Long cid;

    private String qishu;

    private Long tid;

    private Double benjin;

    private Date startdate;

    private Date jisuandate;

    private Date lastdate;

    private Long num;

    private Long status;

    private Double shouyi;

    public Double getShouyi() {
        return shouyi;
    }

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

    public void setShouyi(Double shouyi) {
        this.shouyi = shouyi;
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

    @Override
    public String toString() {
        return "Chanpin{" +
                "cid=" + cid +
                ", qishu='" + qishu + '\'' +
                ", tid=" + tid +
                ", benjin=" + benjin +
                ", startdate=" + startdate +
                ", jisuandate=" + jisuandate +
                ", lastdate=" + lastdate +
                ", num=" + num +
                ", status=" + status +
                ", shouyi=" + shouyi +
                '}';
    }
}