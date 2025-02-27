package ro.cts.seminar1.modele;

public class Student extends Persoana {
    private int idStudent;


    public Student() {
        super( 18,"NumeStudent");
        idStudent = 0;
    }

    public Student(int varsta, String nume, int idStudent) {
        super(varsta, nume);
        this.idStudent = idStudent;
    }

    @Override
    public float calculeazaVenit() {
        return 0;
    }
}
