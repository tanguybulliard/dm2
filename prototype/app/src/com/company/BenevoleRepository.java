package com.company;

import java.util.ArrayList;

public class BenevoleRepository {

    private static ArrayList<Benevole> benevoles = new ArrayList<Benevole>();

    /***
     * ajoute un nouveau bénévole avec les paramètres suivants:
     * id, motDePasse, nom, prenom, addresse, codePostal, ville, Email, cellulaire
     * @param benevole
     */
    public static boolean AddBenevole(Benevole benevole) {
        for (Benevole b: benevoles) {
            if(b.id.equals(benevole.id));
            return false;
        }
        benevoles.add(benevole);
        return true;
    }

}
