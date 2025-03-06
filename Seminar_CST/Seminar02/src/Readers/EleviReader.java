package Readers;

import Clase.Angajat;
import Clase.Aplicant;
import Clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantReader {

    public EleviReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",|\n");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev e = new Elev();
            super.readAplicantData(input2, e);

            int clasa = input2.nextInt();
            String tutore = input2.next();
            e.setClasa(clasa);
            e.setTutore(tutore);

            aplicanti.add(e);
        }

        input2.close();
        return aplicanti;
    }
}
