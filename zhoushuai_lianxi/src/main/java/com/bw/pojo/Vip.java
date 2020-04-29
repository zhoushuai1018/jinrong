package com.bw.pojo;

import java.io.Serializable;

public class Vip  implements Serializable {
    private Long vid;

    private Long dengji;

    private Long edu;

    private String name;

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
}