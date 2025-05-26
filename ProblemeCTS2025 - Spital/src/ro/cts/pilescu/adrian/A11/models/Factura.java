package ro.cts.pilescu.adrian.A11.models;

public class Factura {

    private double sumaDePlatit;
    private ModPlata modPlata;

    public Factura(double sumaDePlatit) {
        this.sumaDePlatit = sumaDePlatit;
    }

    public double getSumaDePlatit() {
        return sumaDePlatit;
    }

    public void setSumaDePlatit(double sumaDePlatit) {
        this.sumaDePlatit = sumaDePlatit;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste() {
        if (modPlata != null) {
            modPlata.plateste(sumaDePlatit);
        } else {
            System.out.println("Modul de plata nu este setat.");
        }
    }
}
