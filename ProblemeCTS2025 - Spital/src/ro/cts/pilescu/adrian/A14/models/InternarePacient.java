package ro.cts.pilescu.adrian.A14.models;

public class InternarePacient extends TemplateMetodaInternare{

    int nrLocuriDisponibile = 10;

    @Override
    protected void analizeazaStarePacient(Pacient pacient) {
        System.out.println("Analizeaza starea pacientului " + pacient.getNume() + " pentru internare.");
        System.out.println(pacient.getStare());

    }

    @Override
    protected void verificaDisponibilitate(Pacient pacient) {

    }

    @Override
    protected void emiteFisaInternare(Pacient pacient) {

    }
}
