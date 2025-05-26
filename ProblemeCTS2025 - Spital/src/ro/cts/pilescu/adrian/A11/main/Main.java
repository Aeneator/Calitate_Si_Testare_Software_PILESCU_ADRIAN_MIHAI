package ro.cts.pilescu.adrian.A11.main;
// A.11. Este dorită implementarea modului de plată pentru pacienții care au fost internați în spital.
// Modul de plată îl decide persoana care plătește în momentul în care trebuie să facă plata.
// Plata se poate realiza cu cardul sau cash. Sa se implementeze modulul de plata.

import ro.cts.pilescu.adrian.A11.models.Factura;
import ro.cts.pilescu.adrian.A11.models.PlataCard;
import ro.cts.pilescu.adrian.A11.models.PlataCash;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(100);

        factura.setModPlata(new PlataCard());

        factura.plateste();
    }
}