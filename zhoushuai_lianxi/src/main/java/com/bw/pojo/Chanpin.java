package com.bw.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Chanpin {
    private Long cid;

    private String qishu;

    private Long tid;

    private BigDecimal benjin;

    private Date startdate;

    private Date jisuandate;

    private Date lastdate;

    private Long num;

    private Long status;

    private BigDecimal shouyi;

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

    public BigDecimal getBenjin() {
        return benjin;
    }

    public void setBenjin(BigDecimal benjin) {
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

    public BigDecimal getShouyi() {
        return shouyi;
    }

    public void setShouyi(BigDecimal shouyi) {
        this.shouyi = shouyi;
    }
}