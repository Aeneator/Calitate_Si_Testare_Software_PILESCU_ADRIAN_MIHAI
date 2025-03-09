package seminar1.modele;

import seminar1.interfete.IPersoana;
import seminar1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil cadruDidactic;
    private List<Student> studenti;

    public Curs() {
        numeCurs = "CTS";
        credite = 5;
        cadruDidactic = new Profesor();
        studenti = new ArrayList<>();
    }

    public Curs(String numeCurs, int credite, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
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

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
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
                .append(((IPersoana)this.cadruDidactic).getNume())
                .append(" are ")
                .append(studenti.size())
                .append(" studenti.");
        System.out.println(sb.toString());
    }

    public void sustineExamene(String data){
        StringBuilder sb = new StringBuilder("Pe data ")
                .append(data)
                .append(" profesorul ")
                .append(((IPersoana)this.cadruDidactic).getNume())
                .append(" sustine examen cu urmatorii studenti: ");

        System.out.println(sb.toString());
        studenti.forEach(s-> System.out.println(s.getNume()));
    }
}


