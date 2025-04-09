package subiect1.Ex2.models;

public class Bicicleta implements IBicicleta {
    // required
    private String marca;
    private Double pret;

    // optional
    private float diametruRoti;
    private String tipFrana;
    private Boolean areCascaProtectie;
    private Boolean areOchelari;

    public Bicicleta(String marca, Double pret, float diametruRoti, String tipFrana, Boolean areCascaProtectie, Boolean areOchelari) {
        this.marca = marca;
        this.pret = pret;
        this.diametruRoti = diametruRoti;
        this.tipFrana = tipFrana;
        this.areCascaProtectie = areCascaProtectie;
        this.areOchelari = areOchelari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", diametruRoti=").append(diametruRoti);
        sb.append(", tipFrana='").append(tipFrana).append('\'');
        sb.append(", areCascaProtectie=").append(areCascaProtectie);
        sb.append(", areOchelari=").append(areOchelari);
        sb.append('}');
        return sb.toString();
    }
}
