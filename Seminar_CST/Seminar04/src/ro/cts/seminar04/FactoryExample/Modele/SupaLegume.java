package ro.cts.seminar04.FactoryExample.Modele;

public class SupaLegume extends Supa{
    private double gramajCrutoane;

    public SupaLegume() {
        super();
        this.gramajCrutoane = 0;
    }

    public SupaLegume(int gramaj, double pretPerSutaDeGrame, String ingrediente,double gramajCrutoane) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Se adauga legumele la supa");
    }

    @Override
    public double calculeazaPret(){
        return super.calculeazaPret() + gramajCrutoane * getPretPerSutaDeGrame() / 100 * 2;
    }
}
