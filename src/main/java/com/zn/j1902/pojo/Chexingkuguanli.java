package com.zn.j1902.pojo;

import java.util.Date;

public class Chexingkuguanli {
    private Long id;

    private String pingpai;

    private String logo;

    private Date created;

    private String changshang;

    private String chexi;

    private String leixing;

    private String chexing;

    private String niankuan;

    private Byte status;

    private String canshumingchen;

    private String canshuleibie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPingpai() {
        return pingpai;
    }

    public void setPingpai(String pingpai) {
        this.pingpai = pingpai == null ? null : pingpai.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getChangshang() {
        return changshang;
    }

    public void setChangshang(String changshang) {
        this.changshang = changshang == null ? null : changshang.trim();
    }

    public String getChexi() {
        return chexi;
    }

    public void setChexi(String chexi) {
        this.chexi = chexi == null ? null : chexi.trim();
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing == null ? null : leixing.trim();
    }

    public String getChexing() {
        return chexing;
    }

    public void setChexing(String chexing) {
        this.chexing = chexing == null ? null : chexing.trim();
    }

    public String getNiankuan() {
        return niankuan;
    }

    public void setNiankuan(String niankuan) {
        this.niankuan = niankuan == null ? null : niankuan.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCanshumingchen() {
        return canshumingchen;
    }

    public void setCanshumingchen(String canshumingchen) {
        this.canshumingchen = canshumingchen == null ? null : canshumingchen.trim();
    }

    public String getCanshuleibie() {
        return canshuleibie;
    }

    public void setCanshuleibie(String canshuleibie) {
        this.canshuleibie = canshuleibie == null ? null : canshuleibie.trim();
    }
}