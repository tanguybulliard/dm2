package com.company;

public class Session {

    private static int counter = 0; //Static counter to have a different session
    private int reservationNumber;  //number on every object creation
    private String nom;
    private String prenom;
    private String dateVisite; // YYYY/MM/DD
    private String heureVisite; // HH:MM

    public Session(){
        reservationNumber = counter;
        counter++;
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
}
