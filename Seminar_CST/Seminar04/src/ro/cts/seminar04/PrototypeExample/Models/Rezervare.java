package ro.cts.seminar04.PrototypeExample.Models;

public class Rezervare extends ARezervare{

    public Rezervare() {
        super();
    }
    public Rezervare(String numeClient, int nrPersoane, String dataRezervare, String oraRezervare) {
        super(numeClient, nrPersoane, dataRezervare, oraRezervare);
    }

    @Override
    public void descriere(){
        System.out.println("Rezervare pentru "+this.getNumeClient()+" la data de "+this.getDataRezervare());
    }

    @Override
    public ARezervare copiaza(){
        Rezervare rezervareNoua = new Rezervare();

        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.dataRezervare = this.dataRezervare;
        rezervareNoua.oraRezervare = this.oraRezervare;

        return rezervareNoua;
    }
}
