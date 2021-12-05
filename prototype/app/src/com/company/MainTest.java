package com.company;
import java.time.LocalDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;

import static com.company.ClientRepository.GetClientFromID;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class MainTest {


    @Test
    public void testEmployeController() {

        //on teste la creation de clients

        assertTrue(EmployeController.CreateClient("123456789112","nom","prenom","2018-28-02","1234567","2021-09-08",
                "Oui","Oui","Oui","Moderna","Oui","Pfizer","abcdefghijklmnopqsrt"));

        assertFalse(EmployeController.CreateClient("123456789114","nomm","prenomm","2018-28-02","12t34 5867","2021-09-08",
                "Oui","Oui","Oui","Moderna","Oui","Pfizer","abcdefghijklmnopqsgt"));


        //on teste la supression de compte
        //assertTrue(EmployeController.DeleteClient("202010250001", "member"));
        //assertFalse(EmployeController.DeleteClient("202010250002", "member"));



        //on test la création d'un bénévole
        assertTrue(EmployeController.CreateBenevole("123","bene","vole","2000-02-02",
                "2088, saint-Laurent", "h2h 3a9", "montreal","ben@vole.com",514));
        assertFalse(EmployeController.CreateBenevole("123456789012","besne","voele","2000-02-02",
                "2088 saint-Laurent", "h2h 3a99", "montreal", "ben@vole.com",514));//code postal + de 6 caractères

    }
    @Test
    public void testBenevoleController() {
        LocalDateTime now = LocalDateTime.now();
        //on test la fonction qui permet de verifier les rendez-vous
        assertEquals(null, BenevoleController.AddSession("nom", "prenom", now, 1));
        assertNotEquals(null, BenevoleController.AddSession("nom", "prenom", now, 2));


    }
    @Test
    public void testClientRepository() {
        assertNotEquals(null, GetClientFromID("123456789112"));
        assertEquals(null, GetClientFromID("123456789119"));


    }
}