package ro.cts.seminar05.BuilderV2.Models;

public class PacientBuilder implements AbstractBuilder {


    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String numeInsotitor;

    public PacientBuilder() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuciDeCamera = false;
        this.areHalat = false;
        this.numeInsotitor = "UnAltPacient";
    }

    public PacientBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
        return this;
    }

    @Override
    public Pacient build(String numePacient) {
        return new Pacient(numePacient,this.arePatRabatabil,this.areMicDejun,this.arePapuciDeCamera,this.areHalat,this.numeInsotitor);
    }

}
