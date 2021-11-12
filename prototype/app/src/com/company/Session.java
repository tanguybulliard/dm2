package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Session {

    private static int counter = 0; //Static counter to have a different session
    private int reservationNumber;  //number on every object creation
    private String nom;
    private String prenom;
    private LocalDateTime date;
    private int typeDeDose; //Premiere ou deuxieme
    private boolean confirmed;

    public Session(){
        confirmed = false;
        reservationNumber = counter;
        counter++;
    }

    public Session(String nom, String prenom, LocalDateTime date, int typeDeDose){
        reservationNumber = counter;
        counter++;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.typeDeDose = typeDeDose;
    }

    public boolean is(String code) {
        return reservationNumber==Integer.parseInt(code);
    }

    public void confirm() {
        this.confirmed = true;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTypeDeDose(int typeDeDose) {
        this.typeDeDose = typeDeDose;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public int getTypeDeDose() {
        return typeDeDose;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

}