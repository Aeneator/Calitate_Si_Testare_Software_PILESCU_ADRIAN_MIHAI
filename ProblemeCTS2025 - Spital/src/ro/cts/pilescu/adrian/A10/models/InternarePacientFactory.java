package ro.cts.pilescu.adrian.A10.models;

import java.util.HashMap;
import java.util.Map;

public class InternarePacientFactory {

    private Map<String,PacientFlyweight> infoPacienti = new HashMap<>();

    public InternarePacient getInternarePacient(String nume, String numarDeTelefon, String adresa, int nrSalon, int nrPat, int nrZileSpitalizare ){
        String key = nume + "_" + numarDeTelefon + "_" + adresa;
        if (!infoPacienti.containsKey(key)){
            infoPacienti.put(key,new PacientFlyweight(nume,numarDeTelefon,adresa));
            System.out.println("Pacientul " + nume + " a fost adaugat in cache");
        }

        return new InternarePacient(nrSalon, nrPat, nrZileSpitalizare,infoPacienti.get(key));
    }


}
