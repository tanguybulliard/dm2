package com.company;

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
        
        System.out.print("Entrez la date (YYYY-MM-DD): ");
        String dateVisite = input.nextLine();

        System.out.print("Entrez l'heure de la visite (HH:MM): ");
        String heureVisite = input.nextLine();

        System.out.print("Entrez le type de dose (1, 2): ");
        int typeDeDose = Integer.parseInt(input.nextLine());

        Session session = new Session(nom, prenom, dateVisite, heureVisite, typeDeDose);
        sessionRepo.AddSession(session);
        return true;
    }

}