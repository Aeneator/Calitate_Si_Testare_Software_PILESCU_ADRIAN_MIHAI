package ro.cts.pilescu.adrian.A6.models;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Pat> listaPaturi;

    public Salon() {
        this.listaPaturi = new ArrayList<>();
    }

    public Salon(List<Pat> listaPaturi) {
        this.listaPaturi = listaPaturi;
    }

    public List<Pat> getListaPaturi() {
        return listaPaturi;
    }

    public void setListaPaturi(List<Pat> listaPaturi) {
        this.listaPaturi = listaPaturi;
    }

    public void setPatOcupat(boolean ocupat,String numePacient,  int index) {
        if (index >= 0 && index < listaPaturi.size()) {
            listaPaturi.get(index).setEsteOcupat(ocupat);
            listaPaturi.get(index).setNumePacient(numePacient);
        } else {
            System.out.println("Index invalid");
        }
    }

    public int existaPatLiber(){
        for (var pat : listaPaturi){
            if (!pat.isEsteOcupat())
                return listaPaturi.indexOf(pat);
        }

        return -1;
    }

}
