package Readers;

import Clase.Angajat;
import Clase.Aplicant;
import Clase.Elev;
import Clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {

    public StudentiReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant>readAplicanti() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student s = new Student();
            super.readAplicantData(input, s);

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();

            s.setFacultate(facultate);
            s.setAnStudii(an_studii);

            aplicanti.add(s);
        }
        input.close();
        return aplicanti;
    }
}
