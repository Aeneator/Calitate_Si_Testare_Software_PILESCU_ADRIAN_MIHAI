package ro.cts.seminar1.modele;

import ro.cts.seminar1.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private int idAsistent;
    private float salariu;

    public Asistent() {
        super();
    }

    public Asistent(int varsta, String nume) {
        super(varsta, nume);
    }

    @Override
    public float calculeazaVenit() {
        return salariu;
    }

    @Override
    public int getVarsta() {
        return super.getVarsta();
    }

    @Override
    public String getNume() {
        return super.getNume();
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    @Override
    public void preda() {

    }
}
