package com.company;

import java.util.ArrayList;

public class SessionRepository{
    
    private static ArrayList<Session> sessions = new ArrayList<Session>();
    
    public SessionRepository() {

    }

    public static String AddSession(Session session){
        sessions.add(session);

        return Integer.toString(session.getReservationNumber());
    }

    public static ArrayList<Session> GetSessions() {
        return sessions;
    }


}