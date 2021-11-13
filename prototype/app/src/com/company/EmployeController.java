package com.company;

public class EmployeController{

    private static ClientRepository clientRepo = new ClientRepository();

    public EmployeController(){

    }

    public static boolean CreateMember(Client client){ 
        clientRepo.AddClient(client);
        return true;
    }

    public static boolean UpdateMember(String clientID){
        Client temp = clientRepo.GetClientFromID(clientID);

        return true;
    }

}