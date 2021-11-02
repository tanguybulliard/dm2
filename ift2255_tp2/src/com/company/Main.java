package com.company;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.println("Entrez 1 pour acceder au menu de Employe");
            System.out.println("Entrez 2 pour acceder au menu de benevole");
            System.out.println("Entrez 3 pour quitter le programme");

            String menuChoice = Main.input.nextLine();

            switch(menuChoice) {

                case "1":
                    BenevoleView.displayMenu();
                    break;

                case "2":
                    EmployeView.displayMenu();
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
