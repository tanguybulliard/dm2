public class ClientRepository{
    
    private static ArrayList<Client> clients = new ArrayList<Client>();

    public ClientRepository(){

    }

    public boolean AddClient(Client client){
        clients.add(client);
        return true;
    }
}