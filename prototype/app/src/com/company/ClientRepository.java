package com.company;

import java.util.ArrayList;

public class ClientRepository{
    //on crée la repository pour stocker les clients et leur informations
    private static ArrayList<Client> clients = new ArrayList<Client>();

    public ClientRepository(){

    }

    /**
     * permet d'ajouter un client aux repository ainsi que leur informations
     * @param client
     * @return True
     */
    public static boolean AddClient(Client client){
        clients.add(client);
        return true;
    }

    /**
     * permet de trouver un client grace à son ID et renvoie null si il n'y aucun client
     * ou le client si on le trouve
     * @param ID
     * @return null ou C
     */
    public static Client GetClientFromID(String ID){
        for(Client c: clients){
            if(c.GetID().equals(ID))
                return c;
        }
        return null;
    }
}