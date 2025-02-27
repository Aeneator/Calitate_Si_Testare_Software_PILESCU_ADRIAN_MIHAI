package ro.cts.seminar1.modele;

import ro.cts.seminar1.interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    private int varsta;

    public Persoana() {
    }

    public Persoana(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public abstract float calculeazaVenit();
}
