package subiect1.Ex1.builders;

import subiect1.Ex1.models.Bicicleta;
import subiect1.Ex1.models.IBicicleta;

public class Builder implements AbstractBuilder{

    // required
    private String marca;
    private Double pret;

    // optional
    private float diametruRoti;
    private String tipFrana;
    private Boolean areCascaProtectie;
    private Boolean areOchelari;

    public Builder() {
        this.marca = "N/A";
        this.pret = 0.0;
        this.diametruRoti = 0.0f;
        this.tipFrana = "N/A";
        this.areCascaProtectie = false;
        this.areOchelari = false;
    }

    public AbstractBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public AbstractBuilder setPret(Double pret) {
        this.pret = pret;
        return this;
    }

    public AbstractBuilder setDiametruRoti(float diametruRoti) {
        this.diametruRoti = diametruRoti;
        return this;
    }

    public AbstractBuilder setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }

    public AbstractBuilder setAreCascaProtectie(Boolean areCascaProtectie) {
        this.areCascaProtectie = areCascaProtectie;
        return this;
    }

    public AbstractBuilder setAreOchelari(Boolean areOchelari) {
        this.areOchelari = areOchelari;
        return this;
    }

    @Override
    public IBicicleta buildBicicleta() {
        return  new Bicicleta(marca, pret, diametruRoti, tipFrana, areCascaProtectie, areOchelari);
    }
}
