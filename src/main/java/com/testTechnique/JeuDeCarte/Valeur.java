package com.testTechnique.JeuDeCarte;

public enum Valeur {

    AS(1),
    DAME(11),
    ROI(12),
    VALET(13);

    private final int numValeur;

    Valeur(int numValeur) {
        this.numValeur = numValeur;
    }

    public int getNumValeur() {
        return numValeur;
    }
}
