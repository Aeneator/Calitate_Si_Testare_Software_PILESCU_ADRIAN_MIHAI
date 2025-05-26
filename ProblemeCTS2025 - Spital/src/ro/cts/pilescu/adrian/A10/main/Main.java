package ro.cts.pilescu.adrian.A10.main;

// A.10. Pentru fiecare internare trebuie să se rețină informații cu privire la
// pacientul internat precum: nume, număr de telefon, adresă, etc, precum și informațiile despre
// salonul unde este internat: număr salon, număr pat, număr zile spitalizare, etc.
// Astfel, dacă un pacient este internat de mai multe ori de-a lungul timpului, informațiile despre acesta
// sunt aceleași și se repetă, ocupând foarte multă memorie. Să se implementeze modulul de memorare al tuturor
// internărilor astfel încât să nu ocupe memorie foarte multă.

import ro.cts.pilescu.adrian.A10.models.InternarePacientFactory;

public class Main {
    public static void main(String[] args) {

        InternarePacientFactory factory = new InternarePacientFactory();

        factory.getInternarePacient("Popescu", "0745123456", "Str. 1, nr. 2", 1, 1, 5);
        factory.getInternarePacient("Popescu", "0745123456", "Str. 1, nr. 2", 10, 3, 5);
    }
}