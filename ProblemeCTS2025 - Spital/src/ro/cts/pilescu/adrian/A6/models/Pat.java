package ro.cts.pilescu.adrian.A6.models;

public class Pat {

    private boolean esteOcupat;
    private String numePacient;

    public Pat() {
        this.esteOcupat = false;
        this.numePacient = "N/A";
    }

    public Pat(boolean esteOcupat, String numePacient) {
        this.esteOcupat = esteOcupat;
        this.numePacient = numePacient;
    }

    public boolean isEsteOcupat() {
        return esteOcupat;
    }

    public void setEsteOcupat(boolean esteOcupat) {
        this.esteOcupat = esteOcupat;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pat{");
        sb.append("esteOcupat=").append(esteOcupat);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
