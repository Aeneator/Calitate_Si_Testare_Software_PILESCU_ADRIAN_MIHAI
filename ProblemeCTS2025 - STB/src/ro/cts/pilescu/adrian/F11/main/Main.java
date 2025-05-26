package ro.cts.pilescu.adrian.F11.main;

//F.11. Se doreste implementarea unei aplicatii prin care utilizatorii se pot inregistra intr-o lista de calatori
// care sa fie anuntati atunci cand autobuzul pleaca de la capat de linie.
// Autobuzul cand pleaca in cursa de la capatul de linie trebuie sa anunte toti acesti calatori că s-a pus in miscare.
// Calatorii vor putea in acest mod sa stie cand trebuie sa astepte autobuzul in statie.


import ro.cts.pilescu.adrian.F11.models.Observer;
import ro.cts.pilescu.adrian.F11.models.CalatorSimplu;
import ro.cts.pilescu.adrian.F11.models.ListaCalatori;

public class Main {
    public static void main(String[] args) {
        ListaCalatori listaCalatori = new ListaCalatori();

        Observer calator1 = new CalatorSimplu("Ion", "Popescu");
        Observer calator2 = new CalatorSimplu("Maria", "Ionescu");
        Observer calator3 = new CalatorSimplu("Andrei", "Popa");

        listaCalatori.addObserver(calator1);
        listaCalatori.addObserver(calator2);
        listaCalatori.addObserver(calator3);

        listaCalatori.removeObserver(calator2);

        listaCalatori.pleaca();

    }
}