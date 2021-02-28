package com.testTechnique.JeuDeCarte;

public enum Couleur {

    CARREAUX(1),
    COEUR(2),
    PIQUE(3),
    TREFLE(4);

    private final int numCouleur;

    Couleur(int numCouleur) {
        this.numCouleur = numCouleur;
    }

    public int getNumCouleur() {
        return numCouleur;
    }
}
