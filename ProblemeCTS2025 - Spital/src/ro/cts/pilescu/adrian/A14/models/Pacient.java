package ro.cts.pilescu.adrian.A14.models;

public class Pacient {

    private String nume;
    private String stare;
    private boolean areTemperatura;
    private boolean areTuse;
    private boolean areDureri;

    public Pacient(String nume, String stare, boolean areTemperatura, boolean areTuse, boolean areDureri) {
        this.nume = nume;
        this.stare = stare;
        this.areTemperatura = areTemperatura;
        this.areTuse = areTuse;
        this.areDureri = areDureri;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public boolean isAreTemperatura() {
        return areTemperatura;
    }

    public void setAreTemperatura(boolean areTemperatura) {
        this.areTemperatura = areTemperatura;
    }

    public boolean isAreTuse() {
        return areTuse;
    }

    public void setAreTuse(boolean areTuse) {
        this.areTuse = areTuse;
    }

    public boolean isAreDureri() {
        return areDureri;
    }

    public void setAreDureri(boolean areDureri) {
        this.areDureri = areDureri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", stare='").append(stare).append('\'');
        sb.append(", areTemperatura=").append(areTemperatura);
        sb.append(", areTuse=").append(areTuse);
        sb.append(", areDureri=").append(areDureri);
        sb.append('}');
        return sb.toString();
    }
}
