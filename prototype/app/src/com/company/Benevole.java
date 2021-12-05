package com.company;

public class Benevole extends Personne{
    /***
     * Constructeur de bénévole
     * @param id
     * @param motDePasse
     * @param nom
     * @param prenom
     * @param addresse
     * @param codePostal
     * @param ville
     * @param Email
     * @param cellulaire
     */
    public Benevole(String id, String motDePasse, String nom, String prenom, String addresse, String codePostal, String ville, String Email, int cellulaire) {
        super(id, motDePasse, nom, prenom, addresse, codePostal, ville, Email, cellulaire);
    }
}
