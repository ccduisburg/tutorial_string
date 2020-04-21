package com.company;

import java.util.Date;

public class Person {
    private Integer id;
    private String adi;
    private String soyadi;
    private Date dogumtarihi;

    @Override
    public String toString() {
        return "Person{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", dogumtarihi=" + dogumtarihi +
                '}';
    }


    public Person(){};

    public Person(Integer id, String adi, String soyadi, Date dogumtarihi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.dogumtarihi = dogumtarihi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Date getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(Date dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }
}
