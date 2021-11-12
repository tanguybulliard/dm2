package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BenevoleView extends View {

    static Scanner input = new Scanner(System.in);

    public static void displayRdv() {
        System.out.println("Liste des rendez-vous : \nNumber\t|\tDate\t\t|\tHeure\t|\tNom\t\t|\tPrenom\t|\tDose");
        for (Session session : BenevoleController.GetSessionRepository().GetSessions()) {
            System.out.println( session.getReservationNumber()+"\t\t|\t"+
                                session.getDate().getYear()+"/"+session.getDate().getMonthValue()+"/"+session.getDate().getDayOfMonth()+"\t|\t"
                                +session.getDate().getHour()+":"+session.getDate().getMinute()+"\t|\t"
                                +session.getNom()+"\t|\t"+session.getPrenom()+"\t|\t"+session.getTypeDeDose()
            );
        }

    }

    public static boolean addSession() {
        System.out.print("Entrez le nom: ");
        String nom = input.nextLine();

        System.out.print("Entrez le prénom: ");
        String prenom = input.nextLine();

        LocalDateTime date = null;
        while(date==null) {
            try {
                System.out.print("Entrez la date (AAAA-MM-JJ): ");
                String dateVisite = input.nextLine();

                System.out.print("Entrez l'heure de la visite (HH:MM): ");
                String heureVisite = input.nextLine();

                DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                date = LocalDateTime.parse(dateVisite + " " + heureVisite, format);
            } catch (Exception e) {
                System.out.println("Entrez une date valide");
                e.printStackTrace();
            }
        }

        System.out.print("Entrez le type de dose (1, 2): ");
        int typeDeDose = Integer.parseInt(input.nextLine());
        BenevoleController.AddSession(nom, prenom, date, typeDeDose);
        System.out.println("Rendez-vous ajouté");
        return true;
    }

    public static void verifyCode() {
        System.out.print("Entrez le numéro du rendez-vous: ");
        String code = input.nextLine();
        Session session = BenevoleController.GetSessionFromCode(code);
        if(session==null) {
            System.out.println("Aucun rendez-vous avec le numero "+code);
            return;
        }
        System.out.println("Rendez-vous pour "+session.getPrenom()+" "+session.getNom()+", le "+
                            session.getDate().getYear()+"/"+session.getDate().getMonthValue()+"/"+session.getDate().getDayOfMonth()+
                            " à "+session.getDate().getHour()+":"+session.getDate().getMinute()+
                            " pour la dose "+session.getTypeDeDose()
        );
    }

    public static void confirmCode() {
        System.out.print("Entrez le numéro du rendez-vous: ");
        String code = input.nextLine();
        Session session = BenevoleController.GetSessionFromCode(code);
        if(session==null) {
            System.out.println("Aucun rendez-vous avec le numero "+code);
            return;
        }
        session.confirm();
    }

    public static void displayMenu() {

        while (true) {

            System.out.println("Veuillez entrer l'option désirée.");
            System.out.println("1: afficher les rendez-vous");
            System.out.println("2: ajouter un rendez-vous");
            System.out.println("3: confirmer présence");
            System.out.println("4: verifier le rendez-vous avec le numéro de vérification");
            System.out.println("5: pour quitter le programme ");
            String menuChoice = BenevoleView.input.nextLine();

            switch (menuChoice) {

                case "1":
                    BenevoleView.displayRdv();
                    break;

                case "2":
                    BenevoleView.addSession();
                    break;

                case "3":
                    BenevoleView.confirmCode();
                    break;

                case "4":
                    BenevoleView.verifyCode();
                    break;

                case "5":
                    return;

                default:
                    System.out.println("La commande " + input + "est invalide");
                    break;

            }
        }
    }



}
