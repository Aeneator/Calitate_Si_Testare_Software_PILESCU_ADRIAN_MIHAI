package ro.cts.seminar04.FactoryExample.Modele;

public class SupaCiuperci extends Supa {
    private double cantitateCiuperci;

    public SupaCiuperci() {
        super();
        this.cantitateCiuperci=0;
    }

    public SupaCiuperci(int gramaj, double pretPerSutaDeGrame, String ingrediente,double cantitateCiuperci) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Se adauga ciuperci la supa");
    }

    @Override
    public double calculeazaPret(){
        return super.calculeazaPret() + cantitateCiuperci * getPretPerSutaDeGrame() / 100;
    }
}
