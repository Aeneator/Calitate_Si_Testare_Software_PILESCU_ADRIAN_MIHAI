package ro.cts.seminar04.PrototypeExample.Main;

import ro.cts.seminar04.FactoryExample.Modele.Supa;
import ro.cts.seminar04.FactoryExample.factory.Factory;
import ro.cts.seminar04.FactoryExample.factory.TipuriSupe;
import ro.cts.seminar04.PrototypeExample.Models.Rezervare;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare = new Rezervare("Daria", 5, "12.05.21","12:00");

        Rezervare rezervare1 =  (Rezervare) rezervare.copiaza();
        Rezervare rezervare2 =  (Rezervare) rezervare.copiaza();

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

    }
}