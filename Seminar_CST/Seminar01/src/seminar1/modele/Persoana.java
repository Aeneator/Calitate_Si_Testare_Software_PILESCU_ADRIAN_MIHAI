package seminar1.modele;

import seminar1.interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    private int varsta;

    public Persoana() {
        this.nume = "necunoscut";
        this.varsta = 0;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public abstract float calculeazaVenit();
}
