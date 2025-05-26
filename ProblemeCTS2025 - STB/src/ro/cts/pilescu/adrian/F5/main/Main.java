package ro.cts.pilescu.adrian.F5.main;

import ro.cts.pilescu.adrian.F5.models.SistemUsiFacade;

public class Main {
    public static void main(String[] args) {
        SistemUsiFacade sistemUsi = new SistemUsiFacade();

        sistemUsi.afiseazaStatusUsi();

        sistemUsi.toggleUsaFata();
        sistemUsi.afiseazaStatusUsi();

        sistemUsi.deschideFortatUsi();
    }
}