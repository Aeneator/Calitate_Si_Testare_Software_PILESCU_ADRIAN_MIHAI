package ro.cts.pilescu.adrian.A6.models;

public class Medic {

    private String nume;
    private String calificare;

    public Medic(String nume, String calificare) {
        this.nume = nume;
        this.calificare = calificare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCalificare() {
        return calificare;
    }

    public void setCalificare(String calificare) {
        this.calificare = calificare;
    }

    public boolean pacientulTrebuieInternat(Pacient pacient){
        return pacient.isAreAsigurareMedicala();
    }
}
