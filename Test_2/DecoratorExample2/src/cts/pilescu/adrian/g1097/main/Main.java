package cts.pilescu.adrian.g1097.main;

//tn cadrul unui magazin online, calculul totalului de plata pentru cosul de cumparaturi al unui client
//inclusiv transportul se realizeaza la sfarsit, in functie de totalul cosului de cumparaturi si de
//adresa clientului. Implementarea este disponibila in clasa Magazin. Ca o masura de promovare a
//magazinului, departamentul de market doreste adaugarea unei noi optiuni de discount de 10%
//aplicat doar o singura data la intreaga prima comanda pentru fiecare client in parte. Aceasta
//optiune nu trebuie sa implice modificari in codul existent. Sa se implementeze un modul
//intermediar care sa gestioneze noul context

import cts.pilescu.adrian.g1097.models.*;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Vasile", "Strada Obletilor");
        client.addProdus(new Produs("Laptop", 1000));
        client.addProdus(new Produs("Baterie", 100));

        Bussiness magazin = new Magazin();
        double cost = magazin.calculeazaPretCosCumparaturi(client.getCosCumparaturi(), client);

        System.out.println("Costul total al cosului de cumparaturi este: " + cost);

        Bussiness magazinReducere = new MagazinDiscount(magazin);
        double costReducere = magazinReducere.calculeazaPretCosCumparaturi(client.getCosCumparaturi(), client);
        System.out.println("Costul total al cosului de cumparaturi cu discount este: " + costReducere);
        double costReducere2 = magazinReducere.calculeazaPretCosCumparaturi(client.getCosCumparaturi(), client);
        System.out.println("Costul total al cosului de cumparaturi cu discount este: " + costReducere2);

    }
}