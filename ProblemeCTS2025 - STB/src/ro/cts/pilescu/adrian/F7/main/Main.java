package ro.cts.pilescu.adrian.F7.main;

//F.7. Compania doreste ca modulul de printare al biletelor sa permita cu ocazia anumitor zile nationale sa printeze pe
// bilet un mesaj de "La multi ani". Se doreste implementarea acestui modul care sa adauge functionalitatea de printare
// mesaj customizat. Exista posibilitatea ca aceasta
// functionalitate sa nu fie folosita, si din acest motiv se doreste sa fie optionala, fara modificarea codului existent.

import ro.cts.pilescu.adrian.F7.models.MovieTicket;
import ro.cts.pilescu.adrian.F7.models.SpecialDayDecorator;
import ro.cts.pilescu.adrian.F7.models.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket movieTicket = new MovieTicket("Inception", "Cinema 12", "12");

        movieTicket.printTicket();

        Ticket birthdayTicket = new SpecialDayDecorator(movieTicket, "Happy Birthday!");

        birthdayTicket.printTicket();

    }
}