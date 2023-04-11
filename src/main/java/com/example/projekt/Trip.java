package com.example.projekt;

public abstract class Trip {
    private String mesto;
    private int dni;
    User user;
    private double cena;
    int minDlzka;

    public Trip(String mesto, int dni, double cena){
        this.mesto = mesto;
        this.dni = dni;
        this.cena = cena;
        this.minDlzka = 3;

    }

    public String getMesto(){
        return this.mesto;
    }

    public int getDni(){
        return this.dni;
    }

    public double getCena(){
        return this.cena;
    }

    public abstract String getTypMesta();
}

