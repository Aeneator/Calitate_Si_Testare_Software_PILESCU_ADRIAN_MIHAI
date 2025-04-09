package ro.cts.seminar05.BuilderV1.Models;

public class PacientBuilder implements AbstractBuilder{

    private Pacient pacient;

    public PacientBuilder(String numePacient){
        this.pacient = new Pacient(numePacient, false, false, false, false, "UnAltPacient");
    }

    public Pacient setArePatRabatabil(boolean arePatRabatabil){
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this.pacient;
    }

    public Pacient setAreMicDejun(boolean areMicDejun){
        this.pacient.setAreMicDejun(areMicDejun);
        return this.pacient;
    }

    public Pacient setArePapuciDeCamera(boolean arePapuciDeCamera){
        this.pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return this.pacient;
    }

    public Pacient setAreHalat(boolean areHalat){
        this.pacient.setAreHalat(areHalat);
        return this.pacient;
    }

    public Pacient setNumeInsotitor(String numeInsotitor){
        this.pacient.setNumeInsotitor(numeInsotitor);
        return this.pacient;
    }

    @Override
    public Pacient getPacient(String numePacient){
        return this.pacient;
    }
}
