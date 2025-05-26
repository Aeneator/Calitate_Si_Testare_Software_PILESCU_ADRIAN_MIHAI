package ro.cts.pilescu.adrian.A12.models;

public class Pacient implements Observer{

    private String nume;
    private String nrTelefon;

    public Pacient(String nume, String nrTelefon) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void notify(String message) {
        System.out.println(this.nume + " ai primit un mesaj: " + message);
    }
}
