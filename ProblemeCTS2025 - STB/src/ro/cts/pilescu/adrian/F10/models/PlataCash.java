package ro.cts.pilescu.adrian.F10.models;

public class PlataCash implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata in numerar a sumei de " + suma + " lei a fost realizata.");
    }
}
