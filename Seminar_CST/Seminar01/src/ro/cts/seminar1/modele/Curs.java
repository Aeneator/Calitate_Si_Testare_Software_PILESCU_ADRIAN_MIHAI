package ro.cts.seminar1.modele;

import ro.cts.seminar1.interfete.IPersoana;
import ro.cts.seminar1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public Curs() {
        numeCurs = "CTS";
        credite = 5;
        profesor = new Profesor();
        studenti = new ArrayList<>();
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void afisareDetalii(){
        StringBuilder sb = new StringBuilder("La cursul ")
                .append(this.numeCurs)
                .append(" cu ")
                .append(this.credite)
                .append(" puncte credite ")
                .append(" predat de ")
                .append(((IPersoana)this.profesor).getNume())
                .append(" are ")
                .append(studenti.size())
                .append(" studenti.");
        System.out.println(sb.toString());
    }

    public void sustineExamene(String data){
        StringBuilder sb = new StringBuilder("Pe data ")
                .append(data)
                .append(" profesorul ")
                .append(((IPersoana)this.profesor).getNume())
                .append(" sustine examen cu urmatorii studenti: ");

        System.out.println(sb.toString());
        studenti.forEach(s-> System.out.println(s.getNume()));
    }
}


