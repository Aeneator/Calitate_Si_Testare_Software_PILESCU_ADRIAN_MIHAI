package cts.pilescu.adrian.g1097.prototype;

import java.sql.Time;
import java.util.Date;

public class MovieTicket implements Ticket, Prototype{

    // static
    private String titlu;
    private String regie;
    private String companiaProducatoare;
    private String descriere;

    // dynamic
    private String data;
    private String ora;
    private String locuri;


    public MovieTicket(String titlu, String regie, String companiaProducatoare, String descriere) {
        this.titlu = titlu;
        this.regie = regie;
        this.companiaProducatoare = companiaProducatoare;
        this.descriere = descriere;
    }

    @Override
    public String print() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Movie title: ").append(titlu).append(", ");
        sb.append("Date: ").append(data).append(", ");
        sb.append("Time: ").append(ora).append(", ");
        sb.append("Seats: ").append(locuri).append(", ");
        sb.append("Regie: ").append(regie).append(", ");
        sb.append("Compania Producatoare: ").append(companiaProducatoare).append(", ");
        sb.append("Descriere ").append(descriere).append(", ");

        return sb.toString();
    }

    @Override
    public Prototype cloneaza() {
        return new MovieTicket(this.titlu,this.regie,this.companiaProducatoare,this.descriere);
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public void setLocuri(String locuri) {
        this.locuri = locuri;
    }
}
