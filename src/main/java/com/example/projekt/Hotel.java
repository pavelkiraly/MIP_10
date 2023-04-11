package com.example.projekt;

public class Hotel {
    private String nazov;
    private String adresa;
    private String telefon;
    private int pocetLudi;
    private String typIzby;

    public Hotel(String nazov, String adresa, String telefon, int pocetLudi, String typIzby){
        this.nazov = nazov;
        this.adresa = adresa;
        this.telefon = telefon;
        this.pocetLudi = pocetLudi;
        this.typIzby = typIzby;
    }

    public String getNazov(){
        return nazov;
    }

    public String getAdresa(){
        return adresa;
    }

    public String getTelefon(){
        return telefon;
    }

    public int getPocetLudi(){
        return pocetLudi;
    }

    public String getTypIzby(){
        return typIzby;
    }
}


