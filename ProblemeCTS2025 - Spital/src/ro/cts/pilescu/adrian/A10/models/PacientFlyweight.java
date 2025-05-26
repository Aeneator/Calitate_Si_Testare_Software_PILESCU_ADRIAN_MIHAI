package ro.cts.pilescu.adrian.A10.models;

public class PacientFlyweight {
    private String nume;
    private String numarDeTelefon;
    private String adresa;

    public PacientFlyweight(String nume, String numarDeTelefon, String adresa) {
        this.nume = nume;
        this.numarDeTelefon = numarDeTelefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public void setNumarDeTelefon(String numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PacientFlyweight{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarDeTelefon='").append(numarDeTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
