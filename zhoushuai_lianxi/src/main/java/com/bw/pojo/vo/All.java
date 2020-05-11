package com.bw.pojo.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class All implements Serializable {
    //=========chanpin=============
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
    //=========dingdan=============
    private Long did;

    private Long uid;

    private Date udate;

    private Long dstatus;
    //=========rates=============
    private Long lid;

    private Double lilv;
    //=========shenhe=============
    private Long sid;

    private Long shenhe;
    //=========type=============

    private Long month;

    //=========user=============

    private String uname;

    private String upwd;

    private String usalt;

    private BigDecimal yue;

    private String url;

    private Long zong;

    private String phone;

    private Long vid;
    //=========vip=============

    private Long dengji;

    private Long edu;

    private String name;

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

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
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

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getShenhe() {
        return shenhe;
    }

    public void setShenhe(Long shenhe) {
        this.shenhe = shenhe;
    }

    public Long getMonth() {
        return month;
    }

    public void setMonth(Long month) {
        this.month = month;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUsalt() {
        return usalt;
    }

    public void setUsalt(String usalt) {
        this.usalt = usalt;
    }

    public BigDecimal getYue() {
        return yue;
    }

    public void setYue(BigDecimal yue) {
        this.yue = yue;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getZong() {
        return zong;
    }

    public void setZong(Long zong) {
        this.zong = zong;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getVid() {
        return vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }

    public Long getDengji() {
        return dengji;
    }

    public void setDengji(Long dengji) {
        this.dengji = dengji;
    }

    public Long getEdu() {
        return edu;
    }

    public void setEdu(Long edu) {
        this.edu = edu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "All{" +
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
                ", did=" + did +
                ", uid=" + uid +
                ", udate=" + udate +
                ", dstatus=" + dstatus +
                ", lid=" + lid +
                ", lilv=" + lilv +
                ", sid=" + sid +
                ", shenhe=" + shenhe +
                ", month=" + month +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", usalt='" + usalt + '\'' +
                ", yue=" + yue +
                ", url='" + url + '\'' +
                ", zong=" + zong +
                ", phone='" + phone + '\'' +
                ", vid=" + vid +
                ", dengji=" + dengji +
                ", edu=" + edu +
                ", name='" + name + '\'' +
                '}';
    }
}
