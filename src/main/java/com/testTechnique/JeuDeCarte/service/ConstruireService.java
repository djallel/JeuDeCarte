package com.testTechnique.JeuDeCarte.service;

import com.testTechnique.JeuDeCarte.Couleur;
import com.testTechnique.JeuDeCarte.Valeur;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

public class ConstruireService {

    int valeur, couleur, valueQuantifiable;
    String key , value ="";
    Map<String, String> uneMainMap = new HashMap<>(); // non ordonné et n'accepte pas les doublons

    Boolean jAiUneMainDeDixMap = Boolean.FALSE;

      public Map<String, String> construireUneMainDeDixMap() {

        while (Boolean.FALSE.equals(jAiUneMainDeDixMap)) {
            Random r = new Random();
            couleur = r.ints(1, (4 + 1)).limit(1).findFirst().getAsInt();
            valeur = r.ints(1, (13 + 1)).limit(1).findFirst().getAsInt();
            key = String.join("-de-", correspondanceIntValeur(valeur), correspondanceIntCouleur(couleur));
            valueQuantifiable = couleur*100+valeur;
            key = String.join("-de-", correspondanceIntValeur(valeur), correspondanceIntCouleur(couleur));
            value = String.join("", ""+valueQuantifiable);


            uneMainMap.put(key,value);
            Predicate<Integer> pUneMainDeDix = tailleSet -> tailleSet > 10; // utilisation de prédicat java8 // j'ai une main de 10
            if (pUneMainDeDix.test(uneMainMap.size())) {
                jAiUneMainDeDixMap = Boolean.TRUE;
            }
        }

        return uneMainMap;
    }

    String correspondanceIntValeur(Integer numValeur) {

        switch (numValeur) {
            case (1): {
                return Valeur.AS.name();
            }
            case (11): {
                return Valeur.ROI.name();
            }
            case (12): {
                return Valeur.DAME.name();
            }
            case (13): {
                return Valeur.VALET.name();
            }
            default:
                return numValeur.toString();
        }
    }

    String correspondanceIntCouleur(Integer numCouleur) {

        switch (numCouleur) {
            case (1): {
                return Couleur.CARREAUX.toString();
            }
            case (2): {
                return (Couleur.COEUR.name());
            }
            case (3): {
                return (Couleur.PIQUE.name());
            }
            case (4): {
                return Couleur.TREFLE.name();
            }
            default:
                return numCouleur.toString();
        }
    }

}
