package Readers;

import Clase.Angajat;
import Clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader{

    public AngajatiReader(String fileName) {
        super(fileName);
    }
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Angajat a = new Angajat();
            super.readAplicantData(input, a);

            int salariu = input.nextInt();
            String ocupatie = input.next();

            a.setSalariu(salariu);
            a.setOcupatie(ocupatie);

            aplicanti.add(a);
        }
        input.close();
        return aplicanti;
    }

}
