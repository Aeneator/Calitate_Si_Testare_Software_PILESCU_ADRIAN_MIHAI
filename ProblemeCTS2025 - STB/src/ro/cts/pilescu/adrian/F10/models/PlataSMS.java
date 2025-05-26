package ro.cts.pilescu.adrian.F10.models;

public class PlataSMS implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata de " + suma + " lei s-a efectuat prin SMS.");
    }
}
