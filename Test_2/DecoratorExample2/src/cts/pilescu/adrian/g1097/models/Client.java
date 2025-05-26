package cts.pilescu.adrian.g1097.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nume;
    private String adresa;
    private List<Produs> cosCumparaturi;


    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.cosCumparaturi = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public List<Produs> getCosCumparaturi() {
        return cosCumparaturi;
    }

    public void setCosCumparaturi(List<Produs> cosCumparaturi) {
        this.cosCumparaturi = cosCumparaturi;
    }

    public void addProdus(Produs produs){
        this.cosCumparaturi.add(produs);
    }
    public void removeProdus(Produs produs){
        this.cosCumparaturi.remove(produs);
    }
    public Produs getProdus(int index){
        return cosCumparaturi.get(index);
    }

    public void clearCos(){
        this.cosCumparaturi.clear();
    }
}
