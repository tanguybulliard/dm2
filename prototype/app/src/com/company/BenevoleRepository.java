package com.company;

import java.util.ArrayList;

public class BenevoleRepository {

    private static ArrayList<Benevole> benevoles = new ArrayList<Benevole>();

    public static void AddBenevole(Benevole benevole) {
        benevoles.add(benevole);
    }

}
