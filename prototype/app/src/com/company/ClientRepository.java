package com.company;

import java.util.ArrayList;

public class ClientRepository{
    
    private static ArrayList<Client> clients = new ArrayList<Client>();

    public ClientRepository(){

    }

    public boolean AddClient(Client client){
        clients.add(client);
        return true;
    }

    public static Client GetClientFromID(String ID){
        for(Client c: clients){
            if(c.GetID().equals(ID))
                return c;
        }
        return null;
    }
}