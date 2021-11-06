package com.company;
import java.util.Scanner;
import java.util.Random;


public class EmployeView {
    static Scanner input = new Scanner(System.in);
        public static void displayMenu() {

            while(true) {

                System.out.println("Veuillez entrer l'option désirée.");
                System.out.println("1: afficher les rendez-vous");
                System.out.println("2: ajouter un rendez-vous");
                System.out.println("3: afficher le calendrier ");
                System.out.println("4: créer benevole");
                System.out.println("5: supprimer benevole");
                System.out.println("6: modifier benevole");
                System.out.println("7:gérer calendrier bénévole");
                System.out.println("8: gérer visiteur");
                System.out.println("9: pour quitter le programme ");
                String input = EmployeView.input.nextLine();

                switch(input) {

                    case "1":
                        //xxxxx.displayRdv();
                        break;

                    case "2":
                        //controller.addRdv();
                        break;

                    case "3":
                        //xxxxxx.displayCalendrier();
                        break;
                    case "4":
                        //à voir
                        break;


                    case "5":
                        //à voir
                        break;

                    case "6":
                        //à voir
                        break;

                    case "7":
                        //à voir
                        break;

                    case "8":
                        updateVisiteur();
                        break;

                    case "9":
                        createMember();
                        break;


                    case "10":

                        return;

                    default:
                        System.out.println("La commande " + input + "est invalide");
                        break;

                }


            }

        }
    public static void createMember() {
        Random rand = new Random();

        String numeroDeCompte = String.valueOf(rand.nextInt(100000));


        System.out.println("Veuillez entrer le nom du client");
        String nom = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer le prenom du client");
        String prenom = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer la date de naissance du client (YYYY-MM-DD)");
        String dateDeNaissance = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer le numéro  de carte assurance maladie (sans espace)");
        String numAssuranceMaladie = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer la Date de la visite (YYYY-MM-DD)");
        String dateVisite = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer si le client a deja recu une premiere dose [Oui, Non] ");
        String dose = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer si le client a deja eu le covid  [Oui, Non] ");
        String ifCovid = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer si le client a des symptomes de la covid [Oui, Non] ");
        String ifSymptome = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer si le client a des allergies [Oui, Non] ");
        String ifallergie = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer le vaccin que le client veut recevoir [Moderna, Pfizer, AstraZeneca, Janssen]");
        String typeVaccin = BenevoleView.input.nextLine();


        //on cree le membre et on enregistre son user ID
        Client newMember = new Client(numeroDeCompte, nom, prenom, dateDeNaissance, numAssuranceMaladie, dateVisite,
                dose, ifCovid, ifSymptome, ifallergie, typeVaccin);

        //si la creation n'est pas reussie, on en informe l'agent
        if (newMember.equals("x")) {

            System.out.println("Une erreur est survenue et le compte n'a pas pu être créé.");
            return;
        }

    }
    public static void updateVisiteur() {//faire méthode deleteclient, modifyClient


        while(true) {
            System.out.println("Voulez vous: ");
            System.out.println("1: supprimer un client");
            System.out.println("2: modifier un client");
            System.out.println("3: revenir en arrière");

            String input = EmployeView.input.nextLine();

            switch(input) {

                case "1":

                    System.out.println("Veuillez entrer le numero du membre que vous voulez gèrer");
                    String num = EmployeView.input.nextLine();

                    //Boolean result = this.client.deleteClient(num, "member");

                    //if(result == true) {
                        System.out.println("Le compte a été supprimé avec succès.");
                    // }else {
                        System.out.println("Le compte n'a pas été supprimé.");
                    // }

                    break;

                case "2":
                    //this.modifyMember();
                    break;

                case "3":
                    return;

                default:
                    System.out.println("La commande " + input + " est invalide");
                    break;


            }




        }


    }
}

