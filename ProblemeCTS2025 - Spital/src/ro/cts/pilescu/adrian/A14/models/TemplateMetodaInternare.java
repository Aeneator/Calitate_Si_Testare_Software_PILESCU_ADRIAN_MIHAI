package ro.cts.pilescu.adrian.A14.models;


//Internarea unui pacient se face după următorii pași: Se analizează dificultatea stării pacientului,
// Se verifica disponibilitatea in saloanele spitalului, Se emite fisa de internare. Sa se implementeze modului
// care realizează in aplicație internarea pacienților după acest pattern.

public abstract class TemplateMetodaInternare {
    public final void interneazaPacient(Pacient pacient){
        analizeazaStarePacient(pacient);
        verificaDisponibilitate(pacient);
        emiteFisaInternare(pacient);
    }

    protected abstract void analizeazaStarePacient(Pacient pacient);
    protected abstract void verificaDisponibilitate(Pacient pacient);
    protected abstract void emiteFisaInternare(Pacient pacient);

}
