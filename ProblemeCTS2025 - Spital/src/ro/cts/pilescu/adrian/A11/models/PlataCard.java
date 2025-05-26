package ro.cts.pilescu.adrian.A11.models;

public class PlataCard implements ModPlata{
    @Override
    public void plateste(double valoare) {
        System.out.println("Plata cu cardul in valoare de " + valoare + " RON");
    }
}
