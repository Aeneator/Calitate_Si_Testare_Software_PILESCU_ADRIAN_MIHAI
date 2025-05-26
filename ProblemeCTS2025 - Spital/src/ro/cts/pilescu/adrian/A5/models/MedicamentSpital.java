package ro.cts.pilescu.adrian.A5.models;

public class MedicamentSpital {

    public void achizitioneazaMedicament(String medicament, String reteta){
        prezintaReteta(reteta);
        System.out.println("Medicamentul " + medicament + " a fost achizitionat din spital.");
    }

    public void prezintaReteta(String reteta){
        System.out.println("Reteta este: " + reteta);
    }
}
