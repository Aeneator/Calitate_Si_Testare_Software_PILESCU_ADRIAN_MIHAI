package ro.cts.seminar04.FactoryExample.Modele;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaDeGrame;
    private String ingrediente;

    public Supa() {
        this.gramaj = 0;
        this.pretPerSutaDeGrame = 0;
        this.ingrediente = "";
    }

    public Supa(int gramaj, double pretPerSutaDeGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
        this.ingrediente = ingrediente;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public double getPretPerSutaDeGrame() {
        return pretPerSutaDeGrame;
    }

    public void setPretPerSutaDeGrame(int pretPerSutaDeGrame) {
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
    }

    public abstract void preparareSupa();

    public double calculeazaPret(){
        return gramaj * pretPerSutaDeGrame / 100;
    }


}
