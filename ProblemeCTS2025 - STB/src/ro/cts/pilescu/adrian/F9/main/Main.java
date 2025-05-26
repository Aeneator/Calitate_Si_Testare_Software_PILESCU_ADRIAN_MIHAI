package ro.cts.pilescu.adrian.F9.main;

//F.9. Pentru fiecare AutobuzLinie sunt salvate in memorie, informatii precum: model autobuz, an fabricatie, numar locuri,
// numar linie,prima statie, ultima statie. Aceste informatii sunt salvate pentru fiecare AutobuzLinie din oras.
// Se doreste implementarea unui modul care sa asigure gestiunea in mod optim a memoriei, tinandu-se cont de faptul ca
// anumite informatii sunt redundante, deoarece pe o linie vor merge mai multe autobuze.

import ro.cts.pilescu.adrian.F9.models.AutobuzFlyweight;
import ro.cts.pilescu.adrian.F9.models.AutobuzFlyweightFactory;
import ro.cts.pilescu.adrian.F9.models.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzFlyweightFactory factory = new AutobuzFlyweightFactory();

        AutobuzFlyweight mercedesInfo = factory.getAutobuz("mercedes", 2000, 40);
        AutobuzFlyweight daciaInfo = factory.getAutobuz("dacia", 2001, 30);
        AutobuzFlyweight volvoInfo = factory.getAutobuz("Volvo", 2021, 45);

        AutobuzLinie linie1 = new AutobuzLinie(1,"Strada strazii", "Strada bulevardului", mercedesInfo);
        AutobuzLinie linie2= new AutobuzLinie(2,"A", "B", daciaInfo);
        AutobuzLinie linie3 = new AutobuzLinie(123, "Obor", "Unirii", mercedesInfo);
        AutobuzLinie linie4 = new AutobuzLinie(124, "Victoriei", "Titan", mercedesInfo);
        AutobuzLinie linie5 = new AutobuzLinie(125, "Militari", "Rahova", volvoInfo);

        System.out.println(
                linie1.toString());

    }
}