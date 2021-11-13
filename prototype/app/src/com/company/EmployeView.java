package com.company;
import java.util.Scanner;
import java.util.Random;


public class EmployeView extends View {

    static Scanner input = new Scanner(System.in);

    public static void displayMenu() {

        while(true) {

            System.out.println("Veuillez entrer l'option désirée.");
            System.out.println("1: afficher les rendez-vous");
            System.out.println("2: ajouter un rendez-vous");
            System.out.println("3: créer benevole");
            System.out.println("4: supprimer benevole");
            System.out.println("5: modifier benevole");
            System.out.println("6: gérer calendrier bénévole");
            System.out.println("7: gérer visiteur");
            System.out.println("8: créer visiteur");
            System.out.println("9: pour quitter le programme ");
            String input = EmployeView.input.nextLine();

            switch(input) {

                case "1":
                    BenevoleView.displayRdv();
                    break;

                case "2":
                    BenevoleView.addSession();
                    break;

                case "3":
                    EmployeView.createBenevole();
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
                    updateVisiteur();
                    break;

                case "8":
                    createClient();
                    break;

                case "9":
                    return;

                default:
                    System.out.println("La commande " + input + "est invalide");
                    break;
            }
        }
    }

    public static void createClient() {
        Random rand = new Random();

        String numeroDeCompte = String.valueOf(rand.nextInt(100000000));

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

        //si la creation n'est pas reussie, on en informe l'agent
        if (EmployeController.CreateClient(numeroDeCompte, nom, prenom, dateDeNaissance, numAssuranceMaladie, dateVisite,
                dose, ifCovid, ifSymptome, ifallergie, typeVaccin)) {
            System.out.println("Une erreur est survenue et le compte n'a pas pu être créé.");
            return;
        }
    }

    public static void createBenevole() {
        Random rand = new Random();

        String id = String.valueOf(rand.nextInt(100000000));

        System.out.println("Veuillez entrer le nom du bénevole");
        String nom = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer le prenom du bénevole");
        String prenom = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer l'addresse du bénevole");
        String addresse = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer le code postal du bénevole");
        String codePostal = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer la ville du bénevole");
        String ville = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer l'email du bénevole ");
        String Email = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer le cellulaire du bénevole ");
        String cellulaire = BenevoleView.input.nextLine();

        System.out.println("Veuillez entrer le mot de passe du bénevole");
        String motDePasse = BenevoleView.input.nextLine();

        //si la creation n'est pas reussie, on en informe l'agent
        if (EmployeController.CreateBenevole(id, motDePasse, nom, prenom, addresse, codePostal, ville, Email, Integer.parseInt(cellulaire))) {
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
                    System.out.print("Entrez le numero de compte du compte visiteur a modifier: ");
                    String numero = EmployeView.input.nextLine();
                    EmployeController.UpdateMember(numero);
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