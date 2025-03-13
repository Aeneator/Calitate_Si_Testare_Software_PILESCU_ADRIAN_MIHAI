package modele;

public class AutoritateEager {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritateEager instance = new AutoritateEager("Autoritatea Nationala pentru Pescuit si Acvacultura", "www.anpa.gov.ro", 100, 1000);

    private AutoritateEager(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static AutoritateEager getInstance(){
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }

    public void angajeaza(int nrAngajatiNoi) {
        this.nrAngajati += nrAngajatiNoi;
    }

    public void concediaza (int nrAngajatiConcediati) {
        this.nrAngajati -= nrAngajatiConcediati;
    }

    public void emiteAutorizatie(String numePersoana) {
        System.out.println("S-a emis o autorizatie pentru " + numePersoana);
        this.nrAutorizatiiEmise++;
    }
}
