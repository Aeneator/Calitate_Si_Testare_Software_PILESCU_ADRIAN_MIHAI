package ro.cts.pilescu.adrian.A8.main;

//A.8. Este dorita reprezentarea departamentelor spitalului in cadrul aplicației.
// Fiecare departament conține subdepartamente sau secții. Secțiile nu conțin subsecții.
// Sa se implementeze modulul care permite reprezentarea arborescenta a departamentelor si secțiilor spitalului.

import ro.cts.pilescu.adrian.A8.models.Component;
import ro.cts.pilescu.adrian.A8.models.Departament;
import ro.cts.pilescu.adrian.A8.models.Sectie;
import ro.cts.pilescu.adrian.A8.models.SubDepartament;

public class Main {
    public static void main(String[] args) {

        Component departament = new Departament("Cardiologie");

        Component subDepartament1 = new SubDepartament("Cardiologie Interventionala");
        Component subDepartament2 = new SubDepartament("Cardiologie Pediatrica");

        Component sectie1 = new Sectie("Electrofiziologie");
        Component sectie2 = new Sectie("Ecografie Cardiaca");
        Component sectie3 = new Sectie("Coronografie");


        departament.adaugaNod(subDepartament1);
        departament.adaugaNod(subDepartament2);
        subDepartament1.adaugaNod(sectie1);
        subDepartament1.adaugaNod(sectie2);
        subDepartament2.adaugaNod(sectie3);

        departament.afiseazaDetalii();

    }
}