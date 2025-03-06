package seminar1.modele;

import seminar1.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private int idAngajat;
    private int salariu;
    private int sporVechime;

    public Profesor() {
        super();
    }

    public Profesor(int varsta, String nume) {
        super(varsta, nume);
    }

    public int getIdAngajat() {
        return idAngajat;
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
    public float calculeazaVenit() {
        return 0;
    }

    @Override
    public void preda() {

    }
}
