package com.company;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // Données incluses
        BenevoleController.AddSession("Foret", "Aura", LocalDateTime.of(2021,11,5,10,0), 1);
        BenevoleController.AddSession("Buisson", "Paul", LocalDateTime.of(2021,12,2,14,0), 2);
        EmployeController.CreateClient("202010250001","Cortez", "Juan", "1990-01-13", "5147836802",
                                "", "", "", "", "", "");
        EmployeController.CreateClient("202004280010","Hannoune", "Isabelle", "1994-10-06", "4382835821",
                                "", "", "", "", "", "");
        //

        while(true) {
            System.out.println("Entrez 1 pour acceder au menu d'employe");
            System.out.println("Entrez 2 pour acceder au menu de benevole");
            System.out.println("Entrez 3 pour quitter le programme");

            String menuChoice = Main.input.nextLine();

            switch(menuChoice) {

                case "1":
                    EmployeView.displayMenu();
                    break;

                case "2":
                    BenevoleView.displayMenu();
                    break;

                case "3":
                    return;

                default:
                    System.out.println("La commande " + menuChoice + " est invalide");
                    break;


            }
        }

    }

}
