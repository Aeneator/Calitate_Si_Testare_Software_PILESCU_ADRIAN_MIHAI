package seminar1.modele;

import seminar1.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private int idAsistent;
    private float salariu;

    public Asistent() {
        super("ASISTENT", 25);
        this.idAsistent = 0;
        this.salariu = 0;
    }

    public Asistent(String nume, int varsta, int idAsistent, float salariu) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariu = salariu;
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

    @Override
    public void preda() {

    }
}
