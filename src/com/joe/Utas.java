package com.joe;

import java.util.Date;

public class Utas {
    //mezok megadasa
    private int megallo;
    private Date felszallasDatuma;
    private String felszallasIdopontja;
    private int kartyaAzonosito;
    private String berletTipus;
    private Date berletErvenyesseg;
    private Integer db;

    public int getMegallo() {
        return megallo;
    }

    public Date getFelszallasDatuma() {
        return felszallasDatuma;
    }

    public String getFelszallasIdopontja() {
        return felszallasIdopontja;
    }

    public int getKartyaAzonosito() {
        return kartyaAzonosito;
    }

    public String getBerletTipus() {
        return berletTipus;
    }

    public Date getBerletErvenyesseg() {
        return berletErvenyesseg;
    }

    public Integer getDb() {
        return db;
    }

    public Utas(int megallo, Date felszallasDatuma, String felszallasIdopontja, int kartyaAzonosito, String berletTipus, Date berletErvenyesseg, Integer db) {
        this.megallo = megallo;
        this.felszallasDatuma = felszallasDatuma;
        this.felszallasIdopontja = felszallasIdopontja;
        this.kartyaAzonosito = kartyaAzonosito;
        this.berletTipus = berletTipus;
        this.berletErvenyesseg = berletErvenyesseg;
        this.db = db;


    }

}
