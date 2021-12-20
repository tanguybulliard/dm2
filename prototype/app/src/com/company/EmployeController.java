package com.company;

public class EmployeController{
    // création du repository Client et bénévole
    private static ClientRepository clientRepo = new ClientRepository();
    private static BenevoleRepository benevoleRepo = new BenevoleRepository();

    public EmployeController(){

    }

    /**
     * Permet de créer un client avec les paramètres suivant
     *
     * @param numeroDeCompte
     * @param nom
     * @param prenom
     * @param dateDeNaissance
     * @param numAssuranceMaladie
     * @param dateVisite
     * @param dose
     * @param ifCovid
     * @param ifSymptome
     * @param ifallergie
     * @param typeVaccin
     * @return True
     */
    public static boolean CreateClient(String numeroDeCompte, String nom, String prenom, String dateDeNaissance, String numAssuranceMaladie, String dateVisite,
                                       String dose, String ifCovid, String ifSymptome, String ifallergie, String typeVaccin){
        return clientRepo.AddClient(new Client(numeroDeCompte, nom, prenom, dateDeNaissance, numAssuranceMaladie, dateVisite, dose, ifCovid, ifSymptome, ifallergie, typeVaccin));
    }

    /**
     * Permet de créer un bénévole avec les paramètres suivant
     * @param id
     * @param motDePasse
     * @param nom
     * @param prenom
     * @param addresse
     * @param codePostal
     * @param ville
     * @param Email
     * @param cellulaire
     * @return true
     */
    public static boolean CreateBenevole(String id, String motDePasse, String nom, String prenom, String addresse,
                                         String codePostal, String ville, String Email, int cellulaire) {
        return benevoleRepo.AddBenevole(new Benevole(id, motDePasse, nom, prenom, addresse, codePostal, ville, Email, cellulaire));
    }

    /**
     *permet de modifier les informations d'un membre
     * @param clientID
     * @return true
     */
    public static boolean UpdateMember(String clientID){
        Client temp = clientRepo.GetClientFromID(clientID);

        return true;
    }

}