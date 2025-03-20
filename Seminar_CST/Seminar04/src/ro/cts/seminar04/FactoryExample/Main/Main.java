package ro.cts.seminar04.FactoryExample.Main;

import ro.cts.seminar04.FactoryExample.Modele.Supa;
import ro.cts.seminar04.FactoryExample.factory.Factory;
import ro.cts.seminar04.FactoryExample.factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {

        Factory fabricaDeSupe = new Factory(100, 0.5);

        Supa supaCiuperci = fabricaDeSupe.getSupa(TipuriSupe.CIUPERCI, "Bors, Legume, Ciuperci", 100);
        Supa supaVita = fabricaDeSupe.getSupa(TipuriSupe.VITA, "Bors, Legume, Vita", 100);
        Supa supaLegume = fabricaDeSupe.getSupa(TipuriSupe.LEGUME, "Bors, Legume, Crutoane", 100);

        supaCiuperci.preparareSupa();
        supaVita.preparareSupa();
        supaLegume.preparareSupa();
    }
}