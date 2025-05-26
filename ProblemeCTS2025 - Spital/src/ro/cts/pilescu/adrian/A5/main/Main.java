package ro.cts.pilescu.adrian.A5.main;

//Spitalul deține un mic magazin pentru medicamente și au o aplicație pentru cumpărarea de medicamente
// pe baza de rețetă. Spitalul închei un contrat cu o farmacie specializată și dorește să integreze
// sistemul informatic al farmaciei cu sistemul software existent în micul magazin de medicamente.
// Dezvoltatorii farmaciei trebuie să integreze aceste două aplicații, astfel încât aplicația farmaciei
// să poate folosi obiectele de tip Medicament din aplicația spitalului. Clasa Medicament din aplicația
// spitalului are metodele achizitioneazaMedicament() și prezintaReteta(). Metoda prezintaReteta() este apelată
// din achizitioneazaMedicament() pentru verificarea rețetei. Clasa Medicament din aplicația farmaciei
// are o singură metodă cumpărăMedicament() în care nu se face verificarea rețetei, deoarece farmacia
// o să vândă medicamente și fără rețetă.

import ro.cts.pilescu.adrian.A5.models.MedicamentFarmacie;
import ro.cts.pilescu.adrian.A5.models.MedicamentFarmacieAdapter;
import ro.cts.pilescu.adrian.A5.models.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital();
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();

        MedicamentFarmacieAdapter adapter = new MedicamentFarmacieAdapter(medicamentFarmacie);

        medicamentSpital.achizitioneazaMedicament("Nurofen", "Nurofen, Algocalmin");
        adapter.achizitioneazaMedicament("Nurofen", "Nurofen, Algocalmin");

    }
}