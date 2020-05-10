package com.bw.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    private Long uid;

    private String uname;

    private String upwd;

    private String usalt;

    private Double yue;

    private String url;

    private Long zong;

    private String phone;

    private Long vid;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
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

    public Double getYue() {
        return yue;
    }

    public void setYue(Double yue) {
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

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", usalt='" + usalt + '\'' +
                ", yue=" + yue +
                ", url='" + url + '\'' +
                ", zong=" + zong +
                ", phone='" + phone + '\'' +
                ", vid=" + vid +
                '}';
    }
}