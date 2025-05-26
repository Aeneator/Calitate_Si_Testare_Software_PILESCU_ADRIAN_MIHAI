package ro.cts.pilescu.adrian.F14.main;

//F.14. Un tramvai circula de fiecare data pe aceeasi linie, astfel el are de parcurs confom unui patern bine stabilit
// statiile de pe acea linie: Statia1, Statia2, Statia3, Statia4, Statia5, Statia6 atunci cand merge intr-un sens si invers
// atunci cand parcurge traseul in sens invers.
// Sa se implementeze modului care asigura oprirea in statiile stabilite de catre patern pentru Tramvai.

import ro.cts.pilescu.adrian.F14.models.ParcurgereTraseu;
import ro.cts.pilescu.adrian.F14.models.ParcurgereTraseuSensInvers;
import ro.cts.pilescu.adrian.F14.models.ParcurgereTraseuSensNormal;
import ro.cts.pilescu.adrian.F14.models.Tramvai;

public class Main {
    public static void main(String[] args) {
        Tramvai tramvai = new Tramvai("Mercedes", 100, 40);

        ParcurgereTraseu parcurgereSensNormal = new ParcurgereTraseuSensNormal();
        ParcurgereTraseu parcurgereSensInvers = new ParcurgereTraseuSensInvers();

        parcurgereSensNormal.parcurgeTraseu(tramvai.getCodTramvai());

        System.out.println();

        parcurgereSensInvers.parcurgeTraseu(tramvai.getCodTramvai());
    }
}