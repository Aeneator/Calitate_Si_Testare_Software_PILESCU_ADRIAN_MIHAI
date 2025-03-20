package ro.cts.seminar04.FactoryExample.Modele;

public class SupaVita extends Supa {
    private double pretExtra;
    public SupaVita() {
        super();
        this.pretExtra = 0;
    }

    public SupaVita(int gramaj, double pretPerSutaDeGrame, String ingrediente, double pretExtra) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Se adauga vita la supa");
    }
}
