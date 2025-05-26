package ro.cts.pilescu.adrian.A9.models;

public class InternareSpital implements Internare{

    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat in spital.");
    }
}
