package ro.cts.pilescu.adrian.A12.main;

// A.12. Spitalul dorește să anunțe toți pacienții care au fost în spital ori de câte ori apare vreo urgență
// cu privire la viruși existenți în oraș. Astfel se dorește implementarea unui modul care atunci când apare
// o epidemie sau un virus nou să se trimită notificări tuturor persoanelor abonate la notificările spitalului.

import ro.cts.pilescu.adrian.A12.models.Observer;
import ro.cts.pilescu.adrian.A12.models.Pacient;
import ro.cts.pilescu.adrian.A12.models.Spital;
import ro.cts.pilescu.adrian.A12.models.Subject;

public class Main {
    public static void main(String[] args) {
        Subject spital = new Spital();

        Observer pacient = new Pacient("Popescu", "071213123123");
        Observer pacient1 = new Pacient("Ionescu", "071213123124");


        spital.adaugaObserver(pacient);
        spital.adaugaObserver(pacient1);

        spital.trimiteNotificare("A venit covid!");

    }
}