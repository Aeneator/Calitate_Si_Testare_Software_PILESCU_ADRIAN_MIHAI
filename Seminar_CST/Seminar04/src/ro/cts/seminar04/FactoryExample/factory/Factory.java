package ro.cts.seminar04.FactoryExample.factory;

import ro.cts.seminar04.FactoryExample.Modele.Supa;
import ro.cts.seminar04.FactoryExample.Modele.SupaCiuperci;
import ro.cts.seminar04.FactoryExample.Modele.SupaLegume;
import ro.cts.seminar04.FactoryExample.Modele.SupaVita;

public class Factory {
    private int gramaj;
    private double pretPerSutaDeGrame;

    public Factory(int gramaj, double pretPerSutaDeGrame){
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
    }

    public Supa getSupa(TipuriSupe tip, String ingrediente, double extraSupa) {
        Supa supa = null;
        switch (tip) {
            case LEGUME:
                supa = new SupaLegume(gramaj, pretPerSutaDeGrame, ingrediente, extraSupa);
                break;
            case CIUPERCI:
                supa = new SupaCiuperci(gramaj, pretPerSutaDeGrame, ingrediente, extraSupa);
                break;
            case VITA:
                supa = new SupaVita(gramaj, pretPerSutaDeGrame, ingrediente, extraSupa);
                break;
            default:
                return null;
        }
        return supa;
    }
}
