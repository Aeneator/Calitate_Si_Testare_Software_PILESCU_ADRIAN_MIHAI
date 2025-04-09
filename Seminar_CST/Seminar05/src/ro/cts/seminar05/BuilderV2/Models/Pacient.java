package ro.cts.seminar05.BuilderV2.Models;

public class Pacient {

    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String numeInsotitor;

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciDeCamera, boolean areHalat, String numeInsotitor) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalat = areHalat;
        this.numeInsotitor = numeInsotitor;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public boolean isAreMicDejun() {
        return areMicDejun;
    }

    public void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public boolean isArePapuciDeCamera() {
        return arePapuciDeCamera;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public boolean isAreHalat() {
        return areHalat;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    public String getNumeInsotitor() {
        return numeInsotitor;
    }

    public void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume);
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append(", arePapuciDeCamera=").append(arePapuciDeCamera);
        sb.append(", areHalat=").append(areHalat);
        sb.append(", numeInsotitor='").append(numeInsotitor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
