package com.example.projekt;

public class VyletneMesto extends Trip{

    private final boolean typvyletu;

    public VyletneMesto(String mesto, int dni, double cena, boolean typVyletu) {
        super(mesto, dni, cena);
        this.typvyletu = typVyletu;
    }

    public boolean isTypvyletu() {
        return typvyletu;
    }

    public String getTypMesta() {
        return "Vyletne mesto";
    }
}
