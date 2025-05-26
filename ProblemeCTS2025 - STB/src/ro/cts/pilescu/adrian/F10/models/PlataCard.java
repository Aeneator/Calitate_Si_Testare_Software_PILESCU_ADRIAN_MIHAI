package ro.cts.pilescu.adrian.F10.models;

public class PlataCard implements ModPlata{

    @Override
    public void plateste(double suma) {
        System.out.println("Plata de " + suma + " a fost realizata cu cardul.");
        System.out.println("Comision de 0.5% aplicat.");
    }
}
