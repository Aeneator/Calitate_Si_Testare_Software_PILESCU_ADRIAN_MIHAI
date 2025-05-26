package ro.cts.pilescu.adrian.A10.models;

public class InternarePacient {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;
    private PacientFlyweight pacientInfo;

    public InternarePacient(int nrSalon, int nrPat, int nrZileSpitalizare, PacientFlyweight pacientInfo) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
        this.pacientInfo = pacientInfo;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public void setNrPat(int nrPat) {
        this.nrPat = nrPat;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }

    public void setNrZileSpitalizare(int nrZileSpitalizare) {
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    public PacientFlyweight getPacientInfo() {
        return pacientInfo;
    }

    public void setPacientInfo(PacientFlyweight pacientInfo) {
        this.pacientInfo = pacientInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InternarePacient{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZileSpitalizare=").append(nrZileSpitalizare);
        sb.append(", pacientInfo=").append(pacientInfo);
        sb.append('}');
        return sb.toString();
    }
}
