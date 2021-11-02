package com.company;

public class Client {
    protected String numeroDeCompte;
    protected String nom;
    protected String prenom;
    protected String dateDeNaissance;
    protected String numAssuranceMaladie;
    protected String dateVisite;
    protected String dose;
    protected String ifCovid;
    protected String ifSymptome;
    protected String ifallergie;
    protected String typeVaccin;


    public Client(String numeroDeCompte, String nom, String prenom, String dateDeNaissance,
                  String numAssuranceMaladie, String dateVisite, String dose, String ifCovid,
                  String ifSymptome,String ifallergie,String typeVaccin){

        this.numeroDeCompte = numeroDeCompte;
        this.nom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.prenom = prenom;
        this.numAssuranceMaladie = numAssuranceMaladie;
        this.dateVisite = dateVisite;
        this.dose = dose;
        this.ifCovid = ifCovid;
        this.ifSymptome = ifSymptome;
        this.ifallergie = ifallergie;
        this.typeVaccin = typeVaccin;

    }

}
