package ro.cts.pilescu.adrian.A6.models;

public class Spital {


    public void interneazaPacient(Pacient pacient, Medic medic, Salon salon){
        if (!pacient.verificaGravitate()){
            System.out.println("Pacientul nu trebuie internat");
            return;
        }

        if (!medic.pacientulTrebuieInternat(pacient)){
            System.out.println("Medic nu este de acord cu internarea pacientului");
            return;
        }

        int patLiberSalon = salon.existaPatLiber();

        if (patLiberSalon == -1){
            System.out.println("Nu exista pat liber in salon");
            return;
        }

        salon.setPatOcupat(true, pacient.getNume(),patLiberSalon);
        System.out.println("Pacientul a fost ocupat in patul " + patLiberSalon + " din salon " + " de catre medicul " + medic.getNume());
    }

}
