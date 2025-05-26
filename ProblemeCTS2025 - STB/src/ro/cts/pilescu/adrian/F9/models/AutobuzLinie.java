package ro.cts.pilescu.adrian.F9.models;

public class AutobuzLinie {

    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    private AutobuzFlyweight autobuzFlyweight;

    public AutobuzLinie(int nrLinie, String primaStatie, String ultimaStatie, AutobuzFlyweight autobuzFlyweight) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.autobuzFlyweight = autobuzFlyweight;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public void setPrimaStatie(String primaStatie) {
        this.primaStatie = primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }

    public void setUltimaStatie(String ultimaStatie) {
        this.ultimaStatie = ultimaStatie;
    }

    public AutobuzFlyweight getAutobuzFlyweight() {
        return autobuzFlyweight;
    }

    public void setAutobuzFlyweight(AutobuzFlyweight autobuzFlyweight) {
        this.autobuzFlyweight = autobuzFlyweight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append(", autobuzFlyweight=").append(autobuzFlyweight);
        sb.append('}');
        return sb.toString();
    }
}
