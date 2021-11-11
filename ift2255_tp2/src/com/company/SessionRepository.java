public class SessionRepository{
    
    private static ArrayList<Session> sessions = new ArrayList<Session>();
    
    public SessionRepository{

    }

    public static boolean AddSession(Session session){
        sessions.add(session);
        return true;
    }

}