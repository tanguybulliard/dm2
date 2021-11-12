package com.company;

public class EmployeController{

    private static ClientRepository clientRepo = new ClientRepository();

    public EmployeController(){

    }

    public static boolean CreateMember(Client client){ 
        clientRepo.AddClient(client);
        return true;
    }

}