package ro.cts.pilescu.adrian.A9.main;

//A.9. Deoarece Spitalul este supraaglomerat se impune ca atunci când pacienții doresc internarea să fie
// internate doar personale care au asigurare de sănătate. Sa se realizeze un nivel intermediar care sa
// permită internarea doar acestor persoane.

import ro.cts.pilescu.adrian.A9.models.InternareProxy;
import ro.cts.pilescu.adrian.A9.models.Pacient;

public class Main {
    public static void main(String[] args) {
        InternareProxy internare = new InternareProxy();
        Pacient pacient = new Pacient("Vasile",true,true,true,true);

        internare.interneazaPacient(pacient);

    }
}