package ro.cts.pilescu.adrian.A8.models;

import java.util.ArrayList;
import java.util.List;

public class Sectie implements Component{
    private String numeSectie;

    public Sectie( String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void adaugaNod(Component component) {
        System.out.println("Nu se poate adauga un nod intr-o sectie");
    }

    @Override
    public void stergeNod(Component component) {
        System.out.println("Nu se poate sterge un nod dintr-o sectie");
    }

    @Override
    public Component getNod(int index) {
        return null;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Sectie{");
        sb.append("numeSectie='").append(numeSectie).append('\'');
        sb.append('}');
        System.out.println(sb);
    }


}
