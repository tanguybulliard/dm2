package com.company;

abstract class Personne {
    protected String id;
    protected String codeVerification;
    protected String motDePasse;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String codePostal;
    protected String ville;
    protected String email;
    protected int cellulaire;


    public Personne(String id, String motDePasse, String nom, String prenom,
                    String addresse, String codePostal, String ville, String Email,
                    int cellulaire) {
        this.id = id;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.email = email;
        this.cellulaire = cellulaire;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getmotDePasse() {
        return motDePasse;
    }

    public void setmotDePasse(String motDePasse) {
        this.motDePasse=motDePasse;
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom=nom;
    }

    public String getprenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom=prenom;
    }

    public String getadresse() {
        return adresse;
    }

    public void setadresse(String adresse) {
        this.adresse=adresse;
    }

    public String getcodePostal() {
        return codePostal;
    }

    public void setcodePostal(String codePostal) {
        this.codePostal=codePostal;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email=email;
    }

    public int getcellulaire() {
        return cellulaire;
    }

    public void setcellulaire(int cellulaire) {
        this.cellulaire=cellulaire;
    }


}

