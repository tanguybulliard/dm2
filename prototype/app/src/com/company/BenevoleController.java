package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class BenevoleController{

    private SessionRepository sessionRepo = new SessionRepository();
    private Scanner input = new Scanner(System.in);

    public BenevoleController(){

    }

    public boolean AddEntry(){
        System.out.print("Entrez le nom: ");
        String nom = input.nextLine();
        
        System.out.print("Entrez le prenom: ");
        String prenom = input.nextLine();

        LocalDate date = null;
        while(date==null) {
            try {
                System.out.print("Entrez la date (YYYY-MM-DD): ");
                String dateVisite = input.nextLine();

                System.out.print("Entrez l'heure de la visite (HH:MM): ");
                String heureVisite = input.nextLine();

                DateTimeFormatter format = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm");
                date = LocalDate.parse(dateVisite + " " + heureVisite, format);
            } catch (Exception e) {
                System.out.println("Entrer une date valide");
            }
        }

        System.out.print("Entrez le type de dose (1, 2): ");
        int typeDeDose = Integer.parseInt(input.nextLine());

        Session session = new Session(nom, prenom, date, typeDeDose);
        sessionRepo.AddSession(session);
        return true;
    }

}