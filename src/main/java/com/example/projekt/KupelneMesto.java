package com.example.projekt;

public class KupelneMesto extends Trip {

    public KupelneMesto(String mesto, int dni, double cena) {
        super(mesto, dni, cena);
    }

    public String getTypMesta() {
        return "Kupelne Mesto";
    }

    public int getDni(){
        if(this.minDlzka < 3)
            return 1;
        else
            return 0;
    }
}
