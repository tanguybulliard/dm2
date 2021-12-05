package com.company;

import java.util.ArrayList;

public class BenevoleRepository {

    private static ArrayList<Benevole> benevoles = new ArrayList<Benevole>();

    /***
     * ajoute un nouveau bénévole avec les paramètres suivants:
     * id, motDePasse, nom, prenom, addresse, codePostal, ville, Email, cellulaire
     * @param benevole
     */
    public static void AddBenevole(Benevole benevole) {
        benevoles.add(benevole);
    }

}
