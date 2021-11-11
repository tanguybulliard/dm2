package com.company;

import java.util.Scanner;

public class BenevoleView extends View {

    static Scanner input = new Scanner(System.in);

    public static void displayMenu() {

        while (true) {

            System.out.println("Veuillez entrer l'option désirée.");
            System.out.println("1: afficher les rendez-vous");
            System.out.println("2: ajouter un rendez-vous");
            System.out.println("3: afficher le calendrier ");
            System.out.println("4: pour quitter le programme ");
            String menuChoice = BenevoleView.input.nextLine();

            switch (menuChoice) {

                case "1":
                    //xxx.displayRdv();
                    break;

                case "2":
                    BenevoleController.AddEntry();
                    break;

                case "3":
                    //xxx.displayCalendrier();
                    break;


                case "4":

                    return;

                default:
                    System.out.println("La commande " + input + "est invalide");
                    break;

            }


        }

    }



}
