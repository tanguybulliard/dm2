package com.company;

public class Session {

    private static int counter = 0; //Static counter to have a different session
    private int reservationNumber;  //number on every object creation
    private String nom;
    private String prenom;
    private String dateVisite; // YYYY-MM-DD
    private String heureVisite; // HH:MM
    private int typeDeDose; //Premiere ou deuxieme

    public Session(){
        reservationNumber = counter;
        counter++;
    }

    public Session(String nom, String prenom, String dateVisite, String heureVisite, int typeDeDose){
        reservationNumber = counter;
        counter++;
        this.nom = nom;
        this.prenom = prenom;
        this.dateVisite = dateVisite;
        this.heureVisite = heureVisite;
        this.typeDeDose = typeDeDose;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setDateVisite(String dateVisite){
        this.dateVisite = dateVisite;
    }

    public void setHeureVisite(String heureVisite){
        this.heureVisite = heureVisite;
    }

    public void setTypeDeDose(int typeDeDose){
        this.typeDeDose = typeDeDose;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom
    }

    public String getDateVisite(){
        return dateVisite;
    }

    public String getHeureVisite(){
        return heureVisite
    }

    public int getTypeDeDose(){
        return typeDeDose;
    }
}