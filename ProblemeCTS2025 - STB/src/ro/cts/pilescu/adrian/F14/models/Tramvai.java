package ro.cts.pilescu.adrian.F14.models;

public class Tramvai {

    private String model;
    private int codTramvai;
    private int nrLocuri;

    public Tramvai(String model, int codTramvai, int nrLocuri) {
        this.model = model;
        this.codTramvai = codTramvai;
        this.nrLocuri = nrLocuri;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCodTramvai() {
        return codTramvai;
    }

    public void setCodTramvai(int codTramvai) {
        this.codTramvai = codTramvai;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
}
