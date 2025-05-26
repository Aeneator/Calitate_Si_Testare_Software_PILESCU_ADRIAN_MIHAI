package ro.cts.pilescu.adrian.F6.main;


import ro.cts.pilescu.adrian.F6.models.*;

public class Main {
    public static void main(String[] args) {
        // Create individual Autobuze
        Component autobuz1 = new Autobuz("Mercedes", "Citaro", 50);
        Component autobuz2 = new Autobuz("Volvo", "7700", 45);
        Component autobuz3 = new Autobuz("MAN", "Lion’s City", 48);
        Component autobuz4 = new Autobuz("Scania", "Citywide", 40);
        Component autobuz5 = new Autobuz("Iveco", "Urbanway", 49);
        Component autobuz6 = new Autobuz("Setra", "S 415 LE", 55);

        autobuz1.setGarantieValida(true);
        autobuz2.setGarantieValida(true);
        autobuz3.setGarantieValida(true);
        autobuz4.setGarantieValida(true);

        Grup grupmare = new GrupMare();
        grupmare.adaugaNod(autobuz1);

        Grup grupmediu = new GrupMediu();
        grupmediu.adaugaNod(autobuz2);
        grupmediu.adaugaNod(autobuz4);

        Grup grupmic = new GrupMediu();
        grupmic.adaugaNod(autobuz3);
        grupmic.adaugaNod(autobuz5);
        grupmic.adaugaNod(autobuz6);

        grupmic.afiseazaDetalii(false);

    }
}