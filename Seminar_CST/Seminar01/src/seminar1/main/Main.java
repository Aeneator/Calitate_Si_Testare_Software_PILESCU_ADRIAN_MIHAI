package seminar1.main;

import seminar1.interfete.IPredabil;
import ro.cts.seminar1.modele.*;
import seminar1.modele.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> ListaStudenti = new ArrayList<>();
        ListaStudenti.add(new Student(20,"Marius",1));
        ListaStudenti.add(new Student(21,"Andrei",2));
        ListaStudenti.add(new Student(23,"George",3));

        Curs curs = new Curs("CTS", 5,(IPredabil) new Profesor(22,"Eduard"),ListaStudenti);

        System.out.println( ((Persoana)curs.getProfesor()).calculeazaVenit());
        curs.afisareDetalii();
        curs.sustineExamene("10.2.2025");

        Asistent asistent = new Asistent(10,"Marin Preda");
        curs.setProfesor(asistent);
        curs.sustineExamene("11.3.2025");

        ((IPredabil)curs.getProfesor()).preda();
    }
}