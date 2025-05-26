package ro.cts.pilescu.adrian.F11.models;


public class CalatorSimplu implements Observer {
    private String nume;
    private String prenume;


    public CalatorSimplu(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println("Calatorul " + nume + " " + prenume + " a fost notificat cu mesajul: " + mesaj);
    }
}
