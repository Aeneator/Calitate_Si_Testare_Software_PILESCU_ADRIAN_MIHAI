package ro.cts.pilescu.adrian.A5.models;

// MedicamentSpital este target si MedicamentFarmacie este adaptee
public class MedicamentFarmacieAdapter extends MedicamentSpital{
    private MedicamentFarmacie medicamentFarmacie;

    public MedicamentFarmacieAdapter(MedicamentFarmacie medicamentFarmacie){
        this.medicamentFarmacie = medicamentFarmacie;
    }

    @Override
    public void achizitioneazaMedicament(String medicament, String reteta) {
        prezintaReteta(reteta);
        medicamentFarmacie.cumparaMedicament(medicament);
    }

    @Override
    public void prezintaReteta(String reteta) {
        super.prezintaReteta(reteta);
    }
}
