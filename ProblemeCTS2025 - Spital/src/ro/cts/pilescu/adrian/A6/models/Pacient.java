package ro.cts.pilescu.adrian.A6.models;

public class Pacient {

    private String nume;
    private boolean arePuls;
    private boolean areTensiune;
    private boolean areTemperatura;
    private boolean areAsigurareMedicala;

    public Pacient(String nume, boolean arePuls, boolean areTensiune, boolean areTemperatura, boolean areAsigurareMedicala) {
        this.nume = nume;
        this.arePuls = arePuls;
        this.areTensiune = areTensiune;
        this.areTemperatura = areTemperatura;
        this.areAsigurareMedicala = areAsigurareMedicala;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isArePuls() {
        return arePuls;
    }

    public void setArePuls(boolean arePuls) {
        this.arePuls = arePuls;
    }

    public boolean isAreTensiune() {
        return areTensiune;
    }

    public void setAreTensiune(boolean areTensiune) {
        this.areTensiune = areTensiune;
    }

    public boolean isAreTemperatura() {
        return areTemperatura;
    }

    public void setAreTemperatura(boolean areTemperatura) {
        this.areTemperatura = areTemperatura;
    }

    public boolean isAreAsigurareMedicala() {
        return areAsigurareMedicala;
    }

    public void setAreAsigurareMedicala(boolean areAsigurareMedicala) {
        this.areAsigurareMedicala = areAsigurareMedicala;
    }

    public boolean verificaGravitate(){
        if (!arePuls || areTensiune || areTemperatura) {
            return true;
        }else{
            return false;
        }
    }
}
