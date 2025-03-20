package ro.cts.seminar04.PrototypeExample.Models;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String dataRezervare;
    protected String oraRezervare;

    public ARezervare() {
        this.numeClient = "";
        this.nrPersoane = 0;
        this.dataRezervare = "";
        this.oraRezervare = "";
    }

    public ARezervare(String numeClient, int nrPersoane, String dataRezervare, String oraRezervare) {
        if (numeClient.length() > 3){
            this.numeClient = numeClient;
        }else{
            this.numeClient = "Necunoscut";
        }

        if (nrPersoane > 2){
            this.nrPersoane = nrPersoane;
        }else{
            this.nrPersoane = 20;
        }

        if (dataRezervare.length() == 8) {
            this.dataRezervare = dataRezervare;
        }else{
            this.dataRezervare = "Necunoscut";
        }

        this.oraRezervare = oraRezervare;
    }

    public abstract void descriere();

    public abstract ARezervare copiaza();

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getDataRezervare() {
        return dataRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ARezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", dataRezervare='").append(dataRezervare).append('\'');
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
