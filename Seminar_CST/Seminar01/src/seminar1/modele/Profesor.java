package seminar1.modele;

import seminar1.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private int idAngajat;
    private float salariu;
    private float sporVechime;

    public Profesor() {
        super("PROF", 35);
        this.idAngajat = 0;
        this.salariu = 0;
        this.sporVechime = 0;
    }

    public Profesor(String nume, int varsta, int idAngajat, float salariu, float sporVechime) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }
    public int getIdAngajat() {
        return idAngajat;
    }
    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public float getSalariu() { return salariu; }
    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public float getSporVechime() {
        return sporVechime;
    }
    public void setSporVechime(float sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public String getNume() {
        return super.getNume();
    }

    @Override
    public int getVarsta() {
        return super.getVarsta();
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder("Profesorul ");
        builder.append(this.getNume()).append(" in varsta de ").append(this.getVarsta()).append(" de ani preda la curs.");
        System.out.println(builder.toString());
    }
    @Override
    public float calculeazaVenit() {
        return salariu + sporVechime * salariu;
    }
}
