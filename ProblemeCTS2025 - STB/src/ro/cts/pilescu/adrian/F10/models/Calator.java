package ro.cts.pilescu.adrian.F10.models;

public class Calator {
    private String nume;
    private String prenume;
    private ModPlata modPlata;

    public Calator(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        this.modPlata = null;
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

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double suma){
        if (modPlata != null){
            modPlata.plateste(suma);
        }else{
            System.out.println("Nu s-a ales un mod de plata!");
        }
    }
}
