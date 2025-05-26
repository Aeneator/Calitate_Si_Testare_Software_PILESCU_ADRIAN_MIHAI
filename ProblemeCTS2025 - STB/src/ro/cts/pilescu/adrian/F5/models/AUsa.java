package ro.cts.pilescu.adrian.F5.models;

public abstract class AUsa {
    private boolean esteLibera;

    public AUsa() {
        this.esteLibera = false;
    }

    public boolean esteLiberaStatus() {
        return esteLibera;
    }

    public void toggleEsteLibera(){
        this.esteLibera = !this.esteLibera;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    public abstract void deschideFortat();

}
