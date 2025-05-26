package ro.cts.pilescu.adrian.F10.main;

//F.10. Un calator are posibilitatea sa plateasca cu cardul de calatorii, cardul bancar sau prin SMS.
// Trebuie implementat modulul dintr-un validator calatorie care sa permita plata calatoriei printruna din cele trei metode.
// Calatorul va decide modul de plata atunci cand se urca in mijlocul de transport.


import ro.cts.pilescu.adrian.F10.models.Calator;
import ro.cts.pilescu.adrian.F10.models.PlataCard;
import ro.cts.pilescu.adrian.F10.models.PlataCash;
import ro.cts.pilescu.adrian.F10.models.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Marian", "Popescu");

        calator.setModPlata(new PlataSMS());

        calator.plateste(100);

        calator.setModPlata(new PlataCash());

        calator.plateste(100);

        calator.setModPlata(new PlataCard());

        calator.plateste(100);
    }
}