package com.example.projekt;

public class HistorickeMesto extends Trip {

    private int vstupenky;

    public HistorickeMesto(String mesto, int dni, double cena) {
        super(mesto, dni, cena);
        this.vstupenky = vstupenky;

    }

    public String getTypMesta() {
        return "Historicke mesto";
    }
}
