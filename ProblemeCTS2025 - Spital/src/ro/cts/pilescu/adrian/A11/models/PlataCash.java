package ro.cts.pilescu.adrian.A11.models;

public class PlataCash implements ModPlata{

    @Override
    public void plateste(double valoare) {
        System.out.println("Plata in numerar: " + valoare + " RON");
    }
}
