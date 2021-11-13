package com.company;

public class EmployeController{

    private static ClientRepository clientRepo = new ClientRepository();
    private static BenevoleRepository benevoleRepo = new BenevoleRepository();

    public EmployeController(){

    }

    public static boolean CreateClient(String numeroDeCompte, String nom, String prenom, String dateDeNaissance, String numAssuranceMaladie, String dateVisite,
                                       String dose, String ifCovid, String ifSymptome, String ifallergie, String typeVaccin){
        clientRepo.AddClient(new Client(numeroDeCompte, nom, prenom, dateDeNaissance, numAssuranceMaladie, dateVisite, dose, ifCovid, ifSymptome, ifallergie, typeVaccin));
        return true;
    }
    
    public static boolean CreateBenevole(String id, String motDePasse, String nom, String prenom, String addresse, String codePostal, String ville, String Email, int cellulaire) {
        benevoleRepo.AddBenevole(new Benevole(id, motDePasse, nom, prenom, addresse, codePostal, ville, Email, cellulaire));
        return true;
    }

    public static boolean UpdateMember(String clientID){
        Client temp = clientRepo.GetClientFromID(clientID);

        return true;
    }

}