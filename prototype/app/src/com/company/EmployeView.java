package com.company;
import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;


public class EmployeView extends View {

    static Scanner input = new Scanner(System.in);

    /***
     * affiche toutes options possibles à faire
     * et renvoie sur l'une des options choisis
     */
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


    /***
     *creer un client, on doit ajouter les paramètres du client dans
     * la ligne de commandes
     * affiche sur la ligne de commande si il y a eu une erreur
     */
    public static void createClient() {
        Random rand = new Random();
        String complement = String.valueOf(rand.nextLong(100000000,999999999));
        String complementBis = String.valueOf(rand.nextLong(100,999));
        String numeroDeCompte=complement+complementBis;

        System.out.println("Veuillez entrer le nom du client\n");
        String nom = BenevoleView.input.nextLine();
        if(nom==""||nom.length()>50){
            while(nom == ""||nom.length()>50) {
                System.out.print("Vous devez inscrire un nom entre 0 et 50 caractères\n");
                System.out.print("Entrez le nom: \n");
                nom = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer le prenom du client\n");
        String prenom = BenevoleView.input.nextLine();
        if(prenom==""||prenom.length()>50){
            while(prenom == ""||prenom.length()>50) {
                System.out.print("Vous devez inscrire un prenom entre 0 et 50 caractères\n");
                System.out.print("Entrez le prenom: \n");
                prenom = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer la date de naissance du client (YYYY-MM-DD)\n");
        String dateDeNaissance = BenevoleView.input.nextLine();
        if(dateDeNaissance.length()!=10){
            while(dateDeNaissance.length()!=10) {
                System.out.print("Vous devez inscrire une date de naissance avec le format(YYYY-MM-DD)\n");
                System.out.print("Veuillez entrer la date de naissance du client (YYYY-MM-DD)\n");
                dateDeNaissance = BenevoleView.input.nextLine();
            }
        }


        System.out.println("Veuillez entrer le numéro  de carte assurance maladie (sans espace)\n");
        String numAssuranceMaladie = BenevoleView.input.nextLine();
        numAssuranceMaladie = numAssuranceMaladie.replaceAll("\\s+","");//on enlève les espaces

        System.out.println("Veuillez entrer la Date de la visite (YYYY-MM-DD)\n");
        String dateVisite = BenevoleView.input.nextLine();
        if(dateVisite.length()!=10){
            while(dateVisite.length()!=10) {
                System.out.print("Vous devez inscrire une date avec le format(YYYY-MM-DD)\n");
                System.out.print("Veuillez entrer la date de naissance du client (YYYY-MM-DD)\n");
                dateVisite = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer si le client a deja recu une premiere dose [Oui, Non]\n");
        String dose = BenevoleView.input.nextLine();
        if(!dose.equals("Oui") && !dose.equals("Non")){
            while(!dose.equals("Oui") && !dose.equals("Non")) {
                System.out.print("Vous devez inscrire :[Oui, Non]\n");
                System.out.println("Veuillez entrer si le client a deja recu une premiere dose [Oui, Non] \n");
                dose = BenevoleView.input.nextLine();
            }
        }


        System.out.println("Veuillez entrer si le client a deja eu le covid  [Oui, Non] \n");
        String ifCovid = BenevoleView.input.nextLine();
        if(!ifCovid.equals("Oui") && !ifCovid.equals("Non")){
            while(!ifCovid.equals("Oui") && !ifCovid.equals("Non")) {
                System.out.print("Vous devez inscrire :[Oui, Non]\n");
                System.out.println("Veuillez entrer si le client a deja eu le covid  [Oui, Non]\n ");
                ifCovid = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer si le client a des symptomes de la covid [Oui, Non] \n");
        String ifSymptome = BenevoleView.input.nextLine();
        if(!ifSymptome.equals("Oui") && !ifSymptome.equals("Non")){
            while(!ifSymptome.equals("Oui") && !ifSymptome.equals("Non")) {
                System.out.print("Vous devez inscrire :[Oui, Non]\n");
                System.out.println("Veuillez entrer si le client a des symptomes de la covid [Oui, Non] \n");
                ifSymptome = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer si le client a des allergies [Oui, Non]\n");
        String ifallergie = BenevoleView.input.nextLine();
        if(!ifallergie.equals("Oui") && !ifallergie.equals("Non")){
            while(!ifallergie.equals("Oui") && !ifallergie.equals("Non")) {
                System.out.print("Vous devez inscrire :[Oui, Non]\n");
                System.out.println("Veuillez entrer si le client a des allergies [Oui, Non]\n");
                ifallergie = BenevoleView.input.nextLine();
            }
        }


        System.out.println("Veuillez entrer le vaccin que le client veut recevoir [Moderna, Pfizer, AstraZeneca, Janssen]\n");
        String typeVaccin = BenevoleView.input.nextLine();
        if(!typeVaccin.equals("Moderna") && !typeVaccin.equals("Pfizer") && !typeVaccin.equals("AstraZeneca")&& !typeVaccin.equals("Janssen")){
            while(!typeVaccin.equals("Moderna") && !typeVaccin.equals("Pfizer")&& !typeVaccin.equals("AstraZeneca")&& !typeVaccin.equals("Janssen")) {
                System.out.print(" veuillez inscrire l'une des options suivantes :[Moderna, Pfizer, AstraZeneca, Janssen]\n");
                System.out.println("Veuillez entrer le vaccin que le client veut recevoir [Moderna, Pfizer, AstraZeneca, Janssen]\n");
                typeVaccin = BenevoleView.input.nextLine();
            }
        }

        //si la creation n'est pas reussie, on en informe l'agent
        if (EmployeController.CreateClient("123456789112", "nom", numeroDeCompte, nom, prenom, dateDeNaissance, numAssuranceMaladie, dateVisite,
                dose, ifCovid, ifSymptome, ifallergie, typeVaccin)) {
            System.out.println("Une erreur est survenue et le compte n'a pas pu être créé.\n");
            return;
        }
    }
    /***
     *creer un benevole, on doit ajouter les paramètres du client dans
     * la ligne de commandes
     * affiche sur la ligne de commande si il y a eu une erreur
     */
    public static void createBenevole() {

        Random rand = new Random();
        String complement = String.valueOf(rand.nextLong(100000000,999999999));
        String complementBis = String.valueOf(rand.nextLong(100,999));
        String id=complement+complementBis;

        System.out.println("Veuillez entrer le nom du bénevole\n");
        String nom = BenevoleView.input.nextLine();
        if(nom==""||nom.length()>50){
            while(nom == ""||nom.length()>50) {
                System.out.print("Vous devez inscrire un nom entre 0 et 50 caractères\n");
                System.out.print("Entrez le nom:\n");
                nom = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer le prenom du bénevole\n");
        String prenom = BenevoleView.input.nextLine();
        if(prenom==""||prenom.length()>50){
            while(prenom == ""||prenom.length()>50) {
                System.out.print("Vous devez inscrire un prenom entre 0 et 50 caractères\n");
                System.out.print("Entrez le prenom:\n");
                nom = BenevoleView.input.nextLine();
            }
        }


        System.out.println("Veuillez entrer l'addresse du bénevole\n");
        String addresse = BenevoleView.input.nextLine();
        if(addresse==""||addresse.length()>50){
            while(addresse == ""||addresse.length()>100) {
                System.out.print("Vous devez inscrire une adresse entre 0 et 100 caractères\n");
                System.out.println("Veuillez entrer l'addresse du bénevole\n");
                addresse = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer le code postal du bénevole\n");
        String codePostal = BenevoleView.input.nextLine();
        if(codePostal==""||codePostal.length()>6){
            while(codePostal == ""||codePostal.length()>100) {
                System.out.print("Vous devez inscrire un code de postal entre 0 et 6 caractères\n");
                System.out.println("Veuillez entrer le code postal du bénevole\n");
                codePostal = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer la ville du bénevole\n");
        String ville = BenevoleView.input.nextLine();
        if(ville==""||ville.length()>50){
            while(ville == ""||ville.length()>50) {
                System.out.print("Vous devez inscrire une ville entre 0 et 50 caractères\n");
                System.out.println("Veuillez entrer la ville du bénevole\n");
                ville = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer l'email du bénevole\n");
        String Email = BenevoleView.input.nextLine();


        System.out.println("Veuillez entrer le cellulaire du bénevole\n");
        String cellulaire = BenevoleView.input.nextLine();
        if(ville.length()!=10){
            while(ville.length()!=10) {
                System.out.print("Vous devez inscrire un numéro contenant 10 chiffres\n");
                System.out.println("Veuillez entrer le cellulaire du bénevole\n");
                cellulaire = BenevoleView.input.nextLine();
            }
        }

        System.out.println("Veuillez entrer le mot de passe du bénevole\n");
        String motDePasse = BenevoleView.input.nextLine();

        //si la creation n'est pas reussie, on en informe l'agent
        if (EmployeController.CreateBenevole(id, motDePasse, nom, prenom, addresse, codePostal, ville, Email, Integer.parseInt(cellulaire))) {
            System.out.println("Une erreur est survenue et le compte n'a pas pu être créé.\n");
            return;
        }
    }

    /***
     * permet de supprimer ou modifier un client avec le numéro de membre
     * la fonction affiche un message à la fin pour dire si l'opération
     * a été réussi ou non.
     */
    public static void updateVisiteur() {//faire méthode deleteclient, modifyClient

        while(true) {
            System.out.println("Voulez vous: ");
            System.out.println("1: supprimer un client");
            System.out.println("2: modifier un client");
            System.out.println("3: revenir en arrière");

            String input = EmployeView.input.nextLine();

            switch(input) {

                case "1":

                    System.out.println("Veuillez entrer le numero du membre que vous voulez supprimer\n");
                    String num = EmployeView.input.nextLine();
                    if(num==""){
                        System.out.println("Veuillez entrer un numéro de membre\n");
                        updateVisiteur();
                    }

                    //Boolean result = this.client.deleteClient(num, "member");

                    //if(result == true) {
                        System.out.println("Le compte a été supprimé avec succès.\n");
                    // }else {
                        System.out.println("Le compte n'a pas été supprimé.\n");
                    // }

                    break;

                case "2":
                    System.out.print("Entrez le numero de compte du compte visiteur a modifier: \n");
                    String numero = EmployeView.input.nextLine();
                    if(numero==""){
                        System.out.println("Veuillez entrer un numéro de membre\n");
                        updateVisiteur();
                    }
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