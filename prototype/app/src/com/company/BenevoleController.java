package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class BenevoleController{

    private static SessionRepository sessionRepo = new SessionRepository();
    private static Scanner input = new Scanner(System.in);

    public BenevoleController(){

    }

    public static SessionRepository GetSessionRepository() {
        return sessionRepo;
    }

    public static void AddSession(String nom, String prenom, LocalDateTime date, int typeDeDose) {
        sessionRepo.AddSession(new Session(nom, prenom, date, typeDeDose));
    }

    public static Session GetSessionFromCode(String code) {
        for (Session session : sessionRepo.GetSessions()) {
            if(session.is(code)) return session;
        }
        return null;
    }

}