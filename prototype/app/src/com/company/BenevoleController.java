package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;



public class BenevoleController{
    //on cree le repositorie Session
    private static SessionRepository sessionRepo = new SessionRepository();
    private static Scanner input = new Scanner(System.in);

    public BenevoleController(){

    }

    public static SessionRepository GetSessionRepository() {
        return sessionRepo;
    }

    /***
     * Permet d'ajouter une session à la classe SessionRepository un rendez-vous
     * @param nom
     * @param prenom
     * @param date
     * @param typeDeDose
     * @return
     */
    public static boolean AddSession(String nom, String prenom, LocalDateTime date, int typeDeDose) {
        return sessionRepo.AddSession(new Session(nom, prenom, date, typeDeDose));
    }

    /***
     * Prend le code de réservation en entrée et renvoie null ou les détails du rendez-vous
     * s'il y a une reservation
     * @param code
     * @return null or Session
     */
    public static Session GetSessionFromCode(String code) {
        for (Session session : sessionRepo.GetSessions()) {
            if(session.is(code)) return session;
        }
        return null;
    }

}