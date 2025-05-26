package cts.pilescu.adrian.g1097.models;

import java.util.ArrayList;
import java.util.List;

public class Magazin implements Bussiness{


    public Magazin() {

    }

    @Override
    public double calculeazaPretCosCumparaturi(List<Produs> cosCumparaturi, Client client) {
        double suma = 0;
        for(Produs produs:cosCumparaturi){
            suma += produs.getCost();
        }
        return suma;
    }
}
